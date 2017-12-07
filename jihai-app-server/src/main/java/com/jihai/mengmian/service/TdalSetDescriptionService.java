package com.jihai.mengmian.service;

import com.google.common.reflect.TypeToken;
import com.jihai.mengmian.BeanUtils;
import com.jihai.mengmian.BeanListUtils;
import com.jihai.mengmian.entity.TdalSetDescriptionEntity;
import com.jihai.mengmian.repo.TdalSetDescriptionEntityRepo;
import com.jihai.mengmian.vo.TdalSetDescriptionVo;
import com.jihai.mengmian.dto.TdalSetDescriptionDto;
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
public class TdalSetDescriptionService {
    @Autowired
    private TdalSetDescriptionEntityRepo tdalSetDescriptionEntityRepo;

    /**
     * 新增
     * @param tdalSetDescriptionDto
     * @return ApiResponse<TdalSetDescriptionVo>
     */
     public ApiResponse<TdalSetDescriptionVo> insert(TdalSetDescriptionDto tdalSetDescriptionDto){
           return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<TdalSetDescriptionVo>(){}.getType()));
           //TdalSetDescriptionEntity tdalSetDescriptionEntity = BeanUtils.copyAttrs(new TdalSetDescriptionEntity(), tdalSetDescriptionDto);
           //tdalSetDescriptionEntityRepo.save(tdalSetDescriptionEntity);
           //return ApiResponse.ok(BeanUtils.copyAttrs(new TdalSetDescriptionVo(),tdalSetDescriptionEntity));
     }


     /**
      * 修改
      * @param tdalSetDescriptionDto
      * @return ApiResponse<TdalSetDescriptionVo>
      */
      public ApiResponse<TdalSetDescriptionVo> update(TdalSetDescriptionDto tdalSetDescriptionDto){
            return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<TdalSetDescriptionVo>(){}.getType()));
            //TdalSetDescriptionEntity tdalSetDescriptionEntity = BeanUtils.copyAttrs(new TdalSetDescriptionEntity(), tdalSetDescriptionDto);
            //tdalSetDescriptionEntityRepo.save(tdalSetDescriptionEntity);
            //return ApiResponse.ok(BeanUtils.copyAttrs(new TdalSetDescriptionVo(),tdalSetDescriptionEntity));
      }

      /**
       * 通过主键获取对象
       * @param id 实体主键
       * @return ApiResponse<TdalSetDescriptionVo>
       */
       public ApiResponse<TdalSetDescriptionVo> findOne(String id){
             return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<TdalSetDescriptionVo>(){}.getType()));
             //TdalSetDescriptionEntity tdalSetDescriptionEntity = tdalSetDescriptionEntityRepo.findOne(id);
             //return ApiResponse.ok(BeanUtils.copyAttrs(new TdalSetDescriptionVo(),tdalSetDescriptionEntity));
       }

       /**
        * 默认查询所有列表，若要筛选列表，请增加过滤参数
        * @return ApiResponse<List<TdalSetDescriptionVo>>
        */
        public ApiResponse<List<TdalSetDescriptionVo>> findAll(){
               return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<List<TdalSetDescriptionVo>>(){}.getType()));
               //List<TdalSetDescriptionEntity> tdalSetDescriptionEntities = tdalSetDescriptionEntityRepo.findAll();
               //List<TdalSetDescriptionVo> tdalSetDescriptionVoList = new BeanListUtils<TdalSetDescriptionVo, TdalSetDescriptionEntity>(TdalSetDescriptionVo.class, tdalSetDescriptionEntities).getTargetList();
               //return ApiResponse.ok(tdalSetDescriptionVoList);
        }

        /**
         * 删除对应主键的数据
         * @return
         */
         public ApiResponse delete(String id){
                //tdalSetDescriptionEntityRepo.delete(id);
                return ApiResponse.prompt(Syscode.SC_OK);
         }

}