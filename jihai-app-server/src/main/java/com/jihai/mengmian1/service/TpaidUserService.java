package com.jihai.mengmian1.service;

import com.google.common.reflect.TypeToken;
import com.jihai.mengmian.BeanUtils;
import com.jihai.mengmian.BeanListUtils;
import com.jihai.mengmian1.entity.TpaidUserEntity;
import com.jihai.mengmian1.repo.TpaidUserEntityRepo;
import com.jihai.mengmian1.vo.TpaidUserVo;
import com.jihai.mengmian1.dto.TpaidUserDto;
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
public class TpaidUserService {
    @Autowired
    private TpaidUserEntityRepo tpaidUserEntityRepo;

    /**
     * 新增
     * @param tpaidUserDto
     * @return ApiResponse<TpaidUserVo>
     */
     public ApiResponse<TpaidUserVo> insert(TpaidUserDto tpaidUserDto){
           return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<TpaidUserVo>(){}.getType()));
           //TpaidUserEntity tpaidUserEntity = BeanUtils.copyAttrs(new TpaidUserEntity(), tpaidUserDto);
           //tpaidUserEntityRepo.save(tpaidUserEntity);
           //return ApiResponse.ok(BeanUtils.copyAttrs(new TpaidUserVo(),tpaidUserEntity));
     }


     /**
      * 修改
      * @param tpaidUserDto
      * @return ApiResponse<TpaidUserVo>
      */
      public ApiResponse<TpaidUserVo> update(TpaidUserDto tpaidUserDto){
            return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<TpaidUserVo>(){}.getType()));
            //TpaidUserEntity tpaidUserEntity = BeanUtils.copyAttrs(new TpaidUserEntity(), tpaidUserDto);
            //tpaidUserEntityRepo.save(tpaidUserEntity);
            //return ApiResponse.ok(BeanUtils.copyAttrs(new TpaidUserVo(),tpaidUserEntity));
      }

      /**
       * 通过主键获取对象
       * @param id 实体主键
       * @return ApiResponse<TpaidUserVo>
       */
       public ApiResponse<TpaidUserVo> findOne(String id){
             return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<TpaidUserVo>(){}.getType()));
             //TpaidUserEntity tpaidUserEntity = tpaidUserEntityRepo.findOne(id);
             //return ApiResponse.ok(BeanUtils.copyAttrs(new TpaidUserVo(),tpaidUserEntity));
       }

       /**
        * 默认查询所有列表，若要筛选列表，请增加过滤参数
        * @return ApiResponse<List<TpaidUserVo>>
        */
        public ApiResponse<List<TpaidUserVo>> findAll(){
               return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<List<TpaidUserVo>>(){}.getType()));
               //List<TpaidUserEntity> tpaidUserEntities = tpaidUserEntityRepo.findAll();
               //List<TpaidUserVo> tpaidUserVoList = new BeanListUtils<TpaidUserVo, TpaidUserEntity>(TpaidUserVo.class, tpaidUserEntities).getTargetList();
               //return ApiResponse.ok(tpaidUserVoList);
        }

        /**
         * 删除对应主键的数据
         * @return
         */
         public ApiResponse delete(String id){
                //tpaidUserEntityRepo.delete(id);
                return ApiResponse.prompt(Syscode.SC_OK);
         }

}