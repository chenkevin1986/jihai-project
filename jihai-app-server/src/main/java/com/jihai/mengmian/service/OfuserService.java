package com.jihai.mengmian.service;

import com.google.common.reflect.TypeToken;
import com.jihai.mengmian.BeanUtils;
import com.jihai.mengmian.BeanListUtils;
import com.jihai.mengmian.entity.OfuserEntity;
import com.jihai.mengmian.repo.OfuserEntityRepo;
import com.jihai.mengmian.vo.OfuserVo;
import com.jihai.mengmian.dto.OfuserDto;
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
public class OfuserService {
    @Autowired
    private OfuserEntityRepo ofuserEntityRepo;

    /**
     * 新增
     * @param ofuserDto
     * @return ApiResponse<OfuserVo>
     */
     public ApiResponse<OfuserVo> insert(OfuserDto ofuserDto){
           return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<OfuserVo>(){}.getType()));
           //OfuserEntity ofuserEntity = BeanUtils.copyAttrs(new OfuserEntity(), ofuserDto);
           //ofuserEntityRepo.save(ofuserEntity);
           //return ApiResponse.ok(BeanUtils.copyAttrs(new OfuserVo(),ofuserEntity));
     }


     /**
      * 修改
      * @param ofuserDto
      * @return ApiResponse<OfuserVo>
      */
      public ApiResponse<OfuserVo> update(OfuserDto ofuserDto){
            return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<OfuserVo>(){}.getType()));
            //OfuserEntity ofuserEntity = BeanUtils.copyAttrs(new OfuserEntity(), ofuserDto);
            //ofuserEntityRepo.save(ofuserEntity);
            //return ApiResponse.ok(BeanUtils.copyAttrs(new OfuserVo(),ofuserEntity));
      }

      /**
       * 通过主键获取对象
       * @param id 实体主键
       * @return ApiResponse<OfuserVo>
       */
       public ApiResponse<OfuserVo> findOne(String id){
             return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<OfuserVo>(){}.getType()));
             //OfuserEntity ofuserEntity = ofuserEntityRepo.findOne(id);
             //return ApiResponse.ok(BeanUtils.copyAttrs(new OfuserVo(),ofuserEntity));
       }

       /**
        * 默认查询所有列表，若要筛选列表，请增加过滤参数
        * @return ApiResponse<List<OfuserVo>>
        */
        public ApiResponse<List<OfuserVo>> findAll(){
               return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<List<OfuserVo>>(){}.getType()));
               //List<OfuserEntity> ofuserEntities = ofuserEntityRepo.findAll();
               //List<OfuserVo> ofuserVoList = new BeanListUtils<OfuserVo, OfuserEntity>(OfuserVo.class, ofuserEntities).getTargetList();
               //return ApiResponse.ok(ofuserVoList);
        }

        /**
         * 删除对应主键的数据
         * @return
         */
         public ApiResponse delete(String id){
                //ofuserEntityRepo.delete(id);
                return ApiResponse.prompt(Syscode.SC_OK);
         }

}