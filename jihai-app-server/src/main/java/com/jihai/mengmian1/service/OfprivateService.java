package com.jihai.mengmian1.service;

import com.google.common.reflect.TypeToken;
import com.jihai.mengmian.BeanUtils;
import com.jihai.mengmian.BeanListUtils;
import com.jihai.mengmian1.entity.OfprivateEntity;
import com.jihai.mengmian1.repo.OfprivateEntityRepo;
import com.jihai.mengmian1.vo.OfprivateVo;
import com.jihai.mengmian1.dto.OfprivateDto;
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
public class OfprivateService {
    @Autowired
    private OfprivateEntityRepo ofprivateEntityRepo;

    /**
     * 新增
     * @param ofprivateDto
     * @return ApiResponse<OfprivateVo>
     */
     public ApiResponse<OfprivateVo> insert(OfprivateDto ofprivateDto){
           return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<OfprivateVo>(){}.getType()));
           //OfprivateEntity ofprivateEntity = BeanUtils.copyAttrs(new OfprivateEntity(), ofprivateDto);
           //ofprivateEntityRepo.save(ofprivateEntity);
           //return ApiResponse.ok(BeanUtils.copyAttrs(new OfprivateVo(),ofprivateEntity));
     }


     /**
      * 修改
      * @param ofprivateDto
      * @return ApiResponse<OfprivateVo>
      */
      public ApiResponse<OfprivateVo> update(OfprivateDto ofprivateDto){
            return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<OfprivateVo>(){}.getType()));
            //OfprivateEntity ofprivateEntity = BeanUtils.copyAttrs(new OfprivateEntity(), ofprivateDto);
            //ofprivateEntityRepo.save(ofprivateEntity);
            //return ApiResponse.ok(BeanUtils.copyAttrs(new OfprivateVo(),ofprivateEntity));
      }

      /**
       * 通过主键获取对象
       * @param id 实体主键
       * @return ApiResponse<OfprivateVo>
       */
       public ApiResponse<OfprivateVo> findOne(String id){
             return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<OfprivateVo>(){}.getType()));
             //OfprivateEntity ofprivateEntity = ofprivateEntityRepo.findOne(id);
             //return ApiResponse.ok(BeanUtils.copyAttrs(new OfprivateVo(),ofprivateEntity));
       }

       /**
        * 默认查询所有列表，若要筛选列表，请增加过滤参数
        * @return ApiResponse<List<OfprivateVo>>
        */
        public ApiResponse<List<OfprivateVo>> findAll(){
               return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<List<OfprivateVo>>(){}.getType()));
               //List<OfprivateEntity> ofprivateEntities = ofprivateEntityRepo.findAll();
               //List<OfprivateVo> ofprivateVoList = new BeanListUtils<OfprivateVo, OfprivateEntity>(OfprivateVo.class, ofprivateEntities).getTargetList();
               //return ApiResponse.ok(ofprivateVoList);
        }

        /**
         * 删除对应主键的数据
         * @return
         */
         public ApiResponse delete(String id){
                //ofprivateEntityRepo.delete(id);
                return ApiResponse.prompt(Syscode.SC_OK);
         }

}