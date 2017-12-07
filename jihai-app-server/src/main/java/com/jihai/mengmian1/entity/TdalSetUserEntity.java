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
@Table(name = "tdal_set_user")
public class TdalSetUserEntity {


    @Id
    @Column(name="Fuser_key",columnDefinition = "varchar(64) NOT NULL COMMENT ''")
    private String userKey;


    @Column(name="Fuser_name",columnDefinition = "varchar(128) NOT NULL COMMENT ''")
    private String userName;


    @Column(name="Fuser_password",columnDefinition = "varchar(128) NOT NULL COMMENT ''")
    private String userPassword;


    @Column(name="Fuser_desc",columnDefinition = "varchar(512) NOT NULL COMMENT ''")
    private String userDesc;


    @Column(name="Fcreate_timestamp",columnDefinition = "int(10) unsigned NOT NULL COMMENT ''")
    private Integer createTimestamp;


    @Column(name="Flastmodify_timestamp",columnDefinition = "int(10) unsigned NOT NULL COMMENT ''")
    private Integer lastmodifyTimestamp;


}