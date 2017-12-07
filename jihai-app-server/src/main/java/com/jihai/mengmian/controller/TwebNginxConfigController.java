package com.jihai.mengmian.controller;

import com.jihai.mengmian.service.TwebNginxConfigService;
import com.jihai.mengmian.vo.TwebNginxConfigVo;
import com.jihai.mengmian.dto.TwebNginxConfigDto;
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
 * <b>Time：</b> 2017-12-07 16:37:29 <br>
 * <b>Contact：<b>wechat and phone number - 13826126615<br>
 */
@Api(description = "Restful-Api接口服务", tags = " Restful-Api接口服务")
@RestController
public class TwebNginxConfigController {

    @Autowired
    private TwebNginxConfigService twebNginxConfigService;

    @ApiOperation(value = "新增",notes = "新增接口")
    @PostMapping("/twebNginxConfig")
    public ApiResponse<TwebNginxConfigVo> insert(@RequestBody TwebNginxConfigDto twebNginxConfigDto){
          return twebNginxConfigService.insert(twebNginxConfigDto);
    }


    @ApiOperation(value = "修改",notes = "修改接口")
    @PutMapping("/twebNginxConfig")
    public ApiResponse<TwebNginxConfigVo> update(@RequestBody TwebNginxConfigDto twebNginxConfigDto){
          return twebNginxConfigService.update(twebNginxConfigDto);
    }

    @ApiOperation(value = "查询单条数据",notes = "查询单条数据接口")
    @GetMapping("/twebNginxConfig/{id}")
    public ApiResponse<TwebNginxConfigVo> findOne(@PathVariable("id") String id){
          return twebNginxConfigService.findOne(id);
    }

    @ApiOperation(value = "查询所有数据",notes = "查询所有数据接口")
    @GetMapping("/twebNginxConfig")
    public ApiResponse<List<TwebNginxConfigVo>> findAll(){
          return twebNginxConfigService.findAll();
    }

    @ApiOperation(value = "删除单条数据",notes = "删除单条数据接口")
    @DeleteMapping("/twebNginxConfig/{id}")
    public ApiResponse delete(String id){
          return twebNginxConfigService.delete(id);
    }


}
