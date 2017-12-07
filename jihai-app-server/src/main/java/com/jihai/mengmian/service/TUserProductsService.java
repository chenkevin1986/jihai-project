package com.jihai.mengmian.service;

import com.google.common.reflect.TypeToken;
import com.jihai.mengmian.BeanUtils;
import com.jihai.mengmian.BeanListUtils;
import com.jihai.mengmian.entity.TUserProductsEntity;
import com.jihai.mengmian.repo.TUserProductsEntityRepo;
import com.jihai.mengmian.vo.TUserProductsVo;
import com.jihai.mengmian.dto.TUserProductsDto;
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
public class TUserProductsService {
    @Autowired
    private TUserProductsEntityRepo tUserProductsEntityRepo;

    /**
     * 新增
     * @param tUserProductsDto
     * @return ApiResponse<TUserProductsVo>
     */
     public ApiResponse<TUserProductsVo> insert(TUserProductsDto tUserProductsDto){
           return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<TUserProductsVo>(){}.getType()));
           //TUserProductsEntity tUserProductsEntity = BeanUtils.copyAttrs(new TUserProductsEntity(), tUserProductsDto);
           //tUserProductsEntityRepo.save(tUserProductsEntity);
           //return ApiResponse.ok(BeanUtils.copyAttrs(new TUserProductsVo(),tUserProductsEntity));
     }


     /**
      * 修改
      * @param tUserProductsDto
      * @return ApiResponse<TUserProductsVo>
      */
      public ApiResponse<TUserProductsVo> update(TUserProductsDto tUserProductsDto){
            return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<TUserProductsVo>(){}.getType()));
            //TUserProductsEntity tUserProductsEntity = BeanUtils.copyAttrs(new TUserProductsEntity(), tUserProductsDto);
            //tUserProductsEntityRepo.save(tUserProductsEntity);
            //return ApiResponse.ok(BeanUtils.copyAttrs(new TUserProductsVo(),tUserProductsEntity));
      }

      /**
       * 通过主键获取对象
       * @param id 实体主键
       * @return ApiResponse<TUserProductsVo>
       */
       public ApiResponse<TUserProductsVo> findOne(String id){
             return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<TUserProductsVo>(){}.getType()));
             //TUserProductsEntity tUserProductsEntity = tUserProductsEntityRepo.findOne(id);
             //return ApiResponse.ok(BeanUtils.copyAttrs(new TUserProductsVo(),tUserProductsEntity));
       }

       /**
        * 默认查询所有列表，若要筛选列表，请增加过滤参数
        * @return ApiResponse<List<TUserProductsVo>>
        */
        public ApiResponse<List<TUserProductsVo>> findAll(){
               return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<List<TUserProductsVo>>(){}.getType()));
               //List<TUserProductsEntity> tUserProductsEntities = tUserProductsEntityRepo.findAll();
               //List<TUserProductsVo> tUserProductsVoList = new BeanListUtils<TUserProductsVo, TUserProductsEntity>(TUserProductsVo.class, tUserProductsEntities).getTargetList();
               //return ApiResponse.ok(tUserProductsVoList);
        }

        /**
         * 删除对应主键的数据
         * @return
         */
         public ApiResponse delete(String id){
                //tUserProductsEntityRepo.delete(id);
                return ApiResponse.prompt(Syscode.SC_OK);
         }

}