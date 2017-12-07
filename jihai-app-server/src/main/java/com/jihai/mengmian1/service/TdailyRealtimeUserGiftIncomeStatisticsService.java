package com.jihai.mengmian1.service;

import com.google.common.reflect.TypeToken;
import com.jihai.mengmian.BeanUtils;
import com.jihai.mengmian.BeanListUtils;
import com.jihai.mengmian1.entity.TdailyRealtimeUserGiftIncomeStatisticsEntity;
import com.jihai.mengmian1.repo.TdailyRealtimeUserGiftIncomeStatisticsEntityRepo;
import com.jihai.mengmian1.vo.TdailyRealtimeUserGiftIncomeStatisticsVo;
import com.jihai.mengmian1.dto.TdailyRealtimeUserGiftIncomeStatisticsDto;
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
public class TdailyRealtimeUserGiftIncomeStatisticsService {
    @Autowired
    private TdailyRealtimeUserGiftIncomeStatisticsEntityRepo tdailyRealtimeUserGiftIncomeStatisticsEntityRepo;

    /**
     * 新增
     * @param tdailyRealtimeUserGiftIncomeStatisticsDto
     * @return ApiResponse<TdailyRealtimeUserGiftIncomeStatisticsVo>
     */
     public ApiResponse<TdailyRealtimeUserGiftIncomeStatisticsVo> insert(TdailyRealtimeUserGiftIncomeStatisticsDto tdailyRealtimeUserGiftIncomeStatisticsDto){
           return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<TdailyRealtimeUserGiftIncomeStatisticsVo>(){}.getType()));
           //TdailyRealtimeUserGiftIncomeStatisticsEntity tdailyRealtimeUserGiftIncomeStatisticsEntity = BeanUtils.copyAttrs(new TdailyRealtimeUserGiftIncomeStatisticsEntity(), tdailyRealtimeUserGiftIncomeStatisticsDto);
           //tdailyRealtimeUserGiftIncomeStatisticsEntityRepo.save(tdailyRealtimeUserGiftIncomeStatisticsEntity);
           //return ApiResponse.ok(BeanUtils.copyAttrs(new TdailyRealtimeUserGiftIncomeStatisticsVo(),tdailyRealtimeUserGiftIncomeStatisticsEntity));
     }


     /**
      * 修改
      * @param tdailyRealtimeUserGiftIncomeStatisticsDto
      * @return ApiResponse<TdailyRealtimeUserGiftIncomeStatisticsVo>
      */
      public ApiResponse<TdailyRealtimeUserGiftIncomeStatisticsVo> update(TdailyRealtimeUserGiftIncomeStatisticsDto tdailyRealtimeUserGiftIncomeStatisticsDto){
            return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<TdailyRealtimeUserGiftIncomeStatisticsVo>(){}.getType()));
            //TdailyRealtimeUserGiftIncomeStatisticsEntity tdailyRealtimeUserGiftIncomeStatisticsEntity = BeanUtils.copyAttrs(new TdailyRealtimeUserGiftIncomeStatisticsEntity(), tdailyRealtimeUserGiftIncomeStatisticsDto);
            //tdailyRealtimeUserGiftIncomeStatisticsEntityRepo.save(tdailyRealtimeUserGiftIncomeStatisticsEntity);
            //return ApiResponse.ok(BeanUtils.copyAttrs(new TdailyRealtimeUserGiftIncomeStatisticsVo(),tdailyRealtimeUserGiftIncomeStatisticsEntity));
      }

      /**
       * 通过主键获取对象
       * @param id 实体主键
       * @return ApiResponse<TdailyRealtimeUserGiftIncomeStatisticsVo>
       */
       public ApiResponse<TdailyRealtimeUserGiftIncomeStatisticsVo> findOne(String id){
             return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<TdailyRealtimeUserGiftIncomeStatisticsVo>(){}.getType()));
             //TdailyRealtimeUserGiftIncomeStatisticsEntity tdailyRealtimeUserGiftIncomeStatisticsEntity = tdailyRealtimeUserGiftIncomeStatisticsEntityRepo.findOne(id);
             //return ApiResponse.ok(BeanUtils.copyAttrs(new TdailyRealtimeUserGiftIncomeStatisticsVo(),tdailyRealtimeUserGiftIncomeStatisticsEntity));
       }

       /**
        * 默认查询所有列表，若要筛选列表，请增加过滤参数
        * @return ApiResponse<List<TdailyRealtimeUserGiftIncomeStatisticsVo>>
        */
        public ApiResponse<List<TdailyRealtimeUserGiftIncomeStatisticsVo>> findAll(){
               return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<List<TdailyRealtimeUserGiftIncomeStatisticsVo>>(){}.getType()));
               //List<TdailyRealtimeUserGiftIncomeStatisticsEntity> tdailyRealtimeUserGiftIncomeStatisticsEntities = tdailyRealtimeUserGiftIncomeStatisticsEntityRepo.findAll();
               //List<TdailyRealtimeUserGiftIncomeStatisticsVo> tdailyRealtimeUserGiftIncomeStatisticsVoList = new BeanListUtils<TdailyRealtimeUserGiftIncomeStatisticsVo, TdailyRealtimeUserGiftIncomeStatisticsEntity>(TdailyRealtimeUserGiftIncomeStatisticsVo.class, tdailyRealtimeUserGiftIncomeStatisticsEntities).getTargetList();
               //return ApiResponse.ok(tdailyRealtimeUserGiftIncomeStatisticsVoList);
        }

        /**
         * 删除对应主键的数据
         * @return
         */
         public ApiResponse delete(String id){
                //tdailyRealtimeUserGiftIncomeStatisticsEntityRepo.delete(id);
                return ApiResponse.prompt(Syscode.SC_OK);
         }

}