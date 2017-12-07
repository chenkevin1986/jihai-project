package com.jihai.mengmian1.service;

import com.google.common.reflect.TypeToken;
import com.jihai.mengmian.BeanUtils;
import com.jihai.mengmian.BeanListUtils;
import com.jihai.mengmian1.entity.OfversionEntity;
import com.jihai.mengmian1.repo.OfversionEntityRepo;
import com.jihai.mengmian1.vo.OfversionVo;
import com.jihai.mengmian1.dto.OfversionDto;
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
public class OfversionService {
    @Autowired
    private OfversionEntityRepo ofversionEntityRepo;

    /**
     * 新增
     * @param ofversionDto
     * @return ApiResponse<OfversionVo>
     */
     public ApiResponse<OfversionVo> insert(OfversionDto ofversionDto){
           return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<OfversionVo>(){}.getType()));
           //OfversionEntity ofversionEntity = BeanUtils.copyAttrs(new OfversionEntity(), ofversionDto);
           //ofversionEntityRepo.save(ofversionEntity);
           //return ApiResponse.ok(BeanUtils.copyAttrs(new OfversionVo(),ofversionEntity));
     }


     /**
      * 修改
      * @param ofversionDto
      * @return ApiResponse<OfversionVo>
      */
      public ApiResponse<OfversionVo> update(OfversionDto ofversionDto){
            return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<OfversionVo>(){}.getType()));
            //OfversionEntity ofversionEntity = BeanUtils.copyAttrs(new OfversionEntity(), ofversionDto);
            //ofversionEntityRepo.save(ofversionEntity);
            //return ApiResponse.ok(BeanUtils.copyAttrs(new OfversionVo(),ofversionEntity));
      }

      /**
       * 通过主键获取对象
       * @param id 实体主键
       * @return ApiResponse<OfversionVo>
       */
       public ApiResponse<OfversionVo> findOne(String id){
             return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<OfversionVo>(){}.getType()));
             //OfversionEntity ofversionEntity = ofversionEntityRepo.findOne(id);
             //return ApiResponse.ok(BeanUtils.copyAttrs(new OfversionVo(),ofversionEntity));
       }

       /**
        * 默认查询所有列表，若要筛选列表，请增加过滤参数
        * @return ApiResponse<List<OfversionVo>>
        */
        public ApiResponse<List<OfversionVo>> findAll(){
               return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<List<OfversionVo>>(){}.getType()));
               //List<OfversionEntity> ofversionEntities = ofversionEntityRepo.findAll();
               //List<OfversionVo> ofversionVoList = new BeanListUtils<OfversionVo, OfversionEntity>(OfversionVo.class, ofversionEntities).getTargetList();
               //return ApiResponse.ok(ofversionVoList);
        }

        /**
         * 删除对应主键的数据
         * @return
         */
         public ApiResponse delete(String id){
                //ofversionEntityRepo.delete(id);
                return ApiResponse.prompt(Syscode.SC_OK);
         }

}