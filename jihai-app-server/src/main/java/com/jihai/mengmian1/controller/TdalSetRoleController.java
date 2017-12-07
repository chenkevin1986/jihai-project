package com.jihai.mengmian1.controller;

import com.jihai.mengmian1.service.TdalSetRoleService;
import com.jihai.mengmian1.vo.TdalSetRoleVo;
import com.jihai.mengmian1.dto.TdalSetRoleDto;
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
public class TdalSetRoleController {

    @Autowired
    private TdalSetRoleService tdalSetRoleService;

    @ApiOperation(value = "新增",notes = "新增接口")
    @PostMapping("/tdalSetRole")
    public ApiResponse<TdalSetRoleVo> insert(@RequestBody TdalSetRoleDto tdalSetRoleDto){
          return tdalSetRoleService.insert(tdalSetRoleDto);
    }


    @ApiOperation(value = "修改",notes = "修改接口")
    @PutMapping("/tdalSetRole")
    public ApiResponse<TdalSetRoleVo> update(@RequestBody TdalSetRoleDto tdalSetRoleDto){
          return tdalSetRoleService.update(tdalSetRoleDto);
    }

    @ApiOperation(value = "查询单条数据",notes = "查询单条数据接口")
    @GetMapping("/tdalSetRole/{id}")
    public ApiResponse<TdalSetRoleVo> findOne(@PathVariable("id") String id){
          return tdalSetRoleService.findOne(id);
    }

    @ApiOperation(value = "查询所有数据",notes = "查询所有数据接口")
    @GetMapping("/tdalSetRole")
    public ApiResponse<List<TdalSetRoleVo>> findAll(){
          return tdalSetRoleService.findAll();
    }

    @ApiOperation(value = "删除单条数据",notes = "删除单条数据接口")
    @DeleteMapping("/tdalSetRole/{id}")
    public ApiResponse delete(String id){
          return tdalSetRoleService.delete(id);
    }


}
