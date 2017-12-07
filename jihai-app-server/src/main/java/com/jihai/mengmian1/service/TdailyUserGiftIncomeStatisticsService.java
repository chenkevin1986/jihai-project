package com.jihai.mengmian1.service;

import com.google.common.reflect.TypeToken;
import com.jihai.mengmian.BeanUtils;
import com.jihai.mengmian.BeanListUtils;
import com.jihai.mengmian1.entity.TdailyUserGiftIncomeStatisticsEntity;
import com.jihai.mengmian1.repo.TdailyUserGiftIncomeStatisticsEntityRepo;
import com.jihai.mengmian1.vo.TdailyUserGiftIncomeStatisticsVo;
import com.jihai.mengmian1.dto.TdailyUserGiftIncomeStatisticsDto;
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
public class TdailyUserGiftIncomeStatisticsService {
    @Autowired
    private TdailyUserGiftIncomeStatisticsEntityRepo tdailyUserGiftIncomeStatisticsEntityRepo;

    /**
     * 新增
     * @param tdailyUserGiftIncomeStatisticsDto
     * @return ApiResponse<TdailyUserGiftIncomeStatisticsVo>
     */
     public ApiResponse<TdailyUserGiftIncomeStatisticsVo> insert(TdailyUserGiftIncomeStatisticsDto tdailyUserGiftIncomeStatisticsDto){
           return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<TdailyUserGiftIncomeStatisticsVo>(){}.getType()));
           //TdailyUserGiftIncomeStatisticsEntity tdailyUserGiftIncomeStatisticsEntity = BeanUtils.copyAttrs(new TdailyUserGiftIncomeStatisticsEntity(), tdailyUserGiftIncomeStatisticsDto);
           //tdailyUserGiftIncomeStatisticsEntityRepo.save(tdailyUserGiftIncomeStatisticsEntity);
           //return ApiResponse.ok(BeanUtils.copyAttrs(new TdailyUserGiftIncomeStatisticsVo(),tdailyUserGiftIncomeStatisticsEntity));
     }


     /**
      * 修改
      * @param tdailyUserGiftIncomeStatisticsDto
      * @return ApiResponse<TdailyUserGiftIncomeStatisticsVo>
      */
      public ApiResponse<TdailyUserGiftIncomeStatisticsVo> update(TdailyUserGiftIncomeStatisticsDto tdailyUserGiftIncomeStatisticsDto){
            return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<TdailyUserGiftIncomeStatisticsVo>(){}.getType()));
            //TdailyUserGiftIncomeStatisticsEntity tdailyUserGiftIncomeStatisticsEntity = BeanUtils.copyAttrs(new TdailyUserGiftIncomeStatisticsEntity(), tdailyUserGiftIncomeStatisticsDto);
            //tdailyUserGiftIncomeStatisticsEntityRepo.save(tdailyUserGiftIncomeStatisticsEntity);
            //return ApiResponse.ok(BeanUtils.copyAttrs(new TdailyUserGiftIncomeStatisticsVo(),tdailyUserGiftIncomeStatisticsEntity));
      }

      /**
       * 通过主键获取对象
       * @param id 实体主键
       * @return ApiResponse<TdailyUserGiftIncomeStatisticsVo>
       */
       public ApiResponse<TdailyUserGiftIncomeStatisticsVo> findOne(String id){
             return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<TdailyUserGiftIncomeStatisticsVo>(){}.getType()));
             //TdailyUserGiftIncomeStatisticsEntity tdailyUserGiftIncomeStatisticsEntity = tdailyUserGiftIncomeStatisticsEntityRepo.findOne(id);
             //return ApiResponse.ok(BeanUtils.copyAttrs(new TdailyUserGiftIncomeStatisticsVo(),tdailyUserGiftIncomeStatisticsEntity));
       }

       /**
        * 默认查询所有列表，若要筛选列表，请增加过滤参数
        * @return ApiResponse<List<TdailyUserGiftIncomeStatisticsVo>>
        */
        public ApiResponse<List<TdailyUserGiftIncomeStatisticsVo>> findAll(){
               return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<List<TdailyUserGiftIncomeStatisticsVo>>(){}.getType()));
               //List<TdailyUserGiftIncomeStatisticsEntity> tdailyUserGiftIncomeStatisticsEntities = tdailyUserGiftIncomeStatisticsEntityRepo.findAll();
               //List<TdailyUserGiftIncomeStatisticsVo> tdailyUserGiftIncomeStatisticsVoList = new BeanListUtils<TdailyUserGiftIncomeStatisticsVo, TdailyUserGiftIncomeStatisticsEntity>(TdailyUserGiftIncomeStatisticsVo.class, tdailyUserGiftIncomeStatisticsEntities).getTargetList();
               //return ApiResponse.ok(tdailyUserGiftIncomeStatisticsVoList);
        }

        /**
         * 删除对应主键的数据
         * @return
         */
         public ApiResponse delete(String id){
                //tdailyUserGiftIncomeStatisticsEntityRepo.delete(id);
                return ApiResponse.prompt(Syscode.SC_OK);
         }

}