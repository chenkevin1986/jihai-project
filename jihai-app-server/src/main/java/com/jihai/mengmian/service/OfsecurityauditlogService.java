package com.jihai.mengmian.service;

import com.google.common.reflect.TypeToken;
import com.jihai.mengmian.BeanUtils;
import com.jihai.mengmian.BeanListUtils;
import com.jihai.mengmian.entity.OfsecurityauditlogEntity;
import com.jihai.mengmian.repo.OfsecurityauditlogEntityRepo;
import com.jihai.mengmian.vo.OfsecurityauditlogVo;
import com.jihai.mengmian.dto.OfsecurityauditlogDto;
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
 * <b>Time：</b> 2017-12-07 16:37:28 <br>
 * <b>Contact：<b>wechat and phone number - 13826126615<br>
 */
@Service
public class OfsecurityauditlogService {
    @Autowired
    private OfsecurityauditlogEntityRepo ofsecurityauditlogEntityRepo;

    /**
     * 新增
     * @param ofsecurityauditlogDto
     * @return ApiResponse<OfsecurityauditlogVo>
     */
     public ApiResponse<OfsecurityauditlogVo> insert(OfsecurityauditlogDto ofsecurityauditlogDto){
           return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<OfsecurityauditlogVo>(){}.getType()));
           //OfsecurityauditlogEntity ofsecurityauditlogEntity = BeanUtils.copyAttrs(new OfsecurityauditlogEntity(), ofsecurityauditlogDto);
           //ofsecurityauditlogEntityRepo.save(ofsecurityauditlogEntity);
           //return ApiResponse.ok(BeanUtils.copyAttrs(new OfsecurityauditlogVo(),ofsecurityauditlogEntity));
     }


     /**
      * 修改
      * @param ofsecurityauditlogDto
      * @return ApiResponse<OfsecurityauditlogVo>
      */
      public ApiResponse<OfsecurityauditlogVo> update(OfsecurityauditlogDto ofsecurityauditlogDto){
            return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<OfsecurityauditlogVo>(){}.getType()));
            //OfsecurityauditlogEntity ofsecurityauditlogEntity = BeanUtils.copyAttrs(new OfsecurityauditlogEntity(), ofsecurityauditlogDto);
            //ofsecurityauditlogEntityRepo.save(ofsecurityauditlogEntity);
            //return ApiResponse.ok(BeanUtils.copyAttrs(new OfsecurityauditlogVo(),ofsecurityauditlogEntity));
      }

      /**
       * 通过主键获取对象
       * @param id 实体主键
       * @return ApiResponse<OfsecurityauditlogVo>
       */
       public ApiResponse<OfsecurityauditlogVo> findOne(String id){
             return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<OfsecurityauditlogVo>(){}.getType()));
             //OfsecurityauditlogEntity ofsecurityauditlogEntity = ofsecurityauditlogEntityRepo.findOne(id);
             //return ApiResponse.ok(BeanUtils.copyAttrs(new OfsecurityauditlogVo(),ofsecurityauditlogEntity));
       }

       /**
        * 默认查询所有列表，若要筛选列表，请增加过滤参数
        * @return ApiResponse<List<OfsecurityauditlogVo>>
        */
        public ApiResponse<List<OfsecurityauditlogVo>> findAll(){
               return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<List<OfsecurityauditlogVo>>(){}.getType()));
               //List<OfsecurityauditlogEntity> ofsecurityauditlogEntities = ofsecurityauditlogEntityRepo.findAll();
               //List<OfsecurityauditlogVo> ofsecurityauditlogVoList = new BeanListUtils<OfsecurityauditlogVo, OfsecurityauditlogEntity>(OfsecurityauditlogVo.class, ofsecurityauditlogEntities).getTargetList();
               //return ApiResponse.ok(ofsecurityauditlogVoList);
        }

        /**
         * 删除对应主键的数据
         * @return
         */
         public ApiResponse delete(String id){
                //ofsecurityauditlogEntityRepo.delete(id);
                return ApiResponse.prompt(Syscode.SC_OK);
         }

}