package com.jihai.mengmian.controller;

import com.jihai.mengmian.service.OfpubsubnodegroupsService;
import com.jihai.mengmian.vo.OfpubsubnodegroupsVo;
import com.jihai.mengmian.dto.OfpubsubnodegroupsDto;
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
public class OfpubsubnodegroupsController {

    @Autowired
    private OfpubsubnodegroupsService ofpubsubnodegroupsService;

    @ApiOperation(value = "新增",notes = "新增接口")
    @PostMapping("/ofpubsubnodegroups")
    public ApiResponse<OfpubsubnodegroupsVo> insert(@RequestBody OfpubsubnodegroupsDto ofpubsubnodegroupsDto){
          return ofpubsubnodegroupsService.insert(ofpubsubnodegroupsDto);
    }


    @ApiOperation(value = "修改",notes = "修改接口")
    @PutMapping("/ofpubsubnodegroups")
    public ApiResponse<OfpubsubnodegroupsVo> update(@RequestBody OfpubsubnodegroupsDto ofpubsubnodegroupsDto){
          return ofpubsubnodegroupsService.update(ofpubsubnodegroupsDto);
    }

    @ApiOperation(value = "查询单条数据",notes = "查询单条数据接口")
    @GetMapping("/ofpubsubnodegroups/{id}")
    public ApiResponse<OfpubsubnodegroupsVo> findOne(@PathVariable("id") String id){
          return ofpubsubnodegroupsService.findOne(id);
    }

    @ApiOperation(value = "查询所有数据",notes = "查询所有数据接口")
    @GetMapping("/ofpubsubnodegroups")
    public ApiResponse<List<OfpubsubnodegroupsVo>> findAll(){
          return ofpubsubnodegroupsService.findAll();
    }

    @ApiOperation(value = "删除单条数据",notes = "删除单条数据接口")
    @DeleteMapping("/ofpubsubnodegroups/{id}")
    public ApiResponse delete(String id){
          return ofpubsubnodegroupsService.delete(id);
    }


}
