package com.jihai.mengmian.controller;

import com.jihai.mengmian.service.TAnchorTopicService;
import com.jihai.mengmian.vo.TAnchorTopicVo;
import com.jihai.mengmian.dto.TAnchorTopicDto;
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
public class TAnchorTopicController {

    @Autowired
    private TAnchorTopicService tAnchorTopicService;

    @ApiOperation(value = "新增",notes = "新增接口")
    @PostMapping("/tAnchorTopic")
    public ApiResponse<TAnchorTopicVo> insert(@RequestBody TAnchorTopicDto tAnchorTopicDto){
          return tAnchorTopicService.insert(tAnchorTopicDto);
    }


    @ApiOperation(value = "修改",notes = "修改接口")
    @PutMapping("/tAnchorTopic")
    public ApiResponse<TAnchorTopicVo> update(@RequestBody TAnchorTopicDto tAnchorTopicDto){
          return tAnchorTopicService.update(tAnchorTopicDto);
    }

    @ApiOperation(value = "查询单条数据",notes = "查询单条数据接口")
    @GetMapping("/tAnchorTopic/{id}")
    public ApiResponse<TAnchorTopicVo> findOne(@PathVariable("id") String id){
          return tAnchorTopicService.findOne(id);
    }

    @ApiOperation(value = "查询所有数据",notes = "查询所有数据接口")
    @GetMapping("/tAnchorTopic")
    public ApiResponse<List<TAnchorTopicVo>> findAll(){
          return tAnchorTopicService.findAll();
    }

    @ApiOperation(value = "删除单条数据",notes = "删除单条数据接口")
    @DeleteMapping("/tAnchorTopic/{id}")
    public ApiResponse delete(String id){
          return tAnchorTopicService.delete(id);
    }


}
