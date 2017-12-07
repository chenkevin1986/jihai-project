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
@Table(name = "ofpresence")
public class OfpresenceEntity {


    @Id
    @Column(name="username",columnDefinition = "varchar(64) NOT NULL COMMENT ''")
    private String username;


    @Column(name="offlinePresence",columnDefinition = "text NOT NULL COMMENT ''")
    private String offlinePresence;


    @Column(name="offlineDate",columnDefinition = "char(15) NOT NULL COMMENT ''")
    private String offlineDate;


}