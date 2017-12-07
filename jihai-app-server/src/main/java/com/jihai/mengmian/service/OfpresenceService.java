package com.jihai.mengmian.service;

import com.google.common.reflect.TypeToken;
import com.jihai.mengmian.BeanUtils;
import com.jihai.mengmian.BeanListUtils;
import com.jihai.mengmian.entity.OfpresenceEntity;
import com.jihai.mengmian.repo.OfpresenceEntityRepo;
import com.jihai.mengmian.vo.OfpresenceVo;
import com.jihai.mengmian.dto.OfpresenceDto;
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
public class OfpresenceService {
    @Autowired
    private OfpresenceEntityRepo ofpresenceEntityRepo;

    /**
     * 新增
     * @param ofpresenceDto
     * @return ApiResponse<OfpresenceVo>
     */
     public ApiResponse<OfpresenceVo> insert(OfpresenceDto ofpresenceDto){
           return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<OfpresenceVo>(){}.getType()));
           //OfpresenceEntity ofpresenceEntity = BeanUtils.copyAttrs(new OfpresenceEntity(), ofpresenceDto);
           //ofpresenceEntityRepo.save(ofpresenceEntity);
           //return ApiResponse.ok(BeanUtils.copyAttrs(new OfpresenceVo(),ofpresenceEntity));
     }


     /**
      * 修改
      * @param ofpresenceDto
      * @return ApiResponse<OfpresenceVo>
      */
      public ApiResponse<OfpresenceVo> update(OfpresenceDto ofpresenceDto){
            return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<OfpresenceVo>(){}.getType()));
            //OfpresenceEntity ofpresenceEntity = BeanUtils.copyAttrs(new OfpresenceEntity(), ofpresenceDto);
            //ofpresenceEntityRepo.save(ofpresenceEntity);
            //return ApiResponse.ok(BeanUtils.copyAttrs(new OfpresenceVo(),ofpresenceEntity));
      }

      /**
       * 通过主键获取对象
       * @param id 实体主键
       * @return ApiResponse<OfpresenceVo>
       */
       public ApiResponse<OfpresenceVo> findOne(String id){
             return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<OfpresenceVo>(){}.getType()));
             //OfpresenceEntity ofpresenceEntity = ofpresenceEntityRepo.findOne(id);
             //return ApiResponse.ok(BeanUtils.copyAttrs(new OfpresenceVo(),ofpresenceEntity));
       }

       /**
        * 默认查询所有列表，若要筛选列表，请增加过滤参数
        * @return ApiResponse<List<OfpresenceVo>>
        */
        public ApiResponse<List<OfpresenceVo>> findAll(){
               return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<List<OfpresenceVo>>(){}.getType()));
               //List<OfpresenceEntity> ofpresenceEntities = ofpresenceEntityRepo.findAll();
               //List<OfpresenceVo> ofpresenceVoList = new BeanListUtils<OfpresenceVo, OfpresenceEntity>(OfpresenceVo.class, ofpresenceEntities).getTargetList();
               //return ApiResponse.ok(ofpresenceVoList);
        }

        /**
         * 删除对应主键的数据
         * @return
         */
         public ApiResponse delete(String id){
                //ofpresenceEntityRepo.delete(id);
                return ApiResponse.prompt(Syscode.SC_OK);
         }

}