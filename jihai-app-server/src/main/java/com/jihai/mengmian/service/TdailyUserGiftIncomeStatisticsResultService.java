package com.jihai.mengmian.service;

import com.google.common.reflect.TypeToken;
import com.jihai.mengmian.BeanUtils;
import com.jihai.mengmian.BeanListUtils;
import com.jihai.mengmian.entity.TdailyUserGiftIncomeStatisticsResultEntity;
import com.jihai.mengmian.repo.TdailyUserGiftIncomeStatisticsResultEntityRepo;
import com.jihai.mengmian.vo.TdailyUserGiftIncomeStatisticsResultVo;
import com.jihai.mengmian.dto.TdailyUserGiftIncomeStatisticsResultDto;
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
public class TdailyUserGiftIncomeStatisticsResultService {
    @Autowired
    private TdailyUserGiftIncomeStatisticsResultEntityRepo tdailyUserGiftIncomeStatisticsResultEntityRepo;

    /**
     * 新增
     * @param tdailyUserGiftIncomeStatisticsResultDto
     * @return ApiResponse<TdailyUserGiftIncomeStatisticsResultVo>
     */
     public ApiResponse<TdailyUserGiftIncomeStatisticsResultVo> insert(TdailyUserGiftIncomeStatisticsResultDto tdailyUserGiftIncomeStatisticsResultDto){
           return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<TdailyUserGiftIncomeStatisticsResultVo>(){}.getType()));
           //TdailyUserGiftIncomeStatisticsResultEntity tdailyUserGiftIncomeStatisticsResultEntity = BeanUtils.copyAttrs(new TdailyUserGiftIncomeStatisticsResultEntity(), tdailyUserGiftIncomeStatisticsResultDto);
           //tdailyUserGiftIncomeStatisticsResultEntityRepo.save(tdailyUserGiftIncomeStatisticsResultEntity);
           //return ApiResponse.ok(BeanUtils.copyAttrs(new TdailyUserGiftIncomeStatisticsResultVo(),tdailyUserGiftIncomeStatisticsResultEntity));
     }


     /**
      * 修改
      * @param tdailyUserGiftIncomeStatisticsResultDto
      * @return ApiResponse<TdailyUserGiftIncomeStatisticsResultVo>
      */
      public ApiResponse<TdailyUserGiftIncomeStatisticsResultVo> update(TdailyUserGiftIncomeStatisticsResultDto tdailyUserGiftIncomeStatisticsResultDto){
            return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<TdailyUserGiftIncomeStatisticsResultVo>(){}.getType()));
            //TdailyUserGiftIncomeStatisticsResultEntity tdailyUserGiftIncomeStatisticsResultEntity = BeanUtils.copyAttrs(new TdailyUserGiftIncomeStatisticsResultEntity(), tdailyUserGiftIncomeStatisticsResultDto);
            //tdailyUserGiftIncomeStatisticsResultEntityRepo.save(tdailyUserGiftIncomeStatisticsResultEntity);
            //return ApiResponse.ok(BeanUtils.copyAttrs(new TdailyUserGiftIncomeStatisticsResultVo(),tdailyUserGiftIncomeStatisticsResultEntity));
      }

      /**
       * 通过主键获取对象
       * @param id 实体主键
       * @return ApiResponse<TdailyUserGiftIncomeStatisticsResultVo>
       */
       public ApiResponse<TdailyUserGiftIncomeStatisticsResultVo> findOne(String id){
             return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<TdailyUserGiftIncomeStatisticsResultVo>(){}.getType()));
             //TdailyUserGiftIncomeStatisticsResultEntity tdailyUserGiftIncomeStatisticsResultEntity = tdailyUserGiftIncomeStatisticsResultEntityRepo.findOne(id);
             //return ApiResponse.ok(BeanUtils.copyAttrs(new TdailyUserGiftIncomeStatisticsResultVo(),tdailyUserGiftIncomeStatisticsResultEntity));
       }

       /**
        * 默认查询所有列表，若要筛选列表，请增加过滤参数
        * @return ApiResponse<List<TdailyUserGiftIncomeStatisticsResultVo>>
        */
        public ApiResponse<List<TdailyUserGiftIncomeStatisticsResultVo>> findAll(){
               return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<List<TdailyUserGiftIncomeStatisticsResultVo>>(){}.getType()));
               //List<TdailyUserGiftIncomeStatisticsResultEntity> tdailyUserGiftIncomeStatisticsResultEntities = tdailyUserGiftIncomeStatisticsResultEntityRepo.findAll();
               //List<TdailyUserGiftIncomeStatisticsResultVo> tdailyUserGiftIncomeStatisticsResultVoList = new BeanListUtils<TdailyUserGiftIncomeStatisticsResultVo, TdailyUserGiftIncomeStatisticsResultEntity>(TdailyUserGiftIncomeStatisticsResultVo.class, tdailyUserGiftIncomeStatisticsResultEntities).getTargetList();
               //return ApiResponse.ok(tdailyUserGiftIncomeStatisticsResultVoList);
        }

        /**
         * 删除对应主键的数据
         * @return
         */
         public ApiResponse delete(String id){
                //tdailyUserGiftIncomeStatisticsResultEntityRepo.delete(id);
                return ApiResponse.prompt(Syscode.SC_OK);
         }

}