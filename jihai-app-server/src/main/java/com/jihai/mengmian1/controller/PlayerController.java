package com.jihai.mengmian1.controller;

import com.jihai.mengmian1.service.PlayerService;
import com.jihai.mengmian1.vo.PlayerVo;
import com.jihai.mengmian1.dto.PlayerDto;
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
 * <b>description：</b>玩家表 Restful-Api接口<br>
 * <b>author：</b>kevin chen<br>
 * <b>Time：</b> 2017-12-06 23:12:28 <br>
 * <b>Contact：<b>wechat and phone number - 13826126615<br>
 */
@Api(description = "玩家表Restful-Api接口服务", tags = "玩家表 Restful-Api接口服务")
@RestController
public class PlayerController {

    @Autowired
    private PlayerService playerService;

    @ApiOperation(value = "新增",notes = "新增接口")
    @PostMapping("/player")
    public ApiResponse<PlayerVo> insert(@RequestBody PlayerDto playerDto){
          return playerService.insert(playerDto);
    }


    @ApiOperation(value = "修改",notes = "修改接口")
    @PutMapping("/player")
    public ApiResponse<PlayerVo> update(@RequestBody PlayerDto playerDto){
          return playerService.update(playerDto);
    }

    @ApiOperation(value = "查询单条数据",notes = "查询单条数据接口")
    @GetMapping("/player/{id}")
    public ApiResponse<PlayerVo> findOne(@PathVariable("id") String id){
          return playerService.findOne(id);
    }

    @ApiOperation(value = "查询所有数据",notes = "查询所有数据接口")
    @GetMapping("/player")
    public ApiResponse<List<PlayerVo>> findAll(){
          return playerService.findAll();
    }

    @ApiOperation(value = "删除单条数据",notes = "删除单条数据接口")
    @DeleteMapping("/player/{id}")
    public ApiResponse delete(String id){
          return playerService.delete(id);
    }


}
