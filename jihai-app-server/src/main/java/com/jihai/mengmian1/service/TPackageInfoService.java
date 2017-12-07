package com.jihai.mengmian1.service;

import com.google.common.reflect.TypeToken;
import com.jihai.mengmian.BeanUtils;
import com.jihai.mengmian.BeanListUtils;
import com.jihai.mengmian1.entity.TPackageInfoEntity;
import com.jihai.mengmian1.repo.TPackageInfoEntityRepo;
import com.jihai.mengmian1.vo.TPackageInfoVo;
import com.jihai.mengmian1.dto.TPackageInfoDto;
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
public class TPackageInfoService {
    @Autowired
    private TPackageInfoEntityRepo tPackageInfoEntityRepo;

    /**
     * 新增
     * @param tPackageInfoDto
     * @return ApiResponse<TPackageInfoVo>
     */
     public ApiResponse<TPackageInfoVo> insert(TPackageInfoDto tPackageInfoDto){
           return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<TPackageInfoVo>(){}.getType()));
           //TPackageInfoEntity tPackageInfoEntity = BeanUtils.copyAttrs(new TPackageInfoEntity(), tPackageInfoDto);
           //tPackageInfoEntityRepo.save(tPackageInfoEntity);
           //return ApiResponse.ok(BeanUtils.copyAttrs(new TPackageInfoVo(),tPackageInfoEntity));
     }


     /**
      * 修改
      * @param tPackageInfoDto
      * @return ApiResponse<TPackageInfoVo>
      */
      public ApiResponse<TPackageInfoVo> update(TPackageInfoDto tPackageInfoDto){
            return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<TPackageInfoVo>(){}.getType()));
            //TPackageInfoEntity tPackageInfoEntity = BeanUtils.copyAttrs(new TPackageInfoEntity(), tPackageInfoDto);
            //tPackageInfoEntityRepo.save(tPackageInfoEntity);
            //return ApiResponse.ok(BeanUtils.copyAttrs(new TPackageInfoVo(),tPackageInfoEntity));
      }

      /**
       * 通过主键获取对象
       * @param id 实体主键
       * @return ApiResponse<TPackageInfoVo>
       */
       public ApiResponse<TPackageInfoVo> findOne(String id){
             return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<TPackageInfoVo>(){}.getType()));
             //TPackageInfoEntity tPackageInfoEntity = tPackageInfoEntityRepo.findOne(id);
             //return ApiResponse.ok(BeanUtils.copyAttrs(new TPackageInfoVo(),tPackageInfoEntity));
       }

       /**
        * 默认查询所有列表，若要筛选列表，请增加过滤参数
        * @return ApiResponse<List<TPackageInfoVo>>
        */
        public ApiResponse<List<TPackageInfoVo>> findAll(){
               return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<List<TPackageInfoVo>>(){}.getType()));
               //List<TPackageInfoEntity> tPackageInfoEntities = tPackageInfoEntityRepo.findAll();
               //List<TPackageInfoVo> tPackageInfoVoList = new BeanListUtils<TPackageInfoVo, TPackageInfoEntity>(TPackageInfoVo.class, tPackageInfoEntities).getTargetList();
               //return ApiResponse.ok(tPackageInfoVoList);
        }

        /**
         * 删除对应主键的数据
         * @return
         */
         public ApiResponse delete(String id){
                //tPackageInfoEntityRepo.delete(id);
                return ApiResponse.prompt(Syscode.SC_OK);
         }

}