package com.jihai.mengmian.controller;

import com.jihai.mengmian.service.Tuser0Service;
import com.jihai.mengmian.vo.Tuser0Vo;
import com.jihai.mengmian.dto.Tuser0Dto;
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
 * <b>Time：</b> 2017-12-07 16:37:29 <br>
 * <b>Contact：<b>wechat and phone number - 13826126615<br>
 */
@Api(description = "Restful-Api接口服务", tags = " Restful-Api接口服务")
@RestController
public class Tuser0Controller {

    @Autowired
    private Tuser0Service tuser0Service;

    @ApiOperation(value = "新增",notes = "新增接口")
    @PostMapping("/tuser0")
    public ApiResponse<Tuser0Vo> insert(@RequestBody Tuser0Dto tuser0Dto){
          return tuser0Service.insert(tuser0Dto);
    }


    @ApiOperation(value = "修改",notes = "修改接口")
    @PutMapping("/tuser0")
    public ApiResponse<Tuser0Vo> update(@RequestBody Tuser0Dto tuser0Dto){
          return tuser0Service.update(tuser0Dto);
    }

    @ApiOperation(value = "查询单条数据",notes = "查询单条数据接口")
    @GetMapping("/tuser0/{id}")
    public ApiResponse<Tuser0Vo> findOne(@PathVariable("id") String id){
          return tuser0Service.findOne(id);
    }

    @ApiOperation(value = "查询所有数据",notes = "查询所有数据接口")
    @GetMapping("/tuser0")
    public ApiResponse<List<Tuser0Vo>> findAll(){
          return tuser0Service.findAll();
    }

    @ApiOperation(value = "删除单条数据",notes = "删除单条数据接口")
    @DeleteMapping("/tuser0/{id}")
    public ApiResponse delete(String id){
          return tuser0Service.delete(id);
    }


}
