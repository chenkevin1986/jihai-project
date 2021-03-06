package com.jihai.mengmian1.controller;

import com.jihai.mengmian1.service.TdailyUserGiftPaymentStatisticsResultService;
import com.jihai.mengmian1.vo.TdailyUserGiftPaymentStatisticsResultVo;
import com.jihai.mengmian1.dto.TdailyUserGiftPaymentStatisticsResultDto;
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
public class TdailyUserGiftPaymentStatisticsResultController {

    @Autowired
    private TdailyUserGiftPaymentStatisticsResultService tdailyUserGiftPaymentStatisticsResultService;

    @ApiOperation(value = "新增",notes = "新增接口")
    @PostMapping("/tdailyUserGiftPaymentStatisticsResult")
    public ApiResponse<TdailyUserGiftPaymentStatisticsResultVo> insert(@RequestBody TdailyUserGiftPaymentStatisticsResultDto tdailyUserGiftPaymentStatisticsResultDto){
          return tdailyUserGiftPaymentStatisticsResultService.insert(tdailyUserGiftPaymentStatisticsResultDto);
    }


    @ApiOperation(value = "修改",notes = "修改接口")
    @PutMapping("/tdailyUserGiftPaymentStatisticsResult")
    public ApiResponse<TdailyUserGiftPaymentStatisticsResultVo> update(@RequestBody TdailyUserGiftPaymentStatisticsResultDto tdailyUserGiftPaymentStatisticsResultDto){
          return tdailyUserGiftPaymentStatisticsResultService.update(tdailyUserGiftPaymentStatisticsResultDto);
    }

    @ApiOperation(value = "查询单条数据",notes = "查询单条数据接口")
    @GetMapping("/tdailyUserGiftPaymentStatisticsResult/{id}")
    public ApiResponse<TdailyUserGiftPaymentStatisticsResultVo> findOne(@PathVariable("id") String id){
          return tdailyUserGiftPaymentStatisticsResultService.findOne(id);
    }

    @ApiOperation(value = "查询所有数据",notes = "查询所有数据接口")
    @GetMapping("/tdailyUserGiftPaymentStatisticsResult")
    public ApiResponse<List<TdailyUserGiftPaymentStatisticsResultVo>> findAll(){
          return tdailyUserGiftPaymentStatisticsResultService.findAll();
    }

    @ApiOperation(value = "删除单条数据",notes = "删除单条数据接口")
    @DeleteMapping("/tdailyUserGiftPaymentStatisticsResult/{id}")
    public ApiResponse delete(String id){
          return tdailyUserGiftPaymentStatisticsResultService.delete(id);
    }


}
