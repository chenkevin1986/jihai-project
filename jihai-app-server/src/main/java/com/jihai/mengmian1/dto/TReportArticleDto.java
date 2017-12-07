package com.jihai.mengmian1.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

/**
 * <br>
 * <b>description：</b> DTO实体<br>
 * <b>author：</b>kevin chen<br>
 * <b>Time：</b> 2017-12-07 16:39:07 <br>
 * <b>Contact：<b>wechat and phone number - 13826126615<br>
 */
@Data
@ApiModel(value = "Dto实体信息", description = "Dto实体信息")
public class TReportArticleDto {
    @ApiModelProperty( value = "填写其字段的含义")
    private Integer reportId;
    @ApiModelProperty( value = "填写其字段的含义")
    private Long articleId;
    @ApiModelProperty( value = "填写其字段的含义")
    private Long commentId;
    @ApiModelProperty( value = "填写其字段的含义")
    private Integer plateId;
    @ApiModelProperty( value = "填写其字段的含义")
    private Long authorUserId;
    @ApiModelProperty( value = "填写其字段的含义")
    private Long commentUserId;
    @ApiModelProperty( value = "填写其字段的含义")
    private Long reporterUserId;
    @ApiModelProperty( value = "填写其字段的含义")
    private String reportContent;
    @ApiModelProperty( value = "填写其字段的含义")
    private Integer createTimestamp;
    @ApiModelProperty( value = "填写其字段的含义")
    private Integer lastmodifyTimestamp;

}