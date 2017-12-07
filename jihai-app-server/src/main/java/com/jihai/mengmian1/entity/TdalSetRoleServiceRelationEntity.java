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
@Table(name = "tdal_set_role_service_relation")
public class TdalSetRoleServiceRelationEntity {


    @Id
    @Column(name="Fservice_key",columnDefinition = "smallint(5) unsigned NOT NULL COMMENT ''")
    private Integer serviceKey;


    @Id
    @Column(name="Finterface_name",columnDefinition = "varchar(128) NOT NULL COMMENT ''")
    private String interfaceName;


    @Id
    @Column(name="Frole_name",columnDefinition = "varchar(64) NOT NULL COMMENT ''")
    private String roleName;


    @Column(name="Fuser_key",columnDefinition = "varchar(64) NOT NULL COMMENT ''")
    private String userKey;


    @Column(name="Frelated_type",columnDefinition = "smallint(5) unsigned NOT NULL COMMENT ''")
    private Integer relatedType;


    @Column(name="Fcreate_timestamp",columnDefinition = "int(10) unsigned NOT NULL COMMENT ''")
    private Integer createTimestamp;


    @Column(name="Flastmodify_timestamp",columnDefinition = "int(10) unsigned NOT NULL COMMENT ''")
    private Integer lastmodifyTimestamp;


}