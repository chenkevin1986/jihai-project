package com.jihai.mengmian1.controller;

import com.jihai.mengmian1.service.OfmucserviceService;
import com.jihai.mengmian1.vo.OfmucserviceVo;
import com.jihai.mengmian1.dto.OfmucserviceDto;
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
public class OfmucserviceController {

    @Autowired
    private OfmucserviceService ofmucserviceService;

    @ApiOperation(value = "新增",notes = "新增接口")
    @PostMapping("/ofmucservice")
    public ApiResponse<OfmucserviceVo> insert(@RequestBody OfmucserviceDto ofmucserviceDto){
          return ofmucserviceService.insert(ofmucserviceDto);
    }


    @ApiOperation(value = "修改",notes = "修改接口")
    @PutMapping("/ofmucservice")
    public ApiResponse<OfmucserviceVo> update(@RequestBody OfmucserviceDto ofmucserviceDto){
          return ofmucserviceService.update(ofmucserviceDto);
    }

    @ApiOperation(value = "查询单条数据",notes = "查询单条数据接口")
    @GetMapping("/ofmucservice/{id}")
    public ApiResponse<OfmucserviceVo> findOne(@PathVariable("id") String id){
          return ofmucserviceService.findOne(id);
    }

    @ApiOperation(value = "查询所有数据",notes = "查询所有数据接口")
    @GetMapping("/ofmucservice")
    public ApiResponse<List<OfmucserviceVo>> findAll(){
          return ofmucserviceService.findAll();
    }

    @ApiOperation(value = "删除单条数据",notes = "删除单条数据接口")
    @DeleteMapping("/ofmucservice/{id}")
    public ApiResponse delete(String id){
          return ofmucserviceService.delete(id);
    }


}
