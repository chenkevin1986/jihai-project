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
@Table(name = "tuser_0")
public class Tuser0Entity {


    @Id
    @Column(name="Fuser_id",columnDefinition = "int(10) unsigned NOT NULL COMMENT ''")
    private Integer userId;


    @Column(name="Fjid",columnDefinition = "varchar(36) NOT NULL COMMENT ''")
    private String jid;


    @Column(name="Fuser_name",columnDefinition = "varchar(32) NOT NULL COMMENT ''")
    private String userName;


    @Column(name="Fpassword",columnDefinition = "varchar(256) NOT NULL COMMENT ''")
    private String password;


    @Column(name="Femail",columnDefinition = "varchar(64) NOT NULL COMMENT ''")
    private String email;


    @Column(name="Fnick_name",columnDefinition = "varchar(32) NOT NULL COMMENT ''")
    private String nickName;


    @Column(name="Fsex",columnDefinition = "int(11) unsigned NOT NULL COMMENT ''")
    private Integer sex;


    @Column(name="Fsource",columnDefinition = "int(11) unsigned NOT NULL COMMENT ''")
    private Integer source;


    @Column(name="Fage",columnDefinition = "int(11) unsigned NOT NULL COMMENT ''")
    private Integer age;


    @Column(name="Fhead_photo",columnDefinition = "varchar(72) NOT NULL COMMENT ''")
    private String headPhoto;


    @Column(name="Fsign",columnDefinition = "varchar(256) NOT NULL COMMENT ''")
    private String sign;


    @Column(name="Fsex_friend",columnDefinition = "int(10) unsigned NOT NULL COMMENT ''")
    private Integer sexFriend;


    @Column(name="Fcreate_timestamp",columnDefinition = "int(10) unsigned NOT NULL COMMENT ''")
    private Integer createTimestamp;


    @Column(name="Flastmodify_timestamp",columnDefinition = "int(10) unsigned NOT NULL COMMENT ''")
    private Integer lastmodifyTimestamp;


    @Column(name="Fcouple_apply_target",columnDefinition = "int(10) unsigned NOT NULL COMMENT ''")
    private Integer coupleApplyTarget;


    @Column(name="Fcouple_apply_sender",columnDefinition = "int(10) unsigned NOT NULL COMMENT ''")
    private Integer coupleApplySender;


    @Column(name="Ftelephone",columnDefinition = "varchar(32) NOT NULL COMMENT ''")
    private String telephone;


    @Column(name="Fheight",columnDefinition = "int(11) unsigned NOT NULL COMMENT ''")
    private Integer height;


    @Column(name="Fbirthday_timestamp",columnDefinition = "int(10) unsigned NOT NULL COMMENT ''")
    private Integer birthdayTimestamp;


    @Column(name="Fzodiac",columnDefinition = "int(11) unsigned NOT NULL COMMENT ''")
    private Integer zodiac;


    @Column(name="Fsource_channel",columnDefinition = "varchar(64) NOT NULL COMMENT ''")
    private String sourceChannel;


    @Column(name="Fapp_id",columnDefinition = "int(11) unsigned NOT NULL COMMENT ''")
    private Integer appId;


}