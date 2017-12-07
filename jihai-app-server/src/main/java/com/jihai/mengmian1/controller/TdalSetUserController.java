package com.jihai.mengmian1.controller;

import com.jihai.mengmian1.service.TdalSetUserService;
import com.jihai.mengmian1.vo.TdalSetUserVo;
import com.jihai.mengmian1.dto.TdalSetUserDto;
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
 * <b>description：</b> Restful-Api接口<br>
 * <b>author：</b>kevin chen<br>
 * <b>Time：</b> 2017-12-07 16:39:08 <br>
 * <b>Contact：<b>wechat and phone number - 13826126615<br>
 */
@Api(description = "Restful-Api接口服务", tags = " Restful-Api接口服务")
@RestController
public class TdalSetUserController {

    @Autowired
    private TdalSetUserService tdalSetUserService;

    @ApiOperation(value = "新增",notes = "新增接口")
    @PostMapping("/tdalSetUser")
    public ApiResponse<TdalSetUserVo> insert(@RequestBody TdalSetUserDto tdalSetUserDto){
          return tdalSetUserService.insert(tdalSetUserDto);
    }


    @ApiOperation(value = "修改",notes = "修改接口")
    @PutMapping("/tdalSetUser")
    public ApiResponse<TdalSetUserVo> update(@RequestBody TdalSetUserDto tdalSetUserDto){
          return tdalSetUserService.update(tdalSetUserDto);
    }

    @ApiOperation(value = "查询单条数据",notes = "查询单条数据接口")
    @GetMapping("/tdalSetUser/{id}")
    public ApiResponse<TdalSetUserVo> findOne(@PathVariable("id") String id){
          return tdalSetUserService.findOne(id);
    }

    @ApiOperation(value = "查询所有数据",notes = "查询所有数据接口")
    @GetMapping("/tdalSetUser")
    public ApiResponse<List<TdalSetUserVo>> findAll(){
          return tdalSetUserService.findAll();
    }

    @ApiOperation(value = "删除单条数据",notes = "删除单条数据接口")
    @DeleteMapping("/tdalSetUser/{id}")
    public ApiResponse delete(String id){
          return tdalSetUserService.delete(id);
    }


}
