package com.jihai.mengmian1.service;

import com.google.common.reflect.TypeToken;
import com.jihai.mengmian.BeanUtils;
import com.jihai.mengmian.BeanListUtils;
import com.jihai.mengmian1.entity.TdalSetRoleServiceRelationEntity;
import com.jihai.mengmian1.repo.TdalSetRoleServiceRelationEntityRepo;
import com.jihai.mengmian1.vo.TdalSetRoleServiceRelationVo;
import com.jihai.mengmian1.dto.TdalSetRoleServiceRelationDto;
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
 * <b>Time：</b> 2017-12-07 16:39:08 <br>
 * <b>Contact：<b>wechat and phone number - 13826126615<br>
 */
@Service
public class TdalSetRoleServiceRelationService {
    @Autowired
    private TdalSetRoleServiceRelationEntityRepo tdalSetRoleServiceRelationEntityRepo;

    /**
     * 新增
     * @param tdalSetRoleServiceRelationDto
     * @return ApiResponse<TdalSetRoleServiceRelationVo>
     */
     public ApiResponse<TdalSetRoleServiceRelationVo> insert(TdalSetRoleServiceRelationDto tdalSetRoleServiceRelationDto){
           return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<TdalSetRoleServiceRelationVo>(){}.getType()));
           //TdalSetRoleServiceRelationEntity tdalSetRoleServiceRelationEntity = BeanUtils.copyAttrs(new TdalSetRoleServiceRelationEntity(), tdalSetRoleServiceRelationDto);
           //tdalSetRoleServiceRelationEntityRepo.save(tdalSetRoleServiceRelationEntity);
           //return ApiResponse.ok(BeanUtils.copyAttrs(new TdalSetRoleServiceRelationVo(),tdalSetRoleServiceRelationEntity));
     }


     /**
      * 修改
      * @param tdalSetRoleServiceRelationDto
      * @return ApiResponse<TdalSetRoleServiceRelationVo>
      */
      public ApiResponse<TdalSetRoleServiceRelationVo> update(TdalSetRoleServiceRelationDto tdalSetRoleServiceRelationDto){
            return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<TdalSetRoleServiceRelationVo>(){}.getType()));
            //TdalSetRoleServiceRelationEntity tdalSetRoleServiceRelationEntity = BeanUtils.copyAttrs(new TdalSetRoleServiceRelationEntity(), tdalSetRoleServiceRelationDto);
            //tdalSetRoleServiceRelationEntityRepo.save(tdalSetRoleServiceRelationEntity);
            //return ApiResponse.ok(BeanUtils.copyAttrs(new TdalSetRoleServiceRelationVo(),tdalSetRoleServiceRelationEntity));
      }

      /**
       * 通过主键获取对象
       * @param id 实体主键
       * @return ApiResponse<TdalSetRoleServiceRelationVo>
       */
       public ApiResponse<TdalSetRoleServiceRelationVo> findOne(String id){
             return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<TdalSetRoleServiceRelationVo>(){}.getType()));
             //TdalSetRoleServiceRelationEntity tdalSetRoleServiceRelationEntity = tdalSetRoleServiceRelationEntityRepo.findOne(id);
             //return ApiResponse.ok(BeanUtils.copyAttrs(new TdalSetRoleServiceRelationVo(),tdalSetRoleServiceRelationEntity));
       }

       /**
        * 默认查询所有列表，若要筛选列表，请增加过滤参数
        * @return ApiResponse<List<TdalSetRoleServiceRelationVo>>
        */
        public ApiResponse<List<TdalSetRoleServiceRelationVo>> findAll(){
               return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<List<TdalSetRoleServiceRelationVo>>(){}.getType()));
               //List<TdalSetRoleServiceRelationEntity> tdalSetRoleServiceRelationEntities = tdalSetRoleServiceRelationEntityRepo.findAll();
               //List<TdalSetRoleServiceRelationVo> tdalSetRoleServiceRelationVoList = new BeanListUtils<TdalSetRoleServiceRelationVo, TdalSetRoleServiceRelationEntity>(TdalSetRoleServiceRelationVo.class, tdalSetRoleServiceRelationEntities).getTargetList();
               //return ApiResponse.ok(tdalSetRoleServiceRelationVoList);
        }

        /**
         * 删除对应主键的数据
         * @return
         */
         public ApiResponse delete(String id){
                //tdalSetRoleServiceRelationEntityRepo.delete(id);
                return ApiResponse.prompt(Syscode.SC_OK);
         }

}