package com.jihai.mengmian.controller;

import com.jihai.mengmian.service.OfgroupuserService;
import com.jihai.mengmian.vo.OfgroupuserVo;
import com.jihai.mengmian.dto.OfgroupuserDto;
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
public class OfgroupuserController {

    @Autowired
    private OfgroupuserService ofgroupuserService;

    @ApiOperation(value = "新增",notes = "新增接口")
    @PostMapping("/ofgroupuser")
    public ApiResponse<OfgroupuserVo> insert(@RequestBody OfgroupuserDto ofgroupuserDto){
          return ofgroupuserService.insert(ofgroupuserDto);
    }


    @ApiOperation(value = "修改",notes = "修改接口")
    @PutMapping("/ofgroupuser")
    public ApiResponse<OfgroupuserVo> update(@RequestBody OfgroupuserDto ofgroupuserDto){
          return ofgroupuserService.update(ofgroupuserDto);
    }

    @ApiOperation(value = "查询单条数据",notes = "查询单条数据接口")
    @GetMapping("/ofgroupuser/{id}")
    public ApiResponse<OfgroupuserVo> findOne(@PathVariable("id") String id){
          return ofgroupuserService.findOne(id);
    }

    @ApiOperation(value = "查询所有数据",notes = "查询所有数据接口")
    @GetMapping("/ofgroupuser")
    public ApiResponse<List<OfgroupuserVo>> findAll(){
          return ofgroupuserService.findAll();
    }

    @ApiOperation(value = "删除单条数据",notes = "删除单条数据接口")
    @DeleteMapping("/ofgroupuser/{id}")
    public ApiResponse delete(String id){
          return ofgroupuserService.delete(id);
    }


}
