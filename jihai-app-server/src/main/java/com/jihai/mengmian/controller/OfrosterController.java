package com.jihai.mengmian.controller;

import com.jihai.mengmian.service.OfrosterService;
import com.jihai.mengmian.vo.OfrosterVo;
import com.jihai.mengmian.dto.OfrosterDto;
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
public class OfrosterController {

    @Autowired
    private OfrosterService ofrosterService;

    @ApiOperation(value = "新增",notes = "新增接口")
    @PostMapping("/ofroster")
    public ApiResponse<OfrosterVo> insert(@RequestBody OfrosterDto ofrosterDto){
          return ofrosterService.insert(ofrosterDto);
    }


    @ApiOperation(value = "修改",notes = "修改接口")
    @PutMapping("/ofroster")
    public ApiResponse<OfrosterVo> update(@RequestBody OfrosterDto ofrosterDto){
          return ofrosterService.update(ofrosterDto);
    }

    @ApiOperation(value = "查询单条数据",notes = "查询单条数据接口")
    @GetMapping("/ofroster/{id}")
    public ApiResponse<OfrosterVo> findOne(@PathVariable("id") String id){
          return ofrosterService.findOne(id);
    }

    @ApiOperation(value = "查询所有数据",notes = "查询所有数据接口")
    @GetMapping("/ofroster")
    public ApiResponse<List<OfrosterVo>> findAll(){
          return ofrosterService.findAll();
    }

    @ApiOperation(value = "删除单条数据",notes = "删除单条数据接口")
    @DeleteMapping("/ofroster/{id}")
    public ApiResponse delete(String id){
          return ofrosterService.delete(id);
    }


}
