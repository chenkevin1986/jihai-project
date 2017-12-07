package com.jihai.mengmian1.controller;

import com.jihai.mengmian1.service.OfgroupService;
import com.jihai.mengmian1.vo.OfgroupVo;
import com.jihai.mengmian1.dto.OfgroupDto;
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
public class OfgroupController {

    @Autowired
    private OfgroupService ofgroupService;

    @ApiOperation(value = "新增",notes = "新增接口")
    @PostMapping("/ofgroup")
    public ApiResponse<OfgroupVo> insert(@RequestBody OfgroupDto ofgroupDto){
          return ofgroupService.insert(ofgroupDto);
    }


    @ApiOperation(value = "修改",notes = "修改接口")
    @PutMapping("/ofgroup")
    public ApiResponse<OfgroupVo> update(@RequestBody OfgroupDto ofgroupDto){
          return ofgroupService.update(ofgroupDto);
    }

    @ApiOperation(value = "查询单条数据",notes = "查询单条数据接口")
    @GetMapping("/ofgroup/{id}")
    public ApiResponse<OfgroupVo> findOne(@PathVariable("id") String id){
          return ofgroupService.findOne(id);
    }

    @ApiOperation(value = "查询所有数据",notes = "查询所有数据接口")
    @GetMapping("/ofgroup")
    public ApiResponse<List<OfgroupVo>> findAll(){
          return ofgroupService.findAll();
    }

    @ApiOperation(value = "删除单条数据",notes = "删除单条数据接口")
    @DeleteMapping("/ofgroup/{id}")
    public ApiResponse delete(String id){
          return ofgroupService.delete(id);
    }


}
