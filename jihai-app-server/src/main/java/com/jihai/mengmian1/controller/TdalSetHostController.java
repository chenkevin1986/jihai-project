package com.jihai.mengmian1.controller;

import com.jihai.mengmian1.service.TdalSetHostService;
import com.jihai.mengmian1.vo.TdalSetHostVo;
import com.jihai.mengmian1.dto.TdalSetHostDto;
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
public class TdalSetHostController {

    @Autowired
    private TdalSetHostService tdalSetHostService;

    @ApiOperation(value = "新增",notes = "新增接口")
    @PostMapping("/tdalSetHost")
    public ApiResponse<TdalSetHostVo> insert(@RequestBody TdalSetHostDto tdalSetHostDto){
          return tdalSetHostService.insert(tdalSetHostDto);
    }


    @ApiOperation(value = "修改",notes = "修改接口")
    @PutMapping("/tdalSetHost")
    public ApiResponse<TdalSetHostVo> update(@RequestBody TdalSetHostDto tdalSetHostDto){
          return tdalSetHostService.update(tdalSetHostDto);
    }

    @ApiOperation(value = "查询单条数据",notes = "查询单条数据接口")
    @GetMapping("/tdalSetHost/{id}")
    public ApiResponse<TdalSetHostVo> findOne(@PathVariable("id") String id){
          return tdalSetHostService.findOne(id);
    }

    @ApiOperation(value = "查询所有数据",notes = "查询所有数据接口")
    @GetMapping("/tdalSetHost")
    public ApiResponse<List<TdalSetHostVo>> findAll(){
          return tdalSetHostService.findAll();
    }

    @ApiOperation(value = "删除单条数据",notes = "删除单条数据接口")
    @DeleteMapping("/tdalSetHost/{id}")
    public ApiResponse delete(String id){
          return tdalSetHostService.delete(id);
    }


}
