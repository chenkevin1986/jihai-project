package com.jihai.mengmian.controller;

import com.jihai.mengmian.service.OfmucconversationlogService;
import com.jihai.mengmian.vo.OfmucconversationlogVo;
import com.jihai.mengmian.dto.OfmucconversationlogDto;
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
public class OfmucconversationlogController {

    @Autowired
    private OfmucconversationlogService ofmucconversationlogService;

    @ApiOperation(value = "新增",notes = "新增接口")
    @PostMapping("/ofmucconversationlog")
    public ApiResponse<OfmucconversationlogVo> insert(@RequestBody OfmucconversationlogDto ofmucconversationlogDto){
          return ofmucconversationlogService.insert(ofmucconversationlogDto);
    }


    @ApiOperation(value = "修改",notes = "修改接口")
    @PutMapping("/ofmucconversationlog")
    public ApiResponse<OfmucconversationlogVo> update(@RequestBody OfmucconversationlogDto ofmucconversationlogDto){
          return ofmucconversationlogService.update(ofmucconversationlogDto);
    }

    @ApiOperation(value = "查询单条数据",notes = "查询单条数据接口")
    @GetMapping("/ofmucconversationlog/{id}")
    public ApiResponse<OfmucconversationlogVo> findOne(@PathVariable("id") String id){
          return ofmucconversationlogService.findOne(id);
    }

    @ApiOperation(value = "查询所有数据",notes = "查询所有数据接口")
    @GetMapping("/ofmucconversationlog")
    public ApiResponse<List<OfmucconversationlogVo>> findAll(){
          return ofmucconversationlogService.findAll();
    }

    @ApiOperation(value = "删除单条数据",notes = "删除单条数据接口")
    @DeleteMapping("/ofmucconversationlog/{id}")
    public ApiResponse delete(String id){
          return ofmucconversationlogService.delete(id);
    }


}
