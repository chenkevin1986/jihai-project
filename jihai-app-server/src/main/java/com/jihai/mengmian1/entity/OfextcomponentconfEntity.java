package com.jihai.mengmian1.entity;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;
import javax.persistence.*;

/**
 * <br>
 * <b>description：</b> ENTITY实体<br>
 * <b>author：</b>kevin chen<br>
 * <b>Time：</b> 2017-12-07 16:39:05 <br>
 * <b>Contact：<b>wechat and phone number - 13826126615<br>
 */
@Data
@NoArgsConstructor
@Entity
@Table(name = "ofextcomponentconf")
public class OfextcomponentconfEntity {


    @Id
    @Column(name="subdomain",columnDefinition = "varchar(255) NOT NULL COMMENT ''")
    private String subdomain;


    @Column(name="wildcard",columnDefinition = "tinyint(4) NOT NULL COMMENT ''")
    private Integer wildcard;


    @Column(name="secret",columnDefinition = "varchar(255) NOT NULL COMMENT ''")
    private String secret;


    @Column(name="permission",columnDefinition = "varchar(10) NOT NULL COMMENT ''")
    private String permission;


}