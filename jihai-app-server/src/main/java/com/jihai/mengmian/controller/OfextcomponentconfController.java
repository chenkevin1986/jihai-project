package com.jihai.mengmian.controller;

import com.jihai.mengmian.service.OfextcomponentconfService;
import com.jihai.mengmian.vo.OfextcomponentconfVo;
import com.jihai.mengmian.dto.OfextcomponentconfDto;
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
public class OfextcomponentconfController {

    @Autowired
    private OfextcomponentconfService ofextcomponentconfService;

    @ApiOperation(value = "新增",notes = "新增接口")
    @PostMapping("/ofextcomponentconf")
    public ApiResponse<OfextcomponentconfVo> insert(@RequestBody OfextcomponentconfDto ofextcomponentconfDto){
          return ofextcomponentconfService.insert(ofextcomponentconfDto);
    }


    @ApiOperation(value = "修改",notes = "修改接口")
    @PutMapping("/ofextcomponentconf")
    public ApiResponse<OfextcomponentconfVo> update(@RequestBody OfextcomponentconfDto ofextcomponentconfDto){
          return ofextcomponentconfService.update(ofextcomponentconfDto);
    }

    @ApiOperation(value = "查询单条数据",notes = "查询单条数据接口")
    @GetMapping("/ofextcomponentconf/{id}")
    public ApiResponse<OfextcomponentconfVo> findOne(@PathVariable("id") String id){
          return ofextcomponentconfService.findOne(id);
    }

    @ApiOperation(value = "查询所有数据",notes = "查询所有数据接口")
    @GetMapping("/ofextcomponentconf")
    public ApiResponse<List<OfextcomponentconfVo>> findAll(){
          return ofextcomponentconfService.findAll();
    }

    @ApiOperation(value = "删除单条数据",notes = "删除单条数据接口")
    @DeleteMapping("/ofextcomponentconf/{id}")
    public ApiResponse delete(String id){
          return ofextcomponentconfService.delete(id);
    }


}
