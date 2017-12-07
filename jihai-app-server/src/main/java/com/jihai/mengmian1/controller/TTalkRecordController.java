package com.jihai.mengmian1.controller;

import com.jihai.mengmian1.service.TTalkRecordService;
import com.jihai.mengmian1.vo.TTalkRecordVo;
import com.jihai.mengmian1.dto.TTalkRecordDto;
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
 * <b>Time：</b> 2017-12-07 16:39:07 <br>
 * <b>Contact：<b>wechat and phone number - 13826126615<br>
 */
@Api(description = "Restful-Api接口服务", tags = " Restful-Api接口服务")
@RestController
public class TTalkRecordController {

    @Autowired
    private TTalkRecordService tTalkRecordService;

    @ApiOperation(value = "新增",notes = "新增接口")
    @PostMapping("/tTalkRecord")
    public ApiResponse<TTalkRecordVo> insert(@RequestBody TTalkRecordDto tTalkRecordDto){
          return tTalkRecordService.insert(tTalkRecordDto);
    }


    @ApiOperation(value = "修改",notes = "修改接口")
    @PutMapping("/tTalkRecord")
    public ApiResponse<TTalkRecordVo> update(@RequestBody TTalkRecordDto tTalkRecordDto){
          return tTalkRecordService.update(tTalkRecordDto);
    }

    @ApiOperation(value = "查询单条数据",notes = "查询单条数据接口")
    @GetMapping("/tTalkRecord/{id}")
    public ApiResponse<TTalkRecordVo> findOne(@PathVariable("id") String id){
          return tTalkRecordService.findOne(id);
    }

    @ApiOperation(value = "查询所有数据",notes = "查询所有数据接口")
    @GetMapping("/tTalkRecord")
    public ApiResponse<List<TTalkRecordVo>> findAll(){
          return tTalkRecordService.findAll();
    }

    @ApiOperation(value = "删除单条数据",notes = "删除单条数据接口")
    @DeleteMapping("/tTalkRecord/{id}")
    public ApiResponse delete(String id){
          return tTalkRecordService.delete(id);
    }


}
