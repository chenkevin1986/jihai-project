package com.jihai.mengmian1.entity;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;
import javax.persistence.*;

/**
 * <br>
 * <b>description：</b> ENTITY实体<br>
 * <b>author：</b>kevin chen<br>
 * <b>Time：</b> 2017-12-07 16:39:07 <br>
 * <b>Contact：<b>wechat and phone number - 13826126615<br>
 */
@Data
@NoArgsConstructor
@Entity
@Table(name = "ofversion")
public class OfversionEntity {


    @Id
    @Column(name="name",columnDefinition = "varchar(50) NOT NULL COMMENT ''")
    private String name;


    @Column(name="version",columnDefinition = "int(11) NOT NULL COMMENT ''")
    private Integer version;


}