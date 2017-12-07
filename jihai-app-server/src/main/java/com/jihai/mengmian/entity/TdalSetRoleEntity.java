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
@Table(name = "tdal_set_role")
public class TdalSetRoleEntity {


    @Id
    @Column(name="Frole_name",columnDefinition = "varchar(64) NOT NULL COMMENT ''")
    private String roleName;


    @Column(name="Fdb_name",columnDefinition = "varchar(64) NOT NULL COMMENT ''")
    private String dbName;


    @Column(name="Fdb_type",columnDefinition = "smallint(6) NOT NULL COMMENT ''")
    private Integer dbType;


    @Column(name="Fdesc",columnDefinition = "varchar(256) NOT NULL COMMENT ''")
    private String desc;


    @Column(name="Fcreate_timestamp",columnDefinition = "int(10) unsigned NOT NULL COMMENT ''")
    private Integer createTimestamp;


    @Column(name="Flastmodify_timestamp",columnDefinition = "int(10) unsigned NOT NULL COMMENT ''")
    private Integer lastmodifyTimestamp;


}