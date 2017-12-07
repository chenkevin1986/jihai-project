package com.jihai.mengmian.controller;

import com.jihai.mengmian.service.TdalSetRoleServiceRelationService;
import com.jihai.mengmian.vo.TdalSetRoleServiceRelationVo;
import com.jihai.mengmian.dto.TdalSetRoleServiceRelationDto;
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
public class TdalSetRoleServiceRelationController {

    @Autowired
    private TdalSetRoleServiceRelationService tdalSetRoleServiceRelationService;

    @ApiOperation(value = "新增",notes = "新增接口")
    @PostMapping("/tdalSetRoleServiceRelation")
    public ApiResponse<TdalSetRoleServiceRelationVo> insert(@RequestBody TdalSetRoleServiceRelationDto tdalSetRoleServiceRelationDto){
          return tdalSetRoleServiceRelationService.insert(tdalSetRoleServiceRelationDto);
    }


    @ApiOperation(value = "修改",notes = "修改接口")
    @PutMapping("/tdalSetRoleServiceRelation")
    public ApiResponse<TdalSetRoleServiceRelationVo> update(@RequestBody TdalSetRoleServiceRelationDto tdalSetRoleServiceRelationDto){
          return tdalSetRoleServiceRelationService.update(tdalSetRoleServiceRelationDto);
    }

    @ApiOperation(value = "查询单条数据",notes = "查询单条数据接口")
    @GetMapping("/tdalSetRoleServiceRelation/{id}")
    public ApiResponse<TdalSetRoleServiceRelationVo> findOne(@PathVariable("id") String id){
          return tdalSetRoleServiceRelationService.findOne(id);
    }

    @ApiOperation(value = "查询所有数据",notes = "查询所有数据接口")
    @GetMapping("/tdalSetRoleServiceRelation")
    public ApiResponse<List<TdalSetRoleServiceRelationVo>> findAll(){
          return tdalSetRoleServiceRelationService.findAll();
    }

    @ApiOperation(value = "删除单条数据",notes = "删除单条数据接口")
    @DeleteMapping("/tdalSetRoleServiceRelation/{id}")
    public ApiResponse delete(String id){
          return tdalSetRoleServiceRelationService.delete(id);
    }


}
