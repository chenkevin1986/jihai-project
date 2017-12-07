package com.jihai.mengmian.service;

import com.google.common.reflect.TypeToken;
import com.jihai.mengmian.BeanUtils;
import com.jihai.mengmian.BeanListUtils;
import com.jihai.mengmian.entity.OfmucroomEntity;
import com.jihai.mengmian.repo.OfmucroomEntityRepo;
import com.jihai.mengmian.vo.OfmucroomVo;
import com.jihai.mengmian.dto.OfmucroomDto;
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
public class OfmucroomService {
    @Autowired
    private OfmucroomEntityRepo ofmucroomEntityRepo;

    /**
     * 新增
     * @param ofmucroomDto
     * @return ApiResponse<OfmucroomVo>
     */
     public ApiResponse<OfmucroomVo> insert(OfmucroomDto ofmucroomDto){
           return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<OfmucroomVo>(){}.getType()));
           //OfmucroomEntity ofmucroomEntity = BeanUtils.copyAttrs(new OfmucroomEntity(), ofmucroomDto);
           //ofmucroomEntityRepo.save(ofmucroomEntity);
           //return ApiResponse.ok(BeanUtils.copyAttrs(new OfmucroomVo(),ofmucroomEntity));
     }


     /**
      * 修改
      * @param ofmucroomDto
      * @return ApiResponse<OfmucroomVo>
      */
      public ApiResponse<OfmucroomVo> update(OfmucroomDto ofmucroomDto){
            return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<OfmucroomVo>(){}.getType()));
            //OfmucroomEntity ofmucroomEntity = BeanUtils.copyAttrs(new OfmucroomEntity(), ofmucroomDto);
            //ofmucroomEntityRepo.save(ofmucroomEntity);
            //return ApiResponse.ok(BeanUtils.copyAttrs(new OfmucroomVo(),ofmucroomEntity));
      }

      /**
       * 通过主键获取对象
       * @param id 实体主键
       * @return ApiResponse<OfmucroomVo>
       */
       public ApiResponse<OfmucroomVo> findOne(String id){
             return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<OfmucroomVo>(){}.getType()));
             //OfmucroomEntity ofmucroomEntity = ofmucroomEntityRepo.findOne(id);
             //return ApiResponse.ok(BeanUtils.copyAttrs(new OfmucroomVo(),ofmucroomEntity));
       }

       /**
        * 默认查询所有列表，若要筛选列表，请增加过滤参数
        * @return ApiResponse<List<OfmucroomVo>>
        */
        public ApiResponse<List<OfmucroomVo>> findAll(){
               return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<List<OfmucroomVo>>(){}.getType()));
               //List<OfmucroomEntity> ofmucroomEntities = ofmucroomEntityRepo.findAll();
               //List<OfmucroomVo> ofmucroomVoList = new BeanListUtils<OfmucroomVo, OfmucroomEntity>(OfmucroomVo.class, ofmucroomEntities).getTargetList();
               //return ApiResponse.ok(ofmucroomVoList);
        }

        /**
         * 删除对应主键的数据
         * @return
         */
         public ApiResponse delete(String id){
                //ofmucroomEntityRepo.delete(id);
                return ApiResponse.prompt(Syscode.SC_OK);
         }

}