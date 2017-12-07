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
@Table(name = "troute_info")
public class TrouteInfoEntity {


    @Id
    @Column(name="Fservice_key",columnDefinition = "int(11) unsigned NOT NULL COMMENT ''")
    private Integer serviceKey;


    @Column(name="Fservice_name",columnDefinition = "varchar(64) NOT NULL COMMENT ''")
    private String serviceName;


    @Column(name="Fip_list",columnDefinition = "varchar(320) NOT NULL COMMENT ''")
    private String ipList;


    @Column(name="Fservice_desc",columnDefinition = "varchar(128) NOT NULL COMMENT ''")
    private String serviceDesc;


    @Column(name="Fcreate_timestamp",columnDefinition = "int(10) unsigned NOT NULL COMMENT ''")
    private Integer createTimestamp;


    @Column(name="Flastmodify_timestamp",columnDefinition = "int(10) unsigned NOT NULL COMMENT ''")
    private Integer lastmodifyTimestamp;


    @Column(name="Froute_type",columnDefinition = "int(11) unsigned NOT NULL COMMENT ''")
    private Integer routeType;


}