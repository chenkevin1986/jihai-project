package com.jihai.mengmian1.controller;

import com.jihai.mengmian1.service.TUserGalleryService;
import com.jihai.mengmian1.vo.TUserGalleryVo;
import com.jihai.mengmian1.dto.TUserGalleryDto;
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
public class TUserGalleryController {

    @Autowired
    private TUserGalleryService tUserGalleryService;

    @ApiOperation(value = "新增",notes = "新增接口")
    @PostMapping("/tUserGallery")
    public ApiResponse<TUserGalleryVo> insert(@RequestBody TUserGalleryDto tUserGalleryDto){
          return tUserGalleryService.insert(tUserGalleryDto);
    }


    @ApiOperation(value = "修改",notes = "修改接口")
    @PutMapping("/tUserGallery")
    public ApiResponse<TUserGalleryVo> update(@RequestBody TUserGalleryDto tUserGalleryDto){
          return tUserGalleryService.update(tUserGalleryDto);
    }

    @ApiOperation(value = "查询单条数据",notes = "查询单条数据接口")
    @GetMapping("/tUserGallery/{id}")
    public ApiResponse<TUserGalleryVo> findOne(@PathVariable("id") String id){
          return tUserGalleryService.findOne(id);
    }

    @ApiOperation(value = "查询所有数据",notes = "查询所有数据接口")
    @GetMapping("/tUserGallery")
    public ApiResponse<List<TUserGalleryVo>> findAll(){
          return tUserGalleryService.findAll();
    }

    @ApiOperation(value = "删除单条数据",notes = "删除单条数据接口")
    @DeleteMapping("/tUserGallery/{id}")
    public ApiResponse delete(String id){
          return tUserGalleryService.delete(id);
    }


}
