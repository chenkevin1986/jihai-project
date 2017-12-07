package com.jihai.mengmian.service;

import com.google.common.reflect.TypeToken;
import com.jihai.mengmian.BeanUtils;
import com.jihai.mengmian.BeanListUtils;
import com.jihai.mengmian.entity.TglobalEntity;
import com.jihai.mengmian.repo.TglobalEntityRepo;
import com.jihai.mengmian.vo.TglobalVo;
import com.jihai.mengmian.dto.TglobalDto;
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
public class TglobalService {
    @Autowired
    private TglobalEntityRepo tglobalEntityRepo;

    /**
     * 新增
     * @param tglobalDto
     * @return ApiResponse<TglobalVo>
     */
     public ApiResponse<TglobalVo> insert(TglobalDto tglobalDto){
           return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<TglobalVo>(){}.getType()));
           //TglobalEntity tglobalEntity = BeanUtils.copyAttrs(new TglobalEntity(), tglobalDto);
           //tglobalEntityRepo.save(tglobalEntity);
           //return ApiResponse.ok(BeanUtils.copyAttrs(new TglobalVo(),tglobalEntity));
     }


     /**
      * 修改
      * @param tglobalDto
      * @return ApiResponse<TglobalVo>
      */
      public ApiResponse<TglobalVo> update(TglobalDto tglobalDto){
            return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<TglobalVo>(){}.getType()));
            //TglobalEntity tglobalEntity = BeanUtils.copyAttrs(new TglobalEntity(), tglobalDto);
            //tglobalEntityRepo.save(tglobalEntity);
            //return ApiResponse.ok(BeanUtils.copyAttrs(new TglobalVo(),tglobalEntity));
      }

      /**
       * 通过主键获取对象
       * @param id 实体主键
       * @return ApiResponse<TglobalVo>
       */
       public ApiResponse<TglobalVo> findOne(String id){
             return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<TglobalVo>(){}.getType()));
             //TglobalEntity tglobalEntity = tglobalEntityRepo.findOne(id);
             //return ApiResponse.ok(BeanUtils.copyAttrs(new TglobalVo(),tglobalEntity));
       }

       /**
        * 默认查询所有列表，若要筛选列表，请增加过滤参数
        * @return ApiResponse<List<TglobalVo>>
        */
        public ApiResponse<List<TglobalVo>> findAll(){
               return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<List<TglobalVo>>(){}.getType()));
               //List<TglobalEntity> tglobalEntities = tglobalEntityRepo.findAll();
               //List<TglobalVo> tglobalVoList = new BeanListUtils<TglobalVo, TglobalEntity>(TglobalVo.class, tglobalEntities).getTargetList();
               //return ApiResponse.ok(tglobalVoList);
        }

        /**
         * 删除对应主键的数据
         * @return
         */
         public ApiResponse delete(String id){
                //tglobalEntityRepo.delete(id);
                return ApiResponse.prompt(Syscode.SC_OK);
         }

}