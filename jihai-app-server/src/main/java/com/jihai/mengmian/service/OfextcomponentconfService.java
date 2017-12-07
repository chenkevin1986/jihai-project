package com.jihai.mengmian.service;

import com.google.common.reflect.TypeToken;
import com.jihai.mengmian.BeanUtils;
import com.jihai.mengmian.BeanListUtils;
import com.jihai.mengmian.entity.OfextcomponentconfEntity;
import com.jihai.mengmian.repo.OfextcomponentconfEntityRepo;
import com.jihai.mengmian.vo.OfextcomponentconfVo;
import com.jihai.mengmian.dto.OfextcomponentconfDto;
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
public class OfextcomponentconfService {
    @Autowired
    private OfextcomponentconfEntityRepo ofextcomponentconfEntityRepo;

    /**
     * 新增
     * @param ofextcomponentconfDto
     * @return ApiResponse<OfextcomponentconfVo>
     */
     public ApiResponse<OfextcomponentconfVo> insert(OfextcomponentconfDto ofextcomponentconfDto){
           return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<OfextcomponentconfVo>(){}.getType()));
           //OfextcomponentconfEntity ofextcomponentconfEntity = BeanUtils.copyAttrs(new OfextcomponentconfEntity(), ofextcomponentconfDto);
           //ofextcomponentconfEntityRepo.save(ofextcomponentconfEntity);
           //return ApiResponse.ok(BeanUtils.copyAttrs(new OfextcomponentconfVo(),ofextcomponentconfEntity));
     }


     /**
      * 修改
      * @param ofextcomponentconfDto
      * @return ApiResponse<OfextcomponentconfVo>
      */
      public ApiResponse<OfextcomponentconfVo> update(OfextcomponentconfDto ofextcomponentconfDto){
            return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<OfextcomponentconfVo>(){}.getType()));
            //OfextcomponentconfEntity ofextcomponentconfEntity = BeanUtils.copyAttrs(new OfextcomponentconfEntity(), ofextcomponentconfDto);
            //ofextcomponentconfEntityRepo.save(ofextcomponentconfEntity);
            //return ApiResponse.ok(BeanUtils.copyAttrs(new OfextcomponentconfVo(),ofextcomponentconfEntity));
      }

      /**
       * 通过主键获取对象
       * @param id 实体主键
       * @return ApiResponse<OfextcomponentconfVo>
       */
       public ApiResponse<OfextcomponentconfVo> findOne(String id){
             return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<OfextcomponentconfVo>(){}.getType()));
             //OfextcomponentconfEntity ofextcomponentconfEntity = ofextcomponentconfEntityRepo.findOne(id);
             //return ApiResponse.ok(BeanUtils.copyAttrs(new OfextcomponentconfVo(),ofextcomponentconfEntity));
       }

       /**
        * 默认查询所有列表，若要筛选列表，请增加过滤参数
        * @return ApiResponse<List<OfextcomponentconfVo>>
        */
        public ApiResponse<List<OfextcomponentconfVo>> findAll(){
               return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<List<OfextcomponentconfVo>>(){}.getType()));
               //List<OfextcomponentconfEntity> ofextcomponentconfEntities = ofextcomponentconfEntityRepo.findAll();
               //List<OfextcomponentconfVo> ofextcomponentconfVoList = new BeanListUtils<OfextcomponentconfVo, OfextcomponentconfEntity>(OfextcomponentconfVo.class, ofextcomponentconfEntities).getTargetList();
               //return ApiResponse.ok(ofextcomponentconfVoList);
        }

        /**
         * 删除对应主键的数据
         * @return
         */
         public ApiResponse delete(String id){
                //ofextcomponentconfEntityRepo.delete(id);
                return ApiResponse.prompt(Syscode.SC_OK);
         }

}