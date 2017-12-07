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
@Table(name = "tglobal")
public class TglobalEntity {


    @Id
    @Column(name="Fid",columnDefinition = "int(10) unsigned NOT NULL COMMENT ''")
    private Integer id;


    @Column(name="Fkey",columnDefinition = "varchar(64) NOT NULL COMMENT ''")
    private String key;


    @Column(name="Fvalue",columnDefinition = "varchar(4096) NOT NULL COMMENT ''")
    private String value;


    @Column(name="Fapp_id",columnDefinition = "int(11) unsigned NOT NULL COMMENT ''")
    private Integer appId;


    @Column(name="Fcreate_timestamp",columnDefinition = "int(10) unsigned NOT NULL COMMENT ''")
    private Integer createTimestamp;


    @Column(name="Flastmodify_timestamp",columnDefinition = "int(10) unsigned NOT NULL COMMENT ''")
    private Integer lastmodifyTimestamp;


}