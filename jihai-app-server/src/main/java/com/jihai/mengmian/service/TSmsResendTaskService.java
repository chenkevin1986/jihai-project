package com.jihai.mengmian.service;

import com.google.common.reflect.TypeToken;
import com.jihai.mengmian.BeanUtils;
import com.jihai.mengmian.BeanListUtils;
import com.jihai.mengmian.entity.TSmsResendTaskEntity;
import com.jihai.mengmian.repo.TSmsResendTaskEntityRepo;
import com.jihai.mengmian.vo.TSmsResendTaskVo;
import com.jihai.mengmian.dto.TSmsResendTaskDto;
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
public class TSmsResendTaskService {
    @Autowired
    private TSmsResendTaskEntityRepo tSmsResendTaskEntityRepo;

    /**
     * 新增
     * @param tSmsResendTaskDto
     * @return ApiResponse<TSmsResendTaskVo>
     */
     public ApiResponse<TSmsResendTaskVo> insert(TSmsResendTaskDto tSmsResendTaskDto){
           return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<TSmsResendTaskVo>(){}.getType()));
           //TSmsResendTaskEntity tSmsResendTaskEntity = BeanUtils.copyAttrs(new TSmsResendTaskEntity(), tSmsResendTaskDto);
           //tSmsResendTaskEntityRepo.save(tSmsResendTaskEntity);
           //return ApiResponse.ok(BeanUtils.copyAttrs(new TSmsResendTaskVo(),tSmsResendTaskEntity));
     }


     /**
      * 修改
      * @param tSmsResendTaskDto
      * @return ApiResponse<TSmsResendTaskVo>
      */
      public ApiResponse<TSmsResendTaskVo> update(TSmsResendTaskDto tSmsResendTaskDto){
            return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<TSmsResendTaskVo>(){}.getType()));
            //TSmsResendTaskEntity tSmsResendTaskEntity = BeanUtils.copyAttrs(new TSmsResendTaskEntity(), tSmsResendTaskDto);
            //tSmsResendTaskEntityRepo.save(tSmsResendTaskEntity);
            //return ApiResponse.ok(BeanUtils.copyAttrs(new TSmsResendTaskVo(),tSmsResendTaskEntity));
      }

      /**
       * 通过主键获取对象
       * @param id 实体主键
       * @return ApiResponse<TSmsResendTaskVo>
       */
       public ApiResponse<TSmsResendTaskVo> findOne(String id){
             return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<TSmsResendTaskVo>(){}.getType()));
             //TSmsResendTaskEntity tSmsResendTaskEntity = tSmsResendTaskEntityRepo.findOne(id);
             //return ApiResponse.ok(BeanUtils.copyAttrs(new TSmsResendTaskVo(),tSmsResendTaskEntity));
       }

       /**
        * 默认查询所有列表，若要筛选列表，请增加过滤参数
        * @return ApiResponse<List<TSmsResendTaskVo>>
        */
        public ApiResponse<List<TSmsResendTaskVo>> findAll(){
               return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<List<TSmsResendTaskVo>>(){}.getType()));
               //List<TSmsResendTaskEntity> tSmsResendTaskEntities = tSmsResendTaskEntityRepo.findAll();
               //List<TSmsResendTaskVo> tSmsResendTaskVoList = new BeanListUtils<TSmsResendTaskVo, TSmsResendTaskEntity>(TSmsResendTaskVo.class, tSmsResendTaskEntities).getTargetList();
               //return ApiResponse.ok(tSmsResendTaskVoList);
        }

        /**
         * 删除对应主键的数据
         * @return
         */
         public ApiResponse delete(String id){
                //tSmsResendTaskEntityRepo.delete(id);
                return ApiResponse.prompt(Syscode.SC_OK);
         }

}