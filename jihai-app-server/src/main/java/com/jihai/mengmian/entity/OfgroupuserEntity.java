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
@Table(name = "ofgroupuser")
public class OfgroupuserEntity {


    @Id
    @Column(name="groupName",columnDefinition = "varchar(50) NOT NULL COMMENT ''")
    private String groupName;


    @Id
    @Column(name="username",columnDefinition = "varchar(100) NOT NULL COMMENT ''")
    private String username;


    @Id
    @Column(name="administrator",columnDefinition = "tinyint(4) NOT NULL COMMENT ''")
    private Integer administrator;


}