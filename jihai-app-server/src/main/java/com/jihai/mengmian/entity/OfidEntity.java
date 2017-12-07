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
@Table(name = "ofid")
public class OfidEntity {


    @Id
    @Column(name="idType",columnDefinition = "int(11) NOT NULL COMMENT ''")
    private Integer idType;


    @Column(name="id",columnDefinition = "bigint(20) NOT NULL COMMENT ''")
    private Long id;


}