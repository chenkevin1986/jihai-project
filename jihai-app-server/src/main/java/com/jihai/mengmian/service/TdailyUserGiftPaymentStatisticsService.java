package com.jihai.mengmian.service;

import com.google.common.reflect.TypeToken;
import com.jihai.mengmian.BeanUtils;
import com.jihai.mengmian.BeanListUtils;
import com.jihai.mengmian.entity.TdailyUserGiftPaymentStatisticsEntity;
import com.jihai.mengmian.repo.TdailyUserGiftPaymentStatisticsEntityRepo;
import com.jihai.mengmian.vo.TdailyUserGiftPaymentStatisticsVo;
import com.jihai.mengmian.dto.TdailyUserGiftPaymentStatisticsDto;
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
public class TdailyUserGiftPaymentStatisticsService {
    @Autowired
    private TdailyUserGiftPaymentStatisticsEntityRepo tdailyUserGiftPaymentStatisticsEntityRepo;

    /**
     * 新增
     * @param tdailyUserGiftPaymentStatisticsDto
     * @return ApiResponse<TdailyUserGiftPaymentStatisticsVo>
     */
     public ApiResponse<TdailyUserGiftPaymentStatisticsVo> insert(TdailyUserGiftPaymentStatisticsDto tdailyUserGiftPaymentStatisticsDto){
           return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<TdailyUserGiftPaymentStatisticsVo>(){}.getType()));
           //TdailyUserGiftPaymentStatisticsEntity tdailyUserGiftPaymentStatisticsEntity = BeanUtils.copyAttrs(new TdailyUserGiftPaymentStatisticsEntity(), tdailyUserGiftPaymentStatisticsDto);
           //tdailyUserGiftPaymentStatisticsEntityRepo.save(tdailyUserGiftPaymentStatisticsEntity);
           //return ApiResponse.ok(BeanUtils.copyAttrs(new TdailyUserGiftPaymentStatisticsVo(),tdailyUserGiftPaymentStatisticsEntity));
     }


     /**
      * 修改
      * @param tdailyUserGiftPaymentStatisticsDto
      * @return ApiResponse<TdailyUserGiftPaymentStatisticsVo>
      */
      public ApiResponse<TdailyUserGiftPaymentStatisticsVo> update(TdailyUserGiftPaymentStatisticsDto tdailyUserGiftPaymentStatisticsDto){
            return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<TdailyUserGiftPaymentStatisticsVo>(){}.getType()));
            //TdailyUserGiftPaymentStatisticsEntity tdailyUserGiftPaymentStatisticsEntity = BeanUtils.copyAttrs(new TdailyUserGiftPaymentStatisticsEntity(), tdailyUserGiftPaymentStatisticsDto);
            //tdailyUserGiftPaymentStatisticsEntityRepo.save(tdailyUserGiftPaymentStatisticsEntity);
            //return ApiResponse.ok(BeanUtils.copyAttrs(new TdailyUserGiftPaymentStatisticsVo(),tdailyUserGiftPaymentStatisticsEntity));
      }

      /**
       * 通过主键获取对象
       * @param id 实体主键
       * @return ApiResponse<TdailyUserGiftPaymentStatisticsVo>
       */
       public ApiResponse<TdailyUserGiftPaymentStatisticsVo> findOne(String id){
             return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<TdailyUserGiftPaymentStatisticsVo>(){}.getType()));
             //TdailyUserGiftPaymentStatisticsEntity tdailyUserGiftPaymentStatisticsEntity = tdailyUserGiftPaymentStatisticsEntityRepo.findOne(id);
             //return ApiResponse.ok(BeanUtils.copyAttrs(new TdailyUserGiftPaymentStatisticsVo(),tdailyUserGiftPaymentStatisticsEntity));
       }

       /**
        * 默认查询所有列表，若要筛选列表，请增加过滤参数
        * @return ApiResponse<List<TdailyUserGiftPaymentStatisticsVo>>
        */
        public ApiResponse<List<TdailyUserGiftPaymentStatisticsVo>> findAll(){
               return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<List<TdailyUserGiftPaymentStatisticsVo>>(){}.getType()));
               //List<TdailyUserGiftPaymentStatisticsEntity> tdailyUserGiftPaymentStatisticsEntities = tdailyUserGiftPaymentStatisticsEntityRepo.findAll();
               //List<TdailyUserGiftPaymentStatisticsVo> tdailyUserGiftPaymentStatisticsVoList = new BeanListUtils<TdailyUserGiftPaymentStatisticsVo, TdailyUserGiftPaymentStatisticsEntity>(TdailyUserGiftPaymentStatisticsVo.class, tdailyUserGiftPaymentStatisticsEntities).getTargetList();
               //return ApiResponse.ok(tdailyUserGiftPaymentStatisticsVoList);
        }

        /**
         * 删除对应主键的数据
         * @return
         */
         public ApiResponse delete(String id){
                //tdailyUserGiftPaymentStatisticsEntityRepo.delete(id);
                return ApiResponse.prompt(Syscode.SC_OK);
         }

}