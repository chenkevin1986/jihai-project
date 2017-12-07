package com.jihai.mengmian.service;

import com.google.common.reflect.TypeToken;
import com.jihai.mengmian.BeanUtils;
import com.jihai.mengmian.BeanListUtils;
import com.jihai.mengmian.entity.OfgroupuserEntity;
import com.jihai.mengmian.repo.OfgroupuserEntityRepo;
import com.jihai.mengmian.vo.OfgroupuserVo;
import com.jihai.mengmian.dto.OfgroupuserDto;
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
public class OfgroupuserService {
    @Autowired
    private OfgroupuserEntityRepo ofgroupuserEntityRepo;

    /**
     * 新增
     * @param ofgroupuserDto
     * @return ApiResponse<OfgroupuserVo>
     */
     public ApiResponse<OfgroupuserVo> insert(OfgroupuserDto ofgroupuserDto){
           return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<OfgroupuserVo>(){}.getType()));
           //OfgroupuserEntity ofgroupuserEntity = BeanUtils.copyAttrs(new OfgroupuserEntity(), ofgroupuserDto);
           //ofgroupuserEntityRepo.save(ofgroupuserEntity);
           //return ApiResponse.ok(BeanUtils.copyAttrs(new OfgroupuserVo(),ofgroupuserEntity));
     }


     /**
      * 修改
      * @param ofgroupuserDto
      * @return ApiResponse<OfgroupuserVo>
      */
      public ApiResponse<OfgroupuserVo> update(OfgroupuserDto ofgroupuserDto){
            return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<OfgroupuserVo>(){}.getType()));
            //OfgroupuserEntity ofgroupuserEntity = BeanUtils.copyAttrs(new OfgroupuserEntity(), ofgroupuserDto);
            //ofgroupuserEntityRepo.save(ofgroupuserEntity);
            //return ApiResponse.ok(BeanUtils.copyAttrs(new OfgroupuserVo(),ofgroupuserEntity));
      }

      /**
       * 通过主键获取对象
       * @param id 实体主键
       * @return ApiResponse<OfgroupuserVo>
       */
       public ApiResponse<OfgroupuserVo> findOne(String id){
             return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<OfgroupuserVo>(){}.getType()));
             //OfgroupuserEntity ofgroupuserEntity = ofgroupuserEntityRepo.findOne(id);
             //return ApiResponse.ok(BeanUtils.copyAttrs(new OfgroupuserVo(),ofgroupuserEntity));
       }

       /**
        * 默认查询所有列表，若要筛选列表，请增加过滤参数
        * @return ApiResponse<List<OfgroupuserVo>>
        */
        public ApiResponse<List<OfgroupuserVo>> findAll(){
               return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<List<OfgroupuserVo>>(){}.getType()));
               //List<OfgroupuserEntity> ofgroupuserEntities = ofgroupuserEntityRepo.findAll();
               //List<OfgroupuserVo> ofgroupuserVoList = new BeanListUtils<OfgroupuserVo, OfgroupuserEntity>(OfgroupuserVo.class, ofgroupuserEntities).getTargetList();
               //return ApiResponse.ok(ofgroupuserVoList);
        }

        /**
         * 删除对应主键的数据
         * @return
         */
         public ApiResponse delete(String id){
                //ofgroupuserEntityRepo.delete(id);
                return ApiResponse.prompt(Syscode.SC_OK);
         }

}