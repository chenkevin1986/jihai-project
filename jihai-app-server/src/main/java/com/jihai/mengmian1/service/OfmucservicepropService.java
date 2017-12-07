package com.jihai.mengmian1.service;

import com.google.common.reflect.TypeToken;
import com.jihai.mengmian.BeanUtils;
import com.jihai.mengmian.BeanListUtils;
import com.jihai.mengmian1.entity.OfmucservicepropEntity;
import com.jihai.mengmian1.repo.OfmucservicepropEntityRepo;
import com.jihai.mengmian1.vo.OfmucservicepropVo;
import com.jihai.mengmian1.dto.OfmucservicepropDto;
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
 * <b>Time：</b> 2017-12-07 16:39:06 <br>
 * <b>Contact：<b>wechat and phone number - 13826126615<br>
 */
@Service
public class OfmucservicepropService {
    @Autowired
    private OfmucservicepropEntityRepo ofmucservicepropEntityRepo;

    /**
     * 新增
     * @param ofmucservicepropDto
     * @return ApiResponse<OfmucservicepropVo>
     */
     public ApiResponse<OfmucservicepropVo> insert(OfmucservicepropDto ofmucservicepropDto){
           return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<OfmucservicepropVo>(){}.getType()));
           //OfmucservicepropEntity ofmucservicepropEntity = BeanUtils.copyAttrs(new OfmucservicepropEntity(), ofmucservicepropDto);
           //ofmucservicepropEntityRepo.save(ofmucservicepropEntity);
           //return ApiResponse.ok(BeanUtils.copyAttrs(new OfmucservicepropVo(),ofmucservicepropEntity));
     }


     /**
      * 修改
      * @param ofmucservicepropDto
      * @return ApiResponse<OfmucservicepropVo>
      */
      public ApiResponse<OfmucservicepropVo> update(OfmucservicepropDto ofmucservicepropDto){
            return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<OfmucservicepropVo>(){}.getType()));
            //OfmucservicepropEntity ofmucservicepropEntity = BeanUtils.copyAttrs(new OfmucservicepropEntity(), ofmucservicepropDto);
            //ofmucservicepropEntityRepo.save(ofmucservicepropEntity);
            //return ApiResponse.ok(BeanUtils.copyAttrs(new OfmucservicepropVo(),ofmucservicepropEntity));
      }

      /**
       * 通过主键获取对象
       * @param id 实体主键
       * @return ApiResponse<OfmucservicepropVo>
       */
       public ApiResponse<OfmucservicepropVo> findOne(String id){
             return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<OfmucservicepropVo>(){}.getType()));
             //OfmucservicepropEntity ofmucservicepropEntity = ofmucservicepropEntityRepo.findOne(id);
             //return ApiResponse.ok(BeanUtils.copyAttrs(new OfmucservicepropVo(),ofmucservicepropEntity));
       }

       /**
        * 默认查询所有列表，若要筛选列表，请增加过滤参数
        * @return ApiResponse<List<OfmucservicepropVo>>
        */
        public ApiResponse<List<OfmucservicepropVo>> findAll(){
               return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<List<OfmucservicepropVo>>(){}.getType()));
               //List<OfmucservicepropEntity> ofmucservicepropEntities = ofmucservicepropEntityRepo.findAll();
               //List<OfmucservicepropVo> ofmucservicepropVoList = new BeanListUtils<OfmucservicepropVo, OfmucservicepropEntity>(OfmucservicepropVo.class, ofmucservicepropEntities).getTargetList();
               //return ApiResponse.ok(ofmucservicepropVoList);
        }

        /**
         * 删除对应主键的数据
         * @return
         */
         public ApiResponse delete(String id){
                //ofmucservicepropEntityRepo.delete(id);
                return ApiResponse.prompt(Syscode.SC_OK);
         }

}