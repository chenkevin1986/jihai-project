package com.jihai.mengmian1.service;

import com.google.common.reflect.TypeToken;
import com.jihai.mengmian.BeanUtils;
import com.jihai.mengmian.BeanListUtils;
import com.jihai.mengmian1.entity.OfgrouppropEntity;
import com.jihai.mengmian1.repo.OfgrouppropEntityRepo;
import com.jihai.mengmian1.vo.OfgrouppropVo;
import com.jihai.mengmian1.dto.OfgrouppropDto;
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
public class OfgrouppropService {
    @Autowired
    private OfgrouppropEntityRepo ofgrouppropEntityRepo;

    /**
     * 新增
     * @param ofgrouppropDto
     * @return ApiResponse<OfgrouppropVo>
     */
     public ApiResponse<OfgrouppropVo> insert(OfgrouppropDto ofgrouppropDto){
           return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<OfgrouppropVo>(){}.getType()));
           //OfgrouppropEntity ofgrouppropEntity = BeanUtils.copyAttrs(new OfgrouppropEntity(), ofgrouppropDto);
           //ofgrouppropEntityRepo.save(ofgrouppropEntity);
           //return ApiResponse.ok(BeanUtils.copyAttrs(new OfgrouppropVo(),ofgrouppropEntity));
     }


     /**
      * 修改
      * @param ofgrouppropDto
      * @return ApiResponse<OfgrouppropVo>
      */
      public ApiResponse<OfgrouppropVo> update(OfgrouppropDto ofgrouppropDto){
            return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<OfgrouppropVo>(){}.getType()));
            //OfgrouppropEntity ofgrouppropEntity = BeanUtils.copyAttrs(new OfgrouppropEntity(), ofgrouppropDto);
            //ofgrouppropEntityRepo.save(ofgrouppropEntity);
            //return ApiResponse.ok(BeanUtils.copyAttrs(new OfgrouppropVo(),ofgrouppropEntity));
      }

      /**
       * 通过主键获取对象
       * @param id 实体主键
       * @return ApiResponse<OfgrouppropVo>
       */
       public ApiResponse<OfgrouppropVo> findOne(String id){
             return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<OfgrouppropVo>(){}.getType()));
             //OfgrouppropEntity ofgrouppropEntity = ofgrouppropEntityRepo.findOne(id);
             //return ApiResponse.ok(BeanUtils.copyAttrs(new OfgrouppropVo(),ofgrouppropEntity));
       }

       /**
        * 默认查询所有列表，若要筛选列表，请增加过滤参数
        * @return ApiResponse<List<OfgrouppropVo>>
        */
        public ApiResponse<List<OfgrouppropVo>> findAll(){
               return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<List<OfgrouppropVo>>(){}.getType()));
               //List<OfgrouppropEntity> ofgrouppropEntities = ofgrouppropEntityRepo.findAll();
               //List<OfgrouppropVo> ofgrouppropVoList = new BeanListUtils<OfgrouppropVo, OfgrouppropEntity>(OfgrouppropVo.class, ofgrouppropEntities).getTargetList();
               //return ApiResponse.ok(ofgrouppropVoList);
        }

        /**
         * 删除对应主键的数据
         * @return
         */
         public ApiResponse delete(String id){
                //ofgrouppropEntityRepo.delete(id);
                return ApiResponse.prompt(Syscode.SC_OK);
         }

}