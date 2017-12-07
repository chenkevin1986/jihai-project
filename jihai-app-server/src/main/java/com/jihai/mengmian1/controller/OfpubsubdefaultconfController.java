package com.jihai.mengmian1.controller;

import com.jihai.mengmian1.service.OfpubsubdefaultconfService;
import com.jihai.mengmian1.vo.OfpubsubdefaultconfVo;
import com.jihai.mengmian1.dto.OfpubsubdefaultconfDto;
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
public class OfpubsubdefaultconfController {

    @Autowired
    private OfpubsubdefaultconfService ofpubsubdefaultconfService;

    @ApiOperation(value = "新增",notes = "新增接口")
    @PostMapping("/ofpubsubdefaultconf")
    public ApiResponse<OfpubsubdefaultconfVo> insert(@RequestBody OfpubsubdefaultconfDto ofpubsubdefaultconfDto){
          return ofpubsubdefaultconfService.insert(ofpubsubdefaultconfDto);
    }


    @ApiOperation(value = "修改",notes = "修改接口")
    @PutMapping("/ofpubsubdefaultconf")
    public ApiResponse<OfpubsubdefaultconfVo> update(@RequestBody OfpubsubdefaultconfDto ofpubsubdefaultconfDto){
          return ofpubsubdefaultconfService.update(ofpubsubdefaultconfDto);
    }

    @ApiOperation(value = "查询单条数据",notes = "查询单条数据接口")
    @GetMapping("/ofpubsubdefaultconf/{id}")
    public ApiResponse<OfpubsubdefaultconfVo> findOne(@PathVariable("id") String id){
          return ofpubsubdefaultconfService.findOne(id);
    }

    @ApiOperation(value = "查询所有数据",notes = "查询所有数据接口")
    @GetMapping("/ofpubsubdefaultconf")
    public ApiResponse<List<OfpubsubdefaultconfVo>> findAll(){
          return ofpubsubdefaultconfService.findAll();
    }

    @ApiOperation(value = "删除单条数据",notes = "删除单条数据接口")
    @DeleteMapping("/ofpubsubdefaultconf/{id}")
    public ApiResponse delete(String id){
          return ofpubsubdefaultconfService.delete(id);
    }


}
