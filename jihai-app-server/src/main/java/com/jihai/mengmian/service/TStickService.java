package com.jihai.mengmian.service;

import com.google.common.reflect.TypeToken;
import com.jihai.mengmian.BeanUtils;
import com.jihai.mengmian.BeanListUtils;
import com.jihai.mengmian.entity.TStickEntity;
import com.jihai.mengmian.repo.TStickEntityRepo;
import com.jihai.mengmian.vo.TStickVo;
import com.jihai.mengmian.dto.TStickDto;
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
public class TStickService {
    @Autowired
    private TStickEntityRepo tStickEntityRepo;

    /**
     * 新增
     * @param tStickDto
     * @return ApiResponse<TStickVo>
     */
     public ApiResponse<TStickVo> insert(TStickDto tStickDto){
           return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<TStickVo>(){}.getType()));
           //TStickEntity tStickEntity = BeanUtils.copyAttrs(new TStickEntity(), tStickDto);
           //tStickEntityRepo.save(tStickEntity);
           //return ApiResponse.ok(BeanUtils.copyAttrs(new TStickVo(),tStickEntity));
     }


     /**
      * 修改
      * @param tStickDto
      * @return ApiResponse<TStickVo>
      */
      public ApiResponse<TStickVo> update(TStickDto tStickDto){
            return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<TStickVo>(){}.getType()));
            //TStickEntity tStickEntity = BeanUtils.copyAttrs(new TStickEntity(), tStickDto);
            //tStickEntityRepo.save(tStickEntity);
            //return ApiResponse.ok(BeanUtils.copyAttrs(new TStickVo(),tStickEntity));
      }

      /**
       * 通过主键获取对象
       * @param id 实体主键
       * @return ApiResponse<TStickVo>
       */
       public ApiResponse<TStickVo> findOne(String id){
             return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<TStickVo>(){}.getType()));
             //TStickEntity tStickEntity = tStickEntityRepo.findOne(id);
             //return ApiResponse.ok(BeanUtils.copyAttrs(new TStickVo(),tStickEntity));
       }

       /**
        * 默认查询所有列表，若要筛选列表，请增加过滤参数
        * @return ApiResponse<List<TStickVo>>
        */
        public ApiResponse<List<TStickVo>> findAll(){
               return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<List<TStickVo>>(){}.getType()));
               //List<TStickEntity> tStickEntities = tStickEntityRepo.findAll();
               //List<TStickVo> tStickVoList = new BeanListUtils<TStickVo, TStickEntity>(TStickVo.class, tStickEntities).getTargetList();
               //return ApiResponse.ok(tStickVoList);
        }

        /**
         * 删除对应主键的数据
         * @return
         */
         public ApiResponse delete(String id){
                //tStickEntityRepo.delete(id);
                return ApiResponse.prompt(Syscode.SC_OK);
         }

}