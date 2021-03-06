package com.jihai.mengmian.controller;

import com.jihai.mengmian.service.TVideoDemoService;
import com.jihai.mengmian.vo.TVideoDemoVo;
import com.jihai.mengmian.dto.TVideoDemoDto;
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
 * <b>Time：</b> 2017-12-07 16:37:28 <br>
 * <b>Contact：<b>wechat and phone number - 13826126615<br>
 */
@Api(description = "Restful-Api接口服务", tags = " Restful-Api接口服务")
@RestController
public class TVideoDemoController {

    @Autowired
    private TVideoDemoService tVideoDemoService;

    @ApiOperation(value = "新增",notes = "新增接口")
    @PostMapping("/tVideoDemo")
    public ApiResponse<TVideoDemoVo> insert(@RequestBody TVideoDemoDto tVideoDemoDto){
          return tVideoDemoService.insert(tVideoDemoDto);
    }


    @ApiOperation(value = "修改",notes = "修改接口")
    @PutMapping("/tVideoDemo")
    public ApiResponse<TVideoDemoVo> update(@RequestBody TVideoDemoDto tVideoDemoDto){
          return tVideoDemoService.update(tVideoDemoDto);
    }

    @ApiOperation(value = "查询单条数据",notes = "查询单条数据接口")
    @GetMapping("/tVideoDemo/{id}")
    public ApiResponse<TVideoDemoVo> findOne(@PathVariable("id") String id){
          return tVideoDemoService.findOne(id);
    }

    @ApiOperation(value = "查询所有数据",notes = "查询所有数据接口")
    @GetMapping("/tVideoDemo")
    public ApiResponse<List<TVideoDemoVo>> findAll(){
          return tVideoDemoService.findAll();
    }

    @ApiOperation(value = "删除单条数据",notes = "删除单条数据接口")
    @DeleteMapping("/tVideoDemo/{id}")
    public ApiResponse delete(String id){
          return tVideoDemoService.delete(id);
    }


}
