package com.jihai.mengmian1.service;

import com.google.common.reflect.TypeToken;
import com.jihai.mengmian.BeanUtils;
import com.jihai.mengmian.BeanListUtils;
import com.jihai.mengmian1.entity.OfmucroompropEntity;
import com.jihai.mengmian1.repo.OfmucroompropEntityRepo;
import com.jihai.mengmian1.vo.OfmucroompropVo;
import com.jihai.mengmian1.dto.OfmucroompropDto;
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
public class OfmucroompropService {
    @Autowired
    private OfmucroompropEntityRepo ofmucroompropEntityRepo;

    /**
     * 新增
     * @param ofmucroompropDto
     * @return ApiResponse<OfmucroompropVo>
     */
     public ApiResponse<OfmucroompropVo> insert(OfmucroompropDto ofmucroompropDto){
           return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<OfmucroompropVo>(){}.getType()));
           //OfmucroompropEntity ofmucroompropEntity = BeanUtils.copyAttrs(new OfmucroompropEntity(), ofmucroompropDto);
           //ofmucroompropEntityRepo.save(ofmucroompropEntity);
           //return ApiResponse.ok(BeanUtils.copyAttrs(new OfmucroompropVo(),ofmucroompropEntity));
     }


     /**
      * 修改
      * @param ofmucroompropDto
      * @return ApiResponse<OfmucroompropVo>
      */
      public ApiResponse<OfmucroompropVo> update(OfmucroompropDto ofmucroompropDto){
            return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<OfmucroompropVo>(){}.getType()));
            //OfmucroompropEntity ofmucroompropEntity = BeanUtils.copyAttrs(new OfmucroompropEntity(), ofmucroompropDto);
            //ofmucroompropEntityRepo.save(ofmucroompropEntity);
            //return ApiResponse.ok(BeanUtils.copyAttrs(new OfmucroompropVo(),ofmucroompropEntity));
      }

      /**
       * 通过主键获取对象
       * @param id 实体主键
       * @return ApiResponse<OfmucroompropVo>
       */
       public ApiResponse<OfmucroompropVo> findOne(String id){
             return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<OfmucroompropVo>(){}.getType()));
             //OfmucroompropEntity ofmucroompropEntity = ofmucroompropEntityRepo.findOne(id);
             //return ApiResponse.ok(BeanUtils.copyAttrs(new OfmucroompropVo(),ofmucroompropEntity));
       }

       /**
        * 默认查询所有列表，若要筛选列表，请增加过滤参数
        * @return ApiResponse<List<OfmucroompropVo>>
        */
        public ApiResponse<List<OfmucroompropVo>> findAll(){
               return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<List<OfmucroompropVo>>(){}.getType()));
               //List<OfmucroompropEntity> ofmucroompropEntities = ofmucroompropEntityRepo.findAll();
               //List<OfmucroompropVo> ofmucroompropVoList = new BeanListUtils<OfmucroompropVo, OfmucroompropEntity>(OfmucroompropVo.class, ofmucroompropEntities).getTargetList();
               //return ApiResponse.ok(ofmucroompropVoList);
        }

        /**
         * 删除对应主键的数据
         * @return
         */
         public ApiResponse delete(String id){
                //ofmucroompropEntityRepo.delete(id);
                return ApiResponse.prompt(Syscode.SC_OK);
         }

}