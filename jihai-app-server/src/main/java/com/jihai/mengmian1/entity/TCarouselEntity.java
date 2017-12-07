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
@Table(name = "t_carousel")
public class TCarouselEntity {


    @Id
    @Column(name="Fcarousel_id",columnDefinition = "int(11) unsigned NOT NULL COMMENT ''")
    private Integer carouselId;


    @Column(name="Fimage_path",columnDefinition = "varchar(128) NOT NULL COMMENT ''")
    private String imagePath;


    @Column(name="Fhref",columnDefinition = "varchar(512) NOT NULL COMMENT ''")
    private String href;


    @Column(name="Fcreate_timestamp",columnDefinition = "int(10) unsigned NOT NULL COMMENT ''")
    private Integer createTimestamp;


    @Column(name="Flastmodify_timestamp",columnDefinition = "int(10) unsigned NOT NULL COMMENT ''")
    private Integer lastmodifyTimestamp;


}