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
@Table(name = "ofmucroomprop")
public class OfmucroompropEntity {


    @Id
    @Column(name="roomID",columnDefinition = "bigint(20) NOT NULL COMMENT ''")
    private Long roomID;


    @Id
    @Column(name="name",columnDefinition = "varchar(100) NOT NULL COMMENT ''")
    private String name;


    @Column(name="propValue",columnDefinition = "text NOT NULL COMMENT ''")
    private String propValue;


}