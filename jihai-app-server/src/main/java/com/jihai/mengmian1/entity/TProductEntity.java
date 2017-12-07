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
@Table(name = "t_product")
public class TProductEntity {


    @Id
    @Column(name="Fproduct_id",columnDefinition = "int(10) unsigned NOT NULL COMMENT ''")
    private Integer productId;


    @Column(name="Ftype",columnDefinition = "int(11) unsigned NOT NULL COMMENT ''")
    private Integer type;


    @Column(name="Fname",columnDefinition = "varchar(128) NOT NULL COMMENT ''")
    private String name;


    @Column(name="Fdescription",columnDefinition = "varchar(1024) NOT NULL COMMENT ''")
    private String description;


    @Column(name="Fquantity",columnDefinition = "int(10) unsigned NOT NULL COMMENT ''")
    private Integer quantity;


    @Column(name="Frate",columnDefinition = "int(10) unsigned NOT NULL COMMENT ''")
    private Integer rate;


    @Column(name="Fcurrency_type",columnDefinition = "int(11) unsigned NOT NULL COMMENT ''")
    private Integer currencyType;


    @Column(name="Fimage_codes",columnDefinition = "varchar(1024) NOT NULL COMMENT ''")
    private String imageCodes;


    @Column(name="Fstatus",columnDefinition = "int(11) unsigned NOT NULL COMMENT ''")
    private Integer status;


    @Column(name="Fcreate_timestamp",columnDefinition = "int(10) unsigned NOT NULL COMMENT ''")
    private Integer createTimestamp;


    @Column(name="Flastmodify_timestamp",columnDefinition = "int(10) unsigned NOT NULL COMMENT ''")
    private Integer lastmodifyTimestamp;


}