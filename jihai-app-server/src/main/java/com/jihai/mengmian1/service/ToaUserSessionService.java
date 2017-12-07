package com.jihai.mengmian1.service;

import com.google.common.reflect.TypeToken;
import com.jihai.mengmian.BeanUtils;
import com.jihai.mengmian.BeanListUtils;
import com.jihai.mengmian1.entity.ToaUserSessionEntity;
import com.jihai.mengmian1.repo.ToaUserSessionEntityRepo;
import com.jihai.mengmian1.vo.ToaUserSessionVo;
import com.jihai.mengmian1.dto.ToaUserSessionDto;
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
public class ToaUserSessionService {
    @Autowired
    private ToaUserSessionEntityRepo toaUserSessionEntityRepo;

    /**
     * 新增
     * @param toaUserSessionDto
     * @return ApiResponse<ToaUserSessionVo>
     */
     public ApiResponse<ToaUserSessionVo> insert(ToaUserSessionDto toaUserSessionDto){
           return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<ToaUserSessionVo>(){}.getType()));
           //ToaUserSessionEntity toaUserSessionEntity = BeanUtils.copyAttrs(new ToaUserSessionEntity(), toaUserSessionDto);
           //toaUserSessionEntityRepo.save(toaUserSessionEntity);
           //return ApiResponse.ok(BeanUtils.copyAttrs(new ToaUserSessionVo(),toaUserSessionEntity));
     }


     /**
      * 修改
      * @param toaUserSessionDto
      * @return ApiResponse<ToaUserSessionVo>
      */
      public ApiResponse<ToaUserSessionVo> update(ToaUserSessionDto toaUserSessionDto){
            return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<ToaUserSessionVo>(){}.getType()));
            //ToaUserSessionEntity toaUserSessionEntity = BeanUtils.copyAttrs(new ToaUserSessionEntity(), toaUserSessionDto);
            //toaUserSessionEntityRepo.save(toaUserSessionEntity);
            //return ApiResponse.ok(BeanUtils.copyAttrs(new ToaUserSessionVo(),toaUserSessionEntity));
      }

      /**
       * 通过主键获取对象
       * @param id 实体主键
       * @return ApiResponse<ToaUserSessionVo>
       */
       public ApiResponse<ToaUserSessionVo> findOne(String id){
             return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<ToaUserSessionVo>(){}.getType()));
             //ToaUserSessionEntity toaUserSessionEntity = toaUserSessionEntityRepo.findOne(id);
             //return ApiResponse.ok(BeanUtils.copyAttrs(new ToaUserSessionVo(),toaUserSessionEntity));
       }

       /**
        * 默认查询所有列表，若要筛选列表，请增加过滤参数
        * @return ApiResponse<List<ToaUserSessionVo>>
        */
        public ApiResponse<List<ToaUserSessionVo>> findAll(){
               return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<List<ToaUserSessionVo>>(){}.getType()));
               //List<ToaUserSessionEntity> toaUserSessionEntities = toaUserSessionEntityRepo.findAll();
               //List<ToaUserSessionVo> toaUserSessionVoList = new BeanListUtils<ToaUserSessionVo, ToaUserSessionEntity>(ToaUserSessionVo.class, toaUserSessionEntities).getTargetList();
               //return ApiResponse.ok(toaUserSessionVoList);
        }

        /**
         * 删除对应主键的数据
         * @return
         */
         public ApiResponse delete(String id){
                //toaUserSessionEntityRepo.delete(id);
                return ApiResponse.prompt(Syscode.SC_OK);
         }

}