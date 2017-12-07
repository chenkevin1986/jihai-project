package com.jihai.mengmian1.controller;

import com.jihai.mengmian1.service.TCarouselService;
import com.jihai.mengmian1.vo.TCarouselVo;
import com.jihai.mengmian1.dto.TCarouselDto;
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
public class TCarouselController {

    @Autowired
    private TCarouselService tCarouselService;

    @ApiOperation(value = "新增",notes = "新增接口")
    @PostMapping("/tCarousel")
    public ApiResponse<TCarouselVo> insert(@RequestBody TCarouselDto tCarouselDto){
          return tCarouselService.insert(tCarouselDto);
    }


    @ApiOperation(value = "修改",notes = "修改接口")
    @PutMapping("/tCarousel")
    public ApiResponse<TCarouselVo> update(@RequestBody TCarouselDto tCarouselDto){
          return tCarouselService.update(tCarouselDto);
    }

    @ApiOperation(value = "查询单条数据",notes = "查询单条数据接口")
    @GetMapping("/tCarousel/{id}")
    public ApiResponse<TCarouselVo> findOne(@PathVariable("id") String id){
          return tCarouselService.findOne(id);
    }

    @ApiOperation(value = "查询所有数据",notes = "查询所有数据接口")
    @GetMapping("/tCarousel")
    public ApiResponse<List<TCarouselVo>> findAll(){
          return tCarouselService.findAll();
    }

    @ApiOperation(value = "删除单条数据",notes = "删除单条数据接口")
    @DeleteMapping("/tCarousel/{id}")
    public ApiResponse delete(String id){
          return tCarouselService.delete(id);
    }


}
