package com.jihai.mengmian.controller;

import com.jihai.mengmian.service.OfmucmemberService;
import com.jihai.mengmian.vo.OfmucmemberVo;
import com.jihai.mengmian.dto.OfmucmemberDto;
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
public class OfmucmemberController {

    @Autowired
    private OfmucmemberService ofmucmemberService;

    @ApiOperation(value = "新增",notes = "新增接口")
    @PostMapping("/ofmucmember")
    public ApiResponse<OfmucmemberVo> insert(@RequestBody OfmucmemberDto ofmucmemberDto){
          return ofmucmemberService.insert(ofmucmemberDto);
    }


    @ApiOperation(value = "修改",notes = "修改接口")
    @PutMapping("/ofmucmember")
    public ApiResponse<OfmucmemberVo> update(@RequestBody OfmucmemberDto ofmucmemberDto){
          return ofmucmemberService.update(ofmucmemberDto);
    }

    @ApiOperation(value = "查询单条数据",notes = "查询单条数据接口")
    @GetMapping("/ofmucmember/{id}")
    public ApiResponse<OfmucmemberVo> findOne(@PathVariable("id") String id){
          return ofmucmemberService.findOne(id);
    }

    @ApiOperation(value = "查询所有数据",notes = "查询所有数据接口")
    @GetMapping("/ofmucmember")
    public ApiResponse<List<OfmucmemberVo>> findAll(){
          return ofmucmemberService.findAll();
    }

    @ApiOperation(value = "删除单条数据",notes = "删除单条数据接口")
    @DeleteMapping("/ofmucmember/{id}")
    public ApiResponse delete(String id){
          return ofmucmemberService.delete(id);
    }


}
