package com.jihai.mengmian1.controller;

import com.jihai.mengmian1.service.TSmsVerifyService;
import com.jihai.mengmian1.vo.TSmsVerifyVo;
import com.jihai.mengmian1.dto.TSmsVerifyDto;
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
public class TSmsVerifyController {

    @Autowired
    private TSmsVerifyService tSmsVerifyService;

    @ApiOperation(value = "新增",notes = "新增接口")
    @PostMapping("/tSmsVerify")
    public ApiResponse<TSmsVerifyVo> insert(@RequestBody TSmsVerifyDto tSmsVerifyDto){
          return tSmsVerifyService.insert(tSmsVerifyDto);
    }


    @ApiOperation(value = "修改",notes = "修改接口")
    @PutMapping("/tSmsVerify")
    public ApiResponse<TSmsVerifyVo> update(@RequestBody TSmsVerifyDto tSmsVerifyDto){
          return tSmsVerifyService.update(tSmsVerifyDto);
    }

    @ApiOperation(value = "查询单条数据",notes = "查询单条数据接口")
    @GetMapping("/tSmsVerify/{id}")
    public ApiResponse<TSmsVerifyVo> findOne(@PathVariable("id") String id){
          return tSmsVerifyService.findOne(id);
    }

    @ApiOperation(value = "查询所有数据",notes = "查询所有数据接口")
    @GetMapping("/tSmsVerify")
    public ApiResponse<List<TSmsVerifyVo>> findAll(){
          return tSmsVerifyService.findAll();
    }

    @ApiOperation(value = "删除单条数据",notes = "删除单条数据接口")
    @DeleteMapping("/tSmsVerify/{id}")
    public ApiResponse delete(String id){
          return tSmsVerifyService.delete(id);
    }


}
