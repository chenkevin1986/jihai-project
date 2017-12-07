package com.jihai.mengmian.controller;

import com.jihai.mengmian.service.OfidService;
import com.jihai.mengmian.vo.OfidVo;
import com.jihai.mengmian.dto.OfidDto;
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
public class OfidController {

    @Autowired
    private OfidService ofidService;

    @ApiOperation(value = "新增",notes = "新增接口")
    @PostMapping("/ofid")
    public ApiResponse<OfidVo> insert(@RequestBody OfidDto ofidDto){
          return ofidService.insert(ofidDto);
    }


    @ApiOperation(value = "修改",notes = "修改接口")
    @PutMapping("/ofid")
    public ApiResponse<OfidVo> update(@RequestBody OfidDto ofidDto){
          return ofidService.update(ofidDto);
    }

    @ApiOperation(value = "查询单条数据",notes = "查询单条数据接口")
    @GetMapping("/ofid/{id}")
    public ApiResponse<OfidVo> findOne(@PathVariable("id") String id){
          return ofidService.findOne(id);
    }

    @ApiOperation(value = "查询所有数据",notes = "查询所有数据接口")
    @GetMapping("/ofid")
    public ApiResponse<List<OfidVo>> findAll(){
          return ofidService.findAll();
    }

    @ApiOperation(value = "删除单条数据",notes = "删除单条数据接口")
    @DeleteMapping("/ofid/{id}")
    public ApiResponse delete(String id){
          return ofidService.delete(id);
    }


}
