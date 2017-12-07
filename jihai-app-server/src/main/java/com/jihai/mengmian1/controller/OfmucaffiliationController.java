package com.jihai.mengmian1.controller;

import com.jihai.mengmian1.service.OfmucaffiliationService;
import com.jihai.mengmian1.vo.OfmucaffiliationVo;
import com.jihai.mengmian1.dto.OfmucaffiliationDto;
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
public class OfmucaffiliationController {

    @Autowired
    private OfmucaffiliationService ofmucaffiliationService;

    @ApiOperation(value = "新增",notes = "新增接口")
    @PostMapping("/ofmucaffiliation")
    public ApiResponse<OfmucaffiliationVo> insert(@RequestBody OfmucaffiliationDto ofmucaffiliationDto){
          return ofmucaffiliationService.insert(ofmucaffiliationDto);
    }


    @ApiOperation(value = "修改",notes = "修改接口")
    @PutMapping("/ofmucaffiliation")
    public ApiResponse<OfmucaffiliationVo> update(@RequestBody OfmucaffiliationDto ofmucaffiliationDto){
          return ofmucaffiliationService.update(ofmucaffiliationDto);
    }

    @ApiOperation(value = "查询单条数据",notes = "查询单条数据接口")
    @GetMapping("/ofmucaffiliation/{id}")
    public ApiResponse<OfmucaffiliationVo> findOne(@PathVariable("id") String id){
          return ofmucaffiliationService.findOne(id);
    }

    @ApiOperation(value = "查询所有数据",notes = "查询所有数据接口")
    @GetMapping("/ofmucaffiliation")
    public ApiResponse<List<OfmucaffiliationVo>> findAll(){
          return ofmucaffiliationService.findAll();
    }

    @ApiOperation(value = "删除单条数据",notes = "删除单条数据接口")
    @DeleteMapping("/ofmucaffiliation/{id}")
    public ApiResponse delete(String id){
          return ofmucaffiliationService.delete(id);
    }


}
