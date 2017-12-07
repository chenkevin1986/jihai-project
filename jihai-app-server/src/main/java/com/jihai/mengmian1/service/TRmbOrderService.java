package com.jihai.mengmian1.service;

import com.google.common.reflect.TypeToken;
import com.jihai.mengmian.BeanUtils;
import com.jihai.mengmian.BeanListUtils;
import com.jihai.mengmian1.entity.TRmbOrderEntity;
import com.jihai.mengmian1.repo.TRmbOrderEntityRepo;
import com.jihai.mengmian1.vo.TRmbOrderVo;
import com.jihai.mengmian1.dto.TRmbOrderDto;
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
 * <b>Time：</b> 2017-12-07 16:39:07 <br>
 * <b>Contact：<b>wechat and phone number - 13826126615<br>
 */
@Service
public class TRmbOrderService {
    @Autowired
    private TRmbOrderEntityRepo tRmbOrderEntityRepo;

    /**
     * 新增
     * @param tRmbOrderDto
     * @return ApiResponse<TRmbOrderVo>
     */
     public ApiResponse<TRmbOrderVo> insert(TRmbOrderDto tRmbOrderDto){
           return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<TRmbOrderVo>(){}.getType()));
           //TRmbOrderEntity tRmbOrderEntity = BeanUtils.copyAttrs(new TRmbOrderEntity(), tRmbOrderDto);
           //tRmbOrderEntityRepo.save(tRmbOrderEntity);
           //return ApiResponse.ok(BeanUtils.copyAttrs(new TRmbOrderVo(),tRmbOrderEntity));
     }


     /**
      * 修改
      * @param tRmbOrderDto
      * @return ApiResponse<TRmbOrderVo>
      */
      public ApiResponse<TRmbOrderVo> update(TRmbOrderDto tRmbOrderDto){
            return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<TRmbOrderVo>(){}.getType()));
            //TRmbOrderEntity tRmbOrderEntity = BeanUtils.copyAttrs(new TRmbOrderEntity(), tRmbOrderDto);
            //tRmbOrderEntityRepo.save(tRmbOrderEntity);
            //return ApiResponse.ok(BeanUtils.copyAttrs(new TRmbOrderVo(),tRmbOrderEntity));
      }

      /**
       * 通过主键获取对象
       * @param id 实体主键
       * @return ApiResponse<TRmbOrderVo>
       */
       public ApiResponse<TRmbOrderVo> findOne(String id){
             return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<TRmbOrderVo>(){}.getType()));
             //TRmbOrderEntity tRmbOrderEntity = tRmbOrderEntityRepo.findOne(id);
             //return ApiResponse.ok(BeanUtils.copyAttrs(new TRmbOrderVo(),tRmbOrderEntity));
       }

       /**
        * 默认查询所有列表，若要筛选列表，请增加过滤参数
        * @return ApiResponse<List<TRmbOrderVo>>
        */
        public ApiResponse<List<TRmbOrderVo>> findAll(){
               return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<List<TRmbOrderVo>>(){}.getType()));
               //List<TRmbOrderEntity> tRmbOrderEntities = tRmbOrderEntityRepo.findAll();
               //List<TRmbOrderVo> tRmbOrderVoList = new BeanListUtils<TRmbOrderVo, TRmbOrderEntity>(TRmbOrderVo.class, tRmbOrderEntities).getTargetList();
               //return ApiResponse.ok(tRmbOrderVoList);
        }

        /**
         * 删除对应主键的数据
         * @return
         */
         public ApiResponse delete(String id){
                //tRmbOrderEntityRepo.delete(id);
                return ApiResponse.prompt(Syscode.SC_OK);
         }

}