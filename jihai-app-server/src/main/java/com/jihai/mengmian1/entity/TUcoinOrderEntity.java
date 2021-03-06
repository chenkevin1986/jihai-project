package com.jihai.mengmian1.entity;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;
import javax.persistence.*;

/**
 * <br>
 * <b>description：</b> ENTITY实体<br>
 * <b>author：</b>kevin chen<br>
 * <b>Time：</b> 2017-12-07 16:39:07 <br>
 * <b>Contact：<b>wechat and phone number - 13826126615<br>
 */
@Data
@NoArgsConstructor
@Entity
@Table(name = "t_ucoin_order")
public class TUcoinOrderEntity {


    @Id
    @Column(name="Forder_id",columnDefinition = "int(10) unsigned NOT NULL COMMENT ''")
    private Integer orderId;


    @Column(name="Fproduct_id",columnDefinition = "int(10) unsigned NOT NULL COMMENT ''")
    private Integer productId;


    @Column(name="Fuser_id",columnDefinition = "int(10) unsigned NOT NULL COMMENT ''")
    private Integer userId;


    @Column(name="Fproduct_name",columnDefinition = "varchar(128) NOT NULL COMMENT ''")
    private String productName;


    @Column(name="Fproduct_description",columnDefinition = "varchar(1024) NOT NULL COMMENT ''")
    private String productDescription;


    @Column(name="Fproduct_quantity",columnDefinition = "int(10) unsigned NOT NULL COMMENT ''")
    private Integer productQuantity;


    @Column(name="Famount",columnDefinition = "int(10) unsigned NOT NULL COMMENT ''")
    private Integer amount;


    @Column(name="Fnum",columnDefinition = "int(10) unsigned NOT NULL COMMENT ''")
    private Integer num;


    @Column(name="Ftotal_amount",columnDefinition = "int(10) unsigned NOT NULL COMMENT ''")
    private Integer totalAmount;


    @Column(name="Fstatus",columnDefinition = "int(11) unsigned NOT NULL COMMENT ''")
    private Integer status;


    @Column(name="Ftrade_begin_timestamp",columnDefinition = "int(10) unsigned NOT NULL COMMENT ''")
    private Integer tradeBeginTimestamp;


    @Column(name="Ftrade_end_timestamp",columnDefinition = "int(10) unsigned NOT NULL COMMENT ''")
    private Integer tradeEndTimestamp;


    @Column(name="Fcreate_timestamp",columnDefinition = "int(10) unsigned NOT NULL COMMENT ''")
    private Integer createTimestamp;


    @Column(name="Flastmodify_timestamp",columnDefinition = "int(10) unsigned NOT NULL COMMENT ''")
    private Integer lastmodifyTimestamp;


}