package com.jihai.mengmian.service;

import com.google.common.reflect.TypeToken;
import com.jihai.mengmian.BeanUtils;
import com.jihai.mengmian.BeanListUtils;
import com.jihai.mengmian.entity.ToaUserEntity;
import com.jihai.mengmian.repo.ToaUserEntityRepo;
import com.jihai.mengmian.vo.ToaUserVo;
import com.jihai.mengmian.dto.ToaUserDto;
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
public class ToaUserService {
    @Autowired
    private ToaUserEntityRepo toaUserEntityRepo;

    /**
     * 新增
     * @param toaUserDto
     * @return ApiResponse<ToaUserVo>
     */
     public ApiResponse<ToaUserVo> insert(ToaUserDto toaUserDto){
           return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<ToaUserVo>(){}.getType()));
           //ToaUserEntity toaUserEntity = BeanUtils.copyAttrs(new ToaUserEntity(), toaUserDto);
           //toaUserEntityRepo.save(toaUserEntity);
           //return ApiResponse.ok(BeanUtils.copyAttrs(new ToaUserVo(),toaUserEntity));
     }


     /**
      * 修改
      * @param toaUserDto
      * @return ApiResponse<ToaUserVo>
      */
      public ApiResponse<ToaUserVo> update(ToaUserDto toaUserDto){
            return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<ToaUserVo>(){}.getType()));
            //ToaUserEntity toaUserEntity = BeanUtils.copyAttrs(new ToaUserEntity(), toaUserDto);
            //toaUserEntityRepo.save(toaUserEntity);
            //return ApiResponse.ok(BeanUtils.copyAttrs(new ToaUserVo(),toaUserEntity));
      }

      /**
       * 通过主键获取对象
       * @param id 实体主键
       * @return ApiResponse<ToaUserVo>
       */
       public ApiResponse<ToaUserVo> findOne(String id){
             return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<ToaUserVo>(){}.getType()));
             //ToaUserEntity toaUserEntity = toaUserEntityRepo.findOne(id);
             //return ApiResponse.ok(BeanUtils.copyAttrs(new ToaUserVo(),toaUserEntity));
       }

       /**
        * 默认查询所有列表，若要筛选列表，请增加过滤参数
        * @return ApiResponse<List<ToaUserVo>>
        */
        public ApiResponse<List<ToaUserVo>> findAll(){
               return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<List<ToaUserVo>>(){}.getType()));
               //List<ToaUserEntity> toaUserEntities = toaUserEntityRepo.findAll();
               //List<ToaUserVo> toaUserVoList = new BeanListUtils<ToaUserVo, ToaUserEntity>(ToaUserVo.class, toaUserEntities).getTargetList();
               //return ApiResponse.ok(toaUserVoList);
        }

        /**
         * 删除对应主键的数据
         * @return
         */
         public ApiResponse delete(String id){
                //toaUserEntityRepo.delete(id);
                return ApiResponse.prompt(Syscode.SC_OK);
         }

}