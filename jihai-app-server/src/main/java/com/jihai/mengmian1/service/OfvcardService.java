package com.jihai.mengmian1.service;

import com.google.common.reflect.TypeToken;
import com.jihai.mengmian.BeanUtils;
import com.jihai.mengmian.BeanListUtils;
import com.jihai.mengmian1.entity.OfvcardEntity;
import com.jihai.mengmian1.repo.OfvcardEntityRepo;
import com.jihai.mengmian1.vo.OfvcardVo;
import com.jihai.mengmian1.dto.OfvcardDto;
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
public class OfvcardService {
    @Autowired
    private OfvcardEntityRepo ofvcardEntityRepo;

    /**
     * 新增
     * @param ofvcardDto
     * @return ApiResponse<OfvcardVo>
     */
     public ApiResponse<OfvcardVo> insert(OfvcardDto ofvcardDto){
           return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<OfvcardVo>(){}.getType()));
           //OfvcardEntity ofvcardEntity = BeanUtils.copyAttrs(new OfvcardEntity(), ofvcardDto);
           //ofvcardEntityRepo.save(ofvcardEntity);
           //return ApiResponse.ok(BeanUtils.copyAttrs(new OfvcardVo(),ofvcardEntity));
     }


     /**
      * 修改
      * @param ofvcardDto
      * @return ApiResponse<OfvcardVo>
      */
      public ApiResponse<OfvcardVo> update(OfvcardDto ofvcardDto){
            return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<OfvcardVo>(){}.getType()));
            //OfvcardEntity ofvcardEntity = BeanUtils.copyAttrs(new OfvcardEntity(), ofvcardDto);
            //ofvcardEntityRepo.save(ofvcardEntity);
            //return ApiResponse.ok(BeanUtils.copyAttrs(new OfvcardVo(),ofvcardEntity));
      }

      /**
       * 通过主键获取对象
       * @param id 实体主键
       * @return ApiResponse<OfvcardVo>
       */
       public ApiResponse<OfvcardVo> findOne(String id){
             return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<OfvcardVo>(){}.getType()));
             //OfvcardEntity ofvcardEntity = ofvcardEntityRepo.findOne(id);
             //return ApiResponse.ok(BeanUtils.copyAttrs(new OfvcardVo(),ofvcardEntity));
       }

       /**
        * 默认查询所有列表，若要筛选列表，请增加过滤参数
        * @return ApiResponse<List<OfvcardVo>>
        */
        public ApiResponse<List<OfvcardVo>> findAll(){
               return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<List<OfvcardVo>>(){}.getType()));
               //List<OfvcardEntity> ofvcardEntities = ofvcardEntityRepo.findAll();
               //List<OfvcardVo> ofvcardVoList = new BeanListUtils<OfvcardVo, OfvcardEntity>(OfvcardVo.class, ofvcardEntities).getTargetList();
               //return ApiResponse.ok(ofvcardVoList);
        }

        /**
         * 删除对应主键的数据
         * @return
         */
         public ApiResponse delete(String id){
                //ofvcardEntityRepo.delete(id);
                return ApiResponse.prompt(Syscode.SC_OK);
         }

}