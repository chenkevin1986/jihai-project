package com.jihai.mengmian.controller;

import com.jihai.mengmian.service.TUserGuestService;
import com.jihai.mengmian.vo.TUserGuestVo;
import com.jihai.mengmian.dto.TUserGuestDto;
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
public class TUserGuestController {

    @Autowired
    private TUserGuestService tUserGuestService;

    @ApiOperation(value = "新增",notes = "新增接口")
    @PostMapping("/tUserGuest")
    public ApiResponse<TUserGuestVo> insert(@RequestBody TUserGuestDto tUserGuestDto){
          return tUserGuestService.insert(tUserGuestDto);
    }


    @ApiOperation(value = "修改",notes = "修改接口")
    @PutMapping("/tUserGuest")
    public ApiResponse<TUserGuestVo> update(@RequestBody TUserGuestDto tUserGuestDto){
          return tUserGuestService.update(tUserGuestDto);
    }

    @ApiOperation(value = "查询单条数据",notes = "查询单条数据接口")
    @GetMapping("/tUserGuest/{id}")
    public ApiResponse<TUserGuestVo> findOne(@PathVariable("id") String id){
          return tUserGuestService.findOne(id);
    }

    @ApiOperation(value = "查询所有数据",notes = "查询所有数据接口")
    @GetMapping("/tUserGuest")
    public ApiResponse<List<TUserGuestVo>> findAll(){
          return tUserGuestService.findAll();
    }

    @ApiOperation(value = "删除单条数据",notes = "删除单条数据接口")
    @DeleteMapping("/tUserGuest/{id}")
    public ApiResponse delete(String id){
          return tUserGuestService.delete(id);
    }


}
