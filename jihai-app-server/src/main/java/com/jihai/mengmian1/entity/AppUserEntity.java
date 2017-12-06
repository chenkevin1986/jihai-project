package com.jihai.mengmian1.entity;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;
import javax.persistence.*;

/**
 * <br>
 * <b>description：</b>app用户表 ENTITY实体<br>
 * <b>author：</b>kevin chen<br>
 * <b>Time：</b> 2017-12-06 23:12:27 <br>
 * <b>Contact：<b>wechat and phone number - 13826126615<br>
 */
@Data
@NoArgsConstructor
@Entity
@Table(name = "appUser")
public class AppUserEntity {


    @Id
    @Column(columnDefinition = "varchar(255) NOT NULL COMMENT ''")
    private String uid;


    @Column(columnDefinition = "varchar(255) NOT NULL COMMENT ''")
    private String password;


    @Column(columnDefinition = "varchar(255) NOT NULL COMMENT ''")
    private String phone;


}