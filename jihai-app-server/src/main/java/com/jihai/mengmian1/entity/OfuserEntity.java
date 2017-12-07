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
@Table(name = "ofuser")
public class OfuserEntity {


    @Id
    @Column(name="username",columnDefinition = "varchar(64) NOT NULL COMMENT ''")
    private String username;


    @Column(name="plainPassword",columnDefinition = "varchar(32) NOT NULL COMMENT ''")
    private String plainPassword;


    @Column(name="encryptedPassword",columnDefinition = "varchar(255) NOT NULL COMMENT ''")
    private String encryptedPassword;


    @Column(name="name",columnDefinition = "varchar(100) NOT NULL COMMENT ''")
    private String name;


    @Column(name="email",columnDefinition = "varchar(100) NOT NULL COMMENT ''")
    private String email;


    @Column(name="creationDate",columnDefinition = "char(15) NOT NULL COMMENT ''")
    private String creationDate;


    @Column(name="modificationDate",columnDefinition = "char(15) NOT NULL COMMENT ''")
    private String modificationDate;


}