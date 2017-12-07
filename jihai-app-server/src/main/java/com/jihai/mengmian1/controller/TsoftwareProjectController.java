package com.jihai.mengmian1.controller;

import com.jihai.mengmian1.service.TsoftwareProjectService;
import com.jihai.mengmian1.vo.TsoftwareProjectVo;
import com.jihai.mengmian1.dto.TsoftwareProjectDto;
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
public class TsoftwareProjectController {

    @Autowired
    private TsoftwareProjectService tsoftwareProjectService;

    @ApiOperation(value = "新增",notes = "新增接口")
    @PostMapping("/tsoftwareProject")
    public ApiResponse<TsoftwareProjectVo> insert(@RequestBody TsoftwareProjectDto tsoftwareProjectDto){
          return tsoftwareProjectService.insert(tsoftwareProjectDto);
    }


    @ApiOperation(value = "修改",notes = "修改接口")
    @PutMapping("/tsoftwareProject")
    public ApiResponse<TsoftwareProjectVo> update(@RequestBody TsoftwareProjectDto tsoftwareProjectDto){
          return tsoftwareProjectService.update(tsoftwareProjectDto);
    }

    @ApiOperation(value = "查询单条数据",notes = "查询单条数据接口")
    @GetMapping("/tsoftwareProject/{id}")
    public ApiResponse<TsoftwareProjectVo> findOne(@PathVariable("id") String id){
          return tsoftwareProjectService.findOne(id);
    }

    @ApiOperation(value = "查询所有数据",notes = "查询所有数据接口")
    @GetMapping("/tsoftwareProject")
    public ApiResponse<List<TsoftwareProjectVo>> findAll(){
          return tsoftwareProjectService.findAll();
    }

    @ApiOperation(value = "删除单条数据",notes = "删除单条数据接口")
    @DeleteMapping("/tsoftwareProject/{id}")
    public ApiResponse delete(String id){
          return tsoftwareProjectService.delete(id);
    }


}
