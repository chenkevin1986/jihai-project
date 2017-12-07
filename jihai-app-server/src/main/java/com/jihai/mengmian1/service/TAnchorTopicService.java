package com.jihai.mengmian1.service;

import com.google.common.reflect.TypeToken;
import com.jihai.mengmian.BeanUtils;
import com.jihai.mengmian.BeanListUtils;
import com.jihai.mengmian1.entity.TAnchorTopicEntity;
import com.jihai.mengmian1.repo.TAnchorTopicEntityRepo;
import com.jihai.mengmian1.vo.TAnchorTopicVo;
import com.jihai.mengmian1.dto.TAnchorTopicDto;
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
public class TAnchorTopicService {
    @Autowired
    private TAnchorTopicEntityRepo tAnchorTopicEntityRepo;

    /**
     * 新增
     * @param tAnchorTopicDto
     * @return ApiResponse<TAnchorTopicVo>
     */
     public ApiResponse<TAnchorTopicVo> insert(TAnchorTopicDto tAnchorTopicDto){
           return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<TAnchorTopicVo>(){}.getType()));
           //TAnchorTopicEntity tAnchorTopicEntity = BeanUtils.copyAttrs(new TAnchorTopicEntity(), tAnchorTopicDto);
           //tAnchorTopicEntityRepo.save(tAnchorTopicEntity);
           //return ApiResponse.ok(BeanUtils.copyAttrs(new TAnchorTopicVo(),tAnchorTopicEntity));
     }


     /**
      * 修改
      * @param tAnchorTopicDto
      * @return ApiResponse<TAnchorTopicVo>
      */
      public ApiResponse<TAnchorTopicVo> update(TAnchorTopicDto tAnchorTopicDto){
            return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<TAnchorTopicVo>(){}.getType()));
            //TAnchorTopicEntity tAnchorTopicEntity = BeanUtils.copyAttrs(new TAnchorTopicEntity(), tAnchorTopicDto);
            //tAnchorTopicEntityRepo.save(tAnchorTopicEntity);
            //return ApiResponse.ok(BeanUtils.copyAttrs(new TAnchorTopicVo(),tAnchorTopicEntity));
      }

      /**
       * 通过主键获取对象
       * @param id 实体主键
       * @return ApiResponse<TAnchorTopicVo>
       */
       public ApiResponse<TAnchorTopicVo> findOne(String id){
             return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<TAnchorTopicVo>(){}.getType()));
             //TAnchorTopicEntity tAnchorTopicEntity = tAnchorTopicEntityRepo.findOne(id);
             //return ApiResponse.ok(BeanUtils.copyAttrs(new TAnchorTopicVo(),tAnchorTopicEntity));
       }

       /**
        * 默认查询所有列表，若要筛选列表，请增加过滤参数
        * @return ApiResponse<List<TAnchorTopicVo>>
        */
        public ApiResponse<List<TAnchorTopicVo>> findAll(){
               return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<List<TAnchorTopicVo>>(){}.getType()));
               //List<TAnchorTopicEntity> tAnchorTopicEntities = tAnchorTopicEntityRepo.findAll();
               //List<TAnchorTopicVo> tAnchorTopicVoList = new BeanListUtils<TAnchorTopicVo, TAnchorTopicEntity>(TAnchorTopicVo.class, tAnchorTopicEntities).getTargetList();
               //return ApiResponse.ok(tAnchorTopicVoList);
        }

        /**
         * 删除对应主键的数据
         * @return
         */
         public ApiResponse delete(String id){
                //tAnchorTopicEntityRepo.delete(id);
                return ApiResponse.prompt(Syscode.SC_OK);
         }

}