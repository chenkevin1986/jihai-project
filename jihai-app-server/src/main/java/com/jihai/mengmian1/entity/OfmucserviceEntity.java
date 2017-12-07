package com.jihai.mengmian1.entity;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;
import javax.persistence.*;

/**
 * <br>
 * <b>description：</b> ENTITY实体<br>
 * <b>author：</b>kevin chen<br>
 * <b>Time：</b> 2017-12-07 16:39:06 <br>
 * <b>Contact：<b>wechat and phone number - 13826126615<br>
 */
@Data
@NoArgsConstructor
@Entity
@Table(name = "ofmucservice")
public class OfmucserviceEntity {


    @Column(name="serviceID",columnDefinition = "bigint(20) NOT NULL COMMENT ''")
    private Long serviceID;


    @Id
    @Column(name="subdomain",columnDefinition = "varchar(255) NOT NULL COMMENT ''")
    private String subdomain;


    @Column(name="description",columnDefinition = "varchar(255) NOT NULL COMMENT ''")
    private String description;


    @Column(name="isHidden",columnDefinition = "int(11) NOT NULL COMMENT ''")
    private Integer isHidden;


}