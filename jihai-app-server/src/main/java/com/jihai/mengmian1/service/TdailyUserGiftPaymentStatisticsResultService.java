package com.jihai.mengmian1.service;

import com.google.common.reflect.TypeToken;
import com.jihai.mengmian.BeanUtils;
import com.jihai.mengmian.BeanListUtils;
import com.jihai.mengmian1.entity.TdailyUserGiftPaymentStatisticsResultEntity;
import com.jihai.mengmian1.repo.TdailyUserGiftPaymentStatisticsResultEntityRepo;
import com.jihai.mengmian1.vo.TdailyUserGiftPaymentStatisticsResultVo;
import com.jihai.mengmian1.dto.TdailyUserGiftPaymentStatisticsResultDto;
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
public class TdailyUserGiftPaymentStatisticsResultService {
    @Autowired
    private TdailyUserGiftPaymentStatisticsResultEntityRepo tdailyUserGiftPaymentStatisticsResultEntityRepo;

    /**
     * 新增
     * @param tdailyUserGiftPaymentStatisticsResultDto
     * @return ApiResponse<TdailyUserGiftPaymentStatisticsResultVo>
     */
     public ApiResponse<TdailyUserGiftPaymentStatisticsResultVo> insert(TdailyUserGiftPaymentStatisticsResultDto tdailyUserGiftPaymentStatisticsResultDto){
           return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<TdailyUserGiftPaymentStatisticsResultVo>(){}.getType()));
           //TdailyUserGiftPaymentStatisticsResultEntity tdailyUserGiftPaymentStatisticsResultEntity = BeanUtils.copyAttrs(new TdailyUserGiftPaymentStatisticsResultEntity(), tdailyUserGiftPaymentStatisticsResultDto);
           //tdailyUserGiftPaymentStatisticsResultEntityRepo.save(tdailyUserGiftPaymentStatisticsResultEntity);
           //return ApiResponse.ok(BeanUtils.copyAttrs(new TdailyUserGiftPaymentStatisticsResultVo(),tdailyUserGiftPaymentStatisticsResultEntity));
     }


     /**
      * 修改
      * @param tdailyUserGiftPaymentStatisticsResultDto
      * @return ApiResponse<TdailyUserGiftPaymentStatisticsResultVo>
      */
      public ApiResponse<TdailyUserGiftPaymentStatisticsResultVo> update(TdailyUserGiftPaymentStatisticsResultDto tdailyUserGiftPaymentStatisticsResultDto){
            return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<TdailyUserGiftPaymentStatisticsResultVo>(){}.getType()));
            //TdailyUserGiftPaymentStatisticsResultEntity tdailyUserGiftPaymentStatisticsResultEntity = BeanUtils.copyAttrs(new TdailyUserGiftPaymentStatisticsResultEntity(), tdailyUserGiftPaymentStatisticsResultDto);
            //tdailyUserGiftPaymentStatisticsResultEntityRepo.save(tdailyUserGiftPaymentStatisticsResultEntity);
            //return ApiResponse.ok(BeanUtils.copyAttrs(new TdailyUserGiftPaymentStatisticsResultVo(),tdailyUserGiftPaymentStatisticsResultEntity));
      }

      /**
       * 通过主键获取对象
       * @param id 实体主键
       * @return ApiResponse<TdailyUserGiftPaymentStatisticsResultVo>
       */
       public ApiResponse<TdailyUserGiftPaymentStatisticsResultVo> findOne(String id){
             return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<TdailyUserGiftPaymentStatisticsResultVo>(){}.getType()));
             //TdailyUserGiftPaymentStatisticsResultEntity tdailyUserGiftPaymentStatisticsResultEntity = tdailyUserGiftPaymentStatisticsResultEntityRepo.findOne(id);
             //return ApiResponse.ok(BeanUtils.copyAttrs(new TdailyUserGiftPaymentStatisticsResultVo(),tdailyUserGiftPaymentStatisticsResultEntity));
       }

       /**
        * 默认查询所有列表，若要筛选列表，请增加过滤参数
        * @return ApiResponse<List<TdailyUserGiftPaymentStatisticsResultVo>>
        */
        public ApiResponse<List<TdailyUserGiftPaymentStatisticsResultVo>> findAll(){
               return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<List<TdailyUserGiftPaymentStatisticsResultVo>>(){}.getType()));
               //List<TdailyUserGiftPaymentStatisticsResultEntity> tdailyUserGiftPaymentStatisticsResultEntities = tdailyUserGiftPaymentStatisticsResultEntityRepo.findAll();
               //List<TdailyUserGiftPaymentStatisticsResultVo> tdailyUserGiftPaymentStatisticsResultVoList = new BeanListUtils<TdailyUserGiftPaymentStatisticsResultVo, TdailyUserGiftPaymentStatisticsResultEntity>(TdailyUserGiftPaymentStatisticsResultVo.class, tdailyUserGiftPaymentStatisticsResultEntities).getTargetList();
               //return ApiResponse.ok(tdailyUserGiftPaymentStatisticsResultVoList);
        }

        /**
         * 删除对应主键的数据
         * @return
         */
         public ApiResponse delete(String id){
                //tdailyUserGiftPaymentStatisticsResultEntityRepo.delete(id);
                return ApiResponse.prompt(Syscode.SC_OK);
         }

}