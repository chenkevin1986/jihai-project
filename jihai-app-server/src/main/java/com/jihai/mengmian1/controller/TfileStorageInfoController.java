package com.jihai.mengmian1.controller;

import com.jihai.mengmian1.service.TfileStorageInfoService;
import com.jihai.mengmian1.vo.TfileStorageInfoVo;
import com.jihai.mengmian1.dto.TfileStorageInfoDto;
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
public class TfileStorageInfoController {

    @Autowired
    private TfileStorageInfoService tfileStorageInfoService;

    @ApiOperation(value = "新增",notes = "新增接口")
    @PostMapping("/tfileStorageInfo")
    public ApiResponse<TfileStorageInfoVo> insert(@RequestBody TfileStorageInfoDto tfileStorageInfoDto){
          return tfileStorageInfoService.insert(tfileStorageInfoDto);
    }


    @ApiOperation(value = "修改",notes = "修改接口")
    @PutMapping("/tfileStorageInfo")
    public ApiResponse<TfileStorageInfoVo> update(@RequestBody TfileStorageInfoDto tfileStorageInfoDto){
          return tfileStorageInfoService.update(tfileStorageInfoDto);
    }

    @ApiOperation(value = "查询单条数据",notes = "查询单条数据接口")
    @GetMapping("/tfileStorageInfo/{id}")
    public ApiResponse<TfileStorageInfoVo> findOne(@PathVariable("id") String id){
          return tfileStorageInfoService.findOne(id);
    }

    @ApiOperation(value = "查询所有数据",notes = "查询所有数据接口")
    @GetMapping("/tfileStorageInfo")
    public ApiResponse<List<TfileStorageInfoVo>> findAll(){
          return tfileStorageInfoService.findAll();
    }

    @ApiOperation(value = "删除单条数据",notes = "删除单条数据接口")
    @DeleteMapping("/tfileStorageInfo/{id}")
    public ApiResponse delete(String id){
          return tfileStorageInfoService.delete(id);
    }


}
