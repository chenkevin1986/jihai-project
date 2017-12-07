package com.jihai.mengmian1.service;

import com.google.common.reflect.TypeToken;
import com.jihai.mengmian.BeanUtils;
import com.jihai.mengmian.BeanListUtils;
import com.jihai.mengmian1.entity.TDailyInfoEntity;
import com.jihai.mengmian1.repo.TDailyInfoEntityRepo;
import com.jihai.mengmian1.vo.TDailyInfoVo;
import com.jihai.mengmian1.dto.TDailyInfoDto;
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
public class TDailyInfoService {
    @Autowired
    private TDailyInfoEntityRepo tDailyInfoEntityRepo;

    /**
     * 新增
     * @param tDailyInfoDto
     * @return ApiResponse<TDailyInfoVo>
     */
     public ApiResponse<TDailyInfoVo> insert(TDailyInfoDto tDailyInfoDto){
           return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<TDailyInfoVo>(){}.getType()));
           //TDailyInfoEntity tDailyInfoEntity = BeanUtils.copyAttrs(new TDailyInfoEntity(), tDailyInfoDto);
           //tDailyInfoEntityRepo.save(tDailyInfoEntity);
           //return ApiResponse.ok(BeanUtils.copyAttrs(new TDailyInfoVo(),tDailyInfoEntity));
     }


     /**
      * 修改
      * @param tDailyInfoDto
      * @return ApiResponse<TDailyInfoVo>
      */
      public ApiResponse<TDailyInfoVo> update(TDailyInfoDto tDailyInfoDto){
            return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<TDailyInfoVo>(){}.getType()));
            //TDailyInfoEntity tDailyInfoEntity = BeanUtils.copyAttrs(new TDailyInfoEntity(), tDailyInfoDto);
            //tDailyInfoEntityRepo.save(tDailyInfoEntity);
            //return ApiResponse.ok(BeanUtils.copyAttrs(new TDailyInfoVo(),tDailyInfoEntity));
      }

      /**
       * 通过主键获取对象
       * @param id 实体主键
       * @return ApiResponse<TDailyInfoVo>
       */
       public ApiResponse<TDailyInfoVo> findOne(String id){
             return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<TDailyInfoVo>(){}.getType()));
             //TDailyInfoEntity tDailyInfoEntity = tDailyInfoEntityRepo.findOne(id);
             //return ApiResponse.ok(BeanUtils.copyAttrs(new TDailyInfoVo(),tDailyInfoEntity));
       }

       /**
        * 默认查询所有列表，若要筛选列表，请增加过滤参数
        * @return ApiResponse<List<TDailyInfoVo>>
        */
        public ApiResponse<List<TDailyInfoVo>> findAll(){
               return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<List<TDailyInfoVo>>(){}.getType()));
               //List<TDailyInfoEntity> tDailyInfoEntities = tDailyInfoEntityRepo.findAll();
               //List<TDailyInfoVo> tDailyInfoVoList = new BeanListUtils<TDailyInfoVo, TDailyInfoEntity>(TDailyInfoVo.class, tDailyInfoEntities).getTargetList();
               //return ApiResponse.ok(tDailyInfoVoList);
        }

        /**
         * 删除对应主键的数据
         * @return
         */
         public ApiResponse delete(String id){
                //tDailyInfoEntityRepo.delete(id);
                return ApiResponse.prompt(Syscode.SC_OK);
         }

}