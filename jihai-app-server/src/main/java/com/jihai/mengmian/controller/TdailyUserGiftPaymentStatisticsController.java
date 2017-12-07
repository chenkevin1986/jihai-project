package com.jihai.mengmian.controller;

import com.jihai.mengmian.service.TdailyUserGiftPaymentStatisticsService;
import com.jihai.mengmian.vo.TdailyUserGiftPaymentStatisticsVo;
import com.jihai.mengmian.dto.TdailyUserGiftPaymentStatisticsDto;
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
 * <b>Time：</b> 2017-12-07 16:37:28 <br>
 * <b>Contact：<b>wechat and phone number - 13826126615<br>
 */
@Api(description = "Restful-Api接口服务", tags = " Restful-Api接口服务")
@RestController
public class TdailyUserGiftPaymentStatisticsController {

    @Autowired
    private TdailyUserGiftPaymentStatisticsService tdailyUserGiftPaymentStatisticsService;

    @ApiOperation(value = "新增",notes = "新增接口")
    @PostMapping("/tdailyUserGiftPaymentStatistics")
    public ApiResponse<TdailyUserGiftPaymentStatisticsVo> insert(@RequestBody TdailyUserGiftPaymentStatisticsDto tdailyUserGiftPaymentStatisticsDto){
          return tdailyUserGiftPaymentStatisticsService.insert(tdailyUserGiftPaymentStatisticsDto);
    }


    @ApiOperation(value = "修改",notes = "修改接口")
    @PutMapping("/tdailyUserGiftPaymentStatistics")
    public ApiResponse<TdailyUserGiftPaymentStatisticsVo> update(@RequestBody TdailyUserGiftPaymentStatisticsDto tdailyUserGiftPaymentStatisticsDto){
          return tdailyUserGiftPaymentStatisticsService.update(tdailyUserGiftPaymentStatisticsDto);
    }

    @ApiOperation(value = "查询单条数据",notes = "查询单条数据接口")
    @GetMapping("/tdailyUserGiftPaymentStatistics/{id}")
    public ApiResponse<TdailyUserGiftPaymentStatisticsVo> findOne(@PathVariable("id") String id){
          return tdailyUserGiftPaymentStatisticsService.findOne(id);
    }

    @ApiOperation(value = "查询所有数据",notes = "查询所有数据接口")
    @GetMapping("/tdailyUserGiftPaymentStatistics")
    public ApiResponse<List<TdailyUserGiftPaymentStatisticsVo>> findAll(){
          return tdailyUserGiftPaymentStatisticsService.findAll();
    }

    @ApiOperation(value = "删除单条数据",notes = "删除单条数据接口")
    @DeleteMapping("/tdailyUserGiftPaymentStatistics/{id}")
    public ApiResponse delete(String id){
          return tdailyUserGiftPaymentStatisticsService.delete(id);
    }


}
