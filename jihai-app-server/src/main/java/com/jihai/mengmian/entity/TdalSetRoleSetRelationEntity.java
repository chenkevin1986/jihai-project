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
@Table(name = "tdal_set_role_set_relation")
public class TdalSetRoleSetRelationEntity {


    @Id
    @Column(name="Fhost_name",columnDefinition = "varchar(128) NOT NULL COMMENT ''")
    private String hostName;


    @Column(name="Ftype_in_set",columnDefinition = "smallint(5) unsigned NOT NULL COMMENT ''")
    private Integer typeInSet;


    @Id
    @Column(name="Fset_index",columnDefinition = "smallint(5) unsigned NOT NULL COMMENT ''")
    private Integer setIndex;


    @Column(name="Fweight",columnDefinition = "int(10) unsigned NOT NULL COMMENT ''")
    private Integer weight;


    @Id
    @Column(name="Frole_name",columnDefinition = "varchar(64) NOT NULL COMMENT ''")
    private String roleName;


    @Column(name="Fcreate_timestamp",columnDefinition = "int(10) unsigned NOT NULL COMMENT ''")
    private Integer createTimestamp;


    @Column(name="Flastmodify_timestamp",columnDefinition = "int(10) unsigned NOT NULL COMMENT ''")
    private Integer lastmodifyTimestamp;


}