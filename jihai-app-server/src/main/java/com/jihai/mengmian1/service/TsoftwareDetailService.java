package com.jihai.mengmian1.service;

import com.google.common.reflect.TypeToken;
import com.jihai.mengmian.BeanUtils;
import com.jihai.mengmian.BeanListUtils;
import com.jihai.mengmian1.entity.TsoftwareDetailEntity;
import com.jihai.mengmian1.repo.TsoftwareDetailEntityRepo;
import com.jihai.mengmian1.vo.TsoftwareDetailVo;
import com.jihai.mengmian1.dto.TsoftwareDetailDto;
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
public class TsoftwareDetailService {
    @Autowired
    private TsoftwareDetailEntityRepo tsoftwareDetailEntityRepo;

    /**
     * 新增
     * @param tsoftwareDetailDto
     * @return ApiResponse<TsoftwareDetailVo>
     */
     public ApiResponse<TsoftwareDetailVo> insert(TsoftwareDetailDto tsoftwareDetailDto){
           return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<TsoftwareDetailVo>(){}.getType()));
           //TsoftwareDetailEntity tsoftwareDetailEntity = BeanUtils.copyAttrs(new TsoftwareDetailEntity(), tsoftwareDetailDto);
           //tsoftwareDetailEntityRepo.save(tsoftwareDetailEntity);
           //return ApiResponse.ok(BeanUtils.copyAttrs(new TsoftwareDetailVo(),tsoftwareDetailEntity));
     }


     /**
      * 修改
      * @param tsoftwareDetailDto
      * @return ApiResponse<TsoftwareDetailVo>
      */
      public ApiResponse<TsoftwareDetailVo> update(TsoftwareDetailDto tsoftwareDetailDto){
            return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<TsoftwareDetailVo>(){}.getType()));
            //TsoftwareDetailEntity tsoftwareDetailEntity = BeanUtils.copyAttrs(new TsoftwareDetailEntity(), tsoftwareDetailDto);
            //tsoftwareDetailEntityRepo.save(tsoftwareDetailEntity);
            //return ApiResponse.ok(BeanUtils.copyAttrs(new TsoftwareDetailVo(),tsoftwareDetailEntity));
      }

      /**
       * 通过主键获取对象
       * @param id 实体主键
       * @return ApiResponse<TsoftwareDetailVo>
       */
       public ApiResponse<TsoftwareDetailVo> findOne(String id){
             return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<TsoftwareDetailVo>(){}.getType()));
             //TsoftwareDetailEntity tsoftwareDetailEntity = tsoftwareDetailEntityRepo.findOne(id);
             //return ApiResponse.ok(BeanUtils.copyAttrs(new TsoftwareDetailVo(),tsoftwareDetailEntity));
       }

       /**
        * 默认查询所有列表，若要筛选列表，请增加过滤参数
        * @return ApiResponse<List<TsoftwareDetailVo>>
        */
        public ApiResponse<List<TsoftwareDetailVo>> findAll(){
               return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<List<TsoftwareDetailVo>>(){}.getType()));
               //List<TsoftwareDetailEntity> tsoftwareDetailEntities = tsoftwareDetailEntityRepo.findAll();
               //List<TsoftwareDetailVo> tsoftwareDetailVoList = new BeanListUtils<TsoftwareDetailVo, TsoftwareDetailEntity>(TsoftwareDetailVo.class, tsoftwareDetailEntities).getTargetList();
               //return ApiResponse.ok(tsoftwareDetailVoList);
        }

        /**
         * 删除对应主键的数据
         * @return
         */
         public ApiResponse delete(String id){
                //tsoftwareDetailEntityRepo.delete(id);
                return ApiResponse.prompt(Syscode.SC_OK);
         }

}