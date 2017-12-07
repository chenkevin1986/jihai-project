package com.jihai.mengmian1.service;

import com.google.common.reflect.TypeToken;
import com.jihai.mengmian.BeanUtils;
import com.jihai.mengmian.BeanListUtils;
import com.jihai.mengmian1.entity.TPlateEntity;
import com.jihai.mengmian1.repo.TPlateEntityRepo;
import com.jihai.mengmian1.vo.TPlateVo;
import com.jihai.mengmian1.dto.TPlateDto;
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
public class TPlateService {
    @Autowired
    private TPlateEntityRepo tPlateEntityRepo;

    /**
     * 新增
     * @param tPlateDto
     * @return ApiResponse<TPlateVo>
     */
     public ApiResponse<TPlateVo> insert(TPlateDto tPlateDto){
           return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<TPlateVo>(){}.getType()));
           //TPlateEntity tPlateEntity = BeanUtils.copyAttrs(new TPlateEntity(), tPlateDto);
           //tPlateEntityRepo.save(tPlateEntity);
           //return ApiResponse.ok(BeanUtils.copyAttrs(new TPlateVo(),tPlateEntity));
     }


     /**
      * 修改
      * @param tPlateDto
      * @return ApiResponse<TPlateVo>
      */
      public ApiResponse<TPlateVo> update(TPlateDto tPlateDto){
            return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<TPlateVo>(){}.getType()));
            //TPlateEntity tPlateEntity = BeanUtils.copyAttrs(new TPlateEntity(), tPlateDto);
            //tPlateEntityRepo.save(tPlateEntity);
            //return ApiResponse.ok(BeanUtils.copyAttrs(new TPlateVo(),tPlateEntity));
      }

      /**
       * 通过主键获取对象
       * @param id 实体主键
       * @return ApiResponse<TPlateVo>
       */
       public ApiResponse<TPlateVo> findOne(String id){
             return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<TPlateVo>(){}.getType()));
             //TPlateEntity tPlateEntity = tPlateEntityRepo.findOne(id);
             //return ApiResponse.ok(BeanUtils.copyAttrs(new TPlateVo(),tPlateEntity));
       }

       /**
        * 默认查询所有列表，若要筛选列表，请增加过滤参数
        * @return ApiResponse<List<TPlateVo>>
        */
        public ApiResponse<List<TPlateVo>> findAll(){
               return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<List<TPlateVo>>(){}.getType()));
               //List<TPlateEntity> tPlateEntities = tPlateEntityRepo.findAll();
               //List<TPlateVo> tPlateVoList = new BeanListUtils<TPlateVo, TPlateEntity>(TPlateVo.class, tPlateEntities).getTargetList();
               //return ApiResponse.ok(tPlateVoList);
        }

        /**
         * 删除对应主键的数据
         * @return
         */
         public ApiResponse delete(String id){
                //tPlateEntityRepo.delete(id);
                return ApiResponse.prompt(Syscode.SC_OK);
         }

}