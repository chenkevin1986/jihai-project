package com.jihai.mengmian.controller;

import com.jihai.mengmian.service.TrouteInfoService;
import com.jihai.mengmian.vo.TrouteInfoVo;
import com.jihai.mengmian.dto.TrouteInfoDto;
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
public class TrouteInfoController {

    @Autowired
    private TrouteInfoService trouteInfoService;

    @ApiOperation(value = "新增",notes = "新增接口")
    @PostMapping("/trouteInfo")
    public ApiResponse<TrouteInfoVo> insert(@RequestBody TrouteInfoDto trouteInfoDto){
          return trouteInfoService.insert(trouteInfoDto);
    }


    @ApiOperation(value = "修改",notes = "修改接口")
    @PutMapping("/trouteInfo")
    public ApiResponse<TrouteInfoVo> update(@RequestBody TrouteInfoDto trouteInfoDto){
          return trouteInfoService.update(trouteInfoDto);
    }

    @ApiOperation(value = "查询单条数据",notes = "查询单条数据接口")
    @GetMapping("/trouteInfo/{id}")
    public ApiResponse<TrouteInfoVo> findOne(@PathVariable("id") String id){
          return trouteInfoService.findOne(id);
    }

    @ApiOperation(value = "查询所有数据",notes = "查询所有数据接口")
    @GetMapping("/trouteInfo")
    public ApiResponse<List<TrouteInfoVo>> findAll(){
          return trouteInfoService.findAll();
    }

    @ApiOperation(value = "删除单条数据",notes = "删除单条数据接口")
    @DeleteMapping("/trouteInfo/{id}")
    public ApiResponse delete(String id){
          return trouteInfoService.delete(id);
    }


}
