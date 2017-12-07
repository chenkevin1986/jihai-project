package com.jihai.mengmian1.controller;

import com.jihai.mengmian1.service.ToaUserService;
import com.jihai.mengmian1.vo.ToaUserVo;
import com.jihai.mengmian1.dto.ToaUserDto;
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
 * <b>Time：</b> 2017-12-07 16:39:08 <br>
 * <b>Contact：<b>wechat and phone number - 13826126615<br>
 */
@Api(description = "Restful-Api接口服务", tags = " Restful-Api接口服务")
@RestController
public class ToaUserController {

    @Autowired
    private ToaUserService toaUserService;

    @ApiOperation(value = "新增",notes = "新增接口")
    @PostMapping("/toaUser")
    public ApiResponse<ToaUserVo> insert(@RequestBody ToaUserDto toaUserDto){
          return toaUserService.insert(toaUserDto);
    }


    @ApiOperation(value = "修改",notes = "修改接口")
    @PutMapping("/toaUser")
    public ApiResponse<ToaUserVo> update(@RequestBody ToaUserDto toaUserDto){
          return toaUserService.update(toaUserDto);
    }

    @ApiOperation(value = "查询单条数据",notes = "查询单条数据接口")
    @GetMapping("/toaUser/{id}")
    public ApiResponse<ToaUserVo> findOne(@PathVariable("id") String id){
          return toaUserService.findOne(id);
    }

    @ApiOperation(value = "查询所有数据",notes = "查询所有数据接口")
    @GetMapping("/toaUser")
    public ApiResponse<List<ToaUserVo>> findAll(){
          return toaUserService.findAll();
    }

    @ApiOperation(value = "删除单条数据",notes = "删除单条数据接口")
    @DeleteMapping("/toaUser/{id}")
    public ApiResponse delete(String id){
          return toaUserService.delete(id);
    }


}
