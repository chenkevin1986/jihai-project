package com.jihai.mengmian.service;

import com.google.common.reflect.TypeToken;
import com.jihai.mengmian.BeanUtils;
import com.jihai.mengmian.BeanListUtils;
import com.jihai.mengmian.entity.TdailyRealtimeUserGiftPaymentStatisticsResultEntity;
import com.jihai.mengmian.repo.TdailyRealtimeUserGiftPaymentStatisticsResultEntityRepo;
import com.jihai.mengmian.vo.TdailyRealtimeUserGiftPaymentStatisticsResultVo;
import com.jihai.mengmian.dto.TdailyRealtimeUserGiftPaymentStatisticsResultDto;
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
 * <b>Time：</b> 2017-12-07 16:37:28 <br>
 * <b>Contact：<b>wechat and phone number - 13826126615<br>
 */
@Service
public class TdailyRealtimeUserGiftPaymentStatisticsResultService {
    @Autowired
    private TdailyRealtimeUserGiftPaymentStatisticsResultEntityRepo tdailyRealtimeUserGiftPaymentStatisticsResultEntityRepo;

    /**
     * 新增
     * @param tdailyRealtimeUserGiftPaymentStatisticsResultDto
     * @return ApiResponse<TdailyRealtimeUserGiftPaymentStatisticsResultVo>
     */
     public ApiResponse<TdailyRealtimeUserGiftPaymentStatisticsResultVo> insert(TdailyRealtimeUserGiftPaymentStatisticsResultDto tdailyRealtimeUserGiftPaymentStatisticsResultDto){
           return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<TdailyRealtimeUserGiftPaymentStatisticsResultVo>(){}.getType()));
           //TdailyRealtimeUserGiftPaymentStatisticsResultEntity tdailyRealtimeUserGiftPaymentStatisticsResultEntity = BeanUtils.copyAttrs(new TdailyRealtimeUserGiftPaymentStatisticsResultEntity(), tdailyRealtimeUserGiftPaymentStatisticsResultDto);
           //tdailyRealtimeUserGiftPaymentStatisticsResultEntityRepo.save(tdailyRealtimeUserGiftPaymentStatisticsResultEntity);
           //return ApiResponse.ok(BeanUtils.copyAttrs(new TdailyRealtimeUserGiftPaymentStatisticsResultVo(),tdailyRealtimeUserGiftPaymentStatisticsResultEntity));
     }


     /**
      * 修改
      * @param tdailyRealtimeUserGiftPaymentStatisticsResultDto
      * @return ApiResponse<TdailyRealtimeUserGiftPaymentStatisticsResultVo>
      */
      public ApiResponse<TdailyRealtimeUserGiftPaymentStatisticsResultVo> update(TdailyRealtimeUserGiftPaymentStatisticsResultDto tdailyRealtimeUserGiftPaymentStatisticsResultDto){
            return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<TdailyRealtimeUserGiftPaymentStatisticsResultVo>(){}.getType()));
            //TdailyRealtimeUserGiftPaymentStatisticsResultEntity tdailyRealtimeUserGiftPaymentStatisticsResultEntity = BeanUtils.copyAttrs(new TdailyRealtimeUserGiftPaymentStatisticsResultEntity(), tdailyRealtimeUserGiftPaymentStatisticsResultDto);
            //tdailyRealtimeUserGiftPaymentStatisticsResultEntityRepo.save(tdailyRealtimeUserGiftPaymentStatisticsResultEntity);
            //return ApiResponse.ok(BeanUtils.copyAttrs(new TdailyRealtimeUserGiftPaymentStatisticsResultVo(),tdailyRealtimeUserGiftPaymentStatisticsResultEntity));
      }

      /**
       * 通过主键获取对象
       * @param id 实体主键
       * @return ApiResponse<TdailyRealtimeUserGiftPaymentStatisticsResultVo>
       */
       public ApiResponse<TdailyRealtimeUserGiftPaymentStatisticsResultVo> findOne(String id){
             return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<TdailyRealtimeUserGiftPaymentStatisticsResultVo>(){}.getType()));
             //TdailyRealtimeUserGiftPaymentStatisticsResultEntity tdailyRealtimeUserGiftPaymentStatisticsResultEntity = tdailyRealtimeUserGiftPaymentStatisticsResultEntityRepo.findOne(id);
             //return ApiResponse.ok(BeanUtils.copyAttrs(new TdailyRealtimeUserGiftPaymentStatisticsResultVo(),tdailyRealtimeUserGiftPaymentStatisticsResultEntity));
       }

       /**
        * 默认查询所有列表，若要筛选列表，请增加过滤参数
        * @return ApiResponse<List<TdailyRealtimeUserGiftPaymentStatisticsResultVo>>
        */
        public ApiResponse<List<TdailyRealtimeUserGiftPaymentStatisticsResultVo>> findAll(){
               return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<List<TdailyRealtimeUserGiftPaymentStatisticsResultVo>>(){}.getType()));
               //List<TdailyRealtimeUserGiftPaymentStatisticsResultEntity> tdailyRealtimeUserGiftPaymentStatisticsResultEntities = tdailyRealtimeUserGiftPaymentStatisticsResultEntityRepo.findAll();
               //List<TdailyRealtimeUserGiftPaymentStatisticsResultVo> tdailyRealtimeUserGiftPaymentStatisticsResultVoList = new BeanListUtils<TdailyRealtimeUserGiftPaymentStatisticsResultVo, TdailyRealtimeUserGiftPaymentStatisticsResultEntity>(TdailyRealtimeUserGiftPaymentStatisticsResultVo.class, tdailyRealtimeUserGiftPaymentStatisticsResultEntities).getTargetList();
               //return ApiResponse.ok(tdailyRealtimeUserGiftPaymentStatisticsResultVoList);
        }

        /**
         * 删除对应主键的数据
         * @return
         */
         public ApiResponse delete(String id){
                //tdailyRealtimeUserGiftPaymentStatisticsResultEntityRepo.delete(id);
                return ApiResponse.prompt(Syscode.SC_OK);
         }

}