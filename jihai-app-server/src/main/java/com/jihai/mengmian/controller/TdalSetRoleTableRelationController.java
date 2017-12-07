package com.jihai.mengmian.controller;

import com.jihai.mengmian.service.TdalSetRoleTableRelationService;
import com.jihai.mengmian.vo.TdalSetRoleTableRelationVo;
import com.jihai.mengmian.dto.TdalSetRoleTableRelationDto;
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
public class TdalSetRoleTableRelationController {

    @Autowired
    private TdalSetRoleTableRelationService tdalSetRoleTableRelationService;

    @ApiOperation(value = "新增",notes = "新增接口")
    @PostMapping("/tdalSetRoleTableRelation")
    public ApiResponse<TdalSetRoleTableRelationVo> insert(@RequestBody TdalSetRoleTableRelationDto tdalSetRoleTableRelationDto){
          return tdalSetRoleTableRelationService.insert(tdalSetRoleTableRelationDto);
    }


    @ApiOperation(value = "修改",notes = "修改接口")
    @PutMapping("/tdalSetRoleTableRelation")
    public ApiResponse<TdalSetRoleTableRelationVo> update(@RequestBody TdalSetRoleTableRelationDto tdalSetRoleTableRelationDto){
          return tdalSetRoleTableRelationService.update(tdalSetRoleTableRelationDto);
    }

    @ApiOperation(value = "查询单条数据",notes = "查询单条数据接口")
    @GetMapping("/tdalSetRoleTableRelation/{id}")
    public ApiResponse<TdalSetRoleTableRelationVo> findOne(@PathVariable("id") String id){
          return tdalSetRoleTableRelationService.findOne(id);
    }

    @ApiOperation(value = "查询所有数据",notes = "查询所有数据接口")
    @GetMapping("/tdalSetRoleTableRelation")
    public ApiResponse<List<TdalSetRoleTableRelationVo>> findAll(){
          return tdalSetRoleTableRelationService.findAll();
    }

    @ApiOperation(value = "删除单条数据",notes = "删除单条数据接口")
    @DeleteMapping("/tdalSetRoleTableRelation/{id}")
    public ApiResponse delete(String id){
          return tdalSetRoleTableRelationService.delete(id);
    }


}
