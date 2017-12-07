package com.jihai.mengmian.service;

import com.google.common.reflect.TypeToken;
import com.jihai.mengmian.BeanUtils;
import com.jihai.mengmian.BeanListUtils;
import com.jihai.mengmian.entity.OfidEntity;
import com.jihai.mengmian.repo.OfidEntityRepo;
import com.jihai.mengmian.vo.OfidVo;
import com.jihai.mengmian.dto.OfidDto;
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
public class OfidService {
    @Autowired
    private OfidEntityRepo ofidEntityRepo;

    /**
     * 新增
     * @param ofidDto
     * @return ApiResponse<OfidVo>
     */
     public ApiResponse<OfidVo> insert(OfidDto ofidDto){
           return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<OfidVo>(){}.getType()));
           //OfidEntity ofidEntity = BeanUtils.copyAttrs(new OfidEntity(), ofidDto);
           //ofidEntityRepo.save(ofidEntity);
           //return ApiResponse.ok(BeanUtils.copyAttrs(new OfidVo(),ofidEntity));
     }


     /**
      * 修改
      * @param ofidDto
      * @return ApiResponse<OfidVo>
      */
      public ApiResponse<OfidVo> update(OfidDto ofidDto){
            return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<OfidVo>(){}.getType()));
            //OfidEntity ofidEntity = BeanUtils.copyAttrs(new OfidEntity(), ofidDto);
            //ofidEntityRepo.save(ofidEntity);
            //return ApiResponse.ok(BeanUtils.copyAttrs(new OfidVo(),ofidEntity));
      }

      /**
       * 通过主键获取对象
       * @param id 实体主键
       * @return ApiResponse<OfidVo>
       */
       public ApiResponse<OfidVo> findOne(String id){
             return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<OfidVo>(){}.getType()));
             //OfidEntity ofidEntity = ofidEntityRepo.findOne(id);
             //return ApiResponse.ok(BeanUtils.copyAttrs(new OfidVo(),ofidEntity));
       }

       /**
        * 默认查询所有列表，若要筛选列表，请增加过滤参数
        * @return ApiResponse<List<OfidVo>>
        */
        public ApiResponse<List<OfidVo>> findAll(){
               return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<List<OfidVo>>(){}.getType()));
               //List<OfidEntity> ofidEntities = ofidEntityRepo.findAll();
               //List<OfidVo> ofidVoList = new BeanListUtils<OfidVo, OfidEntity>(OfidVo.class, ofidEntities).getTargetList();
               //return ApiResponse.ok(ofidVoList);
        }

        /**
         * 删除对应主键的数据
         * @return
         */
         public ApiResponse delete(String id){
                //ofidEntityRepo.delete(id);
                return ApiResponse.prompt(Syscode.SC_OK);
         }

}