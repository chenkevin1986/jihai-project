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
@Table(name = "tdal_set_host")
public class TdalSetHostEntity {


    @Id
    @Column(name="Fhost_name",columnDefinition = "varchar(128) NOT NULL COMMENT ''")
    private String hostName;


    @Column(name="Fhost_domain",columnDefinition = "varchar(128) NOT NULL COMMENT ''")
    private String hostDomain;


    @Column(name="Fhost_port",columnDefinition = "smallint(5) unsigned NOT NULL COMMENT ''")
    private Integer hostPort;


    @Column(name="Fhost_desc",columnDefinition = "varchar(512) NOT NULL COMMENT ''")
    private String hostDesc;


    @Column(name="Fcreate_timestamp",columnDefinition = "int(10) unsigned NOT NULL COMMENT ''")
    private Integer createTimestamp;


    @Column(name="Flastmodify_timestamp",columnDefinition = "int(10) unsigned NOT NULL COMMENT ''")
    private Integer lastmodifyTimestamp;


}