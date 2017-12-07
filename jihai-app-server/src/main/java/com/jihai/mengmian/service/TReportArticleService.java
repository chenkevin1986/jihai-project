package com.jihai.mengmian.service;

import com.google.common.reflect.TypeToken;
import com.jihai.mengmian.BeanUtils;
import com.jihai.mengmian.BeanListUtils;
import com.jihai.mengmian.entity.TReportArticleEntity;
import com.jihai.mengmian.repo.TReportArticleEntityRepo;
import com.jihai.mengmian.vo.TReportArticleVo;
import com.jihai.mengmian.dto.TReportArticleDto;
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
public class TReportArticleService {
    @Autowired
    private TReportArticleEntityRepo tReportArticleEntityRepo;

    /**
     * 新增
     * @param tReportArticleDto
     * @return ApiResponse<TReportArticleVo>
     */
     public ApiResponse<TReportArticleVo> insert(TReportArticleDto tReportArticleDto){
           return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<TReportArticleVo>(){}.getType()));
           //TReportArticleEntity tReportArticleEntity = BeanUtils.copyAttrs(new TReportArticleEntity(), tReportArticleDto);
           //tReportArticleEntityRepo.save(tReportArticleEntity);
           //return ApiResponse.ok(BeanUtils.copyAttrs(new TReportArticleVo(),tReportArticleEntity));
     }


     /**
      * 修改
      * @param tReportArticleDto
      * @return ApiResponse<TReportArticleVo>
      */
      public ApiResponse<TReportArticleVo> update(TReportArticleDto tReportArticleDto){
            return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<TReportArticleVo>(){}.getType()));
            //TReportArticleEntity tReportArticleEntity = BeanUtils.copyAttrs(new TReportArticleEntity(), tReportArticleDto);
            //tReportArticleEntityRepo.save(tReportArticleEntity);
            //return ApiResponse.ok(BeanUtils.copyAttrs(new TReportArticleVo(),tReportArticleEntity));
      }

      /**
       * 通过主键获取对象
       * @param id 实体主键
       * @return ApiResponse<TReportArticleVo>
       */
       public ApiResponse<TReportArticleVo> findOne(String id){
             return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<TReportArticleVo>(){}.getType()));
             //TReportArticleEntity tReportArticleEntity = tReportArticleEntityRepo.findOne(id);
             //return ApiResponse.ok(BeanUtils.copyAttrs(new TReportArticleVo(),tReportArticleEntity));
       }

       /**
        * 默认查询所有列表，若要筛选列表，请增加过滤参数
        * @return ApiResponse<List<TReportArticleVo>>
        */
        public ApiResponse<List<TReportArticleVo>> findAll(){
               return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<List<TReportArticleVo>>(){}.getType()));
               //List<TReportArticleEntity> tReportArticleEntities = tReportArticleEntityRepo.findAll();
               //List<TReportArticleVo> tReportArticleVoList = new BeanListUtils<TReportArticleVo, TReportArticleEntity>(TReportArticleVo.class, tReportArticleEntities).getTargetList();
               //return ApiResponse.ok(tReportArticleVoList);
        }

        /**
         * 删除对应主键的数据
         * @return
         */
         public ApiResponse delete(String id){
                //tReportArticleEntityRepo.delete(id);
                return ApiResponse.prompt(Syscode.SC_OK);
         }

}