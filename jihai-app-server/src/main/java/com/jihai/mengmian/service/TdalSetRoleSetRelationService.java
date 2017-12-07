package com.jihai.mengmian.service;

import com.google.common.reflect.TypeToken;
import com.jihai.mengmian.BeanUtils;
import com.jihai.mengmian.BeanListUtils;
import com.jihai.mengmian.entity.TdalSetRoleSetRelationEntity;
import com.jihai.mengmian.repo.TdalSetRoleSetRelationEntityRepo;
import com.jihai.mengmian.vo.TdalSetRoleSetRelationVo;
import com.jihai.mengmian.dto.TdalSetRoleSetRelationDto;
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
public class TdalSetRoleSetRelationService {
    @Autowired
    private TdalSetRoleSetRelationEntityRepo tdalSetRoleSetRelationEntityRepo;

    /**
     * 新增
     * @param tdalSetRoleSetRelationDto
     * @return ApiResponse<TdalSetRoleSetRelationVo>
     */
     public ApiResponse<TdalSetRoleSetRelationVo> insert(TdalSetRoleSetRelationDto tdalSetRoleSetRelationDto){
           return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<TdalSetRoleSetRelationVo>(){}.getType()));
           //TdalSetRoleSetRelationEntity tdalSetRoleSetRelationEntity = BeanUtils.copyAttrs(new TdalSetRoleSetRelationEntity(), tdalSetRoleSetRelationDto);
           //tdalSetRoleSetRelationEntityRepo.save(tdalSetRoleSetRelationEntity);
           //return ApiResponse.ok(BeanUtils.copyAttrs(new TdalSetRoleSetRelationVo(),tdalSetRoleSetRelationEntity));
     }


     /**
      * 修改
      * @param tdalSetRoleSetRelationDto
      * @return ApiResponse<TdalSetRoleSetRelationVo>
      */
      public ApiResponse<TdalSetRoleSetRelationVo> update(TdalSetRoleSetRelationDto tdalSetRoleSetRelationDto){
            return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<TdalSetRoleSetRelationVo>(){}.getType()));
            //TdalSetRoleSetRelationEntity tdalSetRoleSetRelationEntity = BeanUtils.copyAttrs(new TdalSetRoleSetRelationEntity(), tdalSetRoleSetRelationDto);
            //tdalSetRoleSetRelationEntityRepo.save(tdalSetRoleSetRelationEntity);
            //return ApiResponse.ok(BeanUtils.copyAttrs(new TdalSetRoleSetRelationVo(),tdalSetRoleSetRelationEntity));
      }

      /**
       * 通过主键获取对象
       * @param id 实体主键
       * @return ApiResponse<TdalSetRoleSetRelationVo>
       */
       public ApiResponse<TdalSetRoleSetRelationVo> findOne(String id){
             return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<TdalSetRoleSetRelationVo>(){}.getType()));
             //TdalSetRoleSetRelationEntity tdalSetRoleSetRelationEntity = tdalSetRoleSetRelationEntityRepo.findOne(id);
             //return ApiResponse.ok(BeanUtils.copyAttrs(new TdalSetRoleSetRelationVo(),tdalSetRoleSetRelationEntity));
       }

       /**
        * 默认查询所有列表，若要筛选列表，请增加过滤参数
        * @return ApiResponse<List<TdalSetRoleSetRelationVo>>
        */
        public ApiResponse<List<TdalSetRoleSetRelationVo>> findAll(){
               return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<List<TdalSetRoleSetRelationVo>>(){}.getType()));
               //List<TdalSetRoleSetRelationEntity> tdalSetRoleSetRelationEntities = tdalSetRoleSetRelationEntityRepo.findAll();
               //List<TdalSetRoleSetRelationVo> tdalSetRoleSetRelationVoList = new BeanListUtils<TdalSetRoleSetRelationVo, TdalSetRoleSetRelationEntity>(TdalSetRoleSetRelationVo.class, tdalSetRoleSetRelationEntities).getTargetList();
               //return ApiResponse.ok(tdalSetRoleSetRelationVoList);
        }

        /**
         * 删除对应主键的数据
         * @return
         */
         public ApiResponse delete(String id){
                //tdalSetRoleSetRelationEntityRepo.delete(id);
                return ApiResponse.prompt(Syscode.SC_OK);
         }

}