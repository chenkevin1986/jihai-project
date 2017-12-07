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
@Table(name = "toa_user_session")
public class ToaUserSessionEntity {


    @Id
    @Column(name="Fuser_id",columnDefinition = "int(10) unsigned NOT NULL COMMENT ''")
    private Integer userId;


    @Column(name="Fsession_key",columnDefinition = "varchar(64) NOT NULL COMMENT ''")
    private String sessionKey;


    @Column(name="Flastmodify_timestamp",columnDefinition = "int(10) unsigned NOT NULL COMMENT ''")
    private Integer lastmodifyTimestamp;


}