package com.jihai.mengmian1.service;

import com.google.common.reflect.TypeToken;
import com.jihai.mengmian.BeanUtils;
import com.jihai.mengmian.BeanListUtils;
import com.jihai.mengmian1.entity.TPlateAutoVerifyEntity;
import com.jihai.mengmian1.repo.TPlateAutoVerifyEntityRepo;
import com.jihai.mengmian1.vo.TPlateAutoVerifyVo;
import com.jihai.mengmian1.dto.TPlateAutoVerifyDto;
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
public class TPlateAutoVerifyService {
    @Autowired
    private TPlateAutoVerifyEntityRepo tPlateAutoVerifyEntityRepo;

    /**
     * 新增
     * @param tPlateAutoVerifyDto
     * @return ApiResponse<TPlateAutoVerifyVo>
     */
     public ApiResponse<TPlateAutoVerifyVo> insert(TPlateAutoVerifyDto tPlateAutoVerifyDto){
           return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<TPlateAutoVerifyVo>(){}.getType()));
           //TPlateAutoVerifyEntity tPlateAutoVerifyEntity = BeanUtils.copyAttrs(new TPlateAutoVerifyEntity(), tPlateAutoVerifyDto);
           //tPlateAutoVerifyEntityRepo.save(tPlateAutoVerifyEntity);
           //return ApiResponse.ok(BeanUtils.copyAttrs(new TPlateAutoVerifyVo(),tPlateAutoVerifyEntity));
     }


     /**
      * 修改
      * @param tPlateAutoVerifyDto
      * @return ApiResponse<TPlateAutoVerifyVo>
      */
      public ApiResponse<TPlateAutoVerifyVo> update(TPlateAutoVerifyDto tPlateAutoVerifyDto){
            return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<TPlateAutoVerifyVo>(){}.getType()));
            //TPlateAutoVerifyEntity tPlateAutoVerifyEntity = BeanUtils.copyAttrs(new TPlateAutoVerifyEntity(), tPlateAutoVerifyDto);
            //tPlateAutoVerifyEntityRepo.save(tPlateAutoVerifyEntity);
            //return ApiResponse.ok(BeanUtils.copyAttrs(new TPlateAutoVerifyVo(),tPlateAutoVerifyEntity));
      }

      /**
       * 通过主键获取对象
       * @param id 实体主键
       * @return ApiResponse<TPlateAutoVerifyVo>
       */
       public ApiResponse<TPlateAutoVerifyVo> findOne(String id){
             return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<TPlateAutoVerifyVo>(){}.getType()));
             //TPlateAutoVerifyEntity tPlateAutoVerifyEntity = tPlateAutoVerifyEntityRepo.findOne(id);
             //return ApiResponse.ok(BeanUtils.copyAttrs(new TPlateAutoVerifyVo(),tPlateAutoVerifyEntity));
       }

       /**
        * 默认查询所有列表，若要筛选列表，请增加过滤参数
        * @return ApiResponse<List<TPlateAutoVerifyVo>>
        */
        public ApiResponse<List<TPlateAutoVerifyVo>> findAll(){
               return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<List<TPlateAutoVerifyVo>>(){}.getType()));
               //List<TPlateAutoVerifyEntity> tPlateAutoVerifyEntities = tPlateAutoVerifyEntityRepo.findAll();
               //List<TPlateAutoVerifyVo> tPlateAutoVerifyVoList = new BeanListUtils<TPlateAutoVerifyVo, TPlateAutoVerifyEntity>(TPlateAutoVerifyVo.class, tPlateAutoVerifyEntities).getTargetList();
               //return ApiResponse.ok(tPlateAutoVerifyVoList);
        }

        /**
         * 删除对应主键的数据
         * @return
         */
         public ApiResponse delete(String id){
                //tPlateAutoVerifyEntityRepo.delete(id);
                return ApiResponse.prompt(Syscode.SC_OK);
         }

}