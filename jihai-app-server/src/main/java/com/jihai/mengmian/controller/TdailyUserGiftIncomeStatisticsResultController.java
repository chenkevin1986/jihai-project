package com.jihai.mengmian.controller;

import com.jihai.mengmian.service.TdailyUserGiftIncomeStatisticsResultService;
import com.jihai.mengmian.vo.TdailyUserGiftIncomeStatisticsResultVo;
import com.jihai.mengmian.dto.TdailyUserGiftIncomeStatisticsResultDto;
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
public class TdailyUserGiftIncomeStatisticsResultController {

    @Autowired
    private TdailyUserGiftIncomeStatisticsResultService tdailyUserGiftIncomeStatisticsResultService;

    @ApiOperation(value = "新增",notes = "新增接口")
    @PostMapping("/tdailyUserGiftIncomeStatisticsResult")
    public ApiResponse<TdailyUserGiftIncomeStatisticsResultVo> insert(@RequestBody TdailyUserGiftIncomeStatisticsResultDto tdailyUserGiftIncomeStatisticsResultDto){
          return tdailyUserGiftIncomeStatisticsResultService.insert(tdailyUserGiftIncomeStatisticsResultDto);
    }


    @ApiOperation(value = "修改",notes = "修改接口")
    @PutMapping("/tdailyUserGiftIncomeStatisticsResult")
    public ApiResponse<TdailyUserGiftIncomeStatisticsResultVo> update(@RequestBody TdailyUserGiftIncomeStatisticsResultDto tdailyUserGiftIncomeStatisticsResultDto){
          return tdailyUserGiftIncomeStatisticsResultService.update(tdailyUserGiftIncomeStatisticsResultDto);
    }

    @ApiOperation(value = "查询单条数据",notes = "查询单条数据接口")
    @GetMapping("/tdailyUserGiftIncomeStatisticsResult/{id}")
    public ApiResponse<TdailyUserGiftIncomeStatisticsResultVo> findOne(@PathVariable("id") String id){
          return tdailyUserGiftIncomeStatisticsResultService.findOne(id);
    }

    @ApiOperation(value = "查询所有数据",notes = "查询所有数据接口")
    @GetMapping("/tdailyUserGiftIncomeStatisticsResult")
    public ApiResponse<List<TdailyUserGiftIncomeStatisticsResultVo>> findAll(){
          return tdailyUserGiftIncomeStatisticsResultService.findAll();
    }

    @ApiOperation(value = "删除单条数据",notes = "删除单条数据接口")
    @DeleteMapping("/tdailyUserGiftIncomeStatisticsResult/{id}")
    public ApiResponse delete(String id){
          return tdailyUserGiftIncomeStatisticsResultService.delete(id);
    }


}
