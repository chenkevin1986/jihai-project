package com.jihai.mengmian.service;

import com.google.common.reflect.TypeToken;
import com.jihai.mengmian.BeanUtils;
import com.jihai.mengmian.BeanListUtils;
import com.jihai.mengmian.entity.TShareDetailEntity;
import com.jihai.mengmian.repo.TShareDetailEntityRepo;
import com.jihai.mengmian.vo.TShareDetailVo;
import com.jihai.mengmian.dto.TShareDetailDto;
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
public class TShareDetailService {
    @Autowired
    private TShareDetailEntityRepo tShareDetailEntityRepo;

    /**
     * 新增
     * @param tShareDetailDto
     * @return ApiResponse<TShareDetailVo>
     */
     public ApiResponse<TShareDetailVo> insert(TShareDetailDto tShareDetailDto){
           return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<TShareDetailVo>(){}.getType()));
           //TShareDetailEntity tShareDetailEntity = BeanUtils.copyAttrs(new TShareDetailEntity(), tShareDetailDto);
           //tShareDetailEntityRepo.save(tShareDetailEntity);
           //return ApiResponse.ok(BeanUtils.copyAttrs(new TShareDetailVo(),tShareDetailEntity));
     }


     /**
      * 修改
      * @param tShareDetailDto
      * @return ApiResponse<TShareDetailVo>
      */
      public ApiResponse<TShareDetailVo> update(TShareDetailDto tShareDetailDto){
            return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<TShareDetailVo>(){}.getType()));
            //TShareDetailEntity tShareDetailEntity = BeanUtils.copyAttrs(new TShareDetailEntity(), tShareDetailDto);
            //tShareDetailEntityRepo.save(tShareDetailEntity);
            //return ApiResponse.ok(BeanUtils.copyAttrs(new TShareDetailVo(),tShareDetailEntity));
      }

      /**
       * 通过主键获取对象
       * @param id 实体主键
       * @return ApiResponse<TShareDetailVo>
       */
       public ApiResponse<TShareDetailVo> findOne(String id){
             return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<TShareDetailVo>(){}.getType()));
             //TShareDetailEntity tShareDetailEntity = tShareDetailEntityRepo.findOne(id);
             //return ApiResponse.ok(BeanUtils.copyAttrs(new TShareDetailVo(),tShareDetailEntity));
       }

       /**
        * 默认查询所有列表，若要筛选列表，请增加过滤参数
        * @return ApiResponse<List<TShareDetailVo>>
        */
        public ApiResponse<List<TShareDetailVo>> findAll(){
               return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<List<TShareDetailVo>>(){}.getType()));
               //List<TShareDetailEntity> tShareDetailEntities = tShareDetailEntityRepo.findAll();
               //List<TShareDetailVo> tShareDetailVoList = new BeanListUtils<TShareDetailVo, TShareDetailEntity>(TShareDetailVo.class, tShareDetailEntities).getTargetList();
               //return ApiResponse.ok(tShareDetailVoList);
        }

        /**
         * 删除对应主键的数据
         * @return
         */
         public ApiResponse delete(String id){
                //tShareDetailEntityRepo.delete(id);
                return ApiResponse.prompt(Syscode.SC_OK);
         }

}