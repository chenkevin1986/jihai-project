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
@Table(name = "ofmucmember")
public class OfmucmemberEntity {


    @Id
    @Column(name="roomID",columnDefinition = "bigint(20) NOT NULL COMMENT ''")
    private Long roomID;


    @Id
    @Column(name="jid",columnDefinition = "text NOT NULL COMMENT ''")
    private String jid;


    @Column(name="nickname",columnDefinition = "varchar(255) NOT NULL COMMENT ''")
    private String nickname;


    @Column(name="firstName",columnDefinition = "varchar(100) NOT NULL COMMENT ''")
    private String firstName;


    @Column(name="lastName",columnDefinition = "varchar(100) NOT NULL COMMENT ''")
    private String lastName;


    @Column(name="url",columnDefinition = "varchar(100) NOT NULL COMMENT ''")
    private String url;


    @Column(name="email",columnDefinition = "varchar(100) NOT NULL COMMENT ''")
    private String email;


    @Column(name="faqentry",columnDefinition = "varchar(100) NOT NULL COMMENT ''")
    private String faqentry;


}