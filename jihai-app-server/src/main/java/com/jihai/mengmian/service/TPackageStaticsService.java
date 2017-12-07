package com.jihai.mengmian.service;

import com.google.common.reflect.TypeToken;
import com.jihai.mengmian.BeanUtils;
import com.jihai.mengmian.BeanListUtils;
import com.jihai.mengmian.entity.TPackageStaticsEntity;
import com.jihai.mengmian.repo.TPackageStaticsEntityRepo;
import com.jihai.mengmian.vo.TPackageStaticsVo;
import com.jihai.mengmian.dto.TPackageStaticsDto;
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
public class TPackageStaticsService {
    @Autowired
    private TPackageStaticsEntityRepo tPackageStaticsEntityRepo;

    /**
     * 新增
     * @param tPackageStaticsDto
     * @return ApiResponse<TPackageStaticsVo>
     */
     public ApiResponse<TPackageStaticsVo> insert(TPackageStaticsDto tPackageStaticsDto){
           return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<TPackageStaticsVo>(){}.getType()));
           //TPackageStaticsEntity tPackageStaticsEntity = BeanUtils.copyAttrs(new TPackageStaticsEntity(), tPackageStaticsDto);
           //tPackageStaticsEntityRepo.save(tPackageStaticsEntity);
           //return ApiResponse.ok(BeanUtils.copyAttrs(new TPackageStaticsVo(),tPackageStaticsEntity));
     }


     /**
      * 修改
      * @param tPackageStaticsDto
      * @return ApiResponse<TPackageStaticsVo>
      */
      public ApiResponse<TPackageStaticsVo> update(TPackageStaticsDto tPackageStaticsDto){
            return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<TPackageStaticsVo>(){}.getType()));
            //TPackageStaticsEntity tPackageStaticsEntity = BeanUtils.copyAttrs(new TPackageStaticsEntity(), tPackageStaticsDto);
            //tPackageStaticsEntityRepo.save(tPackageStaticsEntity);
            //return ApiResponse.ok(BeanUtils.copyAttrs(new TPackageStaticsVo(),tPackageStaticsEntity));
      }

      /**
       * 通过主键获取对象
       * @param id 实体主键
       * @return ApiResponse<TPackageStaticsVo>
       */
       public ApiResponse<TPackageStaticsVo> findOne(String id){
             return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<TPackageStaticsVo>(){}.getType()));
             //TPackageStaticsEntity tPackageStaticsEntity = tPackageStaticsEntityRepo.findOne(id);
             //return ApiResponse.ok(BeanUtils.copyAttrs(new TPackageStaticsVo(),tPackageStaticsEntity));
       }

       /**
        * 默认查询所有列表，若要筛选列表，请增加过滤参数
        * @return ApiResponse<List<TPackageStaticsVo>>
        */
        public ApiResponse<List<TPackageStaticsVo>> findAll(){
               return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<List<TPackageStaticsVo>>(){}.getType()));
               //List<TPackageStaticsEntity> tPackageStaticsEntities = tPackageStaticsEntityRepo.findAll();
               //List<TPackageStaticsVo> tPackageStaticsVoList = new BeanListUtils<TPackageStaticsVo, TPackageStaticsEntity>(TPackageStaticsVo.class, tPackageStaticsEntities).getTargetList();
               //return ApiResponse.ok(tPackageStaticsVoList);
        }

        /**
         * 删除对应主键的数据
         * @return
         */
         public ApiResponse delete(String id){
                //tPackageStaticsEntityRepo.delete(id);
                return ApiResponse.prompt(Syscode.SC_OK);
         }

}