package com.jihai.mengmian.service;

import com.google.common.reflect.TypeToken;
import com.jihai.mengmian.BeanUtils;
import com.jihai.mengmian.BeanListUtils;
import com.jihai.mengmian.entity.TShareAppEntity;
import com.jihai.mengmian.repo.TShareAppEntityRepo;
import com.jihai.mengmian.vo.TShareAppVo;
import com.jihai.mengmian.dto.TShareAppDto;
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
public class TShareAppService {
    @Autowired
    private TShareAppEntityRepo tShareAppEntityRepo;

    /**
     * 新增
     * @param tShareAppDto
     * @return ApiResponse<TShareAppVo>
     */
     public ApiResponse<TShareAppVo> insert(TShareAppDto tShareAppDto){
           return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<TShareAppVo>(){}.getType()));
           //TShareAppEntity tShareAppEntity = BeanUtils.copyAttrs(new TShareAppEntity(), tShareAppDto);
           //tShareAppEntityRepo.save(tShareAppEntity);
           //return ApiResponse.ok(BeanUtils.copyAttrs(new TShareAppVo(),tShareAppEntity));
     }


     /**
      * 修改
      * @param tShareAppDto
      * @return ApiResponse<TShareAppVo>
      */
      public ApiResponse<TShareAppVo> update(TShareAppDto tShareAppDto){
            return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<TShareAppVo>(){}.getType()));
            //TShareAppEntity tShareAppEntity = BeanUtils.copyAttrs(new TShareAppEntity(), tShareAppDto);
            //tShareAppEntityRepo.save(tShareAppEntity);
            //return ApiResponse.ok(BeanUtils.copyAttrs(new TShareAppVo(),tShareAppEntity));
      }

      /**
       * 通过主键获取对象
       * @param id 实体主键
       * @return ApiResponse<TShareAppVo>
       */
       public ApiResponse<TShareAppVo> findOne(String id){
             return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<TShareAppVo>(){}.getType()));
             //TShareAppEntity tShareAppEntity = tShareAppEntityRepo.findOne(id);
             //return ApiResponse.ok(BeanUtils.copyAttrs(new TShareAppVo(),tShareAppEntity));
       }

       /**
        * 默认查询所有列表，若要筛选列表，请增加过滤参数
        * @return ApiResponse<List<TShareAppVo>>
        */
        public ApiResponse<List<TShareAppVo>> findAll(){
               return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<List<TShareAppVo>>(){}.getType()));
               //List<TShareAppEntity> tShareAppEntities = tShareAppEntityRepo.findAll();
               //List<TShareAppVo> tShareAppVoList = new BeanListUtils<TShareAppVo, TShareAppEntity>(TShareAppVo.class, tShareAppEntities).getTargetList();
               //return ApiResponse.ok(tShareAppVoList);
        }

        /**
         * 删除对应主键的数据
         * @return
         */
         public ApiResponse delete(String id){
                //tShareAppEntityRepo.delete(id);
                return ApiResponse.prompt(Syscode.SC_OK);
         }

}