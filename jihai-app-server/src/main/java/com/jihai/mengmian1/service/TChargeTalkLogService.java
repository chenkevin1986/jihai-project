package com.jihai.mengmian1.service;

import com.google.common.reflect.TypeToken;
import com.jihai.mengmian.BeanUtils;
import com.jihai.mengmian.BeanListUtils;
import com.jihai.mengmian1.entity.TChargeTalkLogEntity;
import com.jihai.mengmian1.repo.TChargeTalkLogEntityRepo;
import com.jihai.mengmian1.vo.TChargeTalkLogVo;
import com.jihai.mengmian1.dto.TChargeTalkLogDto;
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
public class TChargeTalkLogService {
    @Autowired
    private TChargeTalkLogEntityRepo tChargeTalkLogEntityRepo;

    /**
     * 新增
     * @param tChargeTalkLogDto
     * @return ApiResponse<TChargeTalkLogVo>
     */
     public ApiResponse<TChargeTalkLogVo> insert(TChargeTalkLogDto tChargeTalkLogDto){
           return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<TChargeTalkLogVo>(){}.getType()));
           //TChargeTalkLogEntity tChargeTalkLogEntity = BeanUtils.copyAttrs(new TChargeTalkLogEntity(), tChargeTalkLogDto);
           //tChargeTalkLogEntityRepo.save(tChargeTalkLogEntity);
           //return ApiResponse.ok(BeanUtils.copyAttrs(new TChargeTalkLogVo(),tChargeTalkLogEntity));
     }


     /**
      * 修改
      * @param tChargeTalkLogDto
      * @return ApiResponse<TChargeTalkLogVo>
      */
      public ApiResponse<TChargeTalkLogVo> update(TChargeTalkLogDto tChargeTalkLogDto){
            return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<TChargeTalkLogVo>(){}.getType()));
            //TChargeTalkLogEntity tChargeTalkLogEntity = BeanUtils.copyAttrs(new TChargeTalkLogEntity(), tChargeTalkLogDto);
            //tChargeTalkLogEntityRepo.save(tChargeTalkLogEntity);
            //return ApiResponse.ok(BeanUtils.copyAttrs(new TChargeTalkLogVo(),tChargeTalkLogEntity));
      }

      /**
       * 通过主键获取对象
       * @param id 实体主键
       * @return ApiResponse<TChargeTalkLogVo>
       */
       public ApiResponse<TChargeTalkLogVo> findOne(String id){
             return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<TChargeTalkLogVo>(){}.getType()));
             //TChargeTalkLogEntity tChargeTalkLogEntity = tChargeTalkLogEntityRepo.findOne(id);
             //return ApiResponse.ok(BeanUtils.copyAttrs(new TChargeTalkLogVo(),tChargeTalkLogEntity));
       }

       /**
        * 默认查询所有列表，若要筛选列表，请增加过滤参数
        * @return ApiResponse<List<TChargeTalkLogVo>>
        */
        public ApiResponse<List<TChargeTalkLogVo>> findAll(){
               return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<List<TChargeTalkLogVo>>(){}.getType()));
               //List<TChargeTalkLogEntity> tChargeTalkLogEntities = tChargeTalkLogEntityRepo.findAll();
               //List<TChargeTalkLogVo> tChargeTalkLogVoList = new BeanListUtils<TChargeTalkLogVo, TChargeTalkLogEntity>(TChargeTalkLogVo.class, tChargeTalkLogEntities).getTargetList();
               //return ApiResponse.ok(tChargeTalkLogVoList);
        }

        /**
         * 删除对应主键的数据
         * @return
         */
         public ApiResponse delete(String id){
                //tChargeTalkLogEntityRepo.delete(id);
                return ApiResponse.prompt(Syscode.SC_OK);
         }

}