package com.jihai.mengmian.entity;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;
import javax.persistence.*;

/**
 * <br>
 * <b>description：</b> ENTITY实体<br>
 * <b>author：</b>kevin chen<br>
 * <b>Time：</b> 2017-12-07 16:37:28 <br>
 * <b>Contact：<b>wechat and phone number - 13826126615<br>
 */
@Data
@NoArgsConstructor
@Entity
@Table(name = "ofuserflag")
public class OfuserflagEntity {


    @Id
    @Column(name="username",columnDefinition = "varchar(64) NOT NULL COMMENT ''")
    private String username;


    @Id
    @Column(name="name",columnDefinition = "varchar(100) NOT NULL COMMENT ''")
    private String name;


    @Column(name="startTime",columnDefinition = "char(15) NOT NULL COMMENT ''")
    private String startTime;


    @Column(name="endTime",columnDefinition = "char(15) NOT NULL COMMENT ''")
    private String endTime;


}