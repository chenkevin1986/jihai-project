package com.jihai.mengmian.controller;

import com.jihai.mengmian.service.OfgrouppropService;
import com.jihai.mengmian.vo.OfgrouppropVo;
import com.jihai.mengmian.dto.OfgrouppropDto;
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
public class OfgrouppropController {

    @Autowired
    private OfgrouppropService ofgrouppropService;

    @ApiOperation(value = "新增",notes = "新增接口")
    @PostMapping("/ofgroupprop")
    public ApiResponse<OfgrouppropVo> insert(@RequestBody OfgrouppropDto ofgrouppropDto){
          return ofgrouppropService.insert(ofgrouppropDto);
    }


    @ApiOperation(value = "修改",notes = "修改接口")
    @PutMapping("/ofgroupprop")
    public ApiResponse<OfgrouppropVo> update(@RequestBody OfgrouppropDto ofgrouppropDto){
          return ofgrouppropService.update(ofgrouppropDto);
    }

    @ApiOperation(value = "查询单条数据",notes = "查询单条数据接口")
    @GetMapping("/ofgroupprop/{id}")
    public ApiResponse<OfgrouppropVo> findOne(@PathVariable("id") String id){
          return ofgrouppropService.findOne(id);
    }

    @ApiOperation(value = "查询所有数据",notes = "查询所有数据接口")
    @GetMapping("/ofgroupprop")
    public ApiResponse<List<OfgrouppropVo>> findAll(){
          return ofgrouppropService.findAll();
    }

    @ApiOperation(value = "删除单条数据",notes = "删除单条数据接口")
    @DeleteMapping("/ofgroupprop/{id}")
    public ApiResponse delete(String id){
          return ofgrouppropService.delete(id);
    }


}
