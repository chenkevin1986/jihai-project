package com.jihai.mengmian1.service;

import com.google.common.reflect.TypeToken;
import com.jihai.mengmian.BeanUtils;
import com.jihai.mengmian.BeanListUtils;
import com.jihai.mengmian1.entity.TdalSetTableEntity;
import com.jihai.mengmian1.repo.TdalSetTableEntityRepo;
import com.jihai.mengmian1.vo.TdalSetTableVo;
import com.jihai.mengmian1.dto.TdalSetTableDto;
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
public class TdalSetTableService {
    @Autowired
    private TdalSetTableEntityRepo tdalSetTableEntityRepo;

    /**
     * 新增
     * @param tdalSetTableDto
     * @return ApiResponse<TdalSetTableVo>
     */
     public ApiResponse<TdalSetTableVo> insert(TdalSetTableDto tdalSetTableDto){
           return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<TdalSetTableVo>(){}.getType()));
           //TdalSetTableEntity tdalSetTableEntity = BeanUtils.copyAttrs(new TdalSetTableEntity(), tdalSetTableDto);
           //tdalSetTableEntityRepo.save(tdalSetTableEntity);
           //return ApiResponse.ok(BeanUtils.copyAttrs(new TdalSetTableVo(),tdalSetTableEntity));
     }


     /**
      * 修改
      * @param tdalSetTableDto
      * @return ApiResponse<TdalSetTableVo>
      */
      public ApiResponse<TdalSetTableVo> update(TdalSetTableDto tdalSetTableDto){
            return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<TdalSetTableVo>(){}.getType()));
            //TdalSetTableEntity tdalSetTableEntity = BeanUtils.copyAttrs(new TdalSetTableEntity(), tdalSetTableDto);
            //tdalSetTableEntityRepo.save(tdalSetTableEntity);
            //return ApiResponse.ok(BeanUtils.copyAttrs(new TdalSetTableVo(),tdalSetTableEntity));
      }

      /**
       * 通过主键获取对象
       * @param id 实体主键
       * @return ApiResponse<TdalSetTableVo>
       */
       public ApiResponse<TdalSetTableVo> findOne(String id){
             return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<TdalSetTableVo>(){}.getType()));
             //TdalSetTableEntity tdalSetTableEntity = tdalSetTableEntityRepo.findOne(id);
             //return ApiResponse.ok(BeanUtils.copyAttrs(new TdalSetTableVo(),tdalSetTableEntity));
       }

       /**
        * 默认查询所有列表，若要筛选列表，请增加过滤参数
        * @return ApiResponse<List<TdalSetTableVo>>
        */
        public ApiResponse<List<TdalSetTableVo>> findAll(){
               return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<List<TdalSetTableVo>>(){}.getType()));
               //List<TdalSetTableEntity> tdalSetTableEntities = tdalSetTableEntityRepo.findAll();
               //List<TdalSetTableVo> tdalSetTableVoList = new BeanListUtils<TdalSetTableVo, TdalSetTableEntity>(TdalSetTableVo.class, tdalSetTableEntities).getTargetList();
               //return ApiResponse.ok(tdalSetTableVoList);
        }

        /**
         * 删除对应主键的数据
         * @return
         */
         public ApiResponse delete(String id){
                //tdalSetTableEntityRepo.delete(id);
                return ApiResponse.prompt(Syscode.SC_OK);
         }

}