package com.jihai.mengmian.service;

import com.google.common.reflect.TypeToken;
import com.jihai.mengmian.BeanUtils;
import com.jihai.mengmian.BeanListUtils;
import com.jihai.mengmian.entity.OfpropertyEntity;
import com.jihai.mengmian.repo.OfpropertyEntityRepo;
import com.jihai.mengmian.vo.OfpropertyVo;
import com.jihai.mengmian.dto.OfpropertyDto;
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
public class OfpropertyService {
    @Autowired
    private OfpropertyEntityRepo ofpropertyEntityRepo;

    /**
     * 新增
     * @param ofpropertyDto
     * @return ApiResponse<OfpropertyVo>
     */
     public ApiResponse<OfpropertyVo> insert(OfpropertyDto ofpropertyDto){
           return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<OfpropertyVo>(){}.getType()));
           //OfpropertyEntity ofpropertyEntity = BeanUtils.copyAttrs(new OfpropertyEntity(), ofpropertyDto);
           //ofpropertyEntityRepo.save(ofpropertyEntity);
           //return ApiResponse.ok(BeanUtils.copyAttrs(new OfpropertyVo(),ofpropertyEntity));
     }


     /**
      * 修改
      * @param ofpropertyDto
      * @return ApiResponse<OfpropertyVo>
      */
      public ApiResponse<OfpropertyVo> update(OfpropertyDto ofpropertyDto){
            return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<OfpropertyVo>(){}.getType()));
            //OfpropertyEntity ofpropertyEntity = BeanUtils.copyAttrs(new OfpropertyEntity(), ofpropertyDto);
            //ofpropertyEntityRepo.save(ofpropertyEntity);
            //return ApiResponse.ok(BeanUtils.copyAttrs(new OfpropertyVo(),ofpropertyEntity));
      }

      /**
       * 通过主键获取对象
       * @param id 实体主键
       * @return ApiResponse<OfpropertyVo>
       */
       public ApiResponse<OfpropertyVo> findOne(String id){
             return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<OfpropertyVo>(){}.getType()));
             //OfpropertyEntity ofpropertyEntity = ofpropertyEntityRepo.findOne(id);
             //return ApiResponse.ok(BeanUtils.copyAttrs(new OfpropertyVo(),ofpropertyEntity));
       }

       /**
        * 默认查询所有列表，若要筛选列表，请增加过滤参数
        * @return ApiResponse<List<OfpropertyVo>>
        */
        public ApiResponse<List<OfpropertyVo>> findAll(){
               return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<List<OfpropertyVo>>(){}.getType()));
               //List<OfpropertyEntity> ofpropertyEntities = ofpropertyEntityRepo.findAll();
               //List<OfpropertyVo> ofpropertyVoList = new BeanListUtils<OfpropertyVo, OfpropertyEntity>(OfpropertyVo.class, ofpropertyEntities).getTargetList();
               //return ApiResponse.ok(ofpropertyVoList);
        }

        /**
         * 删除对应主键的数据
         * @return
         */
         public ApiResponse delete(String id){
                //ofpropertyEntityRepo.delete(id);
                return ApiResponse.prompt(Syscode.SC_OK);
         }

}