package com.jihai.mengmian.entity;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;
import javax.persistence.*;

/**
 * <br>
 * <b>description：</b> ENTITY实体<br>
 * <b>author：</b>kevin chen<br>
 * <b>Time：</b> 2017-12-07 16:37:29 <br>
 * <b>Contact：<b>wechat and phone number - 13826126615<br>
 */
@Data
@NoArgsConstructor
@Entity
@Table(name = "tweb_config_info")
public class TwebConfigInfoEntity {


    @Id
    @Column(name="Fweb_project_name",columnDefinition = "varchar(64) NOT NULL COMMENT ''")
    private String webProjectName;


    @Column(name="Fdeploy_type",columnDefinition = "int(11) unsigned NOT NULL COMMENT ''")
    private Integer deployType;


    @Column(name="Fip_list",columnDefinition = "varchar(320) NOT NULL COMMENT ''")
    private String ipList;


    @Column(name="Fport",columnDefinition = "int(10) unsigned NOT NULL COMMENT ''")
    private Integer port;


    @Column(name="Fdomain_list",columnDefinition = "varchar(256) NOT NULL COMMENT ''")
    private String domainList;


    @Column(name="Findex_path",columnDefinition = "varchar(256) NOT NULL COMMENT ''")
    private String indexPath;


    @Column(name="Fdesc",columnDefinition = "varchar(128) NOT NULL COMMENT ''")
    private String desc;


    @Column(name="Fcreate_timestamp",columnDefinition = "int(10) unsigned NOT NULL COMMENT ''")
    private Integer createTimestamp;


    @Column(name="Flastmodify_timestamp",columnDefinition = "int(10) unsigned NOT NULL COMMENT ''")
    private Integer lastmodifyTimestamp;


    @Column(name="Fserver_options",columnDefinition = "varchar(1024) NOT NULL COMMENT ''")
    private String serverOptions;


    @Column(name="Flocation_options",columnDefinition = "varchar(1024) NOT NULL COMMENT ''")
    private String locationOptions;


}