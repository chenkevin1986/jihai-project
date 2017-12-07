package com.jihai.mengmian.service;

import com.google.common.reflect.TypeToken;
import com.jihai.mengmian.BeanUtils;
import com.jihai.mengmian.BeanListUtils;
import com.jihai.mengmian.entity.OfmucserviceEntity;
import com.jihai.mengmian.repo.OfmucserviceEntityRepo;
import com.jihai.mengmian.vo.OfmucserviceVo;
import com.jihai.mengmian.dto.OfmucserviceDto;
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
public class OfmucserviceService {
    @Autowired
    private OfmucserviceEntityRepo ofmucserviceEntityRepo;

    /**
     * 新增
     * @param ofmucserviceDto
     * @return ApiResponse<OfmucserviceVo>
     */
     public ApiResponse<OfmucserviceVo> insert(OfmucserviceDto ofmucserviceDto){
           return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<OfmucserviceVo>(){}.getType()));
           //OfmucserviceEntity ofmucserviceEntity = BeanUtils.copyAttrs(new OfmucserviceEntity(), ofmucserviceDto);
           //ofmucserviceEntityRepo.save(ofmucserviceEntity);
           //return ApiResponse.ok(BeanUtils.copyAttrs(new OfmucserviceVo(),ofmucserviceEntity));
     }


     /**
      * 修改
      * @param ofmucserviceDto
      * @return ApiResponse<OfmucserviceVo>
      */
      public ApiResponse<OfmucserviceVo> update(OfmucserviceDto ofmucserviceDto){
            return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<OfmucserviceVo>(){}.getType()));
            //OfmucserviceEntity ofmucserviceEntity = BeanUtils.copyAttrs(new OfmucserviceEntity(), ofmucserviceDto);
            //ofmucserviceEntityRepo.save(ofmucserviceEntity);
            //return ApiResponse.ok(BeanUtils.copyAttrs(new OfmucserviceVo(),ofmucserviceEntity));
      }

      /**
       * 通过主键获取对象
       * @param id 实体主键
       * @return ApiResponse<OfmucserviceVo>
       */
       public ApiResponse<OfmucserviceVo> findOne(String id){
             return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<OfmucserviceVo>(){}.getType()));
             //OfmucserviceEntity ofmucserviceEntity = ofmucserviceEntityRepo.findOne(id);
             //return ApiResponse.ok(BeanUtils.copyAttrs(new OfmucserviceVo(),ofmucserviceEntity));
       }

       /**
        * 默认查询所有列表，若要筛选列表，请增加过滤参数
        * @return ApiResponse<List<OfmucserviceVo>>
        */
        public ApiResponse<List<OfmucserviceVo>> findAll(){
               return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<List<OfmucserviceVo>>(){}.getType()));
               //List<OfmucserviceEntity> ofmucserviceEntities = ofmucserviceEntityRepo.findAll();
               //List<OfmucserviceVo> ofmucserviceVoList = new BeanListUtils<OfmucserviceVo, OfmucserviceEntity>(OfmucserviceVo.class, ofmucserviceEntities).getTargetList();
               //return ApiResponse.ok(ofmucserviceVoList);
        }

        /**
         * 删除对应主键的数据
         * @return
         */
         public ApiResponse delete(String id){
                //ofmucserviceEntityRepo.delete(id);
                return ApiResponse.prompt(Syscode.SC_OK);
         }

}