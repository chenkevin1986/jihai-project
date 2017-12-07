package com.jihai.mengmian1.entity;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;
import javax.persistence.*;

/**
 * <br>
 * <b>description：</b> ENTITY实体<br>
 * <b>author：</b>kevin chen<br>
 * <b>Time：</b> 2017-12-07 16:39:08 <br>
 * <b>Contact：<b>wechat and phone number - 13826126615<br>
 */
@Data
@NoArgsConstructor
@Entity
@Table(name = "tweb_nginx_config")
public class TwebNginxConfigEntity {


    @Id
    @Column(name="Fid",columnDefinition = "int(11) unsigned NOT NULL COMMENT ''")
    private Integer id;


    @Column(name="Fversion",columnDefinition = "int(10) unsigned NOT NULL COMMENT ''")
    private Integer version;


    @Column(name="Fconfig",columnDefinition = "mediumtext NOT NULL COMMENT ''")
    private String config;


    @Column(name="Flastmodify_timestamp",columnDefinition = "int(10) unsigned NOT NULL COMMENT ''")
    private Integer lastmodifyTimestamp;


}