package com.jihai.mengmian.vo;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

/**
 * <br>
 * <b>description：</b> VO实体<br>
 * <b>author：</b>kevin chen<br>
 * <b>Time：</b> 2017-12-07 16:37:28 <br>
 * <b>Contact：<b>wechat and phone number - 13826126615<br>
 */
@Data
@ApiModel(value = "View显示实体信息", description = "View显示实体信息")
public class TTalkRecordVo {
    @ApiModelProperty( value = "填写其显示字段的含义")
    private Integer talkRecordId;
    @ApiModelProperty( value = "填写其显示字段的含义")
    private Integer callerUserId;
    @ApiModelProperty( value = "填写其显示字段的含义")
    private Integer isCallerAnchor;
    @ApiModelProperty( value = "填写其显示字段的含义")
    private Integer receiverUserId;
    @ApiModelProperty( value = "填写其显示字段的含义")
    private Integer isReceiverAnchor;
    @ApiModelProperty( value = "填写其显示字段的含义")
    private String channel;
    @ApiModelProperty( value = "填写其显示字段的含义")
    private Integer talkRate;
    @ApiModelProperty( value = "填写其显示字段的含义")
    private Integer isFirstTalk;
    @ApiModelProperty( value = "填写其显示字段的含义")
    private Integer applyTimestamp;
    @ApiModelProperty( value = "填写其显示字段的含义")
    private Integer beginTimestamp;
    @ApiModelProperty( value = "填写其显示字段的含义")
    private Integer endTimestamp;
    @ApiModelProperty( value = "填写其显示字段的含义")
    private Integer costUcoins;
    @ApiModelProperty( value = "填写其显示字段的含义")
    private Integer chargeTimes;
    @ApiModelProperty( value = "填写其显示字段的含义")
    private Integer status;
    @ApiModelProperty( value = "填写其显示字段的含义")
    private Integer endedStatus;
    @ApiModelProperty( value = "填写其显示字段的含义")
    private Integer lastChargeTimestamp;
    @ApiModelProperty( value = "填写其显示字段的含义")
    private Integer vipChargeTimes;
    @ApiModelProperty( value = "填写其显示字段的含义")
    private Integer isVideoChat;
    @ApiModelProperty( value = "填写其显示字段的含义")
    private Integer createTimestamp;
    @ApiModelProperty( value = "填写其显示字段的含义")
    private Integer lastmodifyTimestamp;

}