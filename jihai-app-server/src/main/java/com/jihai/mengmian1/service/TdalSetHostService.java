package com.jihai.mengmian1.service;

import com.google.common.reflect.TypeToken;
import com.jihai.mengmian.BeanUtils;
import com.jihai.mengmian.BeanListUtils;
import com.jihai.mengmian1.entity.TdalSetHostEntity;
import com.jihai.mengmian1.repo.TdalSetHostEntityRepo;
import com.jihai.mengmian1.vo.TdalSetHostVo;
import com.jihai.mengmian1.dto.TdalSetHostDto;
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
public class TdalSetHostService {
    @Autowired
    private TdalSetHostEntityRepo tdalSetHostEntityRepo;

    /**
     * 新增
     * @param tdalSetHostDto
     * @return ApiResponse<TdalSetHostVo>
     */
     public ApiResponse<TdalSetHostVo> insert(TdalSetHostDto tdalSetHostDto){
           return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<TdalSetHostVo>(){}.getType()));
           //TdalSetHostEntity tdalSetHostEntity = BeanUtils.copyAttrs(new TdalSetHostEntity(), tdalSetHostDto);
           //tdalSetHostEntityRepo.save(tdalSetHostEntity);
           //return ApiResponse.ok(BeanUtils.copyAttrs(new TdalSetHostVo(),tdalSetHostEntity));
     }


     /**
      * 修改
      * @param tdalSetHostDto
      * @return ApiResponse<TdalSetHostVo>
      */
      public ApiResponse<TdalSetHostVo> update(TdalSetHostDto tdalSetHostDto){
            return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<TdalSetHostVo>(){}.getType()));
            //TdalSetHostEntity tdalSetHostEntity = BeanUtils.copyAttrs(new TdalSetHostEntity(), tdalSetHostDto);
            //tdalSetHostEntityRepo.save(tdalSetHostEntity);
            //return ApiResponse.ok(BeanUtils.copyAttrs(new TdalSetHostVo(),tdalSetHostEntity));
      }

      /**
       * 通过主键获取对象
       * @param id 实体主键
       * @return ApiResponse<TdalSetHostVo>
       */
       public ApiResponse<TdalSetHostVo> findOne(String id){
             return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<TdalSetHostVo>(){}.getType()));
             //TdalSetHostEntity tdalSetHostEntity = tdalSetHostEntityRepo.findOne(id);
             //return ApiResponse.ok(BeanUtils.copyAttrs(new TdalSetHostVo(),tdalSetHostEntity));
       }

       /**
        * 默认查询所有列表，若要筛选列表，请增加过滤参数
        * @return ApiResponse<List<TdalSetHostVo>>
        */
        public ApiResponse<List<TdalSetHostVo>> findAll(){
               return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<List<TdalSetHostVo>>(){}.getType()));
               //List<TdalSetHostEntity> tdalSetHostEntities = tdalSetHostEntityRepo.findAll();
               //List<TdalSetHostVo> tdalSetHostVoList = new BeanListUtils<TdalSetHostVo, TdalSetHostEntity>(TdalSetHostVo.class, tdalSetHostEntities).getTargetList();
               //return ApiResponse.ok(tdalSetHostVoList);
        }

        /**
         * 删除对应主键的数据
         * @return
         */
         public ApiResponse delete(String id){
                //tdalSetHostEntityRepo.delete(id);
                return ApiResponse.prompt(Syscode.SC_OK);
         }

}