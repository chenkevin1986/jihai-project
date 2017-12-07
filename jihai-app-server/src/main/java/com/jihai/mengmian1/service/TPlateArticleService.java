package com.jihai.mengmian1.service;

import com.google.common.reflect.TypeToken;
import com.jihai.mengmian.BeanUtils;
import com.jihai.mengmian.BeanListUtils;
import com.jihai.mengmian1.entity.TPlateArticleEntity;
import com.jihai.mengmian1.repo.TPlateArticleEntityRepo;
import com.jihai.mengmian1.vo.TPlateArticleVo;
import com.jihai.mengmian1.dto.TPlateArticleDto;
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
public class TPlateArticleService {
    @Autowired
    private TPlateArticleEntityRepo tPlateArticleEntityRepo;

    /**
     * 新增
     * @param tPlateArticleDto
     * @return ApiResponse<TPlateArticleVo>
     */
     public ApiResponse<TPlateArticleVo> insert(TPlateArticleDto tPlateArticleDto){
           return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<TPlateArticleVo>(){}.getType()));
           //TPlateArticleEntity tPlateArticleEntity = BeanUtils.copyAttrs(new TPlateArticleEntity(), tPlateArticleDto);
           //tPlateArticleEntityRepo.save(tPlateArticleEntity);
           //return ApiResponse.ok(BeanUtils.copyAttrs(new TPlateArticleVo(),tPlateArticleEntity));
     }


     /**
      * 修改
      * @param tPlateArticleDto
      * @return ApiResponse<TPlateArticleVo>
      */
      public ApiResponse<TPlateArticleVo> update(TPlateArticleDto tPlateArticleDto){
            return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<TPlateArticleVo>(){}.getType()));
            //TPlateArticleEntity tPlateArticleEntity = BeanUtils.copyAttrs(new TPlateArticleEntity(), tPlateArticleDto);
            //tPlateArticleEntityRepo.save(tPlateArticleEntity);
            //return ApiResponse.ok(BeanUtils.copyAttrs(new TPlateArticleVo(),tPlateArticleEntity));
      }

      /**
       * 通过主键获取对象
       * @param id 实体主键
       * @return ApiResponse<TPlateArticleVo>
       */
       public ApiResponse<TPlateArticleVo> findOne(String id){
             return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<TPlateArticleVo>(){}.getType()));
             //TPlateArticleEntity tPlateArticleEntity = tPlateArticleEntityRepo.findOne(id);
             //return ApiResponse.ok(BeanUtils.copyAttrs(new TPlateArticleVo(),tPlateArticleEntity));
       }

       /**
        * 默认查询所有列表，若要筛选列表，请增加过滤参数
        * @return ApiResponse<List<TPlateArticleVo>>
        */
        public ApiResponse<List<TPlateArticleVo>> findAll(){
               return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<List<TPlateArticleVo>>(){}.getType()));
               //List<TPlateArticleEntity> tPlateArticleEntities = tPlateArticleEntityRepo.findAll();
               //List<TPlateArticleVo> tPlateArticleVoList = new BeanListUtils<TPlateArticleVo, TPlateArticleEntity>(TPlateArticleVo.class, tPlateArticleEntities).getTargetList();
               //return ApiResponse.ok(tPlateArticleVoList);
        }

        /**
         * 删除对应主键的数据
         * @return
         */
         public ApiResponse delete(String id){
                //tPlateArticleEntityRepo.delete(id);
                return ApiResponse.prompt(Syscode.SC_OK);
         }

}