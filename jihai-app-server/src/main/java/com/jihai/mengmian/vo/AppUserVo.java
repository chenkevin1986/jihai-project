package com.jihai.mengmian.vo;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by kevinchen on 2016/12/20.
 */
@Data
@ApiModel(value = "app用户显示实体信息", description = "app用户响应参数")
public class AppUserVo {

    @ApiModelProperty( value = "用户id,与平台uid保持一致")
    private String uid;

    @ApiModelProperty( value = "手机号码")
    private String phone;

}
