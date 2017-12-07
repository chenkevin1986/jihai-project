package com.jihai.mengmian1.controller;

import com.jihai.mengmian1.service.TShareAppService;
import com.jihai.mengmian1.vo.TShareAppVo;
import com.jihai.mengmian1.dto.TShareAppDto;
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
public class TShareAppController {

    @Autowired
    private TShareAppService tShareAppService;

    @ApiOperation(value = "新增",notes = "新增接口")
    @PostMapping("/tShareApp")
    public ApiResponse<TShareAppVo> insert(@RequestBody TShareAppDto tShareAppDto){
          return tShareAppService.insert(tShareAppDto);
    }


    @ApiOperation(value = "修改",notes = "修改接口")
    @PutMapping("/tShareApp")
    public ApiResponse<TShareAppVo> update(@RequestBody TShareAppDto tShareAppDto){
          return tShareAppService.update(tShareAppDto);
    }

    @ApiOperation(value = "查询单条数据",notes = "查询单条数据接口")
    @GetMapping("/tShareApp/{id}")
    public ApiResponse<TShareAppVo> findOne(@PathVariable("id") String id){
          return tShareAppService.findOne(id);
    }

    @ApiOperation(value = "查询所有数据",notes = "查询所有数据接口")
    @GetMapping("/tShareApp")
    public ApiResponse<List<TShareAppVo>> findAll(){
          return tShareAppService.findAll();
    }

    @ApiOperation(value = "删除单条数据",notes = "删除单条数据接口")
    @DeleteMapping("/tShareApp/{id}")
    public ApiResponse delete(String id){
          return tShareAppService.delete(id);
    }


}
