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
@Table(name = "ofprivate")
public class OfprivateEntity {


    @Id
    @Column(name="username",columnDefinition = "varchar(64) NOT NULL COMMENT ''")
    private String username;


    @Id
    @Column(name="name",columnDefinition = "varchar(100) NOT NULL COMMENT ''")
    private String name;


    @Id
    @Column(name="namespace",columnDefinition = "varchar(200) NOT NULL COMMENT ''")
    private String namespace;


    @Column(name="privateData",columnDefinition = "text NOT NULL COMMENT ''")
    private String privateData;


}