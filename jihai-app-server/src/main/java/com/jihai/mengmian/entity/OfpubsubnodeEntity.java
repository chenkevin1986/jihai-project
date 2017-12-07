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
@Table(name = "ofpubsubnode")
public class OfpubsubnodeEntity {


    @Id
    @Column(name="serviceID",columnDefinition = "varchar(100) NOT NULL COMMENT ''")
    private String serviceID;


    @Id
    @Column(name="nodeID",columnDefinition = "varchar(100) NOT NULL COMMENT ''")
    private String nodeID;


    @Column(name="leaf",columnDefinition = "int(11) NOT NULL COMMENT ''")
    private Integer leaf;


    @Column(name="creationDate",columnDefinition = "char(15) NOT NULL COMMENT ''")
    private String creationDate;


    @Column(name="modificationDate",columnDefinition = "char(15) NOT NULL COMMENT ''")
    private String modificationDate;


    @Column(name="parent",columnDefinition = "varchar(100) NOT NULL COMMENT ''")
    private String parent;


    @Column(name="deliverPayloads",columnDefinition = "int(11) NOT NULL COMMENT ''")
    private Integer deliverPayloads;


    @Column(name="maxPayloadSize",columnDefinition = "int(11) NOT NULL COMMENT ''")
    private Integer maxPayloadSize;


    @Column(name="persistItems",columnDefinition = "int(11) NOT NULL COMMENT ''")
    private Integer persistItems;


    @Column(name="maxItems",columnDefinition = "int(11) NOT NULL COMMENT ''")
    private Integer maxItems;


    @Column(name="notifyConfigChanges",columnDefinition = "int(11) NOT NULL COMMENT ''")
    private Integer notifyConfigChanges;


    @Column(name="notifyDelete",columnDefinition = "int(11) NOT NULL COMMENT ''")
    private Integer notifyDelete;


    @Column(name="notifyRetract",columnDefinition = "int(11) NOT NULL COMMENT ''")
    private Integer notifyRetract;


    @Column(name="presenceBased",columnDefinition = "int(11) NOT NULL COMMENT ''")
    private Integer presenceBased;


    @Column(name="sendItemSubscribe",columnDefinition = "int(11) NOT NULL COMMENT ''")
    private Integer sendItemSubscribe;


    @Column(name="publisherModel",columnDefinition = "varchar(15) NOT NULL COMMENT ''")
    private String publisherModel;


    @Column(name="subscriptionEnabled",columnDefinition = "int(11) NOT NULL COMMENT ''")
    private Integer subscriptionEnabled;


    @Column(name="configSubscription",columnDefinition = "int(11) NOT NULL COMMENT ''")
    private Integer configSubscription;


    @Column(name="accessModel",columnDefinition = "varchar(10) NOT NULL COMMENT ''")
    private String accessModel;


    @Column(name="payloadType",columnDefinition = "varchar(100) NOT NULL COMMENT ''")
    private String payloadType;


    @Column(name="bodyXSLT",columnDefinition = "varchar(100) NOT NULL COMMENT ''")
    private String bodyXSLT;


    @Column(name="dataformXSLT",columnDefinition = "varchar(100) NOT NULL COMMENT ''")
    private String dataformXSLT;


    @Column(name="creator",columnDefinition = "varchar(255) NOT NULL COMMENT ''")
    private String creator;


    @Column(name="description",columnDefinition = "varchar(255) NOT NULL COMMENT ''")
    private String description;


    @Column(name="language",columnDefinition = "varchar(255) NOT NULL COMMENT ''")
    private String language;


    @Column(name="name",columnDefinition = "varchar(50) NOT NULL COMMENT ''")
    private String name;


    @Column(name="replyPolicy",columnDefinition = "varchar(15) NOT NULL COMMENT ''")
    private String replyPolicy;


    @Column(name="associationPolicy",columnDefinition = "varchar(15) NOT NULL COMMENT ''")
    private String associationPolicy;


    @Column(name="maxLeafNodes",columnDefinition = "int(11) NOT NULL COMMENT ''")
    private Integer maxLeafNodes;


}