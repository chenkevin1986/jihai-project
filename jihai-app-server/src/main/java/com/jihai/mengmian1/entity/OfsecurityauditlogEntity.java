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
@Table(name = "ofsecurityauditlog")
public class OfsecurityauditlogEntity {


    @Id
    @Column(name="msgID",columnDefinition = "bigint(20) NOT NULL COMMENT ''")
    private Long msgID;


    @Column(name="username",columnDefinition = "varchar(64) NOT NULL COMMENT ''")
    private String username;


    @Column(name="entryStamp",columnDefinition = "bigint(20) NOT NULL COMMENT ''")
    private Long entryStamp;


    @Column(name="summary",columnDefinition = "varchar(255) NOT NULL COMMENT ''")
    private String summary;


    @Column(name="node",columnDefinition = "varchar(255) NOT NULL COMMENT ''")
    private String node;


    @Column(name="details",columnDefinition = "text NOT NULL COMMENT ''")
    private String details;


}