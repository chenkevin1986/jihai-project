package com.jihai.mengmian.controller;

import com.jihai.mengmian.service.OfuserService;
import com.jihai.mengmian.vo.OfuserVo;
import com.jihai.mengmian.dto.OfuserDto;
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
public class OfuserController {

    @Autowired
    private OfuserService ofuserService;

    @ApiOperation(value = "新增",notes = "新增接口")
    @PostMapping("/ofuser")
    public ApiResponse<OfuserVo> insert(@RequestBody OfuserDto ofuserDto){
          return ofuserService.insert(ofuserDto);
    }


    @ApiOperation(value = "修改",notes = "修改接口")
    @PutMapping("/ofuser")
    public ApiResponse<OfuserVo> update(@RequestBody OfuserDto ofuserDto){
          return ofuserService.update(ofuserDto);
    }

    @ApiOperation(value = "查询单条数据",notes = "查询单条数据接口")
    @GetMapping("/ofuser/{id}")
    public ApiResponse<OfuserVo> findOne(@PathVariable("id") String id){
          return ofuserService.findOne(id);
    }

    @ApiOperation(value = "查询所有数据",notes = "查询所有数据接口")
    @GetMapping("/ofuser")
    public ApiResponse<List<OfuserVo>> findAll(){
          return ofuserService.findAll();
    }

    @ApiOperation(value = "删除单条数据",notes = "删除单条数据接口")
    @DeleteMapping("/ofuser/{id}")
    public ApiResponse delete(String id){
          return ofuserService.delete(id);
    }


}
