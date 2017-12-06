package com.jihai.mengmian.controller;

import com.jihai.mengmian.service.AppUserDBService;
import com.jihai.mengmian.vo.AppUserVo;
import com.jihai.mengmian.web.ApiResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

/**
 * Created by kevinchen on 2017/7/24.
 */
@Api(description = "内部app服务", tags = "app用户相关")
@RestController
public class AppUserController {


    @Autowired
    private AppUserDBService appUserDBService;

    @ApiOperation(value = "登录",notes = "登录接口")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "phone", value = "手机号码", required = true, paramType = "query", dataType = "string"),
            @ApiImplicitParam(name = "password", value = "密码", required = true, paramType = "query", dataType = "string")
    })
    @GetMapping("/user")
    public ApiResponse<AppUserVo> login(@ApiIgnore @RequestParam("phone") String phone,
                                        @ApiIgnore @RequestParam("password") String password){
        return appUserDBService.login(phone,password);
    }

    @ApiOperation(value = "注册",notes = "注册接口")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "phone", value = "手机号码", required = true, paramType = "form", dataType = "string"),
            @ApiImplicitParam(name = "password", value = "密码", required = true, paramType = "form", dataType = "string"),
    })
    @PostMapping("/user")
    public ApiResponse register(String phone,String password){
        return appUserDBService.register(phone,password);
    }


}
