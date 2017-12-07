package com.jihai.mengmian1.controller;

import com.jihai.mengmian1.service.OfpubsubaffiliationService;
import com.jihai.mengmian1.vo.OfpubsubaffiliationVo;
import com.jihai.mengmian1.dto.OfpubsubaffiliationDto;
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
public class OfpubsubaffiliationController {

    @Autowired
    private OfpubsubaffiliationService ofpubsubaffiliationService;

    @ApiOperation(value = "新增",notes = "新增接口")
    @PostMapping("/ofpubsubaffiliation")
    public ApiResponse<OfpubsubaffiliationVo> insert(@RequestBody OfpubsubaffiliationDto ofpubsubaffiliationDto){
          return ofpubsubaffiliationService.insert(ofpubsubaffiliationDto);
    }


    @ApiOperation(value = "修改",notes = "修改接口")
    @PutMapping("/ofpubsubaffiliation")
    public ApiResponse<OfpubsubaffiliationVo> update(@RequestBody OfpubsubaffiliationDto ofpubsubaffiliationDto){
          return ofpubsubaffiliationService.update(ofpubsubaffiliationDto);
    }

    @ApiOperation(value = "查询单条数据",notes = "查询单条数据接口")
    @GetMapping("/ofpubsubaffiliation/{id}")
    public ApiResponse<OfpubsubaffiliationVo> findOne(@PathVariable("id") String id){
          return ofpubsubaffiliationService.findOne(id);
    }

    @ApiOperation(value = "查询所有数据",notes = "查询所有数据接口")
    @GetMapping("/ofpubsubaffiliation")
    public ApiResponse<List<OfpubsubaffiliationVo>> findAll(){
          return ofpubsubaffiliationService.findAll();
    }

    @ApiOperation(value = "删除单条数据",notes = "删除单条数据接口")
    @DeleteMapping("/ofpubsubaffiliation/{id}")
    public ApiResponse delete(String id){
          return ofpubsubaffiliationService.delete(id);
    }


}
