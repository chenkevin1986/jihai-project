package com.jihai.mengmian1.service;

import com.google.common.reflect.TypeToken;
import com.jihai.mengmian.BeanUtils;
import com.jihai.mengmian.BeanListUtils;
import com.jihai.mengmian1.entity.OfpubsubsubscriptionEntity;
import com.jihai.mengmian1.repo.OfpubsubsubscriptionEntityRepo;
import com.jihai.mengmian1.vo.OfpubsubsubscriptionVo;
import com.jihai.mengmian1.dto.OfpubsubsubscriptionDto;
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
public class OfpubsubsubscriptionService {
    @Autowired
    private OfpubsubsubscriptionEntityRepo ofpubsubsubscriptionEntityRepo;

    /**
     * 新增
     * @param ofpubsubsubscriptionDto
     * @return ApiResponse<OfpubsubsubscriptionVo>
     */
     public ApiResponse<OfpubsubsubscriptionVo> insert(OfpubsubsubscriptionDto ofpubsubsubscriptionDto){
           return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<OfpubsubsubscriptionVo>(){}.getType()));
           //OfpubsubsubscriptionEntity ofpubsubsubscriptionEntity = BeanUtils.copyAttrs(new OfpubsubsubscriptionEntity(), ofpubsubsubscriptionDto);
           //ofpubsubsubscriptionEntityRepo.save(ofpubsubsubscriptionEntity);
           //return ApiResponse.ok(BeanUtils.copyAttrs(new OfpubsubsubscriptionVo(),ofpubsubsubscriptionEntity));
     }


     /**
      * 修改
      * @param ofpubsubsubscriptionDto
      * @return ApiResponse<OfpubsubsubscriptionVo>
      */
      public ApiResponse<OfpubsubsubscriptionVo> update(OfpubsubsubscriptionDto ofpubsubsubscriptionDto){
            return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<OfpubsubsubscriptionVo>(){}.getType()));
            //OfpubsubsubscriptionEntity ofpubsubsubscriptionEntity = BeanUtils.copyAttrs(new OfpubsubsubscriptionEntity(), ofpubsubsubscriptionDto);
            //ofpubsubsubscriptionEntityRepo.save(ofpubsubsubscriptionEntity);
            //return ApiResponse.ok(BeanUtils.copyAttrs(new OfpubsubsubscriptionVo(),ofpubsubsubscriptionEntity));
      }

      /**
       * 通过主键获取对象
       * @param id 实体主键
       * @return ApiResponse<OfpubsubsubscriptionVo>
       */
       public ApiResponse<OfpubsubsubscriptionVo> findOne(String id){
             return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<OfpubsubsubscriptionVo>(){}.getType()));
             //OfpubsubsubscriptionEntity ofpubsubsubscriptionEntity = ofpubsubsubscriptionEntityRepo.findOne(id);
             //return ApiResponse.ok(BeanUtils.copyAttrs(new OfpubsubsubscriptionVo(),ofpubsubsubscriptionEntity));
       }

       /**
        * 默认查询所有列表，若要筛选列表，请增加过滤参数
        * @return ApiResponse<List<OfpubsubsubscriptionVo>>
        */
        public ApiResponse<List<OfpubsubsubscriptionVo>> findAll(){
               return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<List<OfpubsubsubscriptionVo>>(){}.getType()));
               //List<OfpubsubsubscriptionEntity> ofpubsubsubscriptionEntities = ofpubsubsubscriptionEntityRepo.findAll();
               //List<OfpubsubsubscriptionVo> ofpubsubsubscriptionVoList = new BeanListUtils<OfpubsubsubscriptionVo, OfpubsubsubscriptionEntity>(OfpubsubsubscriptionVo.class, ofpubsubsubscriptionEntities).getTargetList();
               //return ApiResponse.ok(ofpubsubsubscriptionVoList);
        }

        /**
         * 删除对应主键的数据
         * @return
         */
         public ApiResponse delete(String id){
                //ofpubsubsubscriptionEntityRepo.delete(id);
                return ApiResponse.prompt(Syscode.SC_OK);
         }

}