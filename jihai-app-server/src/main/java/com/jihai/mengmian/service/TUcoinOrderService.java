package com.jihai.mengmian.service;

import com.google.common.reflect.TypeToken;
import com.jihai.mengmian.BeanUtils;
import com.jihai.mengmian.BeanListUtils;
import com.jihai.mengmian.entity.TUcoinOrderEntity;
import com.jihai.mengmian.repo.TUcoinOrderEntityRepo;
import com.jihai.mengmian.vo.TUcoinOrderVo;
import com.jihai.mengmian.dto.TUcoinOrderDto;
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
public class TUcoinOrderService {
    @Autowired
    private TUcoinOrderEntityRepo tUcoinOrderEntityRepo;

    /**
     * 新增
     * @param tUcoinOrderDto
     * @return ApiResponse<TUcoinOrderVo>
     */
     public ApiResponse<TUcoinOrderVo> insert(TUcoinOrderDto tUcoinOrderDto){
           return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<TUcoinOrderVo>(){}.getType()));
           //TUcoinOrderEntity tUcoinOrderEntity = BeanUtils.copyAttrs(new TUcoinOrderEntity(), tUcoinOrderDto);
           //tUcoinOrderEntityRepo.save(tUcoinOrderEntity);
           //return ApiResponse.ok(BeanUtils.copyAttrs(new TUcoinOrderVo(),tUcoinOrderEntity));
     }


     /**
      * 修改
      * @param tUcoinOrderDto
      * @return ApiResponse<TUcoinOrderVo>
      */
      public ApiResponse<TUcoinOrderVo> update(TUcoinOrderDto tUcoinOrderDto){
            return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<TUcoinOrderVo>(){}.getType()));
            //TUcoinOrderEntity tUcoinOrderEntity = BeanUtils.copyAttrs(new TUcoinOrderEntity(), tUcoinOrderDto);
            //tUcoinOrderEntityRepo.save(tUcoinOrderEntity);
            //return ApiResponse.ok(BeanUtils.copyAttrs(new TUcoinOrderVo(),tUcoinOrderEntity));
      }

      /**
       * 通过主键获取对象
       * @param id 实体主键
       * @return ApiResponse<TUcoinOrderVo>
       */
       public ApiResponse<TUcoinOrderVo> findOne(String id){
             return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<TUcoinOrderVo>(){}.getType()));
             //TUcoinOrderEntity tUcoinOrderEntity = tUcoinOrderEntityRepo.findOne(id);
             //return ApiResponse.ok(BeanUtils.copyAttrs(new TUcoinOrderVo(),tUcoinOrderEntity));
       }

       /**
        * 默认查询所有列表，若要筛选列表，请增加过滤参数
        * @return ApiResponse<List<TUcoinOrderVo>>
        */
        public ApiResponse<List<TUcoinOrderVo>> findAll(){
               return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<List<TUcoinOrderVo>>(){}.getType()));
               //List<TUcoinOrderEntity> tUcoinOrderEntities = tUcoinOrderEntityRepo.findAll();
               //List<TUcoinOrderVo> tUcoinOrderVoList = new BeanListUtils<TUcoinOrderVo, TUcoinOrderEntity>(TUcoinOrderVo.class, tUcoinOrderEntities).getTargetList();
               //return ApiResponse.ok(tUcoinOrderVoList);
        }

        /**
         * 删除对应主键的数据
         * @return
         */
         public ApiResponse delete(String id){
                //tUcoinOrderEntityRepo.delete(id);
                return ApiResponse.prompt(Syscode.SC_OK);
         }

}