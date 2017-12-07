package com.jihai.mengmian1.controller;

import com.jihai.mengmian1.service.OfprivateService;
import com.jihai.mengmian1.vo.OfprivateVo;
import com.jihai.mengmian1.dto.OfprivateDto;
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
public class OfprivateController {

    @Autowired
    private OfprivateService ofprivateService;

    @ApiOperation(value = "新增",notes = "新增接口")
    @PostMapping("/ofprivate")
    public ApiResponse<OfprivateVo> insert(@RequestBody OfprivateDto ofprivateDto){
          return ofprivateService.insert(ofprivateDto);
    }


    @ApiOperation(value = "修改",notes = "修改接口")
    @PutMapping("/ofprivate")
    public ApiResponse<OfprivateVo> update(@RequestBody OfprivateDto ofprivateDto){
          return ofprivateService.update(ofprivateDto);
    }

    @ApiOperation(value = "查询单条数据",notes = "查询单条数据接口")
    @GetMapping("/ofprivate/{id}")
    public ApiResponse<OfprivateVo> findOne(@PathVariable("id") String id){
          return ofprivateService.findOne(id);
    }

    @ApiOperation(value = "查询所有数据",notes = "查询所有数据接口")
    @GetMapping("/ofprivate")
    public ApiResponse<List<OfprivateVo>> findAll(){
          return ofprivateService.findAll();
    }

    @ApiOperation(value = "删除单条数据",notes = "删除单条数据接口")
    @DeleteMapping("/ofprivate/{id}")
    public ApiResponse delete(String id){
          return ofprivateService.delete(id);
    }


}
