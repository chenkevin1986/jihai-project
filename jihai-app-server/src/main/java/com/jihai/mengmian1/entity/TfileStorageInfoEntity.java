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
@Table(name = "tfile_storage_info")
public class TfileStorageInfoEntity {


    @Id
    @Column(name="Fstorage_key",columnDefinition = "varchar(64) NOT NULL COMMENT ''")
    private String storageKey;


    @Column(name="Faccess_attribute",columnDefinition = "int(11) unsigned NOT NULL COMMENT ''")
    private Integer accessAttribute;


    @Column(name="Fdomain",columnDefinition = "varchar(256) NOT NULL COMMENT ''")
    private String domain;


    @Column(name="Fdesc",columnDefinition = "varchar(256) NOT NULL COMMENT ''")
    private String desc;


    @Column(name="Fcreate_timestamp",columnDefinition = "int(10) unsigned NOT NULL COMMENT ''")
    private Integer createTimestamp;


    @Column(name="Flastmodify_timestamp",columnDefinition = "int(10) unsigned NOT NULL COMMENT ''")
    private Integer lastmodifyTimestamp;


}