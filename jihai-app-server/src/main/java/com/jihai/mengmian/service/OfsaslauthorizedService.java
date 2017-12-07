package com.jihai.mengmian.service;

import com.google.common.reflect.TypeToken;
import com.jihai.mengmian.BeanUtils;
import com.jihai.mengmian.BeanListUtils;
import com.jihai.mengmian.entity.OfsaslauthorizedEntity;
import com.jihai.mengmian.repo.OfsaslauthorizedEntityRepo;
import com.jihai.mengmian.vo.OfsaslauthorizedVo;
import com.jihai.mengmian.dto.OfsaslauthorizedDto;
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
 * <b>Time：</b> 2017-12-07 16:37:27 <br>
 * <b>Contact：<b>wechat and phone number - 13826126615<br>
 */
@Service
public class OfsaslauthorizedService {
    @Autowired
    private OfsaslauthorizedEntityRepo ofsaslauthorizedEntityRepo;

    /**
     * 新增
     * @param ofsaslauthorizedDto
     * @return ApiResponse<OfsaslauthorizedVo>
     */
     public ApiResponse<OfsaslauthorizedVo> insert(OfsaslauthorizedDto ofsaslauthorizedDto){
           return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<OfsaslauthorizedVo>(){}.getType()));
           //OfsaslauthorizedEntity ofsaslauthorizedEntity = BeanUtils.copyAttrs(new OfsaslauthorizedEntity(), ofsaslauthorizedDto);
           //ofsaslauthorizedEntityRepo.save(ofsaslauthorizedEntity);
           //return ApiResponse.ok(BeanUtils.copyAttrs(new OfsaslauthorizedVo(),ofsaslauthorizedEntity));
     }


     /**
      * 修改
      * @param ofsaslauthorizedDto
      * @return ApiResponse<OfsaslauthorizedVo>
      */
      public ApiResponse<OfsaslauthorizedVo> update(OfsaslauthorizedDto ofsaslauthorizedDto){
            return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<OfsaslauthorizedVo>(){}.getType()));
            //OfsaslauthorizedEntity ofsaslauthorizedEntity = BeanUtils.copyAttrs(new OfsaslauthorizedEntity(), ofsaslauthorizedDto);
            //ofsaslauthorizedEntityRepo.save(ofsaslauthorizedEntity);
            //return ApiResponse.ok(BeanUtils.copyAttrs(new OfsaslauthorizedVo(),ofsaslauthorizedEntity));
      }

      /**
       * 通过主键获取对象
       * @param id 实体主键
       * @return ApiResponse<OfsaslauthorizedVo>
       */
       public ApiResponse<OfsaslauthorizedVo> findOne(String id){
             return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<OfsaslauthorizedVo>(){}.getType()));
             //OfsaslauthorizedEntity ofsaslauthorizedEntity = ofsaslauthorizedEntityRepo.findOne(id);
             //return ApiResponse.ok(BeanUtils.copyAttrs(new OfsaslauthorizedVo(),ofsaslauthorizedEntity));
       }

       /**
        * 默认查询所有列表，若要筛选列表，请增加过滤参数
        * @return ApiResponse<List<OfsaslauthorizedVo>>
        */
        public ApiResponse<List<OfsaslauthorizedVo>> findAll(){
               return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<List<OfsaslauthorizedVo>>(){}.getType()));
               //List<OfsaslauthorizedEntity> ofsaslauthorizedEntities = ofsaslauthorizedEntityRepo.findAll();
               //List<OfsaslauthorizedVo> ofsaslauthorizedVoList = new BeanListUtils<OfsaslauthorizedVo, OfsaslauthorizedEntity>(OfsaslauthorizedVo.class, ofsaslauthorizedEntities).getTargetList();
               //return ApiResponse.ok(ofsaslauthorizedVoList);
        }

        /**
         * 删除对应主键的数据
         * @return
         */
         public ApiResponse delete(String id){
                //ofsaslauthorizedEntityRepo.delete(id);
                return ApiResponse.prompt(Syscode.SC_OK);
         }

}