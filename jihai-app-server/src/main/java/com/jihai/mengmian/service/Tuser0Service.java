package com.jihai.mengmian.service;

import com.google.common.reflect.TypeToken;
import com.jihai.mengmian.BeanUtils;
import com.jihai.mengmian.BeanListUtils;
import com.jihai.mengmian.entity.Tuser0Entity;
import com.jihai.mengmian.repo.Tuser0EntityRepo;
import com.jihai.mengmian.vo.Tuser0Vo;
import com.jihai.mengmian.dto.Tuser0Dto;
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
 * <b>Time：</b> 2017-12-07 16:37:29 <br>
 * <b>Contact：<b>wechat and phone number - 13826126615<br>
 */
@Service
public class Tuser0Service {
    @Autowired
    private Tuser0EntityRepo tuser0EntityRepo;

    /**
     * 新增
     * @param tuser0Dto
     * @return ApiResponse<Tuser0Vo>
     */
     public ApiResponse<Tuser0Vo> insert(Tuser0Dto tuser0Dto){
           return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<Tuser0Vo>(){}.getType()));
           //Tuser0Entity tuser0Entity = BeanUtils.copyAttrs(new Tuser0Entity(), tuser0Dto);
           //tuser0EntityRepo.save(tuser0Entity);
           //return ApiResponse.ok(BeanUtils.copyAttrs(new Tuser0Vo(),tuser0Entity));
     }


     /**
      * 修改
      * @param tuser0Dto
      * @return ApiResponse<Tuser0Vo>
      */
      public ApiResponse<Tuser0Vo> update(Tuser0Dto tuser0Dto){
            return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<Tuser0Vo>(){}.getType()));
            //Tuser0Entity tuser0Entity = BeanUtils.copyAttrs(new Tuser0Entity(), tuser0Dto);
            //tuser0EntityRepo.save(tuser0Entity);
            //return ApiResponse.ok(BeanUtils.copyAttrs(new Tuser0Vo(),tuser0Entity));
      }

      /**
       * 通过主键获取对象
       * @param id 实体主键
       * @return ApiResponse<Tuser0Vo>
       */
       public ApiResponse<Tuser0Vo> findOne(String id){
             return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<Tuser0Vo>(){}.getType()));
             //Tuser0Entity tuser0Entity = tuser0EntityRepo.findOne(id);
             //return ApiResponse.ok(BeanUtils.copyAttrs(new Tuser0Vo(),tuser0Entity));
       }

       /**
        * 默认查询所有列表，若要筛选列表，请增加过滤参数
        * @return ApiResponse<List<Tuser0Vo>>
        */
        public ApiResponse<List<Tuser0Vo>> findAll(){
               return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<List<Tuser0Vo>>(){}.getType()));
               //List<Tuser0Entity> tuser0Entities = tuser0EntityRepo.findAll();
               //List<Tuser0Vo> tuser0VoList = new BeanListUtils<Tuser0Vo, Tuser0Entity>(Tuser0Vo.class, tuser0Entities).getTargetList();
               //return ApiResponse.ok(tuser0VoList);
        }

        /**
         * 删除对应主键的数据
         * @return
         */
         public ApiResponse delete(String id){
                //tuser0EntityRepo.delete(id);
                return ApiResponse.prompt(Syscode.SC_OK);
         }

}