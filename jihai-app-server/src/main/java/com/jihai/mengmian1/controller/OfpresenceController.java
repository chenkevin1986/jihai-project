package com.jihai.mengmian1.controller;

import com.jihai.mengmian1.service.OfpresenceService;
import com.jihai.mengmian1.vo.OfpresenceVo;
import com.jihai.mengmian1.dto.OfpresenceDto;
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
public class OfpresenceController {

    @Autowired
    private OfpresenceService ofpresenceService;

    @ApiOperation(value = "新增",notes = "新增接口")
    @PostMapping("/ofpresence")
    public ApiResponse<OfpresenceVo> insert(@RequestBody OfpresenceDto ofpresenceDto){
          return ofpresenceService.insert(ofpresenceDto);
    }


    @ApiOperation(value = "修改",notes = "修改接口")
    @PutMapping("/ofpresence")
    public ApiResponse<OfpresenceVo> update(@RequestBody OfpresenceDto ofpresenceDto){
          return ofpresenceService.update(ofpresenceDto);
    }

    @ApiOperation(value = "查询单条数据",notes = "查询单条数据接口")
    @GetMapping("/ofpresence/{id}")
    public ApiResponse<OfpresenceVo> findOne(@PathVariable("id") String id){
          return ofpresenceService.findOne(id);
    }

    @ApiOperation(value = "查询所有数据",notes = "查询所有数据接口")
    @GetMapping("/ofpresence")
    public ApiResponse<List<OfpresenceVo>> findAll(){
          return ofpresenceService.findAll();
    }

    @ApiOperation(value = "删除单条数据",notes = "删除单条数据接口")
    @DeleteMapping("/ofpresence/{id}")
    public ApiResponse delete(String id){
          return ofpresenceService.delete(id);
    }


}
