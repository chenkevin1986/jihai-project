package com.jihai.mengmian.service;

import com.google.common.reflect.TypeToken;
import com.jihai.mengmian.BeanUtils;
import com.jihai.mengmian.BeanListUtils;
import com.jihai.mengmian.entity.TCarouselEntity;
import com.jihai.mengmian.repo.TCarouselEntityRepo;
import com.jihai.mengmian.vo.TCarouselVo;
import com.jihai.mengmian.dto.TCarouselDto;
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
public class TCarouselService {
    @Autowired
    private TCarouselEntityRepo tCarouselEntityRepo;

    /**
     * 新增
     * @param tCarouselDto
     * @return ApiResponse<TCarouselVo>
     */
     public ApiResponse<TCarouselVo> insert(TCarouselDto tCarouselDto){
           return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<TCarouselVo>(){}.getType()));
           //TCarouselEntity tCarouselEntity = BeanUtils.copyAttrs(new TCarouselEntity(), tCarouselDto);
           //tCarouselEntityRepo.save(tCarouselEntity);
           //return ApiResponse.ok(BeanUtils.copyAttrs(new TCarouselVo(),tCarouselEntity));
     }


     /**
      * 修改
      * @param tCarouselDto
      * @return ApiResponse<TCarouselVo>
      */
      public ApiResponse<TCarouselVo> update(TCarouselDto tCarouselDto){
            return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<TCarouselVo>(){}.getType()));
            //TCarouselEntity tCarouselEntity = BeanUtils.copyAttrs(new TCarouselEntity(), tCarouselDto);
            //tCarouselEntityRepo.save(tCarouselEntity);
            //return ApiResponse.ok(BeanUtils.copyAttrs(new TCarouselVo(),tCarouselEntity));
      }

      /**
       * 通过主键获取对象
       * @param id 实体主键
       * @return ApiResponse<TCarouselVo>
       */
       public ApiResponse<TCarouselVo> findOne(String id){
             return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<TCarouselVo>(){}.getType()));
             //TCarouselEntity tCarouselEntity = tCarouselEntityRepo.findOne(id);
             //return ApiResponse.ok(BeanUtils.copyAttrs(new TCarouselVo(),tCarouselEntity));
       }

       /**
        * 默认查询所有列表，若要筛选列表，请增加过滤参数
        * @return ApiResponse<List<TCarouselVo>>
        */
        public ApiResponse<List<TCarouselVo>> findAll(){
               return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<List<TCarouselVo>>(){}.getType()));
               //List<TCarouselEntity> tCarouselEntities = tCarouselEntityRepo.findAll();
               //List<TCarouselVo> tCarouselVoList = new BeanListUtils<TCarouselVo, TCarouselEntity>(TCarouselVo.class, tCarouselEntities).getTargetList();
               //return ApiResponse.ok(tCarouselVoList);
        }

        /**
         * 删除对应主键的数据
         * @return
         */
         public ApiResponse delete(String id){
                //tCarouselEntityRepo.delete(id);
                return ApiResponse.prompt(Syscode.SC_OK);
         }

}