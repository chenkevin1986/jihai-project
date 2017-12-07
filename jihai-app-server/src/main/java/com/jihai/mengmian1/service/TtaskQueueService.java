package com.jihai.mengmian1.service;

import com.google.common.reflect.TypeToken;
import com.jihai.mengmian.BeanUtils;
import com.jihai.mengmian.BeanListUtils;
import com.jihai.mengmian1.entity.TtaskQueueEntity;
import com.jihai.mengmian1.repo.TtaskQueueEntityRepo;
import com.jihai.mengmian1.vo.TtaskQueueVo;
import com.jihai.mengmian1.dto.TtaskQueueDto;
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
 * <b>Time：</b> 2017-12-07 16:39:08 <br>
 * <b>Contact：<b>wechat and phone number - 13826126615<br>
 */
@Service
public class TtaskQueueService {
    @Autowired
    private TtaskQueueEntityRepo ttaskQueueEntityRepo;

    /**
     * 新增
     * @param ttaskQueueDto
     * @return ApiResponse<TtaskQueueVo>
     */
     public ApiResponse<TtaskQueueVo> insert(TtaskQueueDto ttaskQueueDto){
           return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<TtaskQueueVo>(){}.getType()));
           //TtaskQueueEntity ttaskQueueEntity = BeanUtils.copyAttrs(new TtaskQueueEntity(), ttaskQueueDto);
           //ttaskQueueEntityRepo.save(ttaskQueueEntity);
           //return ApiResponse.ok(BeanUtils.copyAttrs(new TtaskQueueVo(),ttaskQueueEntity));
     }


     /**
      * 修改
      * @param ttaskQueueDto
      * @return ApiResponse<TtaskQueueVo>
      */
      public ApiResponse<TtaskQueueVo> update(TtaskQueueDto ttaskQueueDto){
            return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<TtaskQueueVo>(){}.getType()));
            //TtaskQueueEntity ttaskQueueEntity = BeanUtils.copyAttrs(new TtaskQueueEntity(), ttaskQueueDto);
            //ttaskQueueEntityRepo.save(ttaskQueueEntity);
            //return ApiResponse.ok(BeanUtils.copyAttrs(new TtaskQueueVo(),ttaskQueueEntity));
      }

      /**
       * 通过主键获取对象
       * @param id 实体主键
       * @return ApiResponse<TtaskQueueVo>
       */
       public ApiResponse<TtaskQueueVo> findOne(String id){
             return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<TtaskQueueVo>(){}.getType()));
             //TtaskQueueEntity ttaskQueueEntity = ttaskQueueEntityRepo.findOne(id);
             //return ApiResponse.ok(BeanUtils.copyAttrs(new TtaskQueueVo(),ttaskQueueEntity));
       }

       /**
        * 默认查询所有列表，若要筛选列表，请增加过滤参数
        * @return ApiResponse<List<TtaskQueueVo>>
        */
        public ApiResponse<List<TtaskQueueVo>> findAll(){
               return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<List<TtaskQueueVo>>(){}.getType()));
               //List<TtaskQueueEntity> ttaskQueueEntities = ttaskQueueEntityRepo.findAll();
               //List<TtaskQueueVo> ttaskQueueVoList = new BeanListUtils<TtaskQueueVo, TtaskQueueEntity>(TtaskQueueVo.class, ttaskQueueEntities).getTargetList();
               //return ApiResponse.ok(ttaskQueueVoList);
        }

        /**
         * 删除对应主键的数据
         * @return
         */
         public ApiResponse delete(String id){
                //ttaskQueueEntityRepo.delete(id);
                return ApiResponse.prompt(Syscode.SC_OK);
         }

}