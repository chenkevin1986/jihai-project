package com.jihai.mengmian.controller;

import com.jihai.mengmian.service.OfrostergroupsService;
import com.jihai.mengmian.vo.OfrostergroupsVo;
import com.jihai.mengmian.dto.OfrostergroupsDto;
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
 * <b>Time：</b> 2017-12-07 16:37:27 <br>
 * <b>Contact：<b>wechat and phone number - 13826126615<br>
 */
@Api(description = "Restful-Api接口服务", tags = " Restful-Api接口服务")
@RestController
public class OfrostergroupsController {

    @Autowired
    private OfrostergroupsService ofrostergroupsService;

    @ApiOperation(value = "新增",notes = "新增接口")
    @PostMapping("/ofrostergroups")
    public ApiResponse<OfrostergroupsVo> insert(@RequestBody OfrostergroupsDto ofrostergroupsDto){
          return ofrostergroupsService.insert(ofrostergroupsDto);
    }


    @ApiOperation(value = "修改",notes = "修改接口")
    @PutMapping("/ofrostergroups")
    public ApiResponse<OfrostergroupsVo> update(@RequestBody OfrostergroupsDto ofrostergroupsDto){
          return ofrostergroupsService.update(ofrostergroupsDto);
    }

    @ApiOperation(value = "查询单条数据",notes = "查询单条数据接口")
    @GetMapping("/ofrostergroups/{id}")
    public ApiResponse<OfrostergroupsVo> findOne(@PathVariable("id") String id){
          return ofrostergroupsService.findOne(id);
    }

    @ApiOperation(value = "查询所有数据",notes = "查询所有数据接口")
    @GetMapping("/ofrostergroups")
    public ApiResponse<List<OfrostergroupsVo>> findAll(){
          return ofrostergroupsService.findAll();
    }

    @ApiOperation(value = "删除单条数据",notes = "删除单条数据接口")
    @DeleteMapping("/ofrostergroups/{id}")
    public ApiResponse delete(String id){
          return ofrostergroupsService.delete(id);
    }


}
