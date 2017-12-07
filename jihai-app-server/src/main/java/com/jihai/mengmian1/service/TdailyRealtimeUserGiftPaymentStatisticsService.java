package com.jihai.mengmian1.service;

import com.google.common.reflect.TypeToken;
import com.jihai.mengmian.BeanUtils;
import com.jihai.mengmian.BeanListUtils;
import com.jihai.mengmian1.entity.TdailyRealtimeUserGiftPaymentStatisticsEntity;
import com.jihai.mengmian1.repo.TdailyRealtimeUserGiftPaymentStatisticsEntityRepo;
import com.jihai.mengmian1.vo.TdailyRealtimeUserGiftPaymentStatisticsVo;
import com.jihai.mengmian1.dto.TdailyRealtimeUserGiftPaymentStatisticsDto;
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
public class TdailyRealtimeUserGiftPaymentStatisticsService {
    @Autowired
    private TdailyRealtimeUserGiftPaymentStatisticsEntityRepo tdailyRealtimeUserGiftPaymentStatisticsEntityRepo;

    /**
     * 新增
     * @param tdailyRealtimeUserGiftPaymentStatisticsDto
     * @return ApiResponse<TdailyRealtimeUserGiftPaymentStatisticsVo>
     */
     public ApiResponse<TdailyRealtimeUserGiftPaymentStatisticsVo> insert(TdailyRealtimeUserGiftPaymentStatisticsDto tdailyRealtimeUserGiftPaymentStatisticsDto){
           return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<TdailyRealtimeUserGiftPaymentStatisticsVo>(){}.getType()));
           //TdailyRealtimeUserGiftPaymentStatisticsEntity tdailyRealtimeUserGiftPaymentStatisticsEntity = BeanUtils.copyAttrs(new TdailyRealtimeUserGiftPaymentStatisticsEntity(), tdailyRealtimeUserGiftPaymentStatisticsDto);
           //tdailyRealtimeUserGiftPaymentStatisticsEntityRepo.save(tdailyRealtimeUserGiftPaymentStatisticsEntity);
           //return ApiResponse.ok(BeanUtils.copyAttrs(new TdailyRealtimeUserGiftPaymentStatisticsVo(),tdailyRealtimeUserGiftPaymentStatisticsEntity));
     }


     /**
      * 修改
      * @param tdailyRealtimeUserGiftPaymentStatisticsDto
      * @return ApiResponse<TdailyRealtimeUserGiftPaymentStatisticsVo>
      */
      public ApiResponse<TdailyRealtimeUserGiftPaymentStatisticsVo> update(TdailyRealtimeUserGiftPaymentStatisticsDto tdailyRealtimeUserGiftPaymentStatisticsDto){
            return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<TdailyRealtimeUserGiftPaymentStatisticsVo>(){}.getType()));
            //TdailyRealtimeUserGiftPaymentStatisticsEntity tdailyRealtimeUserGiftPaymentStatisticsEntity = BeanUtils.copyAttrs(new TdailyRealtimeUserGiftPaymentStatisticsEntity(), tdailyRealtimeUserGiftPaymentStatisticsDto);
            //tdailyRealtimeUserGiftPaymentStatisticsEntityRepo.save(tdailyRealtimeUserGiftPaymentStatisticsEntity);
            //return ApiResponse.ok(BeanUtils.copyAttrs(new TdailyRealtimeUserGiftPaymentStatisticsVo(),tdailyRealtimeUserGiftPaymentStatisticsEntity));
      }

      /**
       * 通过主键获取对象
       * @param id 实体主键
       * @return ApiResponse<TdailyRealtimeUserGiftPaymentStatisticsVo>
       */
       public ApiResponse<TdailyRealtimeUserGiftPaymentStatisticsVo> findOne(String id){
             return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<TdailyRealtimeUserGiftPaymentStatisticsVo>(){}.getType()));
             //TdailyRealtimeUserGiftPaymentStatisticsEntity tdailyRealtimeUserGiftPaymentStatisticsEntity = tdailyRealtimeUserGiftPaymentStatisticsEntityRepo.findOne(id);
             //return ApiResponse.ok(BeanUtils.copyAttrs(new TdailyRealtimeUserGiftPaymentStatisticsVo(),tdailyRealtimeUserGiftPaymentStatisticsEntity));
       }

       /**
        * 默认查询所有列表，若要筛选列表，请增加过滤参数
        * @return ApiResponse<List<TdailyRealtimeUserGiftPaymentStatisticsVo>>
        */
        public ApiResponse<List<TdailyRealtimeUserGiftPaymentStatisticsVo>> findAll(){
               return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<List<TdailyRealtimeUserGiftPaymentStatisticsVo>>(){}.getType()));
               //List<TdailyRealtimeUserGiftPaymentStatisticsEntity> tdailyRealtimeUserGiftPaymentStatisticsEntities = tdailyRealtimeUserGiftPaymentStatisticsEntityRepo.findAll();
               //List<TdailyRealtimeUserGiftPaymentStatisticsVo> tdailyRealtimeUserGiftPaymentStatisticsVoList = new BeanListUtils<TdailyRealtimeUserGiftPaymentStatisticsVo, TdailyRealtimeUserGiftPaymentStatisticsEntity>(TdailyRealtimeUserGiftPaymentStatisticsVo.class, tdailyRealtimeUserGiftPaymentStatisticsEntities).getTargetList();
               //return ApiResponse.ok(tdailyRealtimeUserGiftPaymentStatisticsVoList);
        }

        /**
         * 删除对应主键的数据
         * @return
         */
         public ApiResponse delete(String id){
                //tdailyRealtimeUserGiftPaymentStatisticsEntityRepo.delete(id);
                return ApiResponse.prompt(Syscode.SC_OK);
         }

}