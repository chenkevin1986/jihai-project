package com.jihai.mengmian1.service;

import com.google.common.reflect.TypeToken;
import com.jihai.mengmian.BeanUtils;
import com.jihai.mengmian.BeanListUtils;
import com.jihai.mengmian1.entity.TrouteVersionEntity;
import com.jihai.mengmian1.repo.TrouteVersionEntityRepo;
import com.jihai.mengmian1.vo.TrouteVersionVo;
import com.jihai.mengmian1.dto.TrouteVersionDto;
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
public class TrouteVersionService {
    @Autowired
    private TrouteVersionEntityRepo trouteVersionEntityRepo;

    /**
     * 新增
     * @param trouteVersionDto
     * @return ApiResponse<TrouteVersionVo>
     */
     public ApiResponse<TrouteVersionVo> insert(TrouteVersionDto trouteVersionDto){
           return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<TrouteVersionVo>(){}.getType()));
           //TrouteVersionEntity trouteVersionEntity = BeanUtils.copyAttrs(new TrouteVersionEntity(), trouteVersionDto);
           //trouteVersionEntityRepo.save(trouteVersionEntity);
           //return ApiResponse.ok(BeanUtils.copyAttrs(new TrouteVersionVo(),trouteVersionEntity));
     }


     /**
      * 修改
      * @param trouteVersionDto
      * @return ApiResponse<TrouteVersionVo>
      */
      public ApiResponse<TrouteVersionVo> update(TrouteVersionDto trouteVersionDto){
            return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<TrouteVersionVo>(){}.getType()));
            //TrouteVersionEntity trouteVersionEntity = BeanUtils.copyAttrs(new TrouteVersionEntity(), trouteVersionDto);
            //trouteVersionEntityRepo.save(trouteVersionEntity);
            //return ApiResponse.ok(BeanUtils.copyAttrs(new TrouteVersionVo(),trouteVersionEntity));
      }

      /**
       * 通过主键获取对象
       * @param id 实体主键
       * @return ApiResponse<TrouteVersionVo>
       */
       public ApiResponse<TrouteVersionVo> findOne(String id){
             return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<TrouteVersionVo>(){}.getType()));
             //TrouteVersionEntity trouteVersionEntity = trouteVersionEntityRepo.findOne(id);
             //return ApiResponse.ok(BeanUtils.copyAttrs(new TrouteVersionVo(),trouteVersionEntity));
       }

       /**
        * 默认查询所有列表，若要筛选列表，请增加过滤参数
        * @return ApiResponse<List<TrouteVersionVo>>
        */
        public ApiResponse<List<TrouteVersionVo>> findAll(){
               return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<List<TrouteVersionVo>>(){}.getType()));
               //List<TrouteVersionEntity> trouteVersionEntities = trouteVersionEntityRepo.findAll();
               //List<TrouteVersionVo> trouteVersionVoList = new BeanListUtils<TrouteVersionVo, TrouteVersionEntity>(TrouteVersionVo.class, trouteVersionEntities).getTargetList();
               //return ApiResponse.ok(trouteVersionVoList);
        }

        /**
         * 删除对应主键的数据
         * @return
         */
         public ApiResponse delete(String id){
                //trouteVersionEntityRepo.delete(id);
                return ApiResponse.prompt(Syscode.SC_OK);
         }

}