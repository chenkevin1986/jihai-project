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
@Table(name = "toa_user")
public class ToaUserEntity {


    @Id
    @Column(name="Fuser_id",columnDefinition = "int(10) unsigned NOT NULL COMMENT ''")
    private Integer userId;


    @Column(name="Fuser_name",columnDefinition = "varchar(16) NOT NULL COMMENT ''")
    private String userName;


    @Column(name="Fuser_password",columnDefinition = "varchar(128) NOT NULL COMMENT ''")
    private String userPassword;


    @Column(name="Fnick_name",columnDefinition = "varchar(64) NOT NULL COMMENT ''")
    private String nickName;


    @Column(name="Fbind_toy_email",columnDefinition = "varchar(64) NOT NULL COMMENT ''")
    private String bindToyEmail;


    @Column(name="Fbind_toy_userId",columnDefinition = "int(10) unsigned NOT NULL COMMENT ''")
    private Integer bindToyUserId;


    @Column(name="Fcreate_timestamp",columnDefinition = "int(10) unsigned NOT NULL COMMENT ''")
    private Integer createTimestamp;


    @Column(name="Flastmodify_timestamp",columnDefinition = "int(10) unsigned NOT NULL COMMENT ''")
    private Integer lastmodifyTimestamp;


}