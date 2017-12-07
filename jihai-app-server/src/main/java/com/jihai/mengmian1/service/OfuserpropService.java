package com.jihai.mengmian1.service;

import com.google.common.reflect.TypeToken;
import com.jihai.mengmian.BeanUtils;
import com.jihai.mengmian.BeanListUtils;
import com.jihai.mengmian1.entity.OfuserpropEntity;
import com.jihai.mengmian1.repo.OfuserpropEntityRepo;
import com.jihai.mengmian1.vo.OfuserpropVo;
import com.jihai.mengmian1.dto.OfuserpropDto;
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
 * <b>Time：</b> 2017-12-07 16:39:06 <br>
 * <b>Contact：<b>wechat and phone number - 13826126615<br>
 */
@Service
public class OfuserpropService {
    @Autowired
    private OfuserpropEntityRepo ofuserpropEntityRepo;

    /**
     * 新增
     * @param ofuserpropDto
     * @return ApiResponse<OfuserpropVo>
     */
     public ApiResponse<OfuserpropVo> insert(OfuserpropDto ofuserpropDto){
           return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<OfuserpropVo>(){}.getType()));
           //OfuserpropEntity ofuserpropEntity = BeanUtils.copyAttrs(new OfuserpropEntity(), ofuserpropDto);
           //ofuserpropEntityRepo.save(ofuserpropEntity);
           //return ApiResponse.ok(BeanUtils.copyAttrs(new OfuserpropVo(),ofuserpropEntity));
     }


     /**
      * 修改
      * @param ofuserpropDto
      * @return ApiResponse<OfuserpropVo>
      */
      public ApiResponse<OfuserpropVo> update(OfuserpropDto ofuserpropDto){
            return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<OfuserpropVo>(){}.getType()));
            //OfuserpropEntity ofuserpropEntity = BeanUtils.copyAttrs(new OfuserpropEntity(), ofuserpropDto);
            //ofuserpropEntityRepo.save(ofuserpropEntity);
            //return ApiResponse.ok(BeanUtils.copyAttrs(new OfuserpropVo(),ofuserpropEntity));
      }

      /**
       * 通过主键获取对象
       * @param id 实体主键
       * @return ApiResponse<OfuserpropVo>
       */
       public ApiResponse<OfuserpropVo> findOne(String id){
             return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<OfuserpropVo>(){}.getType()));
             //OfuserpropEntity ofuserpropEntity = ofuserpropEntityRepo.findOne(id);
             //return ApiResponse.ok(BeanUtils.copyAttrs(new OfuserpropVo(),ofuserpropEntity));
       }

       /**
        * 默认查询所有列表，若要筛选列表，请增加过滤参数
        * @return ApiResponse<List<OfuserpropVo>>
        */
        public ApiResponse<List<OfuserpropVo>> findAll(){
               return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<List<OfuserpropVo>>(){}.getType()));
               //List<OfuserpropEntity> ofuserpropEntities = ofuserpropEntityRepo.findAll();
               //List<OfuserpropVo> ofuserpropVoList = new BeanListUtils<OfuserpropVo, OfuserpropEntity>(OfuserpropVo.class, ofuserpropEntities).getTargetList();
               //return ApiResponse.ok(ofuserpropVoList);
        }

        /**
         * 删除对应主键的数据
         * @return
         */
         public ApiResponse delete(String id){
                //ofuserpropEntityRepo.delete(id);
                return ApiResponse.prompt(Syscode.SC_OK);
         }

}