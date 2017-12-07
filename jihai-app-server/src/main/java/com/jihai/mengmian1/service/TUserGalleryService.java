package com.jihai.mengmian1.service;

import com.google.common.reflect.TypeToken;
import com.jihai.mengmian.BeanUtils;
import com.jihai.mengmian.BeanListUtils;
import com.jihai.mengmian1.entity.TUserGalleryEntity;
import com.jihai.mengmian1.repo.TUserGalleryEntityRepo;
import com.jihai.mengmian1.vo.TUserGalleryVo;
import com.jihai.mengmian1.dto.TUserGalleryDto;
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
 * <b>Time：</b> 2017-12-07 16:39:07 <br>
 * <b>Contact：<b>wechat and phone number - 13826126615<br>
 */
@Service
public class TUserGalleryService {
    @Autowired
    private TUserGalleryEntityRepo tUserGalleryEntityRepo;

    /**
     * 新增
     * @param tUserGalleryDto
     * @return ApiResponse<TUserGalleryVo>
     */
     public ApiResponse<TUserGalleryVo> insert(TUserGalleryDto tUserGalleryDto){
           return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<TUserGalleryVo>(){}.getType()));
           //TUserGalleryEntity tUserGalleryEntity = BeanUtils.copyAttrs(new TUserGalleryEntity(), tUserGalleryDto);
           //tUserGalleryEntityRepo.save(tUserGalleryEntity);
           //return ApiResponse.ok(BeanUtils.copyAttrs(new TUserGalleryVo(),tUserGalleryEntity));
     }


     /**
      * 修改
      * @param tUserGalleryDto
      * @return ApiResponse<TUserGalleryVo>
      */
      public ApiResponse<TUserGalleryVo> update(TUserGalleryDto tUserGalleryDto){
            return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<TUserGalleryVo>(){}.getType()));
            //TUserGalleryEntity tUserGalleryEntity = BeanUtils.copyAttrs(new TUserGalleryEntity(), tUserGalleryDto);
            //tUserGalleryEntityRepo.save(tUserGalleryEntity);
            //return ApiResponse.ok(BeanUtils.copyAttrs(new TUserGalleryVo(),tUserGalleryEntity));
      }

      /**
       * 通过主键获取对象
       * @param id 实体主键
       * @return ApiResponse<TUserGalleryVo>
       */
       public ApiResponse<TUserGalleryVo> findOne(String id){
             return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<TUserGalleryVo>(){}.getType()));
             //TUserGalleryEntity tUserGalleryEntity = tUserGalleryEntityRepo.findOne(id);
             //return ApiResponse.ok(BeanUtils.copyAttrs(new TUserGalleryVo(),tUserGalleryEntity));
       }

       /**
        * 默认查询所有列表，若要筛选列表，请增加过滤参数
        * @return ApiResponse<List<TUserGalleryVo>>
        */
        public ApiResponse<List<TUserGalleryVo>> findAll(){
               return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<List<TUserGalleryVo>>(){}.getType()));
               //List<TUserGalleryEntity> tUserGalleryEntities = tUserGalleryEntityRepo.findAll();
               //List<TUserGalleryVo> tUserGalleryVoList = new BeanListUtils<TUserGalleryVo, TUserGalleryEntity>(TUserGalleryVo.class, tUserGalleryEntities).getTargetList();
               //return ApiResponse.ok(tUserGalleryVoList);
        }

        /**
         * 删除对应主键的数据
         * @return
         */
         public ApiResponse delete(String id){
                //tUserGalleryEntityRepo.delete(id);
                return ApiResponse.prompt(Syscode.SC_OK);
         }

}