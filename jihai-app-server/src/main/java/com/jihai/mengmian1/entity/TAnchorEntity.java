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
@Table(name = "t_anchor")
public class TAnchorEntity {


    @Id
    @Column(name="Fuser_id",columnDefinition = "int(10) unsigned NOT NULL COMMENT ''")
    private Integer userId;


    @Column(name="Fvoice",columnDefinition = "varchar(128) NOT NULL COMMENT ''")
    private String voice;


    @Column(name="Fvoice_duration",columnDefinition = "int(11) NOT NULL COMMENT ''")
    private Integer voiceDuration;


    @Column(name="Ftopics",columnDefinition = "varchar(128) NOT NULL COMMENT ''")
    private String topics;


    @Column(name="Fprovince",columnDefinition = "varchar(32) NOT NULL COMMENT ''")
    private String province;


    @Column(name="Fcity",columnDefinition = "varchar(32) NOT NULL COMMENT ''")
    private String city;


    @Column(name="Fprofession",columnDefinition = "varchar(64) NOT NULL COMMENT ''")
    private String profession;


    @Column(name="Faudio_chat_rate",columnDefinition = "int(11) NOT NULL COMMENT ''")
    private Integer audioChatRate;


    @Column(name="Fstatus",columnDefinition = "int(11) NOT NULL COMMENT ''")
    private Integer status;


    @Column(name="Frejected_reason",columnDefinition = "varchar(128) NOT NULL COMMENT ''")
    private String rejectedReason;


    @Column(name="Fqq",columnDefinition = "varchar(16) NOT NULL COMMENT ''")
    private String qq;


    @Column(name="Fis_recommanded",columnDefinition = "int(11) NOT NULL COMMENT ''")
    private Integer isRecommanded;


    @Column(name="Fpriority",columnDefinition = "int(11) NOT NULL COMMENT ''")
    private Integer priority;


    @Column(name="Fvideo_chat_rate",columnDefinition = "int(11) NOT NULL COMMENT ''")
    private Integer videoChatRate;


    @Column(name="Fis_video_chat_on",columnDefinition = "int(11) NOT NULL COMMENT ''")
    private Integer isVideoChatOn;


    @Column(name="Fcreate_timestamp",columnDefinition = "int(10) unsigned NOT NULL COMMENT ''")
    private Integer createTimestamp;


    @Column(name="Flastmodify_timestamp",columnDefinition = "int(10) unsigned NOT NULL COMMENT ''")
    private Integer lastmodifyTimestamp;


}