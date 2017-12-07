package com.jihai.mengmian1.service;

import com.google.common.reflect.TypeToken;
import com.jihai.mengmian.BeanUtils;
import com.jihai.mengmian.BeanListUtils;
import com.jihai.mengmian1.entity.OfmucaffiliationEntity;
import com.jihai.mengmian1.repo.OfmucaffiliationEntityRepo;
import com.jihai.mengmian1.vo.OfmucaffiliationVo;
import com.jihai.mengmian1.dto.OfmucaffiliationDto;
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
public class OfmucaffiliationService {
    @Autowired
    private OfmucaffiliationEntityRepo ofmucaffiliationEntityRepo;

    /**
     * 新增
     * @param ofmucaffiliationDto
     * @return ApiResponse<OfmucaffiliationVo>
     */
     public ApiResponse<OfmucaffiliationVo> insert(OfmucaffiliationDto ofmucaffiliationDto){
           return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<OfmucaffiliationVo>(){}.getType()));
           //OfmucaffiliationEntity ofmucaffiliationEntity = BeanUtils.copyAttrs(new OfmucaffiliationEntity(), ofmucaffiliationDto);
           //ofmucaffiliationEntityRepo.save(ofmucaffiliationEntity);
           //return ApiResponse.ok(BeanUtils.copyAttrs(new OfmucaffiliationVo(),ofmucaffiliationEntity));
     }


     /**
      * 修改
      * @param ofmucaffiliationDto
      * @return ApiResponse<OfmucaffiliationVo>
      */
      public ApiResponse<OfmucaffiliationVo> update(OfmucaffiliationDto ofmucaffiliationDto){
            return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<OfmucaffiliationVo>(){}.getType()));
            //OfmucaffiliationEntity ofmucaffiliationEntity = BeanUtils.copyAttrs(new OfmucaffiliationEntity(), ofmucaffiliationDto);
            //ofmucaffiliationEntityRepo.save(ofmucaffiliationEntity);
            //return ApiResponse.ok(BeanUtils.copyAttrs(new OfmucaffiliationVo(),ofmucaffiliationEntity));
      }

      /**
       * 通过主键获取对象
       * @param id 实体主键
       * @return ApiResponse<OfmucaffiliationVo>
       */
       public ApiResponse<OfmucaffiliationVo> findOne(String id){
             return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<OfmucaffiliationVo>(){}.getType()));
             //OfmucaffiliationEntity ofmucaffiliationEntity = ofmucaffiliationEntityRepo.findOne(id);
             //return ApiResponse.ok(BeanUtils.copyAttrs(new OfmucaffiliationVo(),ofmucaffiliationEntity));
       }

       /**
        * 默认查询所有列表，若要筛选列表，请增加过滤参数
        * @return ApiResponse<List<OfmucaffiliationVo>>
        */
        public ApiResponse<List<OfmucaffiliationVo>> findAll(){
               return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<List<OfmucaffiliationVo>>(){}.getType()));
               //List<OfmucaffiliationEntity> ofmucaffiliationEntities = ofmucaffiliationEntityRepo.findAll();
               //List<OfmucaffiliationVo> ofmucaffiliationVoList = new BeanListUtils<OfmucaffiliationVo, OfmucaffiliationEntity>(OfmucaffiliationVo.class, ofmucaffiliationEntities).getTargetList();
               //return ApiResponse.ok(ofmucaffiliationVoList);
        }

        /**
         * 删除对应主键的数据
         * @return
         */
         public ApiResponse delete(String id){
                //ofmucaffiliationEntityRepo.delete(id);
                return ApiResponse.prompt(Syscode.SC_OK);
         }

}