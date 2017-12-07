package com.jihai.mengmian1.service;

import com.google.common.reflect.TypeToken;
import com.jihai.mengmian.BeanUtils;
import com.jihai.mengmian.BeanListUtils;
import com.jihai.mengmian1.entity.TuserBlacklistEntity;
import com.jihai.mengmian1.repo.TuserBlacklistEntityRepo;
import com.jihai.mengmian1.vo.TuserBlacklistVo;
import com.jihai.mengmian1.dto.TuserBlacklistDto;
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
public class TuserBlacklistService {
    @Autowired
    private TuserBlacklistEntityRepo tuserBlacklistEntityRepo;

    /**
     * 新增
     * @param tuserBlacklistDto
     * @return ApiResponse<TuserBlacklistVo>
     */
     public ApiResponse<TuserBlacklistVo> insert(TuserBlacklistDto tuserBlacklistDto){
           return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<TuserBlacklistVo>(){}.getType()));
           //TuserBlacklistEntity tuserBlacklistEntity = BeanUtils.copyAttrs(new TuserBlacklistEntity(), tuserBlacklistDto);
           //tuserBlacklistEntityRepo.save(tuserBlacklistEntity);
           //return ApiResponse.ok(BeanUtils.copyAttrs(new TuserBlacklistVo(),tuserBlacklistEntity));
     }


     /**
      * 修改
      * @param tuserBlacklistDto
      * @return ApiResponse<TuserBlacklistVo>
      */
      public ApiResponse<TuserBlacklistVo> update(TuserBlacklistDto tuserBlacklistDto){
            return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<TuserBlacklistVo>(){}.getType()));
            //TuserBlacklistEntity tuserBlacklistEntity = BeanUtils.copyAttrs(new TuserBlacklistEntity(), tuserBlacklistDto);
            //tuserBlacklistEntityRepo.save(tuserBlacklistEntity);
            //return ApiResponse.ok(BeanUtils.copyAttrs(new TuserBlacklistVo(),tuserBlacklistEntity));
      }

      /**
       * 通过主键获取对象
       * @param id 实体主键
       * @return ApiResponse<TuserBlacklistVo>
       */
       public ApiResponse<TuserBlacklistVo> findOne(String id){
             return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<TuserBlacklistVo>(){}.getType()));
             //TuserBlacklistEntity tuserBlacklistEntity = tuserBlacklistEntityRepo.findOne(id);
             //return ApiResponse.ok(BeanUtils.copyAttrs(new TuserBlacklistVo(),tuserBlacklistEntity));
       }

       /**
        * 默认查询所有列表，若要筛选列表，请增加过滤参数
        * @return ApiResponse<List<TuserBlacklistVo>>
        */
        public ApiResponse<List<TuserBlacklistVo>> findAll(){
               return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<List<TuserBlacklistVo>>(){}.getType()));
               //List<TuserBlacklistEntity> tuserBlacklistEntities = tuserBlacklistEntityRepo.findAll();
               //List<TuserBlacklistVo> tuserBlacklistVoList = new BeanListUtils<TuserBlacklistVo, TuserBlacklistEntity>(TuserBlacklistVo.class, tuserBlacklistEntities).getTargetList();
               //return ApiResponse.ok(tuserBlacklistVoList);
        }

        /**
         * 删除对应主键的数据
         * @return
         */
         public ApiResponse delete(String id){
                //tuserBlacklistEntityRepo.delete(id);
                return ApiResponse.prompt(Syscode.SC_OK);
         }

}