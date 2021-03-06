package com.jihai.mengmian1.service;

import com.google.common.reflect.TypeToken;
import com.jihai.mengmian.BeanUtils;
import com.jihai.mengmian.BeanListUtils;
import com.jihai.mengmian1.entity.OfprivacylistEntity;
import com.jihai.mengmian1.repo.OfprivacylistEntityRepo;
import com.jihai.mengmian1.vo.OfprivacylistVo;
import com.jihai.mengmian1.dto.OfprivacylistDto;
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
public class OfprivacylistService {
    @Autowired
    private OfprivacylistEntityRepo ofprivacylistEntityRepo;

    /**
     * 新增
     * @param ofprivacylistDto
     * @return ApiResponse<OfprivacylistVo>
     */
     public ApiResponse<OfprivacylistVo> insert(OfprivacylistDto ofprivacylistDto){
           return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<OfprivacylistVo>(){}.getType()));
           //OfprivacylistEntity ofprivacylistEntity = BeanUtils.copyAttrs(new OfprivacylistEntity(), ofprivacylistDto);
           //ofprivacylistEntityRepo.save(ofprivacylistEntity);
           //return ApiResponse.ok(BeanUtils.copyAttrs(new OfprivacylistVo(),ofprivacylistEntity));
     }


     /**
      * 修改
      * @param ofprivacylistDto
      * @return ApiResponse<OfprivacylistVo>
      */
      public ApiResponse<OfprivacylistVo> update(OfprivacylistDto ofprivacylistDto){
            return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<OfprivacylistVo>(){}.getType()));
            //OfprivacylistEntity ofprivacylistEntity = BeanUtils.copyAttrs(new OfprivacylistEntity(), ofprivacylistDto);
            //ofprivacylistEntityRepo.save(ofprivacylistEntity);
            //return ApiResponse.ok(BeanUtils.copyAttrs(new OfprivacylistVo(),ofprivacylistEntity));
      }

      /**
       * 通过主键获取对象
       * @param id 实体主键
       * @return ApiResponse<OfprivacylistVo>
       */
       public ApiResponse<OfprivacylistVo> findOne(String id){
             return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<OfprivacylistVo>(){}.getType()));
             //OfprivacylistEntity ofprivacylistEntity = ofprivacylistEntityRepo.findOne(id);
             //return ApiResponse.ok(BeanUtils.copyAttrs(new OfprivacylistVo(),ofprivacylistEntity));
       }

       /**
        * 默认查询所有列表，若要筛选列表，请增加过滤参数
        * @return ApiResponse<List<OfprivacylistVo>>
        */
        public ApiResponse<List<OfprivacylistVo>> findAll(){
               return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<List<OfprivacylistVo>>(){}.getType()));
               //List<OfprivacylistEntity> ofprivacylistEntities = ofprivacylistEntityRepo.findAll();
               //List<OfprivacylistVo> ofprivacylistVoList = new BeanListUtils<OfprivacylistVo, OfprivacylistEntity>(OfprivacylistVo.class, ofprivacylistEntities).getTargetList();
               //return ApiResponse.ok(ofprivacylistVoList);
        }

        /**
         * 删除对应主键的数据
         * @return
         */
         public ApiResponse delete(String id){
                //ofprivacylistEntityRepo.delete(id);
                return ApiResponse.prompt(Syscode.SC_OK);
         }

}