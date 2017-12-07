package com.jihai.mengmian.entity;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;
import javax.persistence.*;

/**
 * <br>
 * <b>description：</b> ENTITY实体<br>
 * <b>author：</b>kevin chen<br>
 * <b>Time：</b> 2017-12-07 16:37:27 <br>
 * <b>Contact：<b>wechat and phone number - 13826126615<br>
 */
@Data
@NoArgsConstructor
@Entity
@Table(name = "ofpubsubsubscription")
public class OfpubsubsubscriptionEntity {


    @Id
    @Column(name="serviceID",columnDefinition = "varchar(100) NOT NULL COMMENT ''")
    private String serviceID;


    @Id
    @Column(name="nodeID",columnDefinition = "varchar(100) NOT NULL COMMENT ''")
    private String nodeID;


    @Id
    @Column(name="id",columnDefinition = "varchar(100) NOT NULL COMMENT ''")
    private String id;


    @Column(name="jid",columnDefinition = "varchar(255) NOT NULL COMMENT ''")
    private String jid;


    @Column(name="owner",columnDefinition = "varchar(255) NOT NULL COMMENT ''")
    private String owner;


    @Column(name="state",columnDefinition = "varchar(15) NOT NULL COMMENT ''")
    private String state;


    @Column(name="deliver",columnDefinition = "int(11) NOT NULL COMMENT ''")
    private Integer deliver;


    @Column(name="digest",columnDefinition = "int(11) NOT NULL COMMENT ''")
    private Integer digest;


    @Column(name="digest_frequency",columnDefinition = "int(11) NOT NULL COMMENT ''")
    private Integer digestFrequency;


    @Column(name="expire",columnDefinition = "char(15) NOT NULL COMMENT ''")
    private String expire;


    @Column(name="includeBody",columnDefinition = "int(11) NOT NULL COMMENT ''")
    private Integer includeBody;


    @Column(name="showValues",columnDefinition = "varchar(30) NOT NULL COMMENT ''")
    private String showValues;


    @Column(name="subscriptionType",columnDefinition = "varchar(10) NOT NULL COMMENT ''")
    private String subscriptionType;


    @Column(name="subscriptionDepth",columnDefinition = "int(11) NOT NULL COMMENT ''")
    private Integer subscriptionDepth;


    @Column(name="keyword",columnDefinition = "varchar(200) NOT NULL COMMENT ''")
    private String keyword;


}