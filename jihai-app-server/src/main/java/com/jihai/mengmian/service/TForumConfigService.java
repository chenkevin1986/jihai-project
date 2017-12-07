package com.jihai.mengmian.service;

import com.google.common.reflect.TypeToken;
import com.jihai.mengmian.BeanUtils;
import com.jihai.mengmian.BeanListUtils;
import com.jihai.mengmian.entity.TForumConfigEntity;
import com.jihai.mengmian.repo.TForumConfigEntityRepo;
import com.jihai.mengmian.vo.TForumConfigVo;
import com.jihai.mengmian.dto.TForumConfigDto;
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
 * <b>Time：</b> 2017-12-07 16:37:28 <br>
 * <b>Contact：<b>wechat and phone number - 13826126615<br>
 */
@Service
public class TForumConfigService {
    @Autowired
    private TForumConfigEntityRepo tForumConfigEntityRepo;

    /**
     * 新增
     * @param tForumConfigDto
     * @return ApiResponse<TForumConfigVo>
     */
     public ApiResponse<TForumConfigVo> insert(TForumConfigDto tForumConfigDto){
           return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<TForumConfigVo>(){}.getType()));
           //TForumConfigEntity tForumConfigEntity = BeanUtils.copyAttrs(new TForumConfigEntity(), tForumConfigDto);
           //tForumConfigEntityRepo.save(tForumConfigEntity);
           //return ApiResponse.ok(BeanUtils.copyAttrs(new TForumConfigVo(),tForumConfigEntity));
     }


     /**
      * 修改
      * @param tForumConfigDto
      * @return ApiResponse<TForumConfigVo>
      */
      public ApiResponse<TForumConfigVo> update(TForumConfigDto tForumConfigDto){
            return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<TForumConfigVo>(){}.getType()));
            //TForumConfigEntity tForumConfigEntity = BeanUtils.copyAttrs(new TForumConfigEntity(), tForumConfigDto);
            //tForumConfigEntityRepo.save(tForumConfigEntity);
            //return ApiResponse.ok(BeanUtils.copyAttrs(new TForumConfigVo(),tForumConfigEntity));
      }

      /**
       * 通过主键获取对象
       * @param id 实体主键
       * @return ApiResponse<TForumConfigVo>
       */
       public ApiResponse<TForumConfigVo> findOne(String id){
             return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<TForumConfigVo>(){}.getType()));
             //TForumConfigEntity tForumConfigEntity = tForumConfigEntityRepo.findOne(id);
             //return ApiResponse.ok(BeanUtils.copyAttrs(new TForumConfigVo(),tForumConfigEntity));
       }

       /**
        * 默认查询所有列表，若要筛选列表，请增加过滤参数
        * @return ApiResponse<List<TForumConfigVo>>
        */
        public ApiResponse<List<TForumConfigVo>> findAll(){
               return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<List<TForumConfigVo>>(){}.getType()));
               //List<TForumConfigEntity> tForumConfigEntities = tForumConfigEntityRepo.findAll();
               //List<TForumConfigVo> tForumConfigVoList = new BeanListUtils<TForumConfigVo, TForumConfigEntity>(TForumConfigVo.class, tForumConfigEntities).getTargetList();
               //return ApiResponse.ok(tForumConfigVoList);
        }

        /**
         * 删除对应主键的数据
         * @return
         */
         public ApiResponse delete(String id){
                //tForumConfigEntityRepo.delete(id);
                return ApiResponse.prompt(Syscode.SC_OK);
         }

}