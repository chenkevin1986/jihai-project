package com.jihai.mengmian1.service;

import com.google.common.reflect.TypeToken;
import com.jihai.mengmian.BeanUtils;
import com.jihai.mengmian.BeanListUtils;
import com.jihai.mengmian1.entity.TwebNginxConfigEntity;
import com.jihai.mengmian1.repo.TwebNginxConfigEntityRepo;
import com.jihai.mengmian1.vo.TwebNginxConfigVo;
import com.jihai.mengmian1.dto.TwebNginxConfigDto;
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
public class TwebNginxConfigService {
    @Autowired
    private TwebNginxConfigEntityRepo twebNginxConfigEntityRepo;

    /**
     * 新增
     * @param twebNginxConfigDto
     * @return ApiResponse<TwebNginxConfigVo>
     */
     public ApiResponse<TwebNginxConfigVo> insert(TwebNginxConfigDto twebNginxConfigDto){
           return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<TwebNginxConfigVo>(){}.getType()));
           //TwebNginxConfigEntity twebNginxConfigEntity = BeanUtils.copyAttrs(new TwebNginxConfigEntity(), twebNginxConfigDto);
           //twebNginxConfigEntityRepo.save(twebNginxConfigEntity);
           //return ApiResponse.ok(BeanUtils.copyAttrs(new TwebNginxConfigVo(),twebNginxConfigEntity));
     }


     /**
      * 修改
      * @param twebNginxConfigDto
      * @return ApiResponse<TwebNginxConfigVo>
      */
      public ApiResponse<TwebNginxConfigVo> update(TwebNginxConfigDto twebNginxConfigDto){
            return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<TwebNginxConfigVo>(){}.getType()));
            //TwebNginxConfigEntity twebNginxConfigEntity = BeanUtils.copyAttrs(new TwebNginxConfigEntity(), twebNginxConfigDto);
            //twebNginxConfigEntityRepo.save(twebNginxConfigEntity);
            //return ApiResponse.ok(BeanUtils.copyAttrs(new TwebNginxConfigVo(),twebNginxConfigEntity));
      }

      /**
       * 通过主键获取对象
       * @param id 实体主键
       * @return ApiResponse<TwebNginxConfigVo>
       */
       public ApiResponse<TwebNginxConfigVo> findOne(String id){
             return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<TwebNginxConfigVo>(){}.getType()));
             //TwebNginxConfigEntity twebNginxConfigEntity = twebNginxConfigEntityRepo.findOne(id);
             //return ApiResponse.ok(BeanUtils.copyAttrs(new TwebNginxConfigVo(),twebNginxConfigEntity));
       }

       /**
        * 默认查询所有列表，若要筛选列表，请增加过滤参数
        * @return ApiResponse<List<TwebNginxConfigVo>>
        */
        public ApiResponse<List<TwebNginxConfigVo>> findAll(){
               return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<List<TwebNginxConfigVo>>(){}.getType()));
               //List<TwebNginxConfigEntity> twebNginxConfigEntities = twebNginxConfigEntityRepo.findAll();
               //List<TwebNginxConfigVo> twebNginxConfigVoList = new BeanListUtils<TwebNginxConfigVo, TwebNginxConfigEntity>(TwebNginxConfigVo.class, twebNginxConfigEntities).getTargetList();
               //return ApiResponse.ok(twebNginxConfigVoList);
        }

        /**
         * 删除对应主键的数据
         * @return
         */
         public ApiResponse delete(String id){
                //twebNginxConfigEntityRepo.delete(id);
                return ApiResponse.prompt(Syscode.SC_OK);
         }

}