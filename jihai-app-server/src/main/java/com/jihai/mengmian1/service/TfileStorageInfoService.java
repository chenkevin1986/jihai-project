package com.jihai.mengmian1.service;

import com.google.common.reflect.TypeToken;
import com.jihai.mengmian.BeanUtils;
import com.jihai.mengmian.BeanListUtils;
import com.jihai.mengmian1.entity.TfileStorageInfoEntity;
import com.jihai.mengmian1.repo.TfileStorageInfoEntityRepo;
import com.jihai.mengmian1.vo.TfileStorageInfoVo;
import com.jihai.mengmian1.dto.TfileStorageInfoDto;
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
public class TfileStorageInfoService {
    @Autowired
    private TfileStorageInfoEntityRepo tfileStorageInfoEntityRepo;

    /**
     * 新增
     * @param tfileStorageInfoDto
     * @return ApiResponse<TfileStorageInfoVo>
     */
     public ApiResponse<TfileStorageInfoVo> insert(TfileStorageInfoDto tfileStorageInfoDto){
           return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<TfileStorageInfoVo>(){}.getType()));
           //TfileStorageInfoEntity tfileStorageInfoEntity = BeanUtils.copyAttrs(new TfileStorageInfoEntity(), tfileStorageInfoDto);
           //tfileStorageInfoEntityRepo.save(tfileStorageInfoEntity);
           //return ApiResponse.ok(BeanUtils.copyAttrs(new TfileStorageInfoVo(),tfileStorageInfoEntity));
     }


     /**
      * 修改
      * @param tfileStorageInfoDto
      * @return ApiResponse<TfileStorageInfoVo>
      */
      public ApiResponse<TfileStorageInfoVo> update(TfileStorageInfoDto tfileStorageInfoDto){
            return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<TfileStorageInfoVo>(){}.getType()));
            //TfileStorageInfoEntity tfileStorageInfoEntity = BeanUtils.copyAttrs(new TfileStorageInfoEntity(), tfileStorageInfoDto);
            //tfileStorageInfoEntityRepo.save(tfileStorageInfoEntity);
            //return ApiResponse.ok(BeanUtils.copyAttrs(new TfileStorageInfoVo(),tfileStorageInfoEntity));
      }

      /**
       * 通过主键获取对象
       * @param id 实体主键
       * @return ApiResponse<TfileStorageInfoVo>
       */
       public ApiResponse<TfileStorageInfoVo> findOne(String id){
             return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<TfileStorageInfoVo>(){}.getType()));
             //TfileStorageInfoEntity tfileStorageInfoEntity = tfileStorageInfoEntityRepo.findOne(id);
             //return ApiResponse.ok(BeanUtils.copyAttrs(new TfileStorageInfoVo(),tfileStorageInfoEntity));
       }

       /**
        * 默认查询所有列表，若要筛选列表，请增加过滤参数
        * @return ApiResponse<List<TfileStorageInfoVo>>
        */
        public ApiResponse<List<TfileStorageInfoVo>> findAll(){
               return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<List<TfileStorageInfoVo>>(){}.getType()));
               //List<TfileStorageInfoEntity> tfileStorageInfoEntities = tfileStorageInfoEntityRepo.findAll();
               //List<TfileStorageInfoVo> tfileStorageInfoVoList = new BeanListUtils<TfileStorageInfoVo, TfileStorageInfoEntity>(TfileStorageInfoVo.class, tfileStorageInfoEntities).getTargetList();
               //return ApiResponse.ok(tfileStorageInfoVoList);
        }

        /**
         * 删除对应主键的数据
         * @return
         */
         public ApiResponse delete(String id){
                //tfileStorageInfoEntityRepo.delete(id);
                return ApiResponse.prompt(Syscode.SC_OK);
         }

}