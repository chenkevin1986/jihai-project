package com.jihai.mengmian1.service;

import com.google.common.reflect.TypeToken;
import com.jihai.mengmian.BeanUtils;
import com.jihai.mengmian.BeanListUtils;
import com.jihai.mengmian1.entity.OfpubsubaffiliationEntity;
import com.jihai.mengmian1.repo.OfpubsubaffiliationEntityRepo;
import com.jihai.mengmian1.vo.OfpubsubaffiliationVo;
import com.jihai.mengmian1.dto.OfpubsubaffiliationDto;
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
public class OfpubsubaffiliationService {
    @Autowired
    private OfpubsubaffiliationEntityRepo ofpubsubaffiliationEntityRepo;

    /**
     * 新增
     * @param ofpubsubaffiliationDto
     * @return ApiResponse<OfpubsubaffiliationVo>
     */
     public ApiResponse<OfpubsubaffiliationVo> insert(OfpubsubaffiliationDto ofpubsubaffiliationDto){
           return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<OfpubsubaffiliationVo>(){}.getType()));
           //OfpubsubaffiliationEntity ofpubsubaffiliationEntity = BeanUtils.copyAttrs(new OfpubsubaffiliationEntity(), ofpubsubaffiliationDto);
           //ofpubsubaffiliationEntityRepo.save(ofpubsubaffiliationEntity);
           //return ApiResponse.ok(BeanUtils.copyAttrs(new OfpubsubaffiliationVo(),ofpubsubaffiliationEntity));
     }


     /**
      * 修改
      * @param ofpubsubaffiliationDto
      * @return ApiResponse<OfpubsubaffiliationVo>
      */
      public ApiResponse<OfpubsubaffiliationVo> update(OfpubsubaffiliationDto ofpubsubaffiliationDto){
            return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<OfpubsubaffiliationVo>(){}.getType()));
            //OfpubsubaffiliationEntity ofpubsubaffiliationEntity = BeanUtils.copyAttrs(new OfpubsubaffiliationEntity(), ofpubsubaffiliationDto);
            //ofpubsubaffiliationEntityRepo.save(ofpubsubaffiliationEntity);
            //return ApiResponse.ok(BeanUtils.copyAttrs(new OfpubsubaffiliationVo(),ofpubsubaffiliationEntity));
      }

      /**
       * 通过主键获取对象
       * @param id 实体主键
       * @return ApiResponse<OfpubsubaffiliationVo>
       */
       public ApiResponse<OfpubsubaffiliationVo> findOne(String id){
             return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<OfpubsubaffiliationVo>(){}.getType()));
             //OfpubsubaffiliationEntity ofpubsubaffiliationEntity = ofpubsubaffiliationEntityRepo.findOne(id);
             //return ApiResponse.ok(BeanUtils.copyAttrs(new OfpubsubaffiliationVo(),ofpubsubaffiliationEntity));
       }

       /**
        * 默认查询所有列表，若要筛选列表，请增加过滤参数
        * @return ApiResponse<List<OfpubsubaffiliationVo>>
        */
        public ApiResponse<List<OfpubsubaffiliationVo>> findAll(){
               return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<List<OfpubsubaffiliationVo>>(){}.getType()));
               //List<OfpubsubaffiliationEntity> ofpubsubaffiliationEntities = ofpubsubaffiliationEntityRepo.findAll();
               //List<OfpubsubaffiliationVo> ofpubsubaffiliationVoList = new BeanListUtils<OfpubsubaffiliationVo, OfpubsubaffiliationEntity>(OfpubsubaffiliationVo.class, ofpubsubaffiliationEntities).getTargetList();
               //return ApiResponse.ok(ofpubsubaffiliationVoList);
        }

        /**
         * 删除对应主键的数据
         * @return
         */
         public ApiResponse delete(String id){
                //ofpubsubaffiliationEntityRepo.delete(id);
                return ApiResponse.prompt(Syscode.SC_OK);
         }

}