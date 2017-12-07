package com.jihai.mengmian1.service;

import com.google.common.reflect.TypeToken;
import com.jihai.mengmian.BeanUtils;
import com.jihai.mengmian.BeanListUtils;
import com.jihai.mengmian1.entity.OfpubsubitemEntity;
import com.jihai.mengmian1.repo.OfpubsubitemEntityRepo;
import com.jihai.mengmian1.vo.OfpubsubitemVo;
import com.jihai.mengmian1.dto.OfpubsubitemDto;
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
public class OfpubsubitemService {
    @Autowired
    private OfpubsubitemEntityRepo ofpubsubitemEntityRepo;

    /**
     * 新增
     * @param ofpubsubitemDto
     * @return ApiResponse<OfpubsubitemVo>
     */
     public ApiResponse<OfpubsubitemVo> insert(OfpubsubitemDto ofpubsubitemDto){
           return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<OfpubsubitemVo>(){}.getType()));
           //OfpubsubitemEntity ofpubsubitemEntity = BeanUtils.copyAttrs(new OfpubsubitemEntity(), ofpubsubitemDto);
           //ofpubsubitemEntityRepo.save(ofpubsubitemEntity);
           //return ApiResponse.ok(BeanUtils.copyAttrs(new OfpubsubitemVo(),ofpubsubitemEntity));
     }


     /**
      * 修改
      * @param ofpubsubitemDto
      * @return ApiResponse<OfpubsubitemVo>
      */
      public ApiResponse<OfpubsubitemVo> update(OfpubsubitemDto ofpubsubitemDto){
            return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<OfpubsubitemVo>(){}.getType()));
            //OfpubsubitemEntity ofpubsubitemEntity = BeanUtils.copyAttrs(new OfpubsubitemEntity(), ofpubsubitemDto);
            //ofpubsubitemEntityRepo.save(ofpubsubitemEntity);
            //return ApiResponse.ok(BeanUtils.copyAttrs(new OfpubsubitemVo(),ofpubsubitemEntity));
      }

      /**
       * 通过主键获取对象
       * @param id 实体主键
       * @return ApiResponse<OfpubsubitemVo>
       */
       public ApiResponse<OfpubsubitemVo> findOne(String id){
             return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<OfpubsubitemVo>(){}.getType()));
             //OfpubsubitemEntity ofpubsubitemEntity = ofpubsubitemEntityRepo.findOne(id);
             //return ApiResponse.ok(BeanUtils.copyAttrs(new OfpubsubitemVo(),ofpubsubitemEntity));
       }

       /**
        * 默认查询所有列表，若要筛选列表，请增加过滤参数
        * @return ApiResponse<List<OfpubsubitemVo>>
        */
        public ApiResponse<List<OfpubsubitemVo>> findAll(){
               return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<List<OfpubsubitemVo>>(){}.getType()));
               //List<OfpubsubitemEntity> ofpubsubitemEntities = ofpubsubitemEntityRepo.findAll();
               //List<OfpubsubitemVo> ofpubsubitemVoList = new BeanListUtils<OfpubsubitemVo, OfpubsubitemEntity>(OfpubsubitemVo.class, ofpubsubitemEntities).getTargetList();
               //return ApiResponse.ok(ofpubsubitemVoList);
        }

        /**
         * 删除对应主键的数据
         * @return
         */
         public ApiResponse delete(String id){
                //ofpubsubitemEntityRepo.delete(id);
                return ApiResponse.prompt(Syscode.SC_OK);
         }

}