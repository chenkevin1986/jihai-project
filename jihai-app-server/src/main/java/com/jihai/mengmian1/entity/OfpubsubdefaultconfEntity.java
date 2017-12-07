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
@Table(name = "ofpubsubdefaultconf")
public class OfpubsubdefaultconfEntity {


    @Id
    @Column(name="serviceID",columnDefinition = "varchar(100) NOT NULL COMMENT ''")
    private String serviceID;


    @Id
    @Column(name="leaf",columnDefinition = "int(11) NOT NULL COMMENT ''")
    private Integer leaf;


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


    @Column(name="accessModel",columnDefinition = "varchar(10) NOT NULL COMMENT ''")
    private String accessModel;


    @Column(name="language",columnDefinition = "varchar(255) NOT NULL COMMENT ''")
    private String language;


    @Column(name="replyPolicy",columnDefinition = "varchar(15) NOT NULL COMMENT ''")
    private String replyPolicy;


    @Column(name="associationPolicy",columnDefinition = "varchar(15) NOT NULL COMMENT ''")
    private String associationPolicy;


    @Column(name="maxLeafNodes",columnDefinition = "int(11) NOT NULL COMMENT ''")
    private Integer maxLeafNodes;


}