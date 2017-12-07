package com.jihai.mengmian.controller;

import com.jihai.mengmian.service.TSmsResendTaskService;
import com.jihai.mengmian.vo.TSmsResendTaskVo;
import com.jihai.mengmian.dto.TSmsResendTaskDto;
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
public class TSmsResendTaskController {

    @Autowired
    private TSmsResendTaskService tSmsResendTaskService;

    @ApiOperation(value = "新增",notes = "新增接口")
    @PostMapping("/tSmsResendTask")
    public ApiResponse<TSmsResendTaskVo> insert(@RequestBody TSmsResendTaskDto tSmsResendTaskDto){
          return tSmsResendTaskService.insert(tSmsResendTaskDto);
    }


    @ApiOperation(value = "修改",notes = "修改接口")
    @PutMapping("/tSmsResendTask")
    public ApiResponse<TSmsResendTaskVo> update(@RequestBody TSmsResendTaskDto tSmsResendTaskDto){
          return tSmsResendTaskService.update(tSmsResendTaskDto);
    }

    @ApiOperation(value = "查询单条数据",notes = "查询单条数据接口")
    @GetMapping("/tSmsResendTask/{id}")
    public ApiResponse<TSmsResendTaskVo> findOne(@PathVariable("id") String id){
          return tSmsResendTaskService.findOne(id);
    }

    @ApiOperation(value = "查询所有数据",notes = "查询所有数据接口")
    @GetMapping("/tSmsResendTask")
    public ApiResponse<List<TSmsResendTaskVo>> findAll(){
          return tSmsResendTaskService.findAll();
    }

    @ApiOperation(value = "删除单条数据",notes = "删除单条数据接口")
    @DeleteMapping("/tSmsResendTask/{id}")
    public ApiResponse delete(String id){
          return tSmsResendTaskService.delete(id);
    }


}
