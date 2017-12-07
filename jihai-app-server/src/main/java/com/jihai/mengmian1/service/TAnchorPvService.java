package com.jihai.mengmian1.service;

import com.google.common.reflect.TypeToken;
import com.jihai.mengmian.BeanUtils;
import com.jihai.mengmian.BeanListUtils;
import com.jihai.mengmian1.entity.TAnchorPvEntity;
import com.jihai.mengmian1.repo.TAnchorPvEntityRepo;
import com.jihai.mengmian1.vo.TAnchorPvVo;
import com.jihai.mengmian1.dto.TAnchorPvDto;
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
public class TAnchorPvService {
    @Autowired
    private TAnchorPvEntityRepo tAnchorPvEntityRepo;

    /**
     * 新增
     * @param tAnchorPvDto
     * @return ApiResponse<TAnchorPvVo>
     */
     public ApiResponse<TAnchorPvVo> insert(TAnchorPvDto tAnchorPvDto){
           return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<TAnchorPvVo>(){}.getType()));
           //TAnchorPvEntity tAnchorPvEntity = BeanUtils.copyAttrs(new TAnchorPvEntity(), tAnchorPvDto);
           //tAnchorPvEntityRepo.save(tAnchorPvEntity);
           //return ApiResponse.ok(BeanUtils.copyAttrs(new TAnchorPvVo(),tAnchorPvEntity));
     }


     /**
      * 修改
      * @param tAnchorPvDto
      * @return ApiResponse<TAnchorPvVo>
      */
      public ApiResponse<TAnchorPvVo> update(TAnchorPvDto tAnchorPvDto){
            return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<TAnchorPvVo>(){}.getType()));
            //TAnchorPvEntity tAnchorPvEntity = BeanUtils.copyAttrs(new TAnchorPvEntity(), tAnchorPvDto);
            //tAnchorPvEntityRepo.save(tAnchorPvEntity);
            //return ApiResponse.ok(BeanUtils.copyAttrs(new TAnchorPvVo(),tAnchorPvEntity));
      }

      /**
       * 通过主键获取对象
       * @param id 实体主键
       * @return ApiResponse<TAnchorPvVo>
       */
       public ApiResponse<TAnchorPvVo> findOne(String id){
             return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<TAnchorPvVo>(){}.getType()));
             //TAnchorPvEntity tAnchorPvEntity = tAnchorPvEntityRepo.findOne(id);
             //return ApiResponse.ok(BeanUtils.copyAttrs(new TAnchorPvVo(),tAnchorPvEntity));
       }

       /**
        * 默认查询所有列表，若要筛选列表，请增加过滤参数
        * @return ApiResponse<List<TAnchorPvVo>>
        */
        public ApiResponse<List<TAnchorPvVo>> findAll(){
               return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<List<TAnchorPvVo>>(){}.getType()));
               //List<TAnchorPvEntity> tAnchorPvEntities = tAnchorPvEntityRepo.findAll();
               //List<TAnchorPvVo> tAnchorPvVoList = new BeanListUtils<TAnchorPvVo, TAnchorPvEntity>(TAnchorPvVo.class, tAnchorPvEntities).getTargetList();
               //return ApiResponse.ok(tAnchorPvVoList);
        }

        /**
         * 删除对应主键的数据
         * @return
         */
         public ApiResponse delete(String id){
                //tAnchorPvEntityRepo.delete(id);
                return ApiResponse.prompt(Syscode.SC_OK);
         }

}