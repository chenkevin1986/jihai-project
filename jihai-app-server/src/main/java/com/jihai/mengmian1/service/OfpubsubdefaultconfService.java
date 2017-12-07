package com.jihai.mengmian1.service;

import com.google.common.reflect.TypeToken;
import com.jihai.mengmian.BeanUtils;
import com.jihai.mengmian.BeanListUtils;
import com.jihai.mengmian1.entity.OfpubsubdefaultconfEntity;
import com.jihai.mengmian1.repo.OfpubsubdefaultconfEntityRepo;
import com.jihai.mengmian1.vo.OfpubsubdefaultconfVo;
import com.jihai.mengmian1.dto.OfpubsubdefaultconfDto;
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
 * <b>Time：</b> 2017-12-07 16:39:06 <br>
 * <b>Contact：<b>wechat and phone number - 13826126615<br>
 */
@Service
public class OfpubsubdefaultconfService {
    @Autowired
    private OfpubsubdefaultconfEntityRepo ofpubsubdefaultconfEntityRepo;

    /**
     * 新增
     * @param ofpubsubdefaultconfDto
     * @return ApiResponse<OfpubsubdefaultconfVo>
     */
     public ApiResponse<OfpubsubdefaultconfVo> insert(OfpubsubdefaultconfDto ofpubsubdefaultconfDto){
           return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<OfpubsubdefaultconfVo>(){}.getType()));
           //OfpubsubdefaultconfEntity ofpubsubdefaultconfEntity = BeanUtils.copyAttrs(new OfpubsubdefaultconfEntity(), ofpubsubdefaultconfDto);
           //ofpubsubdefaultconfEntityRepo.save(ofpubsubdefaultconfEntity);
           //return ApiResponse.ok(BeanUtils.copyAttrs(new OfpubsubdefaultconfVo(),ofpubsubdefaultconfEntity));
     }


     /**
      * 修改
      * @param ofpubsubdefaultconfDto
      * @return ApiResponse<OfpubsubdefaultconfVo>
      */
      public ApiResponse<OfpubsubdefaultconfVo> update(OfpubsubdefaultconfDto ofpubsubdefaultconfDto){
            return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<OfpubsubdefaultconfVo>(){}.getType()));
            //OfpubsubdefaultconfEntity ofpubsubdefaultconfEntity = BeanUtils.copyAttrs(new OfpubsubdefaultconfEntity(), ofpubsubdefaultconfDto);
            //ofpubsubdefaultconfEntityRepo.save(ofpubsubdefaultconfEntity);
            //return ApiResponse.ok(BeanUtils.copyAttrs(new OfpubsubdefaultconfVo(),ofpubsubdefaultconfEntity));
      }

      /**
       * 通过主键获取对象
       * @param id 实体主键
       * @return ApiResponse<OfpubsubdefaultconfVo>
       */
       public ApiResponse<OfpubsubdefaultconfVo> findOne(String id){
             return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<OfpubsubdefaultconfVo>(){}.getType()));
             //OfpubsubdefaultconfEntity ofpubsubdefaultconfEntity = ofpubsubdefaultconfEntityRepo.findOne(id);
             //return ApiResponse.ok(BeanUtils.copyAttrs(new OfpubsubdefaultconfVo(),ofpubsubdefaultconfEntity));
       }

       /**
        * 默认查询所有列表，若要筛选列表，请增加过滤参数
        * @return ApiResponse<List<OfpubsubdefaultconfVo>>
        */
        public ApiResponse<List<OfpubsubdefaultconfVo>> findAll(){
               return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<List<OfpubsubdefaultconfVo>>(){}.getType()));
               //List<OfpubsubdefaultconfEntity> ofpubsubdefaultconfEntities = ofpubsubdefaultconfEntityRepo.findAll();
               //List<OfpubsubdefaultconfVo> ofpubsubdefaultconfVoList = new BeanListUtils<OfpubsubdefaultconfVo, OfpubsubdefaultconfEntity>(OfpubsubdefaultconfVo.class, ofpubsubdefaultconfEntities).getTargetList();
               //return ApiResponse.ok(ofpubsubdefaultconfVoList);
        }

        /**
         * 删除对应主键的数据
         * @return
         */
         public ApiResponse delete(String id){
                //ofpubsubdefaultconfEntityRepo.delete(id);
                return ApiResponse.prompt(Syscode.SC_OK);
         }

}