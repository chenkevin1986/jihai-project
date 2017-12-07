package com.jihai.mengmian1.service;

import com.google.common.reflect.TypeToken;
import com.jihai.mengmian.BeanUtils;
import com.jihai.mengmian.BeanListUtils;
import com.jihai.mengmian1.entity.OfmucmemberEntity;
import com.jihai.mengmian1.repo.OfmucmemberEntityRepo;
import com.jihai.mengmian1.vo.OfmucmemberVo;
import com.jihai.mengmian1.dto.OfmucmemberDto;
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
public class OfmucmemberService {
    @Autowired
    private OfmucmemberEntityRepo ofmucmemberEntityRepo;

    /**
     * 新增
     * @param ofmucmemberDto
     * @return ApiResponse<OfmucmemberVo>
     */
     public ApiResponse<OfmucmemberVo> insert(OfmucmemberDto ofmucmemberDto){
           return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<OfmucmemberVo>(){}.getType()));
           //OfmucmemberEntity ofmucmemberEntity = BeanUtils.copyAttrs(new OfmucmemberEntity(), ofmucmemberDto);
           //ofmucmemberEntityRepo.save(ofmucmemberEntity);
           //return ApiResponse.ok(BeanUtils.copyAttrs(new OfmucmemberVo(),ofmucmemberEntity));
     }


     /**
      * 修改
      * @param ofmucmemberDto
      * @return ApiResponse<OfmucmemberVo>
      */
      public ApiResponse<OfmucmemberVo> update(OfmucmemberDto ofmucmemberDto){
            return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<OfmucmemberVo>(){}.getType()));
            //OfmucmemberEntity ofmucmemberEntity = BeanUtils.copyAttrs(new OfmucmemberEntity(), ofmucmemberDto);
            //ofmucmemberEntityRepo.save(ofmucmemberEntity);
            //return ApiResponse.ok(BeanUtils.copyAttrs(new OfmucmemberVo(),ofmucmemberEntity));
      }

      /**
       * 通过主键获取对象
       * @param id 实体主键
       * @return ApiResponse<OfmucmemberVo>
       */
       public ApiResponse<OfmucmemberVo> findOne(String id){
             return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<OfmucmemberVo>(){}.getType()));
             //OfmucmemberEntity ofmucmemberEntity = ofmucmemberEntityRepo.findOne(id);
             //return ApiResponse.ok(BeanUtils.copyAttrs(new OfmucmemberVo(),ofmucmemberEntity));
       }

       /**
        * 默认查询所有列表，若要筛选列表，请增加过滤参数
        * @return ApiResponse<List<OfmucmemberVo>>
        */
        public ApiResponse<List<OfmucmemberVo>> findAll(){
               return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<List<OfmucmemberVo>>(){}.getType()));
               //List<OfmucmemberEntity> ofmucmemberEntities = ofmucmemberEntityRepo.findAll();
               //List<OfmucmemberVo> ofmucmemberVoList = new BeanListUtils<OfmucmemberVo, OfmucmemberEntity>(OfmucmemberVo.class, ofmucmemberEntities).getTargetList();
               //return ApiResponse.ok(ofmucmemberVoList);
        }

        /**
         * 删除对应主键的数据
         * @return
         */
         public ApiResponse delete(String id){
                //ofmucmemberEntityRepo.delete(id);
                return ApiResponse.prompt(Syscode.SC_OK);
         }

}