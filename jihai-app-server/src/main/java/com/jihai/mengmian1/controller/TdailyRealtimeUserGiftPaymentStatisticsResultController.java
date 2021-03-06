package com.jihai.mengmian1.controller;

import com.jihai.mengmian1.service.TdailyRealtimeUserGiftPaymentStatisticsResultService;
import com.jihai.mengmian1.vo.TdailyRealtimeUserGiftPaymentStatisticsResultVo;
import com.jihai.mengmian1.dto.TdailyRealtimeUserGiftPaymentStatisticsResultDto;
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
public class TdailyRealtimeUserGiftPaymentStatisticsResultController {

    @Autowired
    private TdailyRealtimeUserGiftPaymentStatisticsResultService tdailyRealtimeUserGiftPaymentStatisticsResultService;

    @ApiOperation(value = "新增",notes = "新增接口")
    @PostMapping("/tdailyRealtimeUserGiftPaymentStatisticsResult")
    public ApiResponse<TdailyRealtimeUserGiftPaymentStatisticsResultVo> insert(@RequestBody TdailyRealtimeUserGiftPaymentStatisticsResultDto tdailyRealtimeUserGiftPaymentStatisticsResultDto){
          return tdailyRealtimeUserGiftPaymentStatisticsResultService.insert(tdailyRealtimeUserGiftPaymentStatisticsResultDto);
    }


    @ApiOperation(value = "修改",notes = "修改接口")
    @PutMapping("/tdailyRealtimeUserGiftPaymentStatisticsResult")
    public ApiResponse<TdailyRealtimeUserGiftPaymentStatisticsResultVo> update(@RequestBody TdailyRealtimeUserGiftPaymentStatisticsResultDto tdailyRealtimeUserGiftPaymentStatisticsResultDto){
          return tdailyRealtimeUserGiftPaymentStatisticsResultService.update(tdailyRealtimeUserGiftPaymentStatisticsResultDto);
    }

    @ApiOperation(value = "查询单条数据",notes = "查询单条数据接口")
    @GetMapping("/tdailyRealtimeUserGiftPaymentStatisticsResult/{id}")
    public ApiResponse<TdailyRealtimeUserGiftPaymentStatisticsResultVo> findOne(@PathVariable("id") String id){
          return tdailyRealtimeUserGiftPaymentStatisticsResultService.findOne(id);
    }

    @ApiOperation(value = "查询所有数据",notes = "查询所有数据接口")
    @GetMapping("/tdailyRealtimeUserGiftPaymentStatisticsResult")
    public ApiResponse<List<TdailyRealtimeUserGiftPaymentStatisticsResultVo>> findAll(){
          return tdailyRealtimeUserGiftPaymentStatisticsResultService.findAll();
    }

    @ApiOperation(value = "删除单条数据",notes = "删除单条数据接口")
    @DeleteMapping("/tdailyRealtimeUserGiftPaymentStatisticsResult/{id}")
    public ApiResponse delete(String id){
          return tdailyRealtimeUserGiftPaymentStatisticsResultService.delete(id);
    }


}
