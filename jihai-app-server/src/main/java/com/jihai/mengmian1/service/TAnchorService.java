package com.jihai.mengmian1.service;

import com.google.common.reflect.TypeToken;
import com.jihai.mengmian.BeanUtils;
import com.jihai.mengmian.BeanListUtils;
import com.jihai.mengmian1.entity.TAnchorEntity;
import com.jihai.mengmian1.repo.TAnchorEntityRepo;
import com.jihai.mengmian1.vo.TAnchorVo;
import com.jihai.mengmian1.dto.TAnchorDto;
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
public class TAnchorService {
    @Autowired
    private TAnchorEntityRepo tAnchorEntityRepo;

    /**
     * 新增
     * @param tAnchorDto
     * @return ApiResponse<TAnchorVo>
     */
     public ApiResponse<TAnchorVo> insert(TAnchorDto tAnchorDto){
           return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<TAnchorVo>(){}.getType()));
           //TAnchorEntity tAnchorEntity = BeanUtils.copyAttrs(new TAnchorEntity(), tAnchorDto);
           //tAnchorEntityRepo.save(tAnchorEntity);
           //return ApiResponse.ok(BeanUtils.copyAttrs(new TAnchorVo(),tAnchorEntity));
     }


     /**
      * 修改
      * @param tAnchorDto
      * @return ApiResponse<TAnchorVo>
      */
      public ApiResponse<TAnchorVo> update(TAnchorDto tAnchorDto){
            return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<TAnchorVo>(){}.getType()));
            //TAnchorEntity tAnchorEntity = BeanUtils.copyAttrs(new TAnchorEntity(), tAnchorDto);
            //tAnchorEntityRepo.save(tAnchorEntity);
            //return ApiResponse.ok(BeanUtils.copyAttrs(new TAnchorVo(),tAnchorEntity));
      }

      /**
       * 通过主键获取对象
       * @param id 实体主键
       * @return ApiResponse<TAnchorVo>
       */
       public ApiResponse<TAnchorVo> findOne(String id){
             return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<TAnchorVo>(){}.getType()));
             //TAnchorEntity tAnchorEntity = tAnchorEntityRepo.findOne(id);
             //return ApiResponse.ok(BeanUtils.copyAttrs(new TAnchorVo(),tAnchorEntity));
       }

       /**
        * 默认查询所有列表，若要筛选列表，请增加过滤参数
        * @return ApiResponse<List<TAnchorVo>>
        */
        public ApiResponse<List<TAnchorVo>> findAll(){
               return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<List<TAnchorVo>>(){}.getType()));
               //List<TAnchorEntity> tAnchorEntities = tAnchorEntityRepo.findAll();
               //List<TAnchorVo> tAnchorVoList = new BeanListUtils<TAnchorVo, TAnchorEntity>(TAnchorVo.class, tAnchorEntities).getTargetList();
               //return ApiResponse.ok(tAnchorVoList);
        }

        /**
         * 删除对应主键的数据
         * @return
         */
         public ApiResponse delete(String id){
                //tAnchorEntityRepo.delete(id);
                return ApiResponse.prompt(Syscode.SC_OK);
         }

}