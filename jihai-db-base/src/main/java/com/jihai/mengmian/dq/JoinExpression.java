package com.jihai.mengmian.dq;

import org.apache.commons.lang3.StringUtils;

import javax.persistence.criteria.*;

/**
 * Created by kevinchen on 2017/2/28.
 * 支持 关联表查询，仅限于两个实体，不能再多啦
 */
public class JoinExpression implements Criterion {

    private String fieldName;       //属性名
    private Object value;           //对应值
    private Operator operator;      //计算符

    private Join join;

    private Class cls;

    private String clsName;

    private JoinType joinType;

    public JoinExpression(Class cls, String clsName,String fieldName, Object value, Operator operator,JoinType joinType) {
        this.fieldName = fieldName;
        this.value = value;
        this.operator = operator;
        this.cls = cls;
        this.clsName = clsName;
        this.joinType = joinType;
    }

    public Object getValue() {
        return value;
    }


    @Override
    public Predicate toPredicate(Root<?> root, CriteriaQuery<?> query, CriteriaBuilder builder) {
        this.join = root.join(root.getModel().getSingularAttribute(clsName,cls),joinType);
        Path expression = null;
        if(fieldName.contains(".")){
            String[] names = StringUtils.split(fieldName, ".");
            expression = this.join.get(names[0]);
            for (int i = 1; i < names.length; i++) {
                expression = expression.get(names[i]);
            }
        }else{
            expression = this.join.get(fieldName);
        }
        switch (operator) {
            case EQ:
                return builder.equal(expression, value);
            case NE:
                return builder.notEqual(expression, value);
            case LIKE:
                return builder.like((Expression<String>) expression, "%" + value + "%");
            case LT:
                return builder.lessThan(expression, (Comparable) value);
            case GT:
                return builder.greaterThan(expression, (Comparable) value);
            case LTE:
                return builder.lessThanOrEqualTo(expression, (Comparable) value);
            case GTE:
                return builder.greaterThanOrEqualTo(expression, (Comparable) this.getValue());
            default:
                return null;
        }
    }
}
