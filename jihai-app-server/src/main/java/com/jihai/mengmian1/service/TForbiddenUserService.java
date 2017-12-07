package com.jihai.mengmian1.service;

import com.google.common.reflect.TypeToken;
import com.jihai.mengmian.BeanUtils;
import com.jihai.mengmian.BeanListUtils;
import com.jihai.mengmian1.entity.TForbiddenUserEntity;
import com.jihai.mengmian1.repo.TForbiddenUserEntityRepo;
import com.jihai.mengmian1.vo.TForbiddenUserVo;
import com.jihai.mengmian1.dto.TForbiddenUserDto;
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
public class TForbiddenUserService {
    @Autowired
    private TForbiddenUserEntityRepo tForbiddenUserEntityRepo;

    /**
     * 新增
     * @param tForbiddenUserDto
     * @return ApiResponse<TForbiddenUserVo>
     */
     public ApiResponse<TForbiddenUserVo> insert(TForbiddenUserDto tForbiddenUserDto){
           return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<TForbiddenUserVo>(){}.getType()));
           //TForbiddenUserEntity tForbiddenUserEntity = BeanUtils.copyAttrs(new TForbiddenUserEntity(), tForbiddenUserDto);
           //tForbiddenUserEntityRepo.save(tForbiddenUserEntity);
           //return ApiResponse.ok(BeanUtils.copyAttrs(new TForbiddenUserVo(),tForbiddenUserEntity));
     }


     /**
      * 修改
      * @param tForbiddenUserDto
      * @return ApiResponse<TForbiddenUserVo>
      */
      public ApiResponse<TForbiddenUserVo> update(TForbiddenUserDto tForbiddenUserDto){
            return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<TForbiddenUserVo>(){}.getType()));
            //TForbiddenUserEntity tForbiddenUserEntity = BeanUtils.copyAttrs(new TForbiddenUserEntity(), tForbiddenUserDto);
            //tForbiddenUserEntityRepo.save(tForbiddenUserEntity);
            //return ApiResponse.ok(BeanUtils.copyAttrs(new TForbiddenUserVo(),tForbiddenUserEntity));
      }

      /**
       * 通过主键获取对象
       * @param id 实体主键
       * @return ApiResponse<TForbiddenUserVo>
       */
       public ApiResponse<TForbiddenUserVo> findOne(String id){
             return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<TForbiddenUserVo>(){}.getType()));
             //TForbiddenUserEntity tForbiddenUserEntity = tForbiddenUserEntityRepo.findOne(id);
             //return ApiResponse.ok(BeanUtils.copyAttrs(new TForbiddenUserVo(),tForbiddenUserEntity));
       }

       /**
        * 默认查询所有列表，若要筛选列表，请增加过滤参数
        * @return ApiResponse<List<TForbiddenUserVo>>
        */
        public ApiResponse<List<TForbiddenUserVo>> findAll(){
               return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<List<TForbiddenUserVo>>(){}.getType()));
               //List<TForbiddenUserEntity> tForbiddenUserEntities = tForbiddenUserEntityRepo.findAll();
               //List<TForbiddenUserVo> tForbiddenUserVoList = new BeanListUtils<TForbiddenUserVo, TForbiddenUserEntity>(TForbiddenUserVo.class, tForbiddenUserEntities).getTargetList();
               //return ApiResponse.ok(tForbiddenUserVoList);
        }

        /**
         * 删除对应主键的数据
         * @return
         */
         public ApiResponse delete(String id){
                //tForbiddenUserEntityRepo.delete(id);
                return ApiResponse.prompt(Syscode.SC_OK);
         }

}