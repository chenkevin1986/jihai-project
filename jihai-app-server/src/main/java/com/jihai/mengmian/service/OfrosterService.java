package com.jihai.mengmian.service;

import com.google.common.reflect.TypeToken;
import com.jihai.mengmian.BeanUtils;
import com.jihai.mengmian.BeanListUtils;
import com.jihai.mengmian.entity.OfrosterEntity;
import com.jihai.mengmian.repo.OfrosterEntityRepo;
import com.jihai.mengmian.vo.OfrosterVo;
import com.jihai.mengmian.dto.OfrosterDto;
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
public class OfrosterService {
    @Autowired
    private OfrosterEntityRepo ofrosterEntityRepo;

    /**
     * 新增
     * @param ofrosterDto
     * @return ApiResponse<OfrosterVo>
     */
     public ApiResponse<OfrosterVo> insert(OfrosterDto ofrosterDto){
           return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<OfrosterVo>(){}.getType()));
           //OfrosterEntity ofrosterEntity = BeanUtils.copyAttrs(new OfrosterEntity(), ofrosterDto);
           //ofrosterEntityRepo.save(ofrosterEntity);
           //return ApiResponse.ok(BeanUtils.copyAttrs(new OfrosterVo(),ofrosterEntity));
     }


     /**
      * 修改
      * @param ofrosterDto
      * @return ApiResponse<OfrosterVo>
      */
      public ApiResponse<OfrosterVo> update(OfrosterDto ofrosterDto){
            return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<OfrosterVo>(){}.getType()));
            //OfrosterEntity ofrosterEntity = BeanUtils.copyAttrs(new OfrosterEntity(), ofrosterDto);
            //ofrosterEntityRepo.save(ofrosterEntity);
            //return ApiResponse.ok(BeanUtils.copyAttrs(new OfrosterVo(),ofrosterEntity));
      }

      /**
       * 通过主键获取对象
       * @param id 实体主键
       * @return ApiResponse<OfrosterVo>
       */
       public ApiResponse<OfrosterVo> findOne(String id){
             return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<OfrosterVo>(){}.getType()));
             //OfrosterEntity ofrosterEntity = ofrosterEntityRepo.findOne(id);
             //return ApiResponse.ok(BeanUtils.copyAttrs(new OfrosterVo(),ofrosterEntity));
       }

       /**
        * 默认查询所有列表，若要筛选列表，请增加过滤参数
        * @return ApiResponse<List<OfrosterVo>>
        */
        public ApiResponse<List<OfrosterVo>> findAll(){
               return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<List<OfrosterVo>>(){}.getType()));
               //List<OfrosterEntity> ofrosterEntities = ofrosterEntityRepo.findAll();
               //List<OfrosterVo> ofrosterVoList = new BeanListUtils<OfrosterVo, OfrosterEntity>(OfrosterVo.class, ofrosterEntities).getTargetList();
               //return ApiResponse.ok(ofrosterVoList);
        }

        /**
         * 删除对应主键的数据
         * @return
         */
         public ApiResponse delete(String id){
                //ofrosterEntityRepo.delete(id);
                return ApiResponse.prompt(Syscode.SC_OK);
         }

}