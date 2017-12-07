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
@Table(name = "ofmucconversationlog")
public class OfmucconversationlogEntity {


    @Column(name="roomID",columnDefinition = "bigint(20) NOT NULL COMMENT ''")
    private Long roomID;


    @Column(name="sender",columnDefinition = "text NOT NULL COMMENT ''")
    private String sender;


    @Column(name="nickname",columnDefinition = "varchar(255) NOT NULL COMMENT ''")
    private String nickname;


    @Column(name="logTime",columnDefinition = "char(15) NOT NULL COMMENT ''")
    private String logTime;


    @Column(name="subject",columnDefinition = "varchar(255) NOT NULL COMMENT ''")
    private String subject;


    @Column(name="body",columnDefinition = "text NOT NULL COMMENT ''")
    private String body;


}