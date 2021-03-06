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
@Table(name = "t_sms_resend_task")
public class TSmsResendTaskEntity {


    @Id
    @Column(name="Fsms_resend_task_id",columnDefinition = "int(10) unsigned NOT NULL COMMENT ''")
    private Integer smsResendTaskId;


    @Column(name="Fmobile_no",columnDefinition = "varchar(32) NOT NULL COMMENT ''")
    private String mobileNo;


    @Column(name="Fverify_code",columnDefinition = "varchar(32) NOT NULL COMMENT ''")
    private String verifyCode;


    @Column(name="Fsend_timestamp",columnDefinition = "int(10) unsigned NOT NULL COMMENT ''")
    private Integer sendTimestamp;


    @Column(name="Fstatus",columnDefinition = "int(11) unsigned NOT NULL COMMENT ''")
    private Integer status;


    @Column(name="Fmessage",columnDefinition = "varchar(1024) NOT NULL COMMENT ''")
    private String message;


    @Column(name="Fcreate_timestamp",columnDefinition = "int(10) unsigned NOT NULL COMMENT ''")
    private Integer createTimestamp;


    @Column(name="Flastmodify_timestamp",columnDefinition = "int(10) unsigned NOT NULL COMMENT ''")
    private Integer lastmodifyTimestamp;


}