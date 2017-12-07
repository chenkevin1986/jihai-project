package com.jihai.mengmian1.service;

import com.google.common.reflect.TypeToken;
import com.jihai.mengmian.BeanUtils;
import com.jihai.mengmian.BeanListUtils;
import com.jihai.mengmian1.entity.TDbUpdateLogEntity;
import com.jihai.mengmian1.repo.TDbUpdateLogEntityRepo;
import com.jihai.mengmian1.vo.TDbUpdateLogVo;
import com.jihai.mengmian1.dto.TDbUpdateLogDto;
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
public class TDbUpdateLogService {
    @Autowired
    private TDbUpdateLogEntityRepo tDbUpdateLogEntityRepo;

    /**
     * 新增
     * @param tDbUpdateLogDto
     * @return ApiResponse<TDbUpdateLogVo>
     */
     public ApiResponse<TDbUpdateLogVo> insert(TDbUpdateLogDto tDbUpdateLogDto){
           return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<TDbUpdateLogVo>(){}.getType()));
           //TDbUpdateLogEntity tDbUpdateLogEntity = BeanUtils.copyAttrs(new TDbUpdateLogEntity(), tDbUpdateLogDto);
           //tDbUpdateLogEntityRepo.save(tDbUpdateLogEntity);
           //return ApiResponse.ok(BeanUtils.copyAttrs(new TDbUpdateLogVo(),tDbUpdateLogEntity));
     }


     /**
      * 修改
      * @param tDbUpdateLogDto
      * @return ApiResponse<TDbUpdateLogVo>
      */
      public ApiResponse<TDbUpdateLogVo> update(TDbUpdateLogDto tDbUpdateLogDto){
            return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<TDbUpdateLogVo>(){}.getType()));
            //TDbUpdateLogEntity tDbUpdateLogEntity = BeanUtils.copyAttrs(new TDbUpdateLogEntity(), tDbUpdateLogDto);
            //tDbUpdateLogEntityRepo.save(tDbUpdateLogEntity);
            //return ApiResponse.ok(BeanUtils.copyAttrs(new TDbUpdateLogVo(),tDbUpdateLogEntity));
      }

      /**
       * 通过主键获取对象
       * @param id 实体主键
       * @return ApiResponse<TDbUpdateLogVo>
       */
       public ApiResponse<TDbUpdateLogVo> findOne(String id){
             return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<TDbUpdateLogVo>(){}.getType()));
             //TDbUpdateLogEntity tDbUpdateLogEntity = tDbUpdateLogEntityRepo.findOne(id);
             //return ApiResponse.ok(BeanUtils.copyAttrs(new TDbUpdateLogVo(),tDbUpdateLogEntity));
       }

       /**
        * 默认查询所有列表，若要筛选列表，请增加过滤参数
        * @return ApiResponse<List<TDbUpdateLogVo>>
        */
        public ApiResponse<List<TDbUpdateLogVo>> findAll(){
               return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<List<TDbUpdateLogVo>>(){}.getType()));
               //List<TDbUpdateLogEntity> tDbUpdateLogEntities = tDbUpdateLogEntityRepo.findAll();
               //List<TDbUpdateLogVo> tDbUpdateLogVoList = new BeanListUtils<TDbUpdateLogVo, TDbUpdateLogEntity>(TDbUpdateLogVo.class, tDbUpdateLogEntities).getTargetList();
               //return ApiResponse.ok(tDbUpdateLogVoList);
        }

        /**
         * 删除对应主键的数据
         * @return
         */
         public ApiResponse delete(String id){
                //tDbUpdateLogEntityRepo.delete(id);
                return ApiResponse.prompt(Syscode.SC_OK);
         }

}