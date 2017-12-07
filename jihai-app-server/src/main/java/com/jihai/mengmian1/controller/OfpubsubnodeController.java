package com.jihai.mengmian1.controller;

import com.jihai.mengmian1.service.OfpubsubnodeService;
import com.jihai.mengmian1.vo.OfpubsubnodeVo;
import com.jihai.mengmian1.dto.OfpubsubnodeDto;
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
 * <b>Time：</b> 2017-12-07 16:39:06 <br>
 * <b>Contact：<b>wechat and phone number - 13826126615<br>
 */
@Api(description = "Restful-Api接口服务", tags = " Restful-Api接口服务")
@RestController
public class OfpubsubnodeController {

    @Autowired
    private OfpubsubnodeService ofpubsubnodeService;

    @ApiOperation(value = "新增",notes = "新增接口")
    @PostMapping("/ofpubsubnode")
    public ApiResponse<OfpubsubnodeVo> insert(@RequestBody OfpubsubnodeDto ofpubsubnodeDto){
          return ofpubsubnodeService.insert(ofpubsubnodeDto);
    }


    @ApiOperation(value = "修改",notes = "修改接口")
    @PutMapping("/ofpubsubnode")
    public ApiResponse<OfpubsubnodeVo> update(@RequestBody OfpubsubnodeDto ofpubsubnodeDto){
          return ofpubsubnodeService.update(ofpubsubnodeDto);
    }

    @ApiOperation(value = "查询单条数据",notes = "查询单条数据接口")
    @GetMapping("/ofpubsubnode/{id}")
    public ApiResponse<OfpubsubnodeVo> findOne(@PathVariable("id") String id){
          return ofpubsubnodeService.findOne(id);
    }

    @ApiOperation(value = "查询所有数据",notes = "查询所有数据接口")
    @GetMapping("/ofpubsubnode")
    public ApiResponse<List<OfpubsubnodeVo>> findAll(){
          return ofpubsubnodeService.findAll();
    }

    @ApiOperation(value = "删除单条数据",notes = "删除单条数据接口")
    @DeleteMapping("/ofpubsubnode/{id}")
    public ApiResponse delete(String id){
          return ofpubsubnodeService.delete(id);
    }


}
