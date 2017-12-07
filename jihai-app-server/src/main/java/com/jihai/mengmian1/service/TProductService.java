package com.jihai.mengmian1.service;

import com.google.common.reflect.TypeToken;
import com.jihai.mengmian.BeanUtils;
import com.jihai.mengmian.BeanListUtils;
import com.jihai.mengmian1.entity.TProductEntity;
import com.jihai.mengmian1.repo.TProductEntityRepo;
import com.jihai.mengmian1.vo.TProductVo;
import com.jihai.mengmian1.dto.TProductDto;
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
public class TProductService {
    @Autowired
    private TProductEntityRepo tProductEntityRepo;

    /**
     * 新增
     * @param tProductDto
     * @return ApiResponse<TProductVo>
     */
     public ApiResponse<TProductVo> insert(TProductDto tProductDto){
           return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<TProductVo>(){}.getType()));
           //TProductEntity tProductEntity = BeanUtils.copyAttrs(new TProductEntity(), tProductDto);
           //tProductEntityRepo.save(tProductEntity);
           //return ApiResponse.ok(BeanUtils.copyAttrs(new TProductVo(),tProductEntity));
     }


     /**
      * 修改
      * @param tProductDto
      * @return ApiResponse<TProductVo>
      */
      public ApiResponse<TProductVo> update(TProductDto tProductDto){
            return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<TProductVo>(){}.getType()));
            //TProductEntity tProductEntity = BeanUtils.copyAttrs(new TProductEntity(), tProductDto);
            //tProductEntityRepo.save(tProductEntity);
            //return ApiResponse.ok(BeanUtils.copyAttrs(new TProductVo(),tProductEntity));
      }

      /**
       * 通过主键获取对象
       * @param id 实体主键
       * @return ApiResponse<TProductVo>
       */
       public ApiResponse<TProductVo> findOne(String id){
             return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<TProductVo>(){}.getType()));
             //TProductEntity tProductEntity = tProductEntityRepo.findOne(id);
             //return ApiResponse.ok(BeanUtils.copyAttrs(new TProductVo(),tProductEntity));
       }

       /**
        * 默认查询所有列表，若要筛选列表，请增加过滤参数
        * @return ApiResponse<List<TProductVo>>
        */
        public ApiResponse<List<TProductVo>> findAll(){
               return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<List<TProductVo>>(){}.getType()));
               //List<TProductEntity> tProductEntities = tProductEntityRepo.findAll();
               //List<TProductVo> tProductVoList = new BeanListUtils<TProductVo, TProductEntity>(TProductVo.class, tProductEntities).getTargetList();
               //return ApiResponse.ok(tProductVoList);
        }

        /**
         * 删除对应主键的数据
         * @return
         */
         public ApiResponse delete(String id){
                //tProductEntityRepo.delete(id);
                return ApiResponse.prompt(Syscode.SC_OK);
         }

}