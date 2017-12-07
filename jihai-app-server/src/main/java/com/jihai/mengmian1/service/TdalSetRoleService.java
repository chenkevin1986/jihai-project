package com.jihai.mengmian1.service;

import com.google.common.reflect.TypeToken;
import com.jihai.mengmian.BeanUtils;
import com.jihai.mengmian.BeanListUtils;
import com.jihai.mengmian1.entity.TdalSetRoleEntity;
import com.jihai.mengmian1.repo.TdalSetRoleEntityRepo;
import com.jihai.mengmian1.vo.TdalSetRoleVo;
import com.jihai.mengmian1.dto.TdalSetRoleDto;
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
public class TdalSetRoleService {
    @Autowired
    private TdalSetRoleEntityRepo tdalSetRoleEntityRepo;

    /**
     * 新增
     * @param tdalSetRoleDto
     * @return ApiResponse<TdalSetRoleVo>
     */
     public ApiResponse<TdalSetRoleVo> insert(TdalSetRoleDto tdalSetRoleDto){
           return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<TdalSetRoleVo>(){}.getType()));
           //TdalSetRoleEntity tdalSetRoleEntity = BeanUtils.copyAttrs(new TdalSetRoleEntity(), tdalSetRoleDto);
           //tdalSetRoleEntityRepo.save(tdalSetRoleEntity);
           //return ApiResponse.ok(BeanUtils.copyAttrs(new TdalSetRoleVo(),tdalSetRoleEntity));
     }


     /**
      * 修改
      * @param tdalSetRoleDto
      * @return ApiResponse<TdalSetRoleVo>
      */
      public ApiResponse<TdalSetRoleVo> update(TdalSetRoleDto tdalSetRoleDto){
            return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<TdalSetRoleVo>(){}.getType()));
            //TdalSetRoleEntity tdalSetRoleEntity = BeanUtils.copyAttrs(new TdalSetRoleEntity(), tdalSetRoleDto);
            //tdalSetRoleEntityRepo.save(tdalSetRoleEntity);
            //return ApiResponse.ok(BeanUtils.copyAttrs(new TdalSetRoleVo(),tdalSetRoleEntity));
      }

      /**
       * 通过主键获取对象
       * @param id 实体主键
       * @return ApiResponse<TdalSetRoleVo>
       */
       public ApiResponse<TdalSetRoleVo> findOne(String id){
             return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<TdalSetRoleVo>(){}.getType()));
             //TdalSetRoleEntity tdalSetRoleEntity = tdalSetRoleEntityRepo.findOne(id);
             //return ApiResponse.ok(BeanUtils.copyAttrs(new TdalSetRoleVo(),tdalSetRoleEntity));
       }

       /**
        * 默认查询所有列表，若要筛选列表，请增加过滤参数
        * @return ApiResponse<List<TdalSetRoleVo>>
        */
        public ApiResponse<List<TdalSetRoleVo>> findAll(){
               return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<List<TdalSetRoleVo>>(){}.getType()));
               //List<TdalSetRoleEntity> tdalSetRoleEntities = tdalSetRoleEntityRepo.findAll();
               //List<TdalSetRoleVo> tdalSetRoleVoList = new BeanListUtils<TdalSetRoleVo, TdalSetRoleEntity>(TdalSetRoleVo.class, tdalSetRoleEntities).getTargetList();
               //return ApiResponse.ok(tdalSetRoleVoList);
        }

        /**
         * 删除对应主键的数据
         * @return
         */
         public ApiResponse delete(String id){
                //tdalSetRoleEntityRepo.delete(id);
                return ApiResponse.prompt(Syscode.SC_OK);
         }

}