package com.jihai.mengmian1.service;

import com.google.common.reflect.TypeToken;
import com.jihai.mengmian.BeanUtils;
import com.jihai.mengmian.BeanListUtils;
import com.jihai.mengmian1.entity.TsoftwarePlatformEntity;
import com.jihai.mengmian1.repo.TsoftwarePlatformEntityRepo;
import com.jihai.mengmian1.vo.TsoftwarePlatformVo;
import com.jihai.mengmian1.dto.TsoftwarePlatformDto;
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
public class TsoftwarePlatformService {
    @Autowired
    private TsoftwarePlatformEntityRepo tsoftwarePlatformEntityRepo;

    /**
     * 新增
     * @param tsoftwarePlatformDto
     * @return ApiResponse<TsoftwarePlatformVo>
     */
     public ApiResponse<TsoftwarePlatformVo> insert(TsoftwarePlatformDto tsoftwarePlatformDto){
           return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<TsoftwarePlatformVo>(){}.getType()));
           //TsoftwarePlatformEntity tsoftwarePlatformEntity = BeanUtils.copyAttrs(new TsoftwarePlatformEntity(), tsoftwarePlatformDto);
           //tsoftwarePlatformEntityRepo.save(tsoftwarePlatformEntity);
           //return ApiResponse.ok(BeanUtils.copyAttrs(new TsoftwarePlatformVo(),tsoftwarePlatformEntity));
     }


     /**
      * 修改
      * @param tsoftwarePlatformDto
      * @return ApiResponse<TsoftwarePlatformVo>
      */
      public ApiResponse<TsoftwarePlatformVo> update(TsoftwarePlatformDto tsoftwarePlatformDto){
            return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<TsoftwarePlatformVo>(){}.getType()));
            //TsoftwarePlatformEntity tsoftwarePlatformEntity = BeanUtils.copyAttrs(new TsoftwarePlatformEntity(), tsoftwarePlatformDto);
            //tsoftwarePlatformEntityRepo.save(tsoftwarePlatformEntity);
            //return ApiResponse.ok(BeanUtils.copyAttrs(new TsoftwarePlatformVo(),tsoftwarePlatformEntity));
      }

      /**
       * 通过主键获取对象
       * @param id 实体主键
       * @return ApiResponse<TsoftwarePlatformVo>
       */
       public ApiResponse<TsoftwarePlatformVo> findOne(String id){
             return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<TsoftwarePlatformVo>(){}.getType()));
             //TsoftwarePlatformEntity tsoftwarePlatformEntity = tsoftwarePlatformEntityRepo.findOne(id);
             //return ApiResponse.ok(BeanUtils.copyAttrs(new TsoftwarePlatformVo(),tsoftwarePlatformEntity));
       }

       /**
        * 默认查询所有列表，若要筛选列表，请增加过滤参数
        * @return ApiResponse<List<TsoftwarePlatformVo>>
        */
        public ApiResponse<List<TsoftwarePlatformVo>> findAll(){
               return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<List<TsoftwarePlatformVo>>(){}.getType()));
               //List<TsoftwarePlatformEntity> tsoftwarePlatformEntities = tsoftwarePlatformEntityRepo.findAll();
               //List<TsoftwarePlatformVo> tsoftwarePlatformVoList = new BeanListUtils<TsoftwarePlatformVo, TsoftwarePlatformEntity>(TsoftwarePlatformVo.class, tsoftwarePlatformEntities).getTargetList();
               //return ApiResponse.ok(tsoftwarePlatformVoList);
        }

        /**
         * 删除对应主键的数据
         * @return
         */
         public ApiResponse delete(String id){
                //tsoftwarePlatformEntityRepo.delete(id);
                return ApiResponse.prompt(Syscode.SC_OK);
         }

}