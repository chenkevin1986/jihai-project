package com.jihai.mengmian1.controller;

import com.jihai.mengmian1.service.TallocidBysectService;
import com.jihai.mengmian1.vo.TallocidBysectVo;
import com.jihai.mengmian1.dto.TallocidBysectDto;
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
public class TallocidBysectController {

    @Autowired
    private TallocidBysectService tallocidBysectService;

    @ApiOperation(value = "新增",notes = "新增接口")
    @PostMapping("/tallocidBysect")
    public ApiResponse<TallocidBysectVo> insert(@RequestBody TallocidBysectDto tallocidBysectDto){
          return tallocidBysectService.insert(tallocidBysectDto);
    }


    @ApiOperation(value = "修改",notes = "修改接口")
    @PutMapping("/tallocidBysect")
    public ApiResponse<TallocidBysectVo> update(@RequestBody TallocidBysectDto tallocidBysectDto){
          return tallocidBysectService.update(tallocidBysectDto);
    }

    @ApiOperation(value = "查询单条数据",notes = "查询单条数据接口")
    @GetMapping("/tallocidBysect/{id}")
    public ApiResponse<TallocidBysectVo> findOne(@PathVariable("id") String id){
          return tallocidBysectService.findOne(id);
    }

    @ApiOperation(value = "查询所有数据",notes = "查询所有数据接口")
    @GetMapping("/tallocidBysect")
    public ApiResponse<List<TallocidBysectVo>> findAll(){
          return tallocidBysectService.findAll();
    }

    @ApiOperation(value = "删除单条数据",notes = "删除单条数据接口")
    @DeleteMapping("/tallocidBysect/{id}")
    public ApiResponse delete(String id){
          return tallocidBysectService.delete(id);
    }


}
