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
@Table(name = "t_package_info")
public class TPackageInfoEntity {


    @Id
    @Column(name="Fstatic_id",columnDefinition = "int(10) unsigned NOT NULL COMMENT ''")
    private Integer staticId;


    @Column(name="Fdate_timestamp",columnDefinition = "int(10) unsigned NOT NULL COMMENT ''")
    private Integer dateTimestamp;


    @Column(name="Fuser_id",columnDefinition = "int(10) unsigned NOT NULL COMMENT ''")
    private Integer userId;


    @Column(name="Fuser_mac",columnDefinition = "varchar(128) NOT NULL COMMENT ''")
    private String userMac;


    @Column(name="Fuser_ip",columnDefinition = "varchar(64) NOT NULL COMMENT ''")
    private String userIp;


    @Column(name="Fpackage_name",columnDefinition = "varchar(256) NOT NULL COMMENT ''")
    private String packageName;


    @Column(name="Fyoumeng_id",columnDefinition = "varchar(64) NOT NULL COMMENT ''")
    private String youmengId;


    @Column(name="Fcreate_timestamp",columnDefinition = "int(10) unsigned NOT NULL COMMENT ''")
    private Integer createTimestamp;


    @Column(name="Flastmodify_timestamp",columnDefinition = "int(10) unsigned NOT NULL COMMENT ''")
    private Integer lastmodifyTimestamp;


}