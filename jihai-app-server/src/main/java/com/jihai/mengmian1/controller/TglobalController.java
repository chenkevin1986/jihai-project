package com.jihai.mengmian1.controller;

import com.jihai.mengmian1.service.TglobalService;
import com.jihai.mengmian1.vo.TglobalVo;
import com.jihai.mengmian1.dto.TglobalDto;
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
public class TglobalController {

    @Autowired
    private TglobalService tglobalService;

    @ApiOperation(value = "新增",notes = "新增接口")
    @PostMapping("/tglobal")
    public ApiResponse<TglobalVo> insert(@RequestBody TglobalDto tglobalDto){
          return tglobalService.insert(tglobalDto);
    }


    @ApiOperation(value = "修改",notes = "修改接口")
    @PutMapping("/tglobal")
    public ApiResponse<TglobalVo> update(@RequestBody TglobalDto tglobalDto){
          return tglobalService.update(tglobalDto);
    }

    @ApiOperation(value = "查询单条数据",notes = "查询单条数据接口")
    @GetMapping("/tglobal/{id}")
    public ApiResponse<TglobalVo> findOne(@PathVariable("id") String id){
          return tglobalService.findOne(id);
    }

    @ApiOperation(value = "查询所有数据",notes = "查询所有数据接口")
    @GetMapping("/tglobal")
    public ApiResponse<List<TglobalVo>> findAll(){
          return tglobalService.findAll();
    }

    @ApiOperation(value = "删除单条数据",notes = "删除单条数据接口")
    @DeleteMapping("/tglobal/{id}")
    public ApiResponse delete(String id){
          return tglobalService.delete(id);
    }


}
