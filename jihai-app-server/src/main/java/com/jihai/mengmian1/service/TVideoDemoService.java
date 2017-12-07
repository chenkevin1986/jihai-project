package com.jihai.mengmian1.service;

import com.google.common.reflect.TypeToken;
import com.jihai.mengmian.BeanUtils;
import com.jihai.mengmian.BeanListUtils;
import com.jihai.mengmian1.entity.TVideoDemoEntity;
import com.jihai.mengmian1.repo.TVideoDemoEntityRepo;
import com.jihai.mengmian1.vo.TVideoDemoVo;
import com.jihai.mengmian1.dto.TVideoDemoDto;
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
public class TVideoDemoService {
    @Autowired
    private TVideoDemoEntityRepo tVideoDemoEntityRepo;

    /**
     * 新增
     * @param tVideoDemoDto
     * @return ApiResponse<TVideoDemoVo>
     */
     public ApiResponse<TVideoDemoVo> insert(TVideoDemoDto tVideoDemoDto){
           return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<TVideoDemoVo>(){}.getType()));
           //TVideoDemoEntity tVideoDemoEntity = BeanUtils.copyAttrs(new TVideoDemoEntity(), tVideoDemoDto);
           //tVideoDemoEntityRepo.save(tVideoDemoEntity);
           //return ApiResponse.ok(BeanUtils.copyAttrs(new TVideoDemoVo(),tVideoDemoEntity));
     }


     /**
      * 修改
      * @param tVideoDemoDto
      * @return ApiResponse<TVideoDemoVo>
      */
      public ApiResponse<TVideoDemoVo> update(TVideoDemoDto tVideoDemoDto){
            return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<TVideoDemoVo>(){}.getType()));
            //TVideoDemoEntity tVideoDemoEntity = BeanUtils.copyAttrs(new TVideoDemoEntity(), tVideoDemoDto);
            //tVideoDemoEntityRepo.save(tVideoDemoEntity);
            //return ApiResponse.ok(BeanUtils.copyAttrs(new TVideoDemoVo(),tVideoDemoEntity));
      }

      /**
       * 通过主键获取对象
       * @param id 实体主键
       * @return ApiResponse<TVideoDemoVo>
       */
       public ApiResponse<TVideoDemoVo> findOne(String id){
             return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<TVideoDemoVo>(){}.getType()));
             //TVideoDemoEntity tVideoDemoEntity = tVideoDemoEntityRepo.findOne(id);
             //return ApiResponse.ok(BeanUtils.copyAttrs(new TVideoDemoVo(),tVideoDemoEntity));
       }

       /**
        * 默认查询所有列表，若要筛选列表，请增加过滤参数
        * @return ApiResponse<List<TVideoDemoVo>>
        */
        public ApiResponse<List<TVideoDemoVo>> findAll(){
               return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<List<TVideoDemoVo>>(){}.getType()));
               //List<TVideoDemoEntity> tVideoDemoEntities = tVideoDemoEntityRepo.findAll();
               //List<TVideoDemoVo> tVideoDemoVoList = new BeanListUtils<TVideoDemoVo, TVideoDemoEntity>(TVideoDemoVo.class, tVideoDemoEntities).getTargetList();
               //return ApiResponse.ok(tVideoDemoVoList);
        }

        /**
         * 删除对应主键的数据
         * @return
         */
         public ApiResponse delete(String id){
                //tVideoDemoEntityRepo.delete(id);
                return ApiResponse.prompt(Syscode.SC_OK);
         }

}