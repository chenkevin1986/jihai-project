package com.jihai.mengmian1.controller;

import com.jihai.mengmian1.service.OfuserpropService;
import com.jihai.mengmian1.vo.OfuserpropVo;
import com.jihai.mengmian1.dto.OfuserpropDto;
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
public class OfuserpropController {

    @Autowired
    private OfuserpropService ofuserpropService;

    @ApiOperation(value = "新增",notes = "新增接口")
    @PostMapping("/ofuserprop")
    public ApiResponse<OfuserpropVo> insert(@RequestBody OfuserpropDto ofuserpropDto){
          return ofuserpropService.insert(ofuserpropDto);
    }


    @ApiOperation(value = "修改",notes = "修改接口")
    @PutMapping("/ofuserprop")
    public ApiResponse<OfuserpropVo> update(@RequestBody OfuserpropDto ofuserpropDto){
          return ofuserpropService.update(ofuserpropDto);
    }

    @ApiOperation(value = "查询单条数据",notes = "查询单条数据接口")
    @GetMapping("/ofuserprop/{id}")
    public ApiResponse<OfuserpropVo> findOne(@PathVariable("id") String id){
          return ofuserpropService.findOne(id);
    }

    @ApiOperation(value = "查询所有数据",notes = "查询所有数据接口")
    @GetMapping("/ofuserprop")
    public ApiResponse<List<OfuserpropVo>> findAll(){
          return ofuserpropService.findAll();
    }

    @ApiOperation(value = "删除单条数据",notes = "删除单条数据接口")
    @DeleteMapping("/ofuserprop/{id}")
    public ApiResponse delete(String id){
          return ofuserpropService.delete(id);
    }


}
