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
@Table(name = "ofpubsubaffiliation")
public class OfpubsubaffiliationEntity {


    @Id
    @Column(name="serviceID",columnDefinition = "varchar(100) NOT NULL COMMENT ''")
    private String serviceID;


    @Id
    @Column(name="nodeID",columnDefinition = "varchar(100) NOT NULL COMMENT ''")
    private String nodeID;


    @Id
    @Column(name="jid",columnDefinition = "varchar(255) NOT NULL COMMENT ''")
    private String jid;


    @Column(name="affiliation",columnDefinition = "varchar(10) NOT NULL COMMENT ''")
    private String affiliation;


}