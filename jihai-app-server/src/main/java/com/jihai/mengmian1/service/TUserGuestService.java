package com.jihai.mengmian1.service;

import com.google.common.reflect.TypeToken;
import com.jihai.mengmian.BeanUtils;
import com.jihai.mengmian.BeanListUtils;
import com.jihai.mengmian1.entity.TUserGuestEntity;
import com.jihai.mengmian1.repo.TUserGuestEntityRepo;
import com.jihai.mengmian1.vo.TUserGuestVo;
import com.jihai.mengmian1.dto.TUserGuestDto;
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
public class TUserGuestService {
    @Autowired
    private TUserGuestEntityRepo tUserGuestEntityRepo;

    /**
     * 新增
     * @param tUserGuestDto
     * @return ApiResponse<TUserGuestVo>
     */
     public ApiResponse<TUserGuestVo> insert(TUserGuestDto tUserGuestDto){
           return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<TUserGuestVo>(){}.getType()));
           //TUserGuestEntity tUserGuestEntity = BeanUtils.copyAttrs(new TUserGuestEntity(), tUserGuestDto);
           //tUserGuestEntityRepo.save(tUserGuestEntity);
           //return ApiResponse.ok(BeanUtils.copyAttrs(new TUserGuestVo(),tUserGuestEntity));
     }


     /**
      * 修改
      * @param tUserGuestDto
      * @return ApiResponse<TUserGuestVo>
      */
      public ApiResponse<TUserGuestVo> update(TUserGuestDto tUserGuestDto){
            return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<TUserGuestVo>(){}.getType()));
            //TUserGuestEntity tUserGuestEntity = BeanUtils.copyAttrs(new TUserGuestEntity(), tUserGuestDto);
            //tUserGuestEntityRepo.save(tUserGuestEntity);
            //return ApiResponse.ok(BeanUtils.copyAttrs(new TUserGuestVo(),tUserGuestEntity));
      }

      /**
       * 通过主键获取对象
       * @param id 实体主键
       * @return ApiResponse<TUserGuestVo>
       */
       public ApiResponse<TUserGuestVo> findOne(String id){
             return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<TUserGuestVo>(){}.getType()));
             //TUserGuestEntity tUserGuestEntity = tUserGuestEntityRepo.findOne(id);
             //return ApiResponse.ok(BeanUtils.copyAttrs(new TUserGuestVo(),tUserGuestEntity));
       }

       /**
        * 默认查询所有列表，若要筛选列表，请增加过滤参数
        * @return ApiResponse<List<TUserGuestVo>>
        */
        public ApiResponse<List<TUserGuestVo>> findAll(){
               return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<List<TUserGuestVo>>(){}.getType()));
               //List<TUserGuestEntity> tUserGuestEntities = tUserGuestEntityRepo.findAll();
               //List<TUserGuestVo> tUserGuestVoList = new BeanListUtils<TUserGuestVo, TUserGuestEntity>(TUserGuestVo.class, tUserGuestEntities).getTargetList();
               //return ApiResponse.ok(tUserGuestVoList);
        }

        /**
         * 删除对应主键的数据
         * @return
         */
         public ApiResponse delete(String id){
                //tUserGuestEntityRepo.delete(id);
                return ApiResponse.prompt(Syscode.SC_OK);
         }

}