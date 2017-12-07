package com.jihai.mengmian1.service;

import com.google.common.reflect.TypeToken;
import com.jihai.mengmian.BeanUtils;
import com.jihai.mengmian.BeanListUtils;
import com.jihai.mengmian1.entity.TdalSetRoleTableRelationEntity;
import com.jihai.mengmian1.repo.TdalSetRoleTableRelationEntityRepo;
import com.jihai.mengmian1.vo.TdalSetRoleTableRelationVo;
import com.jihai.mengmian1.dto.TdalSetRoleTableRelationDto;
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
public class TdalSetRoleTableRelationService {
    @Autowired
    private TdalSetRoleTableRelationEntityRepo tdalSetRoleTableRelationEntityRepo;

    /**
     * 新增
     * @param tdalSetRoleTableRelationDto
     * @return ApiResponse<TdalSetRoleTableRelationVo>
     */
     public ApiResponse<TdalSetRoleTableRelationVo> insert(TdalSetRoleTableRelationDto tdalSetRoleTableRelationDto){
           return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<TdalSetRoleTableRelationVo>(){}.getType()));
           //TdalSetRoleTableRelationEntity tdalSetRoleTableRelationEntity = BeanUtils.copyAttrs(new TdalSetRoleTableRelationEntity(), tdalSetRoleTableRelationDto);
           //tdalSetRoleTableRelationEntityRepo.save(tdalSetRoleTableRelationEntity);
           //return ApiResponse.ok(BeanUtils.copyAttrs(new TdalSetRoleTableRelationVo(),tdalSetRoleTableRelationEntity));
     }


     /**
      * 修改
      * @param tdalSetRoleTableRelationDto
      * @return ApiResponse<TdalSetRoleTableRelationVo>
      */
      public ApiResponse<TdalSetRoleTableRelationVo> update(TdalSetRoleTableRelationDto tdalSetRoleTableRelationDto){
            return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<TdalSetRoleTableRelationVo>(){}.getType()));
            //TdalSetRoleTableRelationEntity tdalSetRoleTableRelationEntity = BeanUtils.copyAttrs(new TdalSetRoleTableRelationEntity(), tdalSetRoleTableRelationDto);
            //tdalSetRoleTableRelationEntityRepo.save(tdalSetRoleTableRelationEntity);
            //return ApiResponse.ok(BeanUtils.copyAttrs(new TdalSetRoleTableRelationVo(),tdalSetRoleTableRelationEntity));
      }

      /**
       * 通过主键获取对象
       * @param id 实体主键
       * @return ApiResponse<TdalSetRoleTableRelationVo>
       */
       public ApiResponse<TdalSetRoleTableRelationVo> findOne(String id){
             return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<TdalSetRoleTableRelationVo>(){}.getType()));
             //TdalSetRoleTableRelationEntity tdalSetRoleTableRelationEntity = tdalSetRoleTableRelationEntityRepo.findOne(id);
             //return ApiResponse.ok(BeanUtils.copyAttrs(new TdalSetRoleTableRelationVo(),tdalSetRoleTableRelationEntity));
       }

       /**
        * 默认查询所有列表，若要筛选列表，请增加过滤参数
        * @return ApiResponse<List<TdalSetRoleTableRelationVo>>
        */
        public ApiResponse<List<TdalSetRoleTableRelationVo>> findAll(){
               return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<List<TdalSetRoleTableRelationVo>>(){}.getType()));
               //List<TdalSetRoleTableRelationEntity> tdalSetRoleTableRelationEntities = tdalSetRoleTableRelationEntityRepo.findAll();
               //List<TdalSetRoleTableRelationVo> tdalSetRoleTableRelationVoList = new BeanListUtils<TdalSetRoleTableRelationVo, TdalSetRoleTableRelationEntity>(TdalSetRoleTableRelationVo.class, tdalSetRoleTableRelationEntities).getTargetList();
               //return ApiResponse.ok(tdalSetRoleTableRelationVoList);
        }

        /**
         * 删除对应主键的数据
         * @return
         */
         public ApiResponse delete(String id){
                //tdalSetRoleTableRelationEntityRepo.delete(id);
                return ApiResponse.prompt(Syscode.SC_OK);
         }

}