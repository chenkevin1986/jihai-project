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
@Table(name = "t_forbidden_user")
public class TForbiddenUserEntity {


    @Id
    @Column(name="Fuser_id",columnDefinition = "bigint(20) unsigned NOT NULL COMMENT ''")
    private Long userId;


    @Column(name="Fuser_name",columnDefinition = "varchar(128) NOT NULL COMMENT ''")
    private String userName;


    @Column(name="Fuser_email",columnDefinition = "varchar(128) NOT NULL COMMENT ''")
    private String userEmail;


    @Column(name="Fforbidden_timestamp",columnDefinition = "int(10) unsigned NOT NULL COMMENT ''")
    private Integer forbiddenTimestamp;


    @Column(name="Fforbidden_admin_name",columnDefinition = "varchar(64) NOT NULL COMMENT ''")
    private String forbiddenAdminName;


}