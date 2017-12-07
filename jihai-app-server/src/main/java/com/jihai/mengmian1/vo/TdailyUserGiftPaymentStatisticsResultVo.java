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
public class TdailyUserGiftPaymentStatisticsResultVo {
    @ApiModelProperty( value = "填写其显示字段的含义")
    private Integer resultId;
    @ApiModelProperty( value = "填写其显示字段的含义")
    private Integer userId;
    @ApiModelProperty( value = "填写其显示字段的含义")
    private Integer payment;
    @ApiModelProperty( value = "填写其显示字段的含义")
    private Integer statId;
    @ApiModelProperty( value = "填写其显示字段的含义")
    private Integer createTimestamp;

}