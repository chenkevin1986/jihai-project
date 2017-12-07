package com.jihai.mengmian.service;

import com.google.common.reflect.TypeToken;
import com.jihai.mengmian.BeanUtils;
import com.jihai.mengmian.BeanListUtils;
import com.jihai.mengmian.entity.OfrostergroupsEntity;
import com.jihai.mengmian.repo.OfrostergroupsEntityRepo;
import com.jihai.mengmian.vo.OfrostergroupsVo;
import com.jihai.mengmian.dto.OfrostergroupsDto;
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
public class OfrostergroupsService {
    @Autowired
    private OfrostergroupsEntityRepo ofrostergroupsEntityRepo;

    /**
     * 新增
     * @param ofrostergroupsDto
     * @return ApiResponse<OfrostergroupsVo>
     */
     public ApiResponse<OfrostergroupsVo> insert(OfrostergroupsDto ofrostergroupsDto){
           return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<OfrostergroupsVo>(){}.getType()));
           //OfrostergroupsEntity ofrostergroupsEntity = BeanUtils.copyAttrs(new OfrostergroupsEntity(), ofrostergroupsDto);
           //ofrostergroupsEntityRepo.save(ofrostergroupsEntity);
           //return ApiResponse.ok(BeanUtils.copyAttrs(new OfrostergroupsVo(),ofrostergroupsEntity));
     }


     /**
      * 修改
      * @param ofrostergroupsDto
      * @return ApiResponse<OfrostergroupsVo>
      */
      public ApiResponse<OfrostergroupsVo> update(OfrostergroupsDto ofrostergroupsDto){
            return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<OfrostergroupsVo>(){}.getType()));
            //OfrostergroupsEntity ofrostergroupsEntity = BeanUtils.copyAttrs(new OfrostergroupsEntity(), ofrostergroupsDto);
            //ofrostergroupsEntityRepo.save(ofrostergroupsEntity);
            //return ApiResponse.ok(BeanUtils.copyAttrs(new OfrostergroupsVo(),ofrostergroupsEntity));
      }

      /**
       * 通过主键获取对象
       * @param id 实体主键
       * @return ApiResponse<OfrostergroupsVo>
       */
       public ApiResponse<OfrostergroupsVo> findOne(String id){
             return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<OfrostergroupsVo>(){}.getType()));
             //OfrostergroupsEntity ofrostergroupsEntity = ofrostergroupsEntityRepo.findOne(id);
             //return ApiResponse.ok(BeanUtils.copyAttrs(new OfrostergroupsVo(),ofrostergroupsEntity));
       }

       /**
        * 默认查询所有列表，若要筛选列表，请增加过滤参数
        * @return ApiResponse<List<OfrostergroupsVo>>
        */
        public ApiResponse<List<OfrostergroupsVo>> findAll(){
               return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<List<OfrostergroupsVo>>(){}.getType()));
               //List<OfrostergroupsEntity> ofrostergroupsEntities = ofrostergroupsEntityRepo.findAll();
               //List<OfrostergroupsVo> ofrostergroupsVoList = new BeanListUtils<OfrostergroupsVo, OfrostergroupsEntity>(OfrostergroupsVo.class, ofrostergroupsEntities).getTargetList();
               //return ApiResponse.ok(ofrostergroupsVoList);
        }

        /**
         * 删除对应主键的数据
         * @return
         */
         public ApiResponse delete(String id){
                //ofrostergroupsEntityRepo.delete(id);
                return ApiResponse.prompt(Syscode.SC_OK);
         }

}