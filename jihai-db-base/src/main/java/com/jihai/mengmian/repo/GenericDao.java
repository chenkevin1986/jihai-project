package com.jihai.mengmian.repo;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.List;

/**
 * 基础数据Dao访问封装
 * Created by Gizwits on 2017/6/14.
 */
@Transactional(readOnly = true)
@NoRepositoryBean
public interface GenericDao<T, ID extends Serializable> extends JpaRepository<T, ID>, JpaSpecificationExecutor<T> {

    /**
     * sql 列表查询 ，查询结果映射到自定义实体
     * @param querySql 原生sql
     * @param params sql参数
     * @param clazz 映射类
     * @param <S>
     * @return
     */
    <S> List<S> findBySql(String querySql, List<Object> params, Class<S> clazz);

    /**
     * sql 分页查询 ，查询结果映射到自定义实体
     * @param querySql 原生sql
     * @param params ql参数
     * @param pageable 分页实体
     * @param clazz 映射类
     * @param <S>
     * @return
     */
    <S> Page<S> findBySql(String querySql, List<Object> params, Pageable pageable, Class<S> clazz) ;


}
