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
@Table(name = "ofoffline")
public class OfofflineEntity {


    @Id
    @Column(name="username",columnDefinition = "varchar(64) NOT NULL COMMENT ''")
    private String username;


    @Id
    @Column(name="messageID",columnDefinition = "bigint(20) NOT NULL COMMENT ''")
    private Long messageID;


    @Column(name="creationDate",columnDefinition = "char(15) NOT NULL COMMENT ''")
    private String creationDate;


    @Column(name="messageSize",columnDefinition = "int(11) NOT NULL COMMENT ''")
    private Integer messageSize;


    @Column(name="stanza",columnDefinition = "text NOT NULL COMMENT ''")
    private String stanza;


}