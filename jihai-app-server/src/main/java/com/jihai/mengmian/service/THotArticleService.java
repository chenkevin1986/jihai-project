package com.jihai.mengmian.service;

import com.google.common.reflect.TypeToken;
import com.jihai.mengmian.BeanUtils;
import com.jihai.mengmian.BeanListUtils;
import com.jihai.mengmian.entity.THotArticleEntity;
import com.jihai.mengmian.repo.THotArticleEntityRepo;
import com.jihai.mengmian.vo.THotArticleVo;
import com.jihai.mengmian.dto.THotArticleDto;
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
public class THotArticleService {
    @Autowired
    private THotArticleEntityRepo tHotArticleEntityRepo;

    /**
     * 新增
     * @param tHotArticleDto
     * @return ApiResponse<THotArticleVo>
     */
     public ApiResponse<THotArticleVo> insert(THotArticleDto tHotArticleDto){
           return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<THotArticleVo>(){}.getType()));
           //THotArticleEntity tHotArticleEntity = BeanUtils.copyAttrs(new THotArticleEntity(), tHotArticleDto);
           //tHotArticleEntityRepo.save(tHotArticleEntity);
           //return ApiResponse.ok(BeanUtils.copyAttrs(new THotArticleVo(),tHotArticleEntity));
     }


     /**
      * 修改
      * @param tHotArticleDto
      * @return ApiResponse<THotArticleVo>
      */
      public ApiResponse<THotArticleVo> update(THotArticleDto tHotArticleDto){
            return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<THotArticleVo>(){}.getType()));
            //THotArticleEntity tHotArticleEntity = BeanUtils.copyAttrs(new THotArticleEntity(), tHotArticleDto);
            //tHotArticleEntityRepo.save(tHotArticleEntity);
            //return ApiResponse.ok(BeanUtils.copyAttrs(new THotArticleVo(),tHotArticleEntity));
      }

      /**
       * 通过主键获取对象
       * @param id 实体主键
       * @return ApiResponse<THotArticleVo>
       */
       public ApiResponse<THotArticleVo> findOne(String id){
             return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<THotArticleVo>(){}.getType()));
             //THotArticleEntity tHotArticleEntity = tHotArticleEntityRepo.findOne(id);
             //return ApiResponse.ok(BeanUtils.copyAttrs(new THotArticleVo(),tHotArticleEntity));
       }

       /**
        * 默认查询所有列表，若要筛选列表，请增加过滤参数
        * @return ApiResponse<List<THotArticleVo>>
        */
        public ApiResponse<List<THotArticleVo>> findAll(){
               return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<List<THotArticleVo>>(){}.getType()));
               //List<THotArticleEntity> tHotArticleEntities = tHotArticleEntityRepo.findAll();
               //List<THotArticleVo> tHotArticleVoList = new BeanListUtils<THotArticleVo, THotArticleEntity>(THotArticleVo.class, tHotArticleEntities).getTargetList();
               //return ApiResponse.ok(tHotArticleVoList);
        }

        /**
         * 删除对应主键的数据
         * @return
         */
         public ApiResponse delete(String id){
                //tHotArticleEntityRepo.delete(id);
                return ApiResponse.prompt(Syscode.SC_OK);
         }

}