package com.jihai.mengmian1.controller;

import com.jihai.mengmian1.service.TShareDetailService;
import com.jihai.mengmian1.vo.TShareDetailVo;
import com.jihai.mengmian1.dto.TShareDetailDto;
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
public class TShareDetailController {

    @Autowired
    private TShareDetailService tShareDetailService;

    @ApiOperation(value = "新增",notes = "新增接口")
    @PostMapping("/tShareDetail")
    public ApiResponse<TShareDetailVo> insert(@RequestBody TShareDetailDto tShareDetailDto){
          return tShareDetailService.insert(tShareDetailDto);
    }


    @ApiOperation(value = "修改",notes = "修改接口")
    @PutMapping("/tShareDetail")
    public ApiResponse<TShareDetailVo> update(@RequestBody TShareDetailDto tShareDetailDto){
          return tShareDetailService.update(tShareDetailDto);
    }

    @ApiOperation(value = "查询单条数据",notes = "查询单条数据接口")
    @GetMapping("/tShareDetail/{id}")
    public ApiResponse<TShareDetailVo> findOne(@PathVariable("id") String id){
          return tShareDetailService.findOne(id);
    }

    @ApiOperation(value = "查询所有数据",notes = "查询所有数据接口")
    @GetMapping("/tShareDetail")
    public ApiResponse<List<TShareDetailVo>> findAll(){
          return tShareDetailService.findAll();
    }

    @ApiOperation(value = "删除单条数据",notes = "删除单条数据接口")
    @DeleteMapping("/tShareDetail/{id}")
    public ApiResponse delete(String id){
          return tShareDetailService.delete(id);
    }


}
