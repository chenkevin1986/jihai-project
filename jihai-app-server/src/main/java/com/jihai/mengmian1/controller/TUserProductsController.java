package com.jihai.mengmian1.controller;

import com.jihai.mengmian1.service.TUserProductsService;
import com.jihai.mengmian1.vo.TUserProductsVo;
import com.jihai.mengmian1.dto.TUserProductsDto;
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
public class TUserProductsController {

    @Autowired
    private TUserProductsService tUserProductsService;

    @ApiOperation(value = "新增",notes = "新增接口")
    @PostMapping("/tUserProducts")
    public ApiResponse<TUserProductsVo> insert(@RequestBody TUserProductsDto tUserProductsDto){
          return tUserProductsService.insert(tUserProductsDto);
    }


    @ApiOperation(value = "修改",notes = "修改接口")
    @PutMapping("/tUserProducts")
    public ApiResponse<TUserProductsVo> update(@RequestBody TUserProductsDto tUserProductsDto){
          return tUserProductsService.update(tUserProductsDto);
    }

    @ApiOperation(value = "查询单条数据",notes = "查询单条数据接口")
    @GetMapping("/tUserProducts/{id}")
    public ApiResponse<TUserProductsVo> findOne(@PathVariable("id") String id){
          return tUserProductsService.findOne(id);
    }

    @ApiOperation(value = "查询所有数据",notes = "查询所有数据接口")
    @GetMapping("/tUserProducts")
    public ApiResponse<List<TUserProductsVo>> findAll(){
          return tUserProductsService.findAll();
    }

    @ApiOperation(value = "删除单条数据",notes = "删除单条数据接口")
    @DeleteMapping("/tUserProducts/{id}")
    public ApiResponse delete(String id){
          return tUserProductsService.delete(id);
    }


}
