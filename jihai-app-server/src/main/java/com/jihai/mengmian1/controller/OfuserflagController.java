package com.jihai.mengmian1.controller;

import com.jihai.mengmian1.service.OfuserflagService;
import com.jihai.mengmian1.vo.OfuserflagVo;
import com.jihai.mengmian1.dto.OfuserflagDto;
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
 * <b>Time：</b> 2017-12-07 16:39:06 <br>
 * <b>Contact：<b>wechat and phone number - 13826126615<br>
 */
@Api(description = "Restful-Api接口服务", tags = " Restful-Api接口服务")
@RestController
public class OfuserflagController {

    @Autowired
    private OfuserflagService ofuserflagService;

    @ApiOperation(value = "新增",notes = "新增接口")
    @PostMapping("/ofuserflag")
    public ApiResponse<OfuserflagVo> insert(@RequestBody OfuserflagDto ofuserflagDto){
          return ofuserflagService.insert(ofuserflagDto);
    }


    @ApiOperation(value = "修改",notes = "修改接口")
    @PutMapping("/ofuserflag")
    public ApiResponse<OfuserflagVo> update(@RequestBody OfuserflagDto ofuserflagDto){
          return ofuserflagService.update(ofuserflagDto);
    }

    @ApiOperation(value = "查询单条数据",notes = "查询单条数据接口")
    @GetMapping("/ofuserflag/{id}")
    public ApiResponse<OfuserflagVo> findOne(@PathVariable("id") String id){
          return ofuserflagService.findOne(id);
    }

    @ApiOperation(value = "查询所有数据",notes = "查询所有数据接口")
    @GetMapping("/ofuserflag")
    public ApiResponse<List<OfuserflagVo>> findAll(){
          return ofuserflagService.findAll();
    }

    @ApiOperation(value = "删除单条数据",notes = "删除单条数据接口")
    @DeleteMapping("/ofuserflag/{id}")
    public ApiResponse delete(String id){
          return ofuserflagService.delete(id);
    }


}
