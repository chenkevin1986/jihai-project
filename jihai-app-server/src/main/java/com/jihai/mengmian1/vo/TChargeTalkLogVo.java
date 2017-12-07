package com.jihai.mengmian1.vo;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

/**
 * <br>
 * <b>description：</b> VO实体<br>
 * <b>author：</b>kevin chen<br>
 * <b>Time：</b> 2017-12-07 16:39:07 <br>
 * <b>Contact：<b>wechat and phone number - 13826126615<br>
 */
@Data
@ApiModel(value = "View显示实体信息", description = "View显示实体信息")
public class TChargeTalkLogVo {
    @ApiModelProperty( value = "填写其显示字段的含义")
    private Integer chargeTalkLogId;
    @ApiModelProperty( value = "填写其显示字段的含义")
    private Integer talkRecordId;
    @ApiModelProperty( value = "填写其显示字段的含义")
    private Integer chargeTimestamp;
    @ApiModelProperty( value = "填写其显示字段的含义")
    private Integer isFirstTalk;
    @ApiModelProperty( value = "填写其显示字段的含义")
    private Integer talkRate;
    @ApiModelProperty( value = "填写其显示字段的含义")
    private Integer chargeTime;
    @ApiModelProperty( value = "填写其显示字段的含义")
    private Integer chargeAmount;
    @ApiModelProperty( value = "填写其显示字段的含义")
    private Integer isVipCharge;
    @ApiModelProperty( value = "填写其显示字段的含义")
    private Integer createTimestamp;
    @ApiModelProperty( value = "填写其显示字段的含义")
    private Integer lastmodifyTimestamp;

}