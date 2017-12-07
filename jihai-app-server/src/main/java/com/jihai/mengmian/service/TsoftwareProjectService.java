package com.jihai.mengmian.service;

import com.google.common.reflect.TypeToken;
import com.jihai.mengmian.BeanUtils;
import com.jihai.mengmian.BeanListUtils;
import com.jihai.mengmian.entity.TsoftwareProjectEntity;
import com.jihai.mengmian.repo.TsoftwareProjectEntityRepo;
import com.jihai.mengmian.vo.TsoftwareProjectVo;
import com.jihai.mengmian.dto.TsoftwareProjectDto;
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
public class TsoftwareProjectService {
    @Autowired
    private TsoftwareProjectEntityRepo tsoftwareProjectEntityRepo;

    /**
     * 新增
     * @param tsoftwareProjectDto
     * @return ApiResponse<TsoftwareProjectVo>
     */
     public ApiResponse<TsoftwareProjectVo> insert(TsoftwareProjectDto tsoftwareProjectDto){
           return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<TsoftwareProjectVo>(){}.getType()));
           //TsoftwareProjectEntity tsoftwareProjectEntity = BeanUtils.copyAttrs(new TsoftwareProjectEntity(), tsoftwareProjectDto);
           //tsoftwareProjectEntityRepo.save(tsoftwareProjectEntity);
           //return ApiResponse.ok(BeanUtils.copyAttrs(new TsoftwareProjectVo(),tsoftwareProjectEntity));
     }


     /**
      * 修改
      * @param tsoftwareProjectDto
      * @return ApiResponse<TsoftwareProjectVo>
      */
      public ApiResponse<TsoftwareProjectVo> update(TsoftwareProjectDto tsoftwareProjectDto){
            return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<TsoftwareProjectVo>(){}.getType()));
            //TsoftwareProjectEntity tsoftwareProjectEntity = BeanUtils.copyAttrs(new TsoftwareProjectEntity(), tsoftwareProjectDto);
            //tsoftwareProjectEntityRepo.save(tsoftwareProjectEntity);
            //return ApiResponse.ok(BeanUtils.copyAttrs(new TsoftwareProjectVo(),tsoftwareProjectEntity));
      }

      /**
       * 通过主键获取对象
       * @param id 实体主键
       * @return ApiResponse<TsoftwareProjectVo>
       */
       public ApiResponse<TsoftwareProjectVo> findOne(String id){
             return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<TsoftwareProjectVo>(){}.getType()));
             //TsoftwareProjectEntity tsoftwareProjectEntity = tsoftwareProjectEntityRepo.findOne(id);
             //return ApiResponse.ok(BeanUtils.copyAttrs(new TsoftwareProjectVo(),tsoftwareProjectEntity));
       }

       /**
        * 默认查询所有列表，若要筛选列表，请增加过滤参数
        * @return ApiResponse<List<TsoftwareProjectVo>>
        */
        public ApiResponse<List<TsoftwareProjectVo>> findAll(){
               return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<List<TsoftwareProjectVo>>(){}.getType()));
               //List<TsoftwareProjectEntity> tsoftwareProjectEntities = tsoftwareProjectEntityRepo.findAll();
               //List<TsoftwareProjectVo> tsoftwareProjectVoList = new BeanListUtils<TsoftwareProjectVo, TsoftwareProjectEntity>(TsoftwareProjectVo.class, tsoftwareProjectEntities).getTargetList();
               //return ApiResponse.ok(tsoftwareProjectVoList);
        }

        /**
         * 删除对应主键的数据
         * @return
         */
         public ApiResponse delete(String id){
                //tsoftwareProjectEntityRepo.delete(id);
                return ApiResponse.prompt(Syscode.SC_OK);
         }

}