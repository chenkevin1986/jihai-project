package com.jihai.mengmian1.service;

import com.google.common.reflect.TypeToken;
import com.jihai.mengmian.BeanUtils;
import com.jihai.mengmian.BeanListUtils;
import com.jihai.mengmian1.entity.TwebConfigInfoEntity;
import com.jihai.mengmian1.repo.TwebConfigInfoEntityRepo;
import com.jihai.mengmian1.vo.TwebConfigInfoVo;
import com.jihai.mengmian1.dto.TwebConfigInfoDto;
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
public class TwebConfigInfoService {
    @Autowired
    private TwebConfigInfoEntityRepo twebConfigInfoEntityRepo;

    /**
     * 新增
     * @param twebConfigInfoDto
     * @return ApiResponse<TwebConfigInfoVo>
     */
     public ApiResponse<TwebConfigInfoVo> insert(TwebConfigInfoDto twebConfigInfoDto){
           return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<TwebConfigInfoVo>(){}.getType()));
           //TwebConfigInfoEntity twebConfigInfoEntity = BeanUtils.copyAttrs(new TwebConfigInfoEntity(), twebConfigInfoDto);
           //twebConfigInfoEntityRepo.save(twebConfigInfoEntity);
           //return ApiResponse.ok(BeanUtils.copyAttrs(new TwebConfigInfoVo(),twebConfigInfoEntity));
     }


     /**
      * 修改
      * @param twebConfigInfoDto
      * @return ApiResponse<TwebConfigInfoVo>
      */
      public ApiResponse<TwebConfigInfoVo> update(TwebConfigInfoDto twebConfigInfoDto){
            return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<TwebConfigInfoVo>(){}.getType()));
            //TwebConfigInfoEntity twebConfigInfoEntity = BeanUtils.copyAttrs(new TwebConfigInfoEntity(), twebConfigInfoDto);
            //twebConfigInfoEntityRepo.save(twebConfigInfoEntity);
            //return ApiResponse.ok(BeanUtils.copyAttrs(new TwebConfigInfoVo(),twebConfigInfoEntity));
      }

      /**
       * 通过主键获取对象
       * @param id 实体主键
       * @return ApiResponse<TwebConfigInfoVo>
       */
       public ApiResponse<TwebConfigInfoVo> findOne(String id){
             return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<TwebConfigInfoVo>(){}.getType()));
             //TwebConfigInfoEntity twebConfigInfoEntity = twebConfigInfoEntityRepo.findOne(id);
             //return ApiResponse.ok(BeanUtils.copyAttrs(new TwebConfigInfoVo(),twebConfigInfoEntity));
       }

       /**
        * 默认查询所有列表，若要筛选列表，请增加过滤参数
        * @return ApiResponse<List<TwebConfigInfoVo>>
        */
        public ApiResponse<List<TwebConfigInfoVo>> findAll(){
               return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<List<TwebConfigInfoVo>>(){}.getType()));
               //List<TwebConfigInfoEntity> twebConfigInfoEntities = twebConfigInfoEntityRepo.findAll();
               //List<TwebConfigInfoVo> twebConfigInfoVoList = new BeanListUtils<TwebConfigInfoVo, TwebConfigInfoEntity>(TwebConfigInfoVo.class, twebConfigInfoEntities).getTargetList();
               //return ApiResponse.ok(twebConfigInfoVoList);
        }

        /**
         * 删除对应主键的数据
         * @return
         */
         public ApiResponse delete(String id){
                //twebConfigInfoEntityRepo.delete(id);
                return ApiResponse.prompt(Syscode.SC_OK);
         }

}