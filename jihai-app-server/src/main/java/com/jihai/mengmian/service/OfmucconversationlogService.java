package com.jihai.mengmian.service;

import com.google.common.reflect.TypeToken;
import com.jihai.mengmian.BeanUtils;
import com.jihai.mengmian.BeanListUtils;
import com.jihai.mengmian.entity.OfmucconversationlogEntity;
import com.jihai.mengmian.repo.OfmucconversationlogEntityRepo;
import com.jihai.mengmian.vo.OfmucconversationlogVo;
import com.jihai.mengmian.dto.OfmucconversationlogDto;
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
public class OfmucconversationlogService {
    @Autowired
    private OfmucconversationlogEntityRepo ofmucconversationlogEntityRepo;

    /**
     * 新增
     * @param ofmucconversationlogDto
     * @return ApiResponse<OfmucconversationlogVo>
     */
     public ApiResponse<OfmucconversationlogVo> insert(OfmucconversationlogDto ofmucconversationlogDto){
           return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<OfmucconversationlogVo>(){}.getType()));
           //OfmucconversationlogEntity ofmucconversationlogEntity = BeanUtils.copyAttrs(new OfmucconversationlogEntity(), ofmucconversationlogDto);
           //ofmucconversationlogEntityRepo.save(ofmucconversationlogEntity);
           //return ApiResponse.ok(BeanUtils.copyAttrs(new OfmucconversationlogVo(),ofmucconversationlogEntity));
     }


     /**
      * 修改
      * @param ofmucconversationlogDto
      * @return ApiResponse<OfmucconversationlogVo>
      */
      public ApiResponse<OfmucconversationlogVo> update(OfmucconversationlogDto ofmucconversationlogDto){
            return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<OfmucconversationlogVo>(){}.getType()));
            //OfmucconversationlogEntity ofmucconversationlogEntity = BeanUtils.copyAttrs(new OfmucconversationlogEntity(), ofmucconversationlogDto);
            //ofmucconversationlogEntityRepo.save(ofmucconversationlogEntity);
            //return ApiResponse.ok(BeanUtils.copyAttrs(new OfmucconversationlogVo(),ofmucconversationlogEntity));
      }

      /**
       * 通过主键获取对象
       * @param id 实体主键
       * @return ApiResponse<OfmucconversationlogVo>
       */
       public ApiResponse<OfmucconversationlogVo> findOne(String id){
             return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<OfmucconversationlogVo>(){}.getType()));
             //OfmucconversationlogEntity ofmucconversationlogEntity = ofmucconversationlogEntityRepo.findOne(id);
             //return ApiResponse.ok(BeanUtils.copyAttrs(new OfmucconversationlogVo(),ofmucconversationlogEntity));
       }

       /**
        * 默认查询所有列表，若要筛选列表，请增加过滤参数
        * @return ApiResponse<List<OfmucconversationlogVo>>
        */
        public ApiResponse<List<OfmucconversationlogVo>> findAll(){
               return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<List<OfmucconversationlogVo>>(){}.getType()));
               //List<OfmucconversationlogEntity> ofmucconversationlogEntities = ofmucconversationlogEntityRepo.findAll();
               //List<OfmucconversationlogVo> ofmucconversationlogVoList = new BeanListUtils<OfmucconversationlogVo, OfmucconversationlogEntity>(OfmucconversationlogVo.class, ofmucconversationlogEntities).getTargetList();
               //return ApiResponse.ok(ofmucconversationlogVoList);
        }

        /**
         * 删除对应主键的数据
         * @return
         */
         public ApiResponse delete(String id){
                //ofmucconversationlogEntityRepo.delete(id);
                return ApiResponse.prompt(Syscode.SC_OK);
         }

}