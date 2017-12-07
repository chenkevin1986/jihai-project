package com.jihai.mengmian.service;

import com.google.common.reflect.TypeToken;
import com.jihai.mengmian.BeanUtils;
import com.jihai.mengmian.BeanListUtils;
import com.jihai.mengmian.entity.OfpubsubnodegroupsEntity;
import com.jihai.mengmian.repo.OfpubsubnodegroupsEntityRepo;
import com.jihai.mengmian.vo.OfpubsubnodegroupsVo;
import com.jihai.mengmian.dto.OfpubsubnodegroupsDto;
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
public class OfpubsubnodegroupsService {
    @Autowired
    private OfpubsubnodegroupsEntityRepo ofpubsubnodegroupsEntityRepo;

    /**
     * 新增
     * @param ofpubsubnodegroupsDto
     * @return ApiResponse<OfpubsubnodegroupsVo>
     */
     public ApiResponse<OfpubsubnodegroupsVo> insert(OfpubsubnodegroupsDto ofpubsubnodegroupsDto){
           return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<OfpubsubnodegroupsVo>(){}.getType()));
           //OfpubsubnodegroupsEntity ofpubsubnodegroupsEntity = BeanUtils.copyAttrs(new OfpubsubnodegroupsEntity(), ofpubsubnodegroupsDto);
           //ofpubsubnodegroupsEntityRepo.save(ofpubsubnodegroupsEntity);
           //return ApiResponse.ok(BeanUtils.copyAttrs(new OfpubsubnodegroupsVo(),ofpubsubnodegroupsEntity));
     }


     /**
      * 修改
      * @param ofpubsubnodegroupsDto
      * @return ApiResponse<OfpubsubnodegroupsVo>
      */
      public ApiResponse<OfpubsubnodegroupsVo> update(OfpubsubnodegroupsDto ofpubsubnodegroupsDto){
            return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<OfpubsubnodegroupsVo>(){}.getType()));
            //OfpubsubnodegroupsEntity ofpubsubnodegroupsEntity = BeanUtils.copyAttrs(new OfpubsubnodegroupsEntity(), ofpubsubnodegroupsDto);
            //ofpubsubnodegroupsEntityRepo.save(ofpubsubnodegroupsEntity);
            //return ApiResponse.ok(BeanUtils.copyAttrs(new OfpubsubnodegroupsVo(),ofpubsubnodegroupsEntity));
      }

      /**
       * 通过主键获取对象
       * @param id 实体主键
       * @return ApiResponse<OfpubsubnodegroupsVo>
       */
       public ApiResponse<OfpubsubnodegroupsVo> findOne(String id){
             return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<OfpubsubnodegroupsVo>(){}.getType()));
             //OfpubsubnodegroupsEntity ofpubsubnodegroupsEntity = ofpubsubnodegroupsEntityRepo.findOne(id);
             //return ApiResponse.ok(BeanUtils.copyAttrs(new OfpubsubnodegroupsVo(),ofpubsubnodegroupsEntity));
       }

       /**
        * 默认查询所有列表，若要筛选列表，请增加过滤参数
        * @return ApiResponse<List<OfpubsubnodegroupsVo>>
        */
        public ApiResponse<List<OfpubsubnodegroupsVo>> findAll(){
               return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<List<OfpubsubnodegroupsVo>>(){}.getType()));
               //List<OfpubsubnodegroupsEntity> ofpubsubnodegroupsEntities = ofpubsubnodegroupsEntityRepo.findAll();
               //List<OfpubsubnodegroupsVo> ofpubsubnodegroupsVoList = new BeanListUtils<OfpubsubnodegroupsVo, OfpubsubnodegroupsEntity>(OfpubsubnodegroupsVo.class, ofpubsubnodegroupsEntities).getTargetList();
               //return ApiResponse.ok(ofpubsubnodegroupsVoList);
        }

        /**
         * 删除对应主键的数据
         * @return
         */
         public ApiResponse delete(String id){
                //ofpubsubnodegroupsEntityRepo.delete(id);
                return ApiResponse.prompt(Syscode.SC_OK);
         }

}