package com.jihai.mengmian1.controller;

import com.jihai.mengmian1.service.TdalSetDescriptionService;
import com.jihai.mengmian1.vo.TdalSetDescriptionVo;
import com.jihai.mengmian1.dto.TdalSetDescriptionDto;
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
public class TdalSetDescriptionController {

    @Autowired
    private TdalSetDescriptionService tdalSetDescriptionService;

    @ApiOperation(value = "新增",notes = "新增接口")
    @PostMapping("/tdalSetDescription")
    public ApiResponse<TdalSetDescriptionVo> insert(@RequestBody TdalSetDescriptionDto tdalSetDescriptionDto){
          return tdalSetDescriptionService.insert(tdalSetDescriptionDto);
    }


    @ApiOperation(value = "修改",notes = "修改接口")
    @PutMapping("/tdalSetDescription")
    public ApiResponse<TdalSetDescriptionVo> update(@RequestBody TdalSetDescriptionDto tdalSetDescriptionDto){
          return tdalSetDescriptionService.update(tdalSetDescriptionDto);
    }

    @ApiOperation(value = "查询单条数据",notes = "查询单条数据接口")
    @GetMapping("/tdalSetDescription/{id}")
    public ApiResponse<TdalSetDescriptionVo> findOne(@PathVariable("id") String id){
          return tdalSetDescriptionService.findOne(id);
    }

    @ApiOperation(value = "查询所有数据",notes = "查询所有数据接口")
    @GetMapping("/tdalSetDescription")
    public ApiResponse<List<TdalSetDescriptionVo>> findAll(){
          return tdalSetDescriptionService.findAll();
    }

    @ApiOperation(value = "删除单条数据",notes = "删除单条数据接口")
    @DeleteMapping("/tdalSetDescription/{id}")
    public ApiResponse delete(String id){
          return tdalSetDescriptionService.delete(id);
    }


}
