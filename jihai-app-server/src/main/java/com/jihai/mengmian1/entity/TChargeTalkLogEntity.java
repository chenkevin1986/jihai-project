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
@Table(name = "t_charge_talk_log")
public class TChargeTalkLogEntity {


    @Id
    @Column(name="Fcharge_talk_log_id",columnDefinition = "int(10) unsigned NOT NULL COMMENT ''")
    private Integer chargeTalkLogId;


    @Column(name="Ftalk_record_id",columnDefinition = "int(10) unsigned NOT NULL COMMENT ''")
    private Integer talkRecordId;


    @Column(name="Fcharge_timestamp",columnDefinition = "int(10) unsigned NOT NULL COMMENT ''")
    private Integer chargeTimestamp;


    @Column(name="Fis_first_talk",columnDefinition = "int(11) NOT NULL COMMENT ''")
    private Integer isFirstTalk;


    @Column(name="Ftalk_rate",columnDefinition = "int(11) NOT NULL COMMENT ''")
    private Integer talkRate;


    @Column(name="Fcharge_time",columnDefinition = "int(11) NOT NULL COMMENT ''")
    private Integer chargeTime;


    @Column(name="Fcharge_amount",columnDefinition = "int(11) NOT NULL COMMENT ''")
    private Integer chargeAmount;


    @Column(name="Fis_vip_charge",columnDefinition = "int(11) NOT NULL COMMENT ''")
    private Integer isVipCharge;


    @Column(name="Fcreate_timestamp",columnDefinition = "int(10) unsigned NOT NULL COMMENT ''")
    private Integer createTimestamp;


    @Column(name="Flastmodify_timestamp",columnDefinition = "int(10) unsigned NOT NULL COMMENT ''")
    private Integer lastmodifyTimestamp;


}