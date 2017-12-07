package com.jihai.mengmian.controller;

import com.jihai.mengmian.service.TsoftwareDetailService;
import com.jihai.mengmian.vo.TsoftwareDetailVo;
import com.jihai.mengmian.dto.TsoftwareDetailDto;
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
 * <b>Time：</b> 2017-12-07 16:37:28 <br>
 * <b>Contact：<b>wechat and phone number - 13826126615<br>
 */
@Api(description = "Restful-Api接口服务", tags = " Restful-Api接口服务")
@RestController
public class TsoftwareDetailController {

    @Autowired
    private TsoftwareDetailService tsoftwareDetailService;

    @ApiOperation(value = "新增",notes = "新增接口")
    @PostMapping("/tsoftwareDetail")
    public ApiResponse<TsoftwareDetailVo> insert(@RequestBody TsoftwareDetailDto tsoftwareDetailDto){
          return tsoftwareDetailService.insert(tsoftwareDetailDto);
    }


    @ApiOperation(value = "修改",notes = "修改接口")
    @PutMapping("/tsoftwareDetail")
    public ApiResponse<TsoftwareDetailVo> update(@RequestBody TsoftwareDetailDto tsoftwareDetailDto){
          return tsoftwareDetailService.update(tsoftwareDetailDto);
    }

    @ApiOperation(value = "查询单条数据",notes = "查询单条数据接口")
    @GetMapping("/tsoftwareDetail/{id}")
    public ApiResponse<TsoftwareDetailVo> findOne(@PathVariable("id") String id){
          return tsoftwareDetailService.findOne(id);
    }

    @ApiOperation(value = "查询所有数据",notes = "查询所有数据接口")
    @GetMapping("/tsoftwareDetail")
    public ApiResponse<List<TsoftwareDetailVo>> findAll(){
          return tsoftwareDetailService.findAll();
    }

    @ApiOperation(value = "删除单条数据",notes = "删除单条数据接口")
    @DeleteMapping("/tsoftwareDetail/{id}")
    public ApiResponse delete(String id){
          return tsoftwareDetailService.delete(id);
    }


}
