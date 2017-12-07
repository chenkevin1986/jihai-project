package com.jihai.mengmian1.service;

import com.google.common.reflect.TypeToken;
import com.jihai.mengmian.BeanUtils;
import com.jihai.mengmian.BeanListUtils;
import com.jihai.mengmian1.entity.TrouteInfoEntity;
import com.jihai.mengmian1.repo.TrouteInfoEntityRepo;
import com.jihai.mengmian1.vo.TrouteInfoVo;
import com.jihai.mengmian1.dto.TrouteInfoDto;
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
public class TrouteInfoService {
    @Autowired
    private TrouteInfoEntityRepo trouteInfoEntityRepo;

    /**
     * 新增
     * @param trouteInfoDto
     * @return ApiResponse<TrouteInfoVo>
     */
     public ApiResponse<TrouteInfoVo> insert(TrouteInfoDto trouteInfoDto){
           return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<TrouteInfoVo>(){}.getType()));
           //TrouteInfoEntity trouteInfoEntity = BeanUtils.copyAttrs(new TrouteInfoEntity(), trouteInfoDto);
           //trouteInfoEntityRepo.save(trouteInfoEntity);
           //return ApiResponse.ok(BeanUtils.copyAttrs(new TrouteInfoVo(),trouteInfoEntity));
     }


     /**
      * 修改
      * @param trouteInfoDto
      * @return ApiResponse<TrouteInfoVo>
      */
      public ApiResponse<TrouteInfoVo> update(TrouteInfoDto trouteInfoDto){
            return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<TrouteInfoVo>(){}.getType()));
            //TrouteInfoEntity trouteInfoEntity = BeanUtils.copyAttrs(new TrouteInfoEntity(), trouteInfoDto);
            //trouteInfoEntityRepo.save(trouteInfoEntity);
            //return ApiResponse.ok(BeanUtils.copyAttrs(new TrouteInfoVo(),trouteInfoEntity));
      }

      /**
       * 通过主键获取对象
       * @param id 实体主键
       * @return ApiResponse<TrouteInfoVo>
       */
       public ApiResponse<TrouteInfoVo> findOne(String id){
             return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<TrouteInfoVo>(){}.getType()));
             //TrouteInfoEntity trouteInfoEntity = trouteInfoEntityRepo.findOne(id);
             //return ApiResponse.ok(BeanUtils.copyAttrs(new TrouteInfoVo(),trouteInfoEntity));
       }

       /**
        * 默认查询所有列表，若要筛选列表，请增加过滤参数
        * @return ApiResponse<List<TrouteInfoVo>>
        */
        public ApiResponse<List<TrouteInfoVo>> findAll(){
               return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<List<TrouteInfoVo>>(){}.getType()));
               //List<TrouteInfoEntity> trouteInfoEntities = trouteInfoEntityRepo.findAll();
               //List<TrouteInfoVo> trouteInfoVoList = new BeanListUtils<TrouteInfoVo, TrouteInfoEntity>(TrouteInfoVo.class, trouteInfoEntities).getTargetList();
               //return ApiResponse.ok(trouteInfoVoList);
        }

        /**
         * 删除对应主键的数据
         * @return
         */
         public ApiResponse delete(String id){
                //trouteInfoEntityRepo.delete(id);
                return ApiResponse.prompt(Syscode.SC_OK);
         }

}