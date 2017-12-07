package com.jihai.mengmian1.service;

import com.google.common.reflect.TypeToken;
import com.jihai.mengmian.BeanUtils;
import com.jihai.mengmian.BeanListUtils;
import com.jihai.mengmian1.entity.TExtraProductEntity;
import com.jihai.mengmian1.repo.TExtraProductEntityRepo;
import com.jihai.mengmian1.vo.TExtraProductVo;
import com.jihai.mengmian1.dto.TExtraProductDto;
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
public class TExtraProductService {
    @Autowired
    private TExtraProductEntityRepo tExtraProductEntityRepo;

    /**
     * 新增
     * @param tExtraProductDto
     * @return ApiResponse<TExtraProductVo>
     */
     public ApiResponse<TExtraProductVo> insert(TExtraProductDto tExtraProductDto){
           return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<TExtraProductVo>(){}.getType()));
           //TExtraProductEntity tExtraProductEntity = BeanUtils.copyAttrs(new TExtraProductEntity(), tExtraProductDto);
           //tExtraProductEntityRepo.save(tExtraProductEntity);
           //return ApiResponse.ok(BeanUtils.copyAttrs(new TExtraProductVo(),tExtraProductEntity));
     }


     /**
      * 修改
      * @param tExtraProductDto
      * @return ApiResponse<TExtraProductVo>
      */
      public ApiResponse<TExtraProductVo> update(TExtraProductDto tExtraProductDto){
            return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<TExtraProductVo>(){}.getType()));
            //TExtraProductEntity tExtraProductEntity = BeanUtils.copyAttrs(new TExtraProductEntity(), tExtraProductDto);
            //tExtraProductEntityRepo.save(tExtraProductEntity);
            //return ApiResponse.ok(BeanUtils.copyAttrs(new TExtraProductVo(),tExtraProductEntity));
      }

      /**
       * 通过主键获取对象
       * @param id 实体主键
       * @return ApiResponse<TExtraProductVo>
       */
       public ApiResponse<TExtraProductVo> findOne(String id){
             return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<TExtraProductVo>(){}.getType()));
             //TExtraProductEntity tExtraProductEntity = tExtraProductEntityRepo.findOne(id);
             //return ApiResponse.ok(BeanUtils.copyAttrs(new TExtraProductVo(),tExtraProductEntity));
       }

       /**
        * 默认查询所有列表，若要筛选列表，请增加过滤参数
        * @return ApiResponse<List<TExtraProductVo>>
        */
        public ApiResponse<List<TExtraProductVo>> findAll(){
               return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<List<TExtraProductVo>>(){}.getType()));
               //List<TExtraProductEntity> tExtraProductEntities = tExtraProductEntityRepo.findAll();
               //List<TExtraProductVo> tExtraProductVoList = new BeanListUtils<TExtraProductVo, TExtraProductEntity>(TExtraProductVo.class, tExtraProductEntities).getTargetList();
               //return ApiResponse.ok(tExtraProductVoList);
        }

        /**
         * 删除对应主键的数据
         * @return
         */
         public ApiResponse delete(String id){
                //tExtraProductEntityRepo.delete(id);
                return ApiResponse.prompt(Syscode.SC_OK);
         }

}