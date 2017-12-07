package com.jihai.mengmian1.controller;

import com.jihai.mengmian1.service.TExtraProductService;
import com.jihai.mengmian1.vo.TExtraProductVo;
import com.jihai.mengmian1.dto.TExtraProductDto;
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
public class TExtraProductController {

    @Autowired
    private TExtraProductService tExtraProductService;

    @ApiOperation(value = "新增",notes = "新增接口")
    @PostMapping("/tExtraProduct")
    public ApiResponse<TExtraProductVo> insert(@RequestBody TExtraProductDto tExtraProductDto){
          return tExtraProductService.insert(tExtraProductDto);
    }


    @ApiOperation(value = "修改",notes = "修改接口")
    @PutMapping("/tExtraProduct")
    public ApiResponse<TExtraProductVo> update(@RequestBody TExtraProductDto tExtraProductDto){
          return tExtraProductService.update(tExtraProductDto);
    }

    @ApiOperation(value = "查询单条数据",notes = "查询单条数据接口")
    @GetMapping("/tExtraProduct/{id}")
    public ApiResponse<TExtraProductVo> findOne(@PathVariable("id") String id){
          return tExtraProductService.findOne(id);
    }

    @ApiOperation(value = "查询所有数据",notes = "查询所有数据接口")
    @GetMapping("/tExtraProduct")
    public ApiResponse<List<TExtraProductVo>> findAll(){
          return tExtraProductService.findAll();
    }

    @ApiOperation(value = "删除单条数据",notes = "删除单条数据接口")
    @DeleteMapping("/tExtraProduct/{id}")
    public ApiResponse delete(String id){
          return tExtraProductService.delete(id);
    }


}
