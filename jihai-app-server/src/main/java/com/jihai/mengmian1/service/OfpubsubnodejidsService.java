package com.jihai.mengmian1.service;

import com.google.common.reflect.TypeToken;
import com.jihai.mengmian.BeanUtils;
import com.jihai.mengmian.BeanListUtils;
import com.jihai.mengmian1.entity.OfpubsubnodejidsEntity;
import com.jihai.mengmian1.repo.OfpubsubnodejidsEntityRepo;
import com.jihai.mengmian1.vo.OfpubsubnodejidsVo;
import com.jihai.mengmian1.dto.OfpubsubnodejidsDto;
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
public class OfpubsubnodejidsService {
    @Autowired
    private OfpubsubnodejidsEntityRepo ofpubsubnodejidsEntityRepo;

    /**
     * 新增
     * @param ofpubsubnodejidsDto
     * @return ApiResponse<OfpubsubnodejidsVo>
     */
     public ApiResponse<OfpubsubnodejidsVo> insert(OfpubsubnodejidsDto ofpubsubnodejidsDto){
           return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<OfpubsubnodejidsVo>(){}.getType()));
           //OfpubsubnodejidsEntity ofpubsubnodejidsEntity = BeanUtils.copyAttrs(new OfpubsubnodejidsEntity(), ofpubsubnodejidsDto);
           //ofpubsubnodejidsEntityRepo.save(ofpubsubnodejidsEntity);
           //return ApiResponse.ok(BeanUtils.copyAttrs(new OfpubsubnodejidsVo(),ofpubsubnodejidsEntity));
     }


     /**
      * 修改
      * @param ofpubsubnodejidsDto
      * @return ApiResponse<OfpubsubnodejidsVo>
      */
      public ApiResponse<OfpubsubnodejidsVo> update(OfpubsubnodejidsDto ofpubsubnodejidsDto){
            return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<OfpubsubnodejidsVo>(){}.getType()));
            //OfpubsubnodejidsEntity ofpubsubnodejidsEntity = BeanUtils.copyAttrs(new OfpubsubnodejidsEntity(), ofpubsubnodejidsDto);
            //ofpubsubnodejidsEntityRepo.save(ofpubsubnodejidsEntity);
            //return ApiResponse.ok(BeanUtils.copyAttrs(new OfpubsubnodejidsVo(),ofpubsubnodejidsEntity));
      }

      /**
       * 通过主键获取对象
       * @param id 实体主键
       * @return ApiResponse<OfpubsubnodejidsVo>
       */
       public ApiResponse<OfpubsubnodejidsVo> findOne(String id){
             return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<OfpubsubnodejidsVo>(){}.getType()));
             //OfpubsubnodejidsEntity ofpubsubnodejidsEntity = ofpubsubnodejidsEntityRepo.findOne(id);
             //return ApiResponse.ok(BeanUtils.copyAttrs(new OfpubsubnodejidsVo(),ofpubsubnodejidsEntity));
       }

       /**
        * 默认查询所有列表，若要筛选列表，请增加过滤参数
        * @return ApiResponse<List<OfpubsubnodejidsVo>>
        */
        public ApiResponse<List<OfpubsubnodejidsVo>> findAll(){
               return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<List<OfpubsubnodejidsVo>>(){}.getType()));
               //List<OfpubsubnodejidsEntity> ofpubsubnodejidsEntities = ofpubsubnodejidsEntityRepo.findAll();
               //List<OfpubsubnodejidsVo> ofpubsubnodejidsVoList = new BeanListUtils<OfpubsubnodejidsVo, OfpubsubnodejidsEntity>(OfpubsubnodejidsVo.class, ofpubsubnodejidsEntities).getTargetList();
               //return ApiResponse.ok(ofpubsubnodejidsVoList);
        }

        /**
         * 删除对应主键的数据
         * @return
         */
         public ApiResponse delete(String id){
                //ofpubsubnodejidsEntityRepo.delete(id);
                return ApiResponse.prompt(Syscode.SC_OK);
         }

}