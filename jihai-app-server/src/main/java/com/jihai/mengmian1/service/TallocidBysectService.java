package com.jihai.mengmian1.service;

import com.google.common.reflect.TypeToken;
import com.jihai.mengmian.BeanUtils;
import com.jihai.mengmian.BeanListUtils;
import com.jihai.mengmian1.entity.TallocidBysectEntity;
import com.jihai.mengmian1.repo.TallocidBysectEntityRepo;
import com.jihai.mengmian1.vo.TallocidBysectVo;
import com.jihai.mengmian1.dto.TallocidBysectDto;
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
public class TallocidBysectService {
    @Autowired
    private TallocidBysectEntityRepo tallocidBysectEntityRepo;

    /**
     * 新增
     * @param tallocidBysectDto
     * @return ApiResponse<TallocidBysectVo>
     */
     public ApiResponse<TallocidBysectVo> insert(TallocidBysectDto tallocidBysectDto){
           return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<TallocidBysectVo>(){}.getType()));
           //TallocidBysectEntity tallocidBysectEntity = BeanUtils.copyAttrs(new TallocidBysectEntity(), tallocidBysectDto);
           //tallocidBysectEntityRepo.save(tallocidBysectEntity);
           //return ApiResponse.ok(BeanUtils.copyAttrs(new TallocidBysectVo(),tallocidBysectEntity));
     }


     /**
      * 修改
      * @param tallocidBysectDto
      * @return ApiResponse<TallocidBysectVo>
      */
      public ApiResponse<TallocidBysectVo> update(TallocidBysectDto tallocidBysectDto){
            return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<TallocidBysectVo>(){}.getType()));
            //TallocidBysectEntity tallocidBysectEntity = BeanUtils.copyAttrs(new TallocidBysectEntity(), tallocidBysectDto);
            //tallocidBysectEntityRepo.save(tallocidBysectEntity);
            //return ApiResponse.ok(BeanUtils.copyAttrs(new TallocidBysectVo(),tallocidBysectEntity));
      }

      /**
       * 通过主键获取对象
       * @param id 实体主键
       * @return ApiResponse<TallocidBysectVo>
       */
       public ApiResponse<TallocidBysectVo> findOne(String id){
             return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<TallocidBysectVo>(){}.getType()));
             //TallocidBysectEntity tallocidBysectEntity = tallocidBysectEntityRepo.findOne(id);
             //return ApiResponse.ok(BeanUtils.copyAttrs(new TallocidBysectVo(),tallocidBysectEntity));
       }

       /**
        * 默认查询所有列表，若要筛选列表，请增加过滤参数
        * @return ApiResponse<List<TallocidBysectVo>>
        */
        public ApiResponse<List<TallocidBysectVo>> findAll(){
               return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<List<TallocidBysectVo>>(){}.getType()));
               //List<TallocidBysectEntity> tallocidBysectEntities = tallocidBysectEntityRepo.findAll();
               //List<TallocidBysectVo> tallocidBysectVoList = new BeanListUtils<TallocidBysectVo, TallocidBysectEntity>(TallocidBysectVo.class, tallocidBysectEntities).getTargetList();
               //return ApiResponse.ok(tallocidBysectVoList);
        }

        /**
         * 删除对应主键的数据
         * @return
         */
         public ApiResponse delete(String id){
                //tallocidBysectEntityRepo.delete(id);
                return ApiResponse.prompt(Syscode.SC_OK);
         }

}