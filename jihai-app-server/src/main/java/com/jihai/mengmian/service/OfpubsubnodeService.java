package com.jihai.mengmian.service;

import com.google.common.reflect.TypeToken;
import com.jihai.mengmian.BeanUtils;
import com.jihai.mengmian.BeanListUtils;
import com.jihai.mengmian.entity.OfpubsubnodeEntity;
import com.jihai.mengmian.repo.OfpubsubnodeEntityRepo;
import com.jihai.mengmian.vo.OfpubsubnodeVo;
import com.jihai.mengmian.dto.OfpubsubnodeDto;
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
public class OfpubsubnodeService {
    @Autowired
    private OfpubsubnodeEntityRepo ofpubsubnodeEntityRepo;

    /**
     * 新增
     * @param ofpubsubnodeDto
     * @return ApiResponse<OfpubsubnodeVo>
     */
     public ApiResponse<OfpubsubnodeVo> insert(OfpubsubnodeDto ofpubsubnodeDto){
           return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<OfpubsubnodeVo>(){}.getType()));
           //OfpubsubnodeEntity ofpubsubnodeEntity = BeanUtils.copyAttrs(new OfpubsubnodeEntity(), ofpubsubnodeDto);
           //ofpubsubnodeEntityRepo.save(ofpubsubnodeEntity);
           //return ApiResponse.ok(BeanUtils.copyAttrs(new OfpubsubnodeVo(),ofpubsubnodeEntity));
     }


     /**
      * 修改
      * @param ofpubsubnodeDto
      * @return ApiResponse<OfpubsubnodeVo>
      */
      public ApiResponse<OfpubsubnodeVo> update(OfpubsubnodeDto ofpubsubnodeDto){
            return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<OfpubsubnodeVo>(){}.getType()));
            //OfpubsubnodeEntity ofpubsubnodeEntity = BeanUtils.copyAttrs(new OfpubsubnodeEntity(), ofpubsubnodeDto);
            //ofpubsubnodeEntityRepo.save(ofpubsubnodeEntity);
            //return ApiResponse.ok(BeanUtils.copyAttrs(new OfpubsubnodeVo(),ofpubsubnodeEntity));
      }

      /**
       * 通过主键获取对象
       * @param id 实体主键
       * @return ApiResponse<OfpubsubnodeVo>
       */
       public ApiResponse<OfpubsubnodeVo> findOne(String id){
             return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<OfpubsubnodeVo>(){}.getType()));
             //OfpubsubnodeEntity ofpubsubnodeEntity = ofpubsubnodeEntityRepo.findOne(id);
             //return ApiResponse.ok(BeanUtils.copyAttrs(new OfpubsubnodeVo(),ofpubsubnodeEntity));
       }

       /**
        * 默认查询所有列表，若要筛选列表，请增加过滤参数
        * @return ApiResponse<List<OfpubsubnodeVo>>
        */
        public ApiResponse<List<OfpubsubnodeVo>> findAll(){
               return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<List<OfpubsubnodeVo>>(){}.getType()));
               //List<OfpubsubnodeEntity> ofpubsubnodeEntities = ofpubsubnodeEntityRepo.findAll();
               //List<OfpubsubnodeVo> ofpubsubnodeVoList = new BeanListUtils<OfpubsubnodeVo, OfpubsubnodeEntity>(OfpubsubnodeVo.class, ofpubsubnodeEntities).getTargetList();
               //return ApiResponse.ok(ofpubsubnodeVoList);
        }

        /**
         * 删除对应主键的数据
         * @return
         */
         public ApiResponse delete(String id){
                //ofpubsubnodeEntityRepo.delete(id);
                return ApiResponse.prompt(Syscode.SC_OK);
         }

}