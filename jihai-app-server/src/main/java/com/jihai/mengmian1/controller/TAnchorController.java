package com.jihai.mengmian1.controller;

import com.jihai.mengmian1.service.TAnchorService;
import com.jihai.mengmian1.vo.TAnchorVo;
import com.jihai.mengmian1.dto.TAnchorDto;
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
public class TAnchorController {

    @Autowired
    private TAnchorService tAnchorService;

    @ApiOperation(value = "新增",notes = "新增接口")
    @PostMapping("/tAnchor")
    public ApiResponse<TAnchorVo> insert(@RequestBody TAnchorDto tAnchorDto){
          return tAnchorService.insert(tAnchorDto);
    }


    @ApiOperation(value = "修改",notes = "修改接口")
    @PutMapping("/tAnchor")
    public ApiResponse<TAnchorVo> update(@RequestBody TAnchorDto tAnchorDto){
          return tAnchorService.update(tAnchorDto);
    }

    @ApiOperation(value = "查询单条数据",notes = "查询单条数据接口")
    @GetMapping("/tAnchor/{id}")
    public ApiResponse<TAnchorVo> findOne(@PathVariable("id") String id){
          return tAnchorService.findOne(id);
    }

    @ApiOperation(value = "查询所有数据",notes = "查询所有数据接口")
    @GetMapping("/tAnchor")
    public ApiResponse<List<TAnchorVo>> findAll(){
          return tAnchorService.findAll();
    }

    @ApiOperation(value = "删除单条数据",notes = "删除单条数据接口")
    @DeleteMapping("/tAnchor/{id}")
    public ApiResponse delete(String id){
          return tAnchorService.delete(id);
    }


}
