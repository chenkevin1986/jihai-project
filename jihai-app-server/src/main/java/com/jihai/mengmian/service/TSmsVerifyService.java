package com.jihai.mengmian.service;

import com.google.common.reflect.TypeToken;
import com.jihai.mengmian.BeanUtils;
import com.jihai.mengmian.BeanListUtils;
import com.jihai.mengmian.entity.TSmsVerifyEntity;
import com.jihai.mengmian.repo.TSmsVerifyEntityRepo;
import com.jihai.mengmian.vo.TSmsVerifyVo;
import com.jihai.mengmian.dto.TSmsVerifyDto;
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
public class TSmsVerifyService {
    @Autowired
    private TSmsVerifyEntityRepo tSmsVerifyEntityRepo;

    /**
     * 新增
     * @param tSmsVerifyDto
     * @return ApiResponse<TSmsVerifyVo>
     */
     public ApiResponse<TSmsVerifyVo> insert(TSmsVerifyDto tSmsVerifyDto){
           return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<TSmsVerifyVo>(){}.getType()));
           //TSmsVerifyEntity tSmsVerifyEntity = BeanUtils.copyAttrs(new TSmsVerifyEntity(), tSmsVerifyDto);
           //tSmsVerifyEntityRepo.save(tSmsVerifyEntity);
           //return ApiResponse.ok(BeanUtils.copyAttrs(new TSmsVerifyVo(),tSmsVerifyEntity));
     }


     /**
      * 修改
      * @param tSmsVerifyDto
      * @return ApiResponse<TSmsVerifyVo>
      */
      public ApiResponse<TSmsVerifyVo> update(TSmsVerifyDto tSmsVerifyDto){
            return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<TSmsVerifyVo>(){}.getType()));
            //TSmsVerifyEntity tSmsVerifyEntity = BeanUtils.copyAttrs(new TSmsVerifyEntity(), tSmsVerifyDto);
            //tSmsVerifyEntityRepo.save(tSmsVerifyEntity);
            //return ApiResponse.ok(BeanUtils.copyAttrs(new TSmsVerifyVo(),tSmsVerifyEntity));
      }

      /**
       * 通过主键获取对象
       * @param id 实体主键
       * @return ApiResponse<TSmsVerifyVo>
       */
       public ApiResponse<TSmsVerifyVo> findOne(String id){
             return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<TSmsVerifyVo>(){}.getType()));
             //TSmsVerifyEntity tSmsVerifyEntity = tSmsVerifyEntityRepo.findOne(id);
             //return ApiResponse.ok(BeanUtils.copyAttrs(new TSmsVerifyVo(),tSmsVerifyEntity));
       }

       /**
        * 默认查询所有列表，若要筛选列表，请增加过滤参数
        * @return ApiResponse<List<TSmsVerifyVo>>
        */
        public ApiResponse<List<TSmsVerifyVo>> findAll(){
               return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<List<TSmsVerifyVo>>(){}.getType()));
               //List<TSmsVerifyEntity> tSmsVerifyEntities = tSmsVerifyEntityRepo.findAll();
               //List<TSmsVerifyVo> tSmsVerifyVoList = new BeanListUtils<TSmsVerifyVo, TSmsVerifyEntity>(TSmsVerifyVo.class, tSmsVerifyEntities).getTargetList();
               //return ApiResponse.ok(tSmsVerifyVoList);
        }

        /**
         * 删除对应主键的数据
         * @return
         */
         public ApiResponse delete(String id){
                //tSmsVerifyEntityRepo.delete(id);
                return ApiResponse.prompt(Syscode.SC_OK);
         }

}