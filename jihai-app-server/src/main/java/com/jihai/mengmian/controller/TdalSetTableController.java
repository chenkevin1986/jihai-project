package com.jihai.mengmian.controller;

import com.jihai.mengmian.service.TdalSetTableService;
import com.jihai.mengmian.vo.TdalSetTableVo;
import com.jihai.mengmian.dto.TdalSetTableDto;
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
public class TdalSetTableController {

    @Autowired
    private TdalSetTableService tdalSetTableService;

    @ApiOperation(value = "新增",notes = "新增接口")
    @PostMapping("/tdalSetTable")
    public ApiResponse<TdalSetTableVo> insert(@RequestBody TdalSetTableDto tdalSetTableDto){
          return tdalSetTableService.insert(tdalSetTableDto);
    }


    @ApiOperation(value = "修改",notes = "修改接口")
    @PutMapping("/tdalSetTable")
    public ApiResponse<TdalSetTableVo> update(@RequestBody TdalSetTableDto tdalSetTableDto){
          return tdalSetTableService.update(tdalSetTableDto);
    }

    @ApiOperation(value = "查询单条数据",notes = "查询单条数据接口")
    @GetMapping("/tdalSetTable/{id}")
    public ApiResponse<TdalSetTableVo> findOne(@PathVariable("id") String id){
          return tdalSetTableService.findOne(id);
    }

    @ApiOperation(value = "查询所有数据",notes = "查询所有数据接口")
    @GetMapping("/tdalSetTable")
    public ApiResponse<List<TdalSetTableVo>> findAll(){
          return tdalSetTableService.findAll();
    }

    @ApiOperation(value = "删除单条数据",notes = "删除单条数据接口")
    @DeleteMapping("/tdalSetTable/{id}")
    public ApiResponse delete(String id){
          return tdalSetTableService.delete(id);
    }


}
