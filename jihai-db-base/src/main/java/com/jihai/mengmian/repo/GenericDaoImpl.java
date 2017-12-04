package com.jihai.mengmian.repo;

import com.jihai.mengmian.utils.JpaResultTransformerUtil;
import org.hibernate.SQLQuery;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.util.Assert;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.List;

/**
 * 基础数据Dao访问封装实现
 * Created by Toby Lai on 2017/6/14.
 */
public class GenericDaoImpl<T, ID extends Serializable> extends SimpleJpaRepository<T, ID> implements GenericDao<T, ID> {
    private final EntityManager em;
    private Class<T> domainClass;
    private static final Logger logger = LoggerFactory.getLogger(GenericDaoImpl.class);

    public GenericDaoImpl(Class<T> domainClass, EntityManager entityManager) {
        super(domainClass, entityManager);
        this.em = entityManager;
        this.domainClass = domainClass;
    }

    private <S> SQLQuery getSelectSQLQuery(String querySql, List<Object> params, Class<S> clazz) {
        StringBuilder querySqlBuild = new StringBuilder();
        querySqlBuild.append(JpaResultTransformerUtil.getSelectSql(clazz))
                .append(" FROM ( ")
                .append(querySql)
                .append(") tt ");

        Query query = em.createNativeQuery(querySqlBuild.toString());
        for(int i=0; i< params.size(); i++) {
            query.setParameter(i+1, params.get(i));
        }
        SQLQuery sqlQuery = query.unwrap(SQLQuery.class);
        sqlQuery = JpaResultTransformerUtil.setResultTransformer(sqlQuery, clazz);
        return sqlQuery;
    }

    private long countSql(String querySql, List<Object> params) {
        StringBuilder countSqlBuild = new StringBuilder("SELECT COUNT(*) FROM ( ");
        countSqlBuild.append(querySql)
                .append(") tt");
        Query query = em.createNativeQuery(countSqlBuild.toString());
        for(int i=0; i< params.size(); i++) {
            query.setParameter(i+1, params.get(i));
        }
        BigInteger bigInteger = (BigInteger) query.getSingleResult();
        return bigInteger.longValue();
    }

    /**
     * @see GenericDao#findBySql(String, List, Class)
     * @param querySql 原生sql
     * @param params sql参数
     * @param clazz 映射类
     * @param <S>
     * @return
     */
    public <S> List<S> findBySql(String querySql, List<Object> params, Class<S> clazz) {
        Assert.notNull(params, "params is null");
        SQLQuery sqlQuery = getSelectSQLQuery(querySql, params, clazz);
        return sqlQuery.list();
    }

    /**
     * @see GenericDao#findBySql(String, List, Pageable, Class)
     * @param querySql 原生sql
     * @param params ql参数
     * @param pageable 分页实体
     * @param clazz 映射类
     * @param <S>
     * @return
     */
    public <S> Page<S> findBySql(String querySql, List<Object> params, Pageable pageable, Class<S> clazz) {
        Assert.notNull(params, "params is null");
        SQLQuery sqlQuery = getSelectSQLQuery(querySql, params, clazz);
        if(null != pageable) {
            sqlQuery.setFirstResult(pageable.getPageNumber()*pageable.getPageSize());
            sqlQuery.setMaxResults(pageable.getPageSize());
        }
        long total = countSql(querySql, params);
        return new PageImpl(sqlQuery.list(), pageable, total);
    }

}
