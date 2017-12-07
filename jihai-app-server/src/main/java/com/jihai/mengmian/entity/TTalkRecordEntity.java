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
@Table(name = "t_talk_record")
public class TTalkRecordEntity {


    @Id
    @Column(name="Ftalk_record_id",columnDefinition = "int(10) unsigned NOT NULL COMMENT ''")
    private Integer talkRecordId;


    @Column(name="Fcaller_user_id",columnDefinition = "int(10) unsigned NOT NULL COMMENT ''")
    private Integer callerUserId;


    @Column(name="Fis_caller_anchor",columnDefinition = "int(11) NOT NULL COMMENT ''")
    private Integer isCallerAnchor;


    @Column(name="Freceiver_user_id",columnDefinition = "int(10) unsigned NOT NULL COMMENT ''")
    private Integer receiverUserId;


    @Column(name="Fis_receiver_anchor",columnDefinition = "int(11) NOT NULL COMMENT ''")
    private Integer isReceiverAnchor;


    @Column(name="Fchannel",columnDefinition = "varchar(64) NOT NULL COMMENT ''")
    private String channel;


    @Column(name="Ftalk_rate",columnDefinition = "int(11) NOT NULL COMMENT ''")
    private Integer talkRate;


    @Column(name="Fis_first_talk",columnDefinition = "int(11) NOT NULL COMMENT ''")
    private Integer isFirstTalk;


    @Column(name="Fapply_timestamp",columnDefinition = "int(10) unsigned NOT NULL COMMENT ''")
    private Integer applyTimestamp;


    @Column(name="Fbegin_timestamp",columnDefinition = "int(10) unsigned NOT NULL COMMENT ''")
    private Integer beginTimestamp;


    @Column(name="Fend_timestamp",columnDefinition = "int(10) unsigned NOT NULL COMMENT ''")
    private Integer endTimestamp;


    @Column(name="Fcost_ucoins",columnDefinition = "int(11) NOT NULL COMMENT ''")
    private Integer costUcoins;


    @Column(name="Fcharge_times",columnDefinition = "int(11) NOT NULL COMMENT ''")
    private Integer chargeTimes;


    @Column(name="Fstatus",columnDefinition = "int(11) NOT NULL COMMENT ''")
    private Integer status;


    @Column(name="Fended_status",columnDefinition = "int(11) NOT NULL COMMENT ''")
    private Integer endedStatus;


    @Column(name="Flast_charge_timestamp",columnDefinition = "int(10) unsigned NOT NULL COMMENT ''")
    private Integer lastChargeTimestamp;


    @Column(name="Fvip_charge_times",columnDefinition = "int(11) NOT NULL COMMENT ''")
    private Integer vipChargeTimes;


    @Column(name="Fis_video_chat",columnDefinition = "int(11) NOT NULL COMMENT ''")
    private Integer isVideoChat;


    @Column(name="Fcreate_timestamp",columnDefinition = "int(10) unsigned NOT NULL COMMENT ''")
    private Integer createTimestamp;


    @Column(name="Flastmodify_timestamp",columnDefinition = "int(10) unsigned NOT NULL COMMENT ''")
    private Integer lastmodifyTimestamp;


}