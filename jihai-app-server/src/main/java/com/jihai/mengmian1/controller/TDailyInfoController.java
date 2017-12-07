package com.jihai.mengmian1.controller;

import com.jihai.mengmian1.service.TDailyInfoService;
import com.jihai.mengmian1.vo.TDailyInfoVo;
import com.jihai.mengmian1.dto.TDailyInfoDto;
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
 * <b>Time：</b> 2017-12-07 16:39:07 <br>
 * <b>Contact：<b>wechat and phone number - 13826126615<br>
 */
@Api(description = "Restful-Api接口服务", tags = " Restful-Api接口服务")
@RestController
public class TDailyInfoController {

    @Autowired
    private TDailyInfoService tDailyInfoService;

    @ApiOperation(value = "新增",notes = "新增接口")
    @PostMapping("/tDailyInfo")
    public ApiResponse<TDailyInfoVo> insert(@RequestBody TDailyInfoDto tDailyInfoDto){
          return tDailyInfoService.insert(tDailyInfoDto);
    }


    @ApiOperation(value = "修改",notes = "修改接口")
    @PutMapping("/tDailyInfo")
    public ApiResponse<TDailyInfoVo> update(@RequestBody TDailyInfoDto tDailyInfoDto){
          return tDailyInfoService.update(tDailyInfoDto);
    }

    @ApiOperation(value = "查询单条数据",notes = "查询单条数据接口")
    @GetMapping("/tDailyInfo/{id}")
    public ApiResponse<TDailyInfoVo> findOne(@PathVariable("id") String id){
          return tDailyInfoService.findOne(id);
    }

    @ApiOperation(value = "查询所有数据",notes = "查询所有数据接口")
    @GetMapping("/tDailyInfo")
    public ApiResponse<List<TDailyInfoVo>> findAll(){
          return tDailyInfoService.findAll();
    }

    @ApiOperation(value = "删除单条数据",notes = "删除单条数据接口")
    @DeleteMapping("/tDailyInfo/{id}")
    public ApiResponse delete(String id){
          return tDailyInfoService.delete(id);
    }


}
