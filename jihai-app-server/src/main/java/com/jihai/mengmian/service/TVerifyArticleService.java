package com.jihai.mengmian.service;

import com.google.common.reflect.TypeToken;
import com.jihai.mengmian.BeanUtils;
import com.jihai.mengmian.BeanListUtils;
import com.jihai.mengmian.entity.TVerifyArticleEntity;
import com.jihai.mengmian.repo.TVerifyArticleEntityRepo;
import com.jihai.mengmian.vo.TVerifyArticleVo;
import com.jihai.mengmian.dto.TVerifyArticleDto;
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
public class TVerifyArticleService {
    @Autowired
    private TVerifyArticleEntityRepo tVerifyArticleEntityRepo;

    /**
     * 新增
     * @param tVerifyArticleDto
     * @return ApiResponse<TVerifyArticleVo>
     */
     public ApiResponse<TVerifyArticleVo> insert(TVerifyArticleDto tVerifyArticleDto){
           return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<TVerifyArticleVo>(){}.getType()));
           //TVerifyArticleEntity tVerifyArticleEntity = BeanUtils.copyAttrs(new TVerifyArticleEntity(), tVerifyArticleDto);
           //tVerifyArticleEntityRepo.save(tVerifyArticleEntity);
           //return ApiResponse.ok(BeanUtils.copyAttrs(new TVerifyArticleVo(),tVerifyArticleEntity));
     }


     /**
      * 修改
      * @param tVerifyArticleDto
      * @return ApiResponse<TVerifyArticleVo>
      */
      public ApiResponse<TVerifyArticleVo> update(TVerifyArticleDto tVerifyArticleDto){
            return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<TVerifyArticleVo>(){}.getType()));
            //TVerifyArticleEntity tVerifyArticleEntity = BeanUtils.copyAttrs(new TVerifyArticleEntity(), tVerifyArticleDto);
            //tVerifyArticleEntityRepo.save(tVerifyArticleEntity);
            //return ApiResponse.ok(BeanUtils.copyAttrs(new TVerifyArticleVo(),tVerifyArticleEntity));
      }

      /**
       * 通过主键获取对象
       * @param id 实体主键
       * @return ApiResponse<TVerifyArticleVo>
       */
       public ApiResponse<TVerifyArticleVo> findOne(String id){
             return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<TVerifyArticleVo>(){}.getType()));
             //TVerifyArticleEntity tVerifyArticleEntity = tVerifyArticleEntityRepo.findOne(id);
             //return ApiResponse.ok(BeanUtils.copyAttrs(new TVerifyArticleVo(),tVerifyArticleEntity));
       }

       /**
        * 默认查询所有列表，若要筛选列表，请增加过滤参数
        * @return ApiResponse<List<TVerifyArticleVo>>
        */
        public ApiResponse<List<TVerifyArticleVo>> findAll(){
               return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<List<TVerifyArticleVo>>(){}.getType()));
               //List<TVerifyArticleEntity> tVerifyArticleEntities = tVerifyArticleEntityRepo.findAll();
               //List<TVerifyArticleVo> tVerifyArticleVoList = new BeanListUtils<TVerifyArticleVo, TVerifyArticleEntity>(TVerifyArticleVo.class, tVerifyArticleEntities).getTargetList();
               //return ApiResponse.ok(tVerifyArticleVoList);
        }

        /**
         * 删除对应主键的数据
         * @return
         */
         public ApiResponse delete(String id){
                //tVerifyArticleEntityRepo.delete(id);
                return ApiResponse.prompt(Syscode.SC_OK);
         }

}