package com.jihai.mengmian.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

/**
 * <br>
 * <b>description：</b> DTO实体<br>
 * <b>author：</b>kevin chen<br>
 * <b>Time：</b> 2017-12-07 16:37:28 <br>
 * <b>Contact：<b>wechat and phone number - 13826126615<br>
 */
@Data
@ApiModel(value = "Dto实体信息", description = "Dto实体信息")
public class TAnchorDto {
    @ApiModelProperty( value = "填写其字段的含义")
    private Integer userId;
    @ApiModelProperty( value = "填写其字段的含义")
    private String voice;
    @ApiModelProperty( value = "填写其字段的含义")
    private Integer voiceDuration;
    @ApiModelProperty( value = "填写其字段的含义")
    private String topics;
    @ApiModelProperty( value = "填写其字段的含义")
    private String province;
    @ApiModelProperty( value = "填写其字段的含义")
    private String city;
    @ApiModelProperty( value = "填写其字段的含义")
    private String profession;
    @ApiModelProperty( value = "填写其字段的含义")
    private Integer audioChatRate;
    @ApiModelProperty( value = "填写其字段的含义")
    private Integer status;
    @ApiModelProperty( value = "填写其字段的含义")
    private String rejectedReason;
    @ApiModelProperty( value = "填写其字段的含义")
    private String qq;
    @ApiModelProperty( value = "填写其字段的含义")
    private Integer isRecommanded;
    @ApiModelProperty( value = "填写其字段的含义")
    private Integer priority;
    @ApiModelProperty( value = "填写其字段的含义")
    private Integer videoChatRate;
    @ApiModelProperty( value = "填写其字段的含义")
    private Integer isVideoChatOn;
    @ApiModelProperty( value = "填写其字段的含义")
    private Integer createTimestamp;
    @ApiModelProperty( value = "填写其字段的含义")
    private Integer lastmodifyTimestamp;

}