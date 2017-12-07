package com.jihai.mengmian.controller;

import com.jihai.mengmian.service.OfpubsubsubscriptionService;
import com.jihai.mengmian.vo.OfpubsubsubscriptionVo;
import com.jihai.mengmian.dto.OfpubsubsubscriptionDto;
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
public class OfpubsubsubscriptionController {

    @Autowired
    private OfpubsubsubscriptionService ofpubsubsubscriptionService;

    @ApiOperation(value = "新增",notes = "新增接口")
    @PostMapping("/ofpubsubsubscription")
    public ApiResponse<OfpubsubsubscriptionVo> insert(@RequestBody OfpubsubsubscriptionDto ofpubsubsubscriptionDto){
          return ofpubsubsubscriptionService.insert(ofpubsubsubscriptionDto);
    }


    @ApiOperation(value = "修改",notes = "修改接口")
    @PutMapping("/ofpubsubsubscription")
    public ApiResponse<OfpubsubsubscriptionVo> update(@RequestBody OfpubsubsubscriptionDto ofpubsubsubscriptionDto){
          return ofpubsubsubscriptionService.update(ofpubsubsubscriptionDto);
    }

    @ApiOperation(value = "查询单条数据",notes = "查询单条数据接口")
    @GetMapping("/ofpubsubsubscription/{id}")
    public ApiResponse<OfpubsubsubscriptionVo> findOne(@PathVariable("id") String id){
          return ofpubsubsubscriptionService.findOne(id);
    }

    @ApiOperation(value = "查询所有数据",notes = "查询所有数据接口")
    @GetMapping("/ofpubsubsubscription")
    public ApiResponse<List<OfpubsubsubscriptionVo>> findAll(){
          return ofpubsubsubscriptionService.findAll();
    }

    @ApiOperation(value = "删除单条数据",notes = "删除单条数据接口")
    @DeleteMapping("/ofpubsubsubscription/{id}")
    public ApiResponse delete(String id){
          return ofpubsubsubscriptionService.delete(id);
    }


}
