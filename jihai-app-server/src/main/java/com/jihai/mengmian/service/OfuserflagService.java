package com.jihai.mengmian.service;

import com.google.common.reflect.TypeToken;
import com.jihai.mengmian.BeanUtils;
import com.jihai.mengmian.BeanListUtils;
import com.jihai.mengmian.entity.OfuserflagEntity;
import com.jihai.mengmian.repo.OfuserflagEntityRepo;
import com.jihai.mengmian.vo.OfuserflagVo;
import com.jihai.mengmian.dto.OfuserflagDto;
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
public class OfuserflagService {
    @Autowired
    private OfuserflagEntityRepo ofuserflagEntityRepo;

    /**
     * 新增
     * @param ofuserflagDto
     * @return ApiResponse<OfuserflagVo>
     */
     public ApiResponse<OfuserflagVo> insert(OfuserflagDto ofuserflagDto){
           return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<OfuserflagVo>(){}.getType()));
           //OfuserflagEntity ofuserflagEntity = BeanUtils.copyAttrs(new OfuserflagEntity(), ofuserflagDto);
           //ofuserflagEntityRepo.save(ofuserflagEntity);
           //return ApiResponse.ok(BeanUtils.copyAttrs(new OfuserflagVo(),ofuserflagEntity));
     }


     /**
      * 修改
      * @param ofuserflagDto
      * @return ApiResponse<OfuserflagVo>
      */
      public ApiResponse<OfuserflagVo> update(OfuserflagDto ofuserflagDto){
            return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<OfuserflagVo>(){}.getType()));
            //OfuserflagEntity ofuserflagEntity = BeanUtils.copyAttrs(new OfuserflagEntity(), ofuserflagDto);
            //ofuserflagEntityRepo.save(ofuserflagEntity);
            //return ApiResponse.ok(BeanUtils.copyAttrs(new OfuserflagVo(),ofuserflagEntity));
      }

      /**
       * 通过主键获取对象
       * @param id 实体主键
       * @return ApiResponse<OfuserflagVo>
       */
       public ApiResponse<OfuserflagVo> findOne(String id){
             return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<OfuserflagVo>(){}.getType()));
             //OfuserflagEntity ofuserflagEntity = ofuserflagEntityRepo.findOne(id);
             //return ApiResponse.ok(BeanUtils.copyAttrs(new OfuserflagVo(),ofuserflagEntity));
       }

       /**
        * 默认查询所有列表，若要筛选列表，请增加过滤参数
        * @return ApiResponse<List<OfuserflagVo>>
        */
        public ApiResponse<List<OfuserflagVo>> findAll(){
               return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<List<OfuserflagVo>>(){}.getType()));
               //List<OfuserflagEntity> ofuserflagEntities = ofuserflagEntityRepo.findAll();
               //List<OfuserflagVo> ofuserflagVoList = new BeanListUtils<OfuserflagVo, OfuserflagEntity>(OfuserflagVo.class, ofuserflagEntities).getTargetList();
               //return ApiResponse.ok(ofuserflagVoList);
        }

        /**
         * 删除对应主键的数据
         * @return
         */
         public ApiResponse delete(String id){
                //ofuserflagEntityRepo.delete(id);
                return ApiResponse.prompt(Syscode.SC_OK);
         }

}