package com.jihai.mengmian1.service;

import com.google.common.reflect.TypeToken;
import com.jihai.mengmian.BeanUtils;
import com.jihai.mengmian.BeanListUtils;
import com.jihai.mengmian1.entity.TdalSetUserEntity;
import com.jihai.mengmian1.repo.TdalSetUserEntityRepo;
import com.jihai.mengmian1.vo.TdalSetUserVo;
import com.jihai.mengmian1.dto.TdalSetUserDto;
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
public class TdalSetUserService {
    @Autowired
    private TdalSetUserEntityRepo tdalSetUserEntityRepo;

    /**
     * 新增
     * @param tdalSetUserDto
     * @return ApiResponse<TdalSetUserVo>
     */
     public ApiResponse<TdalSetUserVo> insert(TdalSetUserDto tdalSetUserDto){
           return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<TdalSetUserVo>(){}.getType()));
           //TdalSetUserEntity tdalSetUserEntity = BeanUtils.copyAttrs(new TdalSetUserEntity(), tdalSetUserDto);
           //tdalSetUserEntityRepo.save(tdalSetUserEntity);
           //return ApiResponse.ok(BeanUtils.copyAttrs(new TdalSetUserVo(),tdalSetUserEntity));
     }


     /**
      * 修改
      * @param tdalSetUserDto
      * @return ApiResponse<TdalSetUserVo>
      */
      public ApiResponse<TdalSetUserVo> update(TdalSetUserDto tdalSetUserDto){
            return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<TdalSetUserVo>(){}.getType()));
            //TdalSetUserEntity tdalSetUserEntity = BeanUtils.copyAttrs(new TdalSetUserEntity(), tdalSetUserDto);
            //tdalSetUserEntityRepo.save(tdalSetUserEntity);
            //return ApiResponse.ok(BeanUtils.copyAttrs(new TdalSetUserVo(),tdalSetUserEntity));
      }

      /**
       * 通过主键获取对象
       * @param id 实体主键
       * @return ApiResponse<TdalSetUserVo>
       */
       public ApiResponse<TdalSetUserVo> findOne(String id){
             return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<TdalSetUserVo>(){}.getType()));
             //TdalSetUserEntity tdalSetUserEntity = tdalSetUserEntityRepo.findOne(id);
             //return ApiResponse.ok(BeanUtils.copyAttrs(new TdalSetUserVo(),tdalSetUserEntity));
       }

       /**
        * 默认查询所有列表，若要筛选列表，请增加过滤参数
        * @return ApiResponse<List<TdalSetUserVo>>
        */
        public ApiResponse<List<TdalSetUserVo>> findAll(){
               return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<List<TdalSetUserVo>>(){}.getType()));
               //List<TdalSetUserEntity> tdalSetUserEntities = tdalSetUserEntityRepo.findAll();
               //List<TdalSetUserVo> tdalSetUserVoList = new BeanListUtils<TdalSetUserVo, TdalSetUserEntity>(TdalSetUserVo.class, tdalSetUserEntities).getTargetList();
               //return ApiResponse.ok(tdalSetUserVoList);
        }

        /**
         * 删除对应主键的数据
         * @return
         */
         public ApiResponse delete(String id){
                //tdalSetUserEntityRepo.delete(id);
                return ApiResponse.prompt(Syscode.SC_OK);
         }

}