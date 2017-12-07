package com.jihai.mengmian1.service;

import com.google.common.reflect.TypeToken;
import com.jihai.mengmian.BeanUtils;
import com.jihai.mengmian.BeanListUtils;
import com.jihai.mengmian1.entity.TdailyRealtimeUserGiftIncomeStatisticsResultEntity;
import com.jihai.mengmian1.repo.TdailyRealtimeUserGiftIncomeStatisticsResultEntityRepo;
import com.jihai.mengmian1.vo.TdailyRealtimeUserGiftIncomeStatisticsResultVo;
import com.jihai.mengmian1.dto.TdailyRealtimeUserGiftIncomeStatisticsResultDto;
import com.jihai.mengmian.syscode.Syscode;
import com.jihai.mengmian.web.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.jihai.mock.ModelEntity;
import java.util.List;

/**
 * <br>
 * <b>description：</b> 业务接口<br>
 * <b>author：</b>kevin chen<br>
 * <b>Time：</b> 2017-12-07 16:39:07 <br>
 * <b>Contact：<b>wechat and phone number - 13826126615<br>
 */
@Service
public class TdailyRealtimeUserGiftIncomeStatisticsResultService {
    @Autowired
    private TdailyRealtimeUserGiftIncomeStatisticsResultEntityRepo tdailyRealtimeUserGiftIncomeStatisticsResultEntityRepo;

    /**
     * 新增
     * @param tdailyRealtimeUserGiftIncomeStatisticsResultDto
     * @return ApiResponse<TdailyRealtimeUserGiftIncomeStatisticsResultVo>
     */
     public ApiResponse<TdailyRealtimeUserGiftIncomeStatisticsResultVo> insert(TdailyRealtimeUserGiftIncomeStatisticsResultDto tdailyRealtimeUserGiftIncomeStatisticsResultDto){
           return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<TdailyRealtimeUserGiftIncomeStatisticsResultVo>(){}.getType()));
           //TdailyRealtimeUserGiftIncomeStatisticsResultEntity tdailyRealtimeUserGiftIncomeStatisticsResultEntity = BeanUtils.copyAttrs(new TdailyRealtimeUserGiftIncomeStatisticsResultEntity(), tdailyRealtimeUserGiftIncomeStatisticsResultDto);
           //tdailyRealtimeUserGiftIncomeStatisticsResultEntityRepo.save(tdailyRealtimeUserGiftIncomeStatisticsResultEntity);
           //return ApiResponse.ok(BeanUtils.copyAttrs(new TdailyRealtimeUserGiftIncomeStatisticsResultVo(),tdailyRealtimeUserGiftIncomeStatisticsResultEntity));
     }


     /**
      * 修改
      * @param tdailyRealtimeUserGiftIncomeStatisticsResultDto
      * @return ApiResponse<TdailyRealtimeUserGiftIncomeStatisticsResultVo>
      */
      public ApiResponse<TdailyRealtimeUserGiftIncomeStatisticsResultVo> update(TdailyRealtimeUserGiftIncomeStatisticsResultDto tdailyRealtimeUserGiftIncomeStatisticsResultDto){
            return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<TdailyRealtimeUserGiftIncomeStatisticsResultVo>(){}.getType()));
            //TdailyRealtimeUserGiftIncomeStatisticsResultEntity tdailyRealtimeUserGiftIncomeStatisticsResultEntity = BeanUtils.copyAttrs(new TdailyRealtimeUserGiftIncomeStatisticsResultEntity(), tdailyRealtimeUserGiftIncomeStatisticsResultDto);
            //tdailyRealtimeUserGiftIncomeStatisticsResultEntityRepo.save(tdailyRealtimeUserGiftIncomeStatisticsResultEntity);
            //return ApiResponse.ok(BeanUtils.copyAttrs(new TdailyRealtimeUserGiftIncomeStatisticsResultVo(),tdailyRealtimeUserGiftIncomeStatisticsResultEntity));
      }

      /**
       * 通过主键获取对象
       * @param id 实体主键
       * @return ApiResponse<TdailyRealtimeUserGiftIncomeStatisticsResultVo>
       */
       public ApiResponse<TdailyRealtimeUserGiftIncomeStatisticsResultVo> findOne(String id){
             return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<TdailyRealtimeUserGiftIncomeStatisticsResultVo>(){}.getType()));
             //TdailyRealtimeUserGiftIncomeStatisticsResultEntity tdailyRealtimeUserGiftIncomeStatisticsResultEntity = tdailyRealtimeUserGiftIncomeStatisticsResultEntityRepo.findOne(id);
             //return ApiResponse.ok(BeanUtils.copyAttrs(new TdailyRealtimeUserGiftIncomeStatisticsResultVo(),tdailyRealtimeUserGiftIncomeStatisticsResultEntity));
       }

       /**
        * 默认查询所有列表，若要筛选列表，请增加过滤参数
        * @return ApiResponse<List<TdailyRealtimeUserGiftIncomeStatisticsResultVo>>
        */
        public ApiResponse<List<TdailyRealtimeUserGiftIncomeStatisticsResultVo>> findAll(){
               return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<List<TdailyRealtimeUserGiftIncomeStatisticsResultVo>>(){}.getType()));
               //List<TdailyRealtimeUserGiftIncomeStatisticsResultEntity> tdailyRealtimeUserGiftIncomeStatisticsResultEntities = tdailyRealtimeUserGiftIncomeStatisticsResultEntityRepo.findAll();
               //List<TdailyRealtimeUserGiftIncomeStatisticsResultVo> tdailyRealtimeUserGiftIncomeStatisticsResultVoList = new BeanListUtils<TdailyRealtimeUserGiftIncomeStatisticsResultVo, TdailyRealtimeUserGiftIncomeStatisticsResultEntity>(TdailyRealtimeUserGiftIncomeStatisticsResultVo.class, tdailyRealtimeUserGiftIncomeStatisticsResultEntities).getTargetList();
               //return ApiResponse.ok(tdailyRealtimeUserGiftIncomeStatisticsResultVoList);
        }

        /**
         * 删除对应主键的数据
         * @return
         */
         public ApiResponse delete(String id){
                //tdailyRealtimeUserGiftIncomeStatisticsResultEntityRepo.delete(id);
                return ApiResponse.prompt(Syscode.SC_OK);
         }

}