package com.jihai.mengmian.service;

import com.google.common.reflect.TypeToken;
import com.jihai.mengmian.BeanUtils;
import com.jihai.mengmian.BeanListUtils;
import com.jihai.mengmian.entity.OfgroupEntity;
import com.jihai.mengmian.repo.OfgroupEntityRepo;
import com.jihai.mengmian.vo.OfgroupVo;
import com.jihai.mengmian.dto.OfgroupDto;
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
 * <b>Time：</b> 2017-12-07 16:37:27 <br>
 * <b>Contact：<b>wechat and phone number - 13826126615<br>
 */
@Service
public class OfgroupService {
    @Autowired
    private OfgroupEntityRepo ofgroupEntityRepo;

    /**
     * 新增
     * @param ofgroupDto
     * @return ApiResponse<OfgroupVo>
     */
     public ApiResponse<OfgroupVo> insert(OfgroupDto ofgroupDto){
           return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<OfgroupVo>(){}.getType()));
           //OfgroupEntity ofgroupEntity = BeanUtils.copyAttrs(new OfgroupEntity(), ofgroupDto);
           //ofgroupEntityRepo.save(ofgroupEntity);
           //return ApiResponse.ok(BeanUtils.copyAttrs(new OfgroupVo(),ofgroupEntity));
     }


     /**
      * 修改
      * @param ofgroupDto
      * @return ApiResponse<OfgroupVo>
      */
      public ApiResponse<OfgroupVo> update(OfgroupDto ofgroupDto){
            return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<OfgroupVo>(){}.getType()));
            //OfgroupEntity ofgroupEntity = BeanUtils.copyAttrs(new OfgroupEntity(), ofgroupDto);
            //ofgroupEntityRepo.save(ofgroupEntity);
            //return ApiResponse.ok(BeanUtils.copyAttrs(new OfgroupVo(),ofgroupEntity));
      }

      /**
       * 通过主键获取对象
       * @param id 实体主键
       * @return ApiResponse<OfgroupVo>
       */
       public ApiResponse<OfgroupVo> findOne(String id){
             return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<OfgroupVo>(){}.getType()));
             //OfgroupEntity ofgroupEntity = ofgroupEntityRepo.findOne(id);
             //return ApiResponse.ok(BeanUtils.copyAttrs(new OfgroupVo(),ofgroupEntity));
       }

       /**
        * 默认查询所有列表，若要筛选列表，请增加过滤参数
        * @return ApiResponse<List<OfgroupVo>>
        */
        public ApiResponse<List<OfgroupVo>> findAll(){
               return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<List<OfgroupVo>>(){}.getType()));
               //List<OfgroupEntity> ofgroupEntities = ofgroupEntityRepo.findAll();
               //List<OfgroupVo> ofgroupVoList = new BeanListUtils<OfgroupVo, OfgroupEntity>(OfgroupVo.class, ofgroupEntities).getTargetList();
               //return ApiResponse.ok(ofgroupVoList);
        }

        /**
         * 删除对应主键的数据
         * @return
         */
         public ApiResponse delete(String id){
                //ofgroupEntityRepo.delete(id);
                return ApiResponse.prompt(Syscode.SC_OK);
         }

}