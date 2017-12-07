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
@Table(name = "t_user_products")
public class TUserProductsEntity {


    @Id
    @Column(name="Fid",columnDefinition = "int(10) unsigned NOT NULL COMMENT ''")
    private Integer id;


    @Column(name="Fuser_id",columnDefinition = "int(10) unsigned NOT NULL COMMENT ''")
    private Integer userId;


    @Column(name="Fproduct_id",columnDefinition = "int(10) unsigned NOT NULL COMMENT ''")
    private Integer productId;


    @Column(name="Fproduct_name",columnDefinition = "varchar(64) NOT NULL COMMENT ''")
    private String productName;


    @Column(name="Fproduct_count",columnDefinition = "int(10) unsigned NOT NULL COMMENT ''")
    private Integer productCount;


    @Column(name="Fproduct_total_ucoin",columnDefinition = "int(10) unsigned NOT NULL COMMENT ''")
    private Integer productTotalUcoin;


    @Column(name="Fproduct_type",columnDefinition = "int(11) unsigned NOT NULL COMMENT ''")
    private Integer productType;


    @Column(name="Fproduct_status",columnDefinition = "int(11) unsigned NOT NULL COMMENT ''")
    private Integer productStatus;


    @Column(name="Fcreate_timestamp",columnDefinition = "int(10) unsigned NOT NULL COMMENT ''")
    private Integer createTimestamp;


    @Column(name="Flastmodify_timestamp",columnDefinition = "int(10) unsigned NOT NULL COMMENT ''")
    private Integer lastmodifyTimestamp;


}