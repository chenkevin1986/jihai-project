package com.jihai.mengmian.controller;

import com.jihai.mengmian.service.ToaUserSessionService;
import com.jihai.mengmian.vo.ToaUserSessionVo;
import com.jihai.mengmian.dto.ToaUserSessionDto;
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
public class ToaUserSessionController {

    @Autowired
    private ToaUserSessionService toaUserSessionService;

    @ApiOperation(value = "新增",notes = "新增接口")
    @PostMapping("/toaUserSession")
    public ApiResponse<ToaUserSessionVo> insert(@RequestBody ToaUserSessionDto toaUserSessionDto){
          return toaUserSessionService.insert(toaUserSessionDto);
    }


    @ApiOperation(value = "修改",notes = "修改接口")
    @PutMapping("/toaUserSession")
    public ApiResponse<ToaUserSessionVo> update(@RequestBody ToaUserSessionDto toaUserSessionDto){
          return toaUserSessionService.update(toaUserSessionDto);
    }

    @ApiOperation(value = "查询单条数据",notes = "查询单条数据接口")
    @GetMapping("/toaUserSession/{id}")
    public ApiResponse<ToaUserSessionVo> findOne(@PathVariable("id") String id){
          return toaUserSessionService.findOne(id);
    }

    @ApiOperation(value = "查询所有数据",notes = "查询所有数据接口")
    @GetMapping("/toaUserSession")
    public ApiResponse<List<ToaUserSessionVo>> findAll(){
          return toaUserSessionService.findAll();
    }

    @ApiOperation(value = "删除单条数据",notes = "删除单条数据接口")
    @DeleteMapping("/toaUserSession/{id}")
    public ApiResponse delete(String id){
          return toaUserSessionService.delete(id);
    }


}
