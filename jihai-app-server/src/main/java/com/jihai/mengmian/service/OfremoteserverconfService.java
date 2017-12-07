package com.jihai.mengmian.service;

import com.google.common.reflect.TypeToken;
import com.jihai.mengmian.BeanUtils;
import com.jihai.mengmian.BeanListUtils;
import com.jihai.mengmian.entity.OfremoteserverconfEntity;
import com.jihai.mengmian.repo.OfremoteserverconfEntityRepo;
import com.jihai.mengmian.vo.OfremoteserverconfVo;
import com.jihai.mengmian.dto.OfremoteserverconfDto;
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
public class OfremoteserverconfService {
    @Autowired
    private OfremoteserverconfEntityRepo ofremoteserverconfEntityRepo;

    /**
     * 新增
     * @param ofremoteserverconfDto
     * @return ApiResponse<OfremoteserverconfVo>
     */
     public ApiResponse<OfremoteserverconfVo> insert(OfremoteserverconfDto ofremoteserverconfDto){
           return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<OfremoteserverconfVo>(){}.getType()));
           //OfremoteserverconfEntity ofremoteserverconfEntity = BeanUtils.copyAttrs(new OfremoteserverconfEntity(), ofremoteserverconfDto);
           //ofremoteserverconfEntityRepo.save(ofremoteserverconfEntity);
           //return ApiResponse.ok(BeanUtils.copyAttrs(new OfremoteserverconfVo(),ofremoteserverconfEntity));
     }


     /**
      * 修改
      * @param ofremoteserverconfDto
      * @return ApiResponse<OfremoteserverconfVo>
      */
      public ApiResponse<OfremoteserverconfVo> update(OfremoteserverconfDto ofremoteserverconfDto){
            return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<OfremoteserverconfVo>(){}.getType()));
            //OfremoteserverconfEntity ofremoteserverconfEntity = BeanUtils.copyAttrs(new OfremoteserverconfEntity(), ofremoteserverconfDto);
            //ofremoteserverconfEntityRepo.save(ofremoteserverconfEntity);
            //return ApiResponse.ok(BeanUtils.copyAttrs(new OfremoteserverconfVo(),ofremoteserverconfEntity));
      }

      /**
       * 通过主键获取对象
       * @param id 实体主键
       * @return ApiResponse<OfremoteserverconfVo>
       */
       public ApiResponse<OfremoteserverconfVo> findOne(String id){
             return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<OfremoteserverconfVo>(){}.getType()));
             //OfremoteserverconfEntity ofremoteserverconfEntity = ofremoteserverconfEntityRepo.findOne(id);
             //return ApiResponse.ok(BeanUtils.copyAttrs(new OfremoteserverconfVo(),ofremoteserverconfEntity));
       }

       /**
        * 默认查询所有列表，若要筛选列表，请增加过滤参数
        * @return ApiResponse<List<OfremoteserverconfVo>>
        */
        public ApiResponse<List<OfremoteserverconfVo>> findAll(){
               return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<List<OfremoteserverconfVo>>(){}.getType()));
               //List<OfremoteserverconfEntity> ofremoteserverconfEntities = ofremoteserverconfEntityRepo.findAll();
               //List<OfremoteserverconfVo> ofremoteserverconfVoList = new BeanListUtils<OfremoteserverconfVo, OfremoteserverconfEntity>(OfremoteserverconfVo.class, ofremoteserverconfEntities).getTargetList();
               //return ApiResponse.ok(ofremoteserverconfVoList);
        }

        /**
         * 删除对应主键的数据
         * @return
         */
         public ApiResponse delete(String id){
                //ofremoteserverconfEntityRepo.delete(id);
                return ApiResponse.prompt(Syscode.SC_OK);
         }

}