package com.jihai.mengmian.entity;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;
import javax.persistence.*;

/**
 * <br>
 * <b>description：</b> ENTITY实体<br>
 * <b>author：</b>kevin chen<br>
 * <b>Time：</b> 2017-12-07 16:37:28 <br>
 * <b>Contact：<b>wechat and phone number - 13826126615<br>
 */
@Data
@NoArgsConstructor
@Entity
@Table(name = "t_ucoin_bill")
public class TUcoinBillEntity {


    @Id
    @Column(name="Fid",columnDefinition = "int(10) unsigned NOT NULL COMMENT ''")
    private Integer id;


    @Column(name="Fuser_id",columnDefinition = "int(10) unsigned NOT NULL COMMENT ''")
    private Integer userId;


    @Column(name="Fbill_id",columnDefinition = "bigint(20) unsigned NOT NULL COMMENT ''")
    private Long billId;


    @Column(name="Forder_id",columnDefinition = "bigint(20) unsigned NOT NULL COMMENT ''")
    private Long orderId;


    @Column(name="Faction",columnDefinition = "int(11) unsigned NOT NULL COMMENT ''")
    private Integer action;


    @Column(name="Fstatus",columnDefinition = "int(11) unsigned NOT NULL COMMENT ''")
    private Integer status;


    @Column(name="Fbill_info",columnDefinition = "text NOT NULL COMMENT ''")
    private String billInfo;


    @Column(name="Fbill_type",columnDefinition = "int(11) unsigned NOT NULL COMMENT ''")
    private Integer billType;


    @Column(name="Fold_ucoin_balance",columnDefinition = "int(10) unsigned NOT NULL COMMENT ''")
    private Integer oldUcoinBalance;


    @Column(name="Fnow_ucoin_balance",columnDefinition = "int(10) unsigned NOT NULL COMMENT ''")
    private Integer nowUcoinBalance;


    @Column(name="Famt",columnDefinition = "int(11) NOT NULL COMMENT ''")
    private Integer amt;


    @Column(name="Fuser_ip",columnDefinition = "varchar(64) NOT NULL COMMENT ''")
    private String userIp;


    @Column(name="Fproduct_id",columnDefinition = "int(10) unsigned NOT NULL COMMENT ''")
    private Integer productId;


    @Column(name="Fproduct_name",columnDefinition = "varchar(64) NOT NULL COMMENT ''")
    private String productName;


    @Column(name="Fproduct_count",columnDefinition = "int(10) unsigned NOT NULL COMMENT ''")
    private Integer productCount;


    @Column(name="Fproduct_total_price",columnDefinition = "int(10) unsigned NOT NULL COMMENT ''")
    private Integer productTotalPrice;


    @Column(name="Fcreate_timestamp",columnDefinition = "int(10) unsigned NOT NULL COMMENT ''")
    private Integer createTimestamp;


    @Column(name="Flastmodify_timestamp",columnDefinition = "int(10) unsigned NOT NULL COMMENT ''")
    private Integer lastmodifyTimestamp;


}