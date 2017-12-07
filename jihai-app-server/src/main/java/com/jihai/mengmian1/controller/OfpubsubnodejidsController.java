package com.jihai.mengmian1.controller;

import com.jihai.mengmian1.service.OfpubsubnodejidsService;
import com.jihai.mengmian1.vo.OfpubsubnodejidsVo;
import com.jihai.mengmian1.dto.OfpubsubnodejidsDto;
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
public class OfpubsubnodejidsController {

    @Autowired
    private OfpubsubnodejidsService ofpubsubnodejidsService;

    @ApiOperation(value = "新增",notes = "新增接口")
    @PostMapping("/ofpubsubnodejids")
    public ApiResponse<OfpubsubnodejidsVo> insert(@RequestBody OfpubsubnodejidsDto ofpubsubnodejidsDto){
          return ofpubsubnodejidsService.insert(ofpubsubnodejidsDto);
    }


    @ApiOperation(value = "修改",notes = "修改接口")
    @PutMapping("/ofpubsubnodejids")
    public ApiResponse<OfpubsubnodejidsVo> update(@RequestBody OfpubsubnodejidsDto ofpubsubnodejidsDto){
          return ofpubsubnodejidsService.update(ofpubsubnodejidsDto);
    }

    @ApiOperation(value = "查询单条数据",notes = "查询单条数据接口")
    @GetMapping("/ofpubsubnodejids/{id}")
    public ApiResponse<OfpubsubnodejidsVo> findOne(@PathVariable("id") String id){
          return ofpubsubnodejidsService.findOne(id);
    }

    @ApiOperation(value = "查询所有数据",notes = "查询所有数据接口")
    @GetMapping("/ofpubsubnodejids")
    public ApiResponse<List<OfpubsubnodejidsVo>> findAll(){
          return ofpubsubnodejidsService.findAll();
    }

    @ApiOperation(value = "删除单条数据",notes = "删除单条数据接口")
    @DeleteMapping("/ofpubsubnodejids/{id}")
    public ApiResponse delete(String id){
          return ofpubsubnodejidsService.delete(id);
    }


}
