package com.jihai.mengmian1.controller;

import com.jihai.mengmian1.service.AppUserService;
import com.jihai.mengmian1.vo.AppUserVo;
import com.jihai.mengmian1.dto.AppUserDto;
import com.jihai.mengmian.web.ApiResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;
import java.util.List;

/**
 * <br>
 * <b>description：</b>app用户表 Restful-Api接口<br>
 * <b>author：</b>kevin chen<br>
 * <b>Time：</b> 2017-12-06 23:12:27 <br>
 * <b>Contact：<b>wechat and phone number - 13826126615<br>
 */
@Api(description = "app用户表Restful-Api接口服务", tags = "app用户表 Restful-Api接口服务")
@RestController
public class AppUserController {

    @Autowired
    private AppUserService appUserService;

    @ApiOperation(value = "新增",notes = "新增接口")
    @PostMapping("/appUser")
    public ApiResponse<AppUserVo> insert(@RequestBody AppUserDto appUserDto){
          return appUserService.insert(appUserDto);
    }


    @ApiOperation(value = "修改",notes = "修改接口")
    @PutMapping("/appUser")
    public ApiResponse<AppUserVo> update(@RequestBody AppUserDto appUserDto){
          return appUserService.update(appUserDto);
    }

    @ApiOperation(value = "查询单条数据",notes = "查询单条数据接口")
    @GetMapping("/appUser/{id}")
    public ApiResponse<AppUserVo> findOne(@PathVariable("id") String id){
          return appUserService.findOne(id);
    }

    @ApiOperation(value = "查询所有数据",notes = "查询所有数据接口")
    @GetMapping("/appUser")
    public ApiResponse<List<AppUserVo>> findAll(){
          return appUserService.findAll();
    }

    @ApiOperation(value = "删除单条数据",notes = "删除单条数据接口")
    @DeleteMapping("/appUser/{id}")
    public ApiResponse delete(String id){
          return appUserService.delete(id);
    }


}
