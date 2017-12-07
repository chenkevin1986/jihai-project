package com.jihai.mengmian1.service;

import com.google.common.reflect.TypeToken;
import com.jihai.mengmian.BeanUtils;
import com.jihai.mengmian.BeanListUtils;
import com.jihai.mengmian1.entity.OfofflineEntity;
import com.jihai.mengmian1.repo.OfofflineEntityRepo;
import com.jihai.mengmian1.vo.OfofflineVo;
import com.jihai.mengmian1.dto.OfofflineDto;
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
public class OfofflineService {
    @Autowired
    private OfofflineEntityRepo ofofflineEntityRepo;

    /**
     * 新增
     * @param ofofflineDto
     * @return ApiResponse<OfofflineVo>
     */
     public ApiResponse<OfofflineVo> insert(OfofflineDto ofofflineDto){
           return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<OfofflineVo>(){}.getType()));
           //OfofflineEntity ofofflineEntity = BeanUtils.copyAttrs(new OfofflineEntity(), ofofflineDto);
           //ofofflineEntityRepo.save(ofofflineEntity);
           //return ApiResponse.ok(BeanUtils.copyAttrs(new OfofflineVo(),ofofflineEntity));
     }


     /**
      * 修改
      * @param ofofflineDto
      * @return ApiResponse<OfofflineVo>
      */
      public ApiResponse<OfofflineVo> update(OfofflineDto ofofflineDto){
            return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<OfofflineVo>(){}.getType()));
            //OfofflineEntity ofofflineEntity = BeanUtils.copyAttrs(new OfofflineEntity(), ofofflineDto);
            //ofofflineEntityRepo.save(ofofflineEntity);
            //return ApiResponse.ok(BeanUtils.copyAttrs(new OfofflineVo(),ofofflineEntity));
      }

      /**
       * 通过主键获取对象
       * @param id 实体主键
       * @return ApiResponse<OfofflineVo>
       */
       public ApiResponse<OfofflineVo> findOne(String id){
             return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<OfofflineVo>(){}.getType()));
             //OfofflineEntity ofofflineEntity = ofofflineEntityRepo.findOne(id);
             //return ApiResponse.ok(BeanUtils.copyAttrs(new OfofflineVo(),ofofflineEntity));
       }

       /**
        * 默认查询所有列表，若要筛选列表，请增加过滤参数
        * @return ApiResponse<List<OfofflineVo>>
        */
        public ApiResponse<List<OfofflineVo>> findAll(){
               return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<List<OfofflineVo>>(){}.getType()));
               //List<OfofflineEntity> ofofflineEntities = ofofflineEntityRepo.findAll();
               //List<OfofflineVo> ofofflineVoList = new BeanListUtils<OfofflineVo, OfofflineEntity>(OfofflineVo.class, ofofflineEntities).getTargetList();
               //return ApiResponse.ok(ofofflineVoList);
        }

        /**
         * 删除对应主键的数据
         * @return
         */
         public ApiResponse delete(String id){
                //ofofflineEntityRepo.delete(id);
                return ApiResponse.prompt(Syscode.SC_OK);
         }

}