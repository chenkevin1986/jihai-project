package com.jihai.mengmian.service;

import com.google.common.reflect.TypeToken;
import com.jihai.mengmian.BeanUtils;
import com.jihai.mengmian.BeanListUtils;
import com.jihai.mengmian.entity.TUcoinBillEntity;
import com.jihai.mengmian.repo.TUcoinBillEntityRepo;
import com.jihai.mengmian.vo.TUcoinBillVo;
import com.jihai.mengmian.dto.TUcoinBillDto;
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
public class TUcoinBillService {
    @Autowired
    private TUcoinBillEntityRepo tUcoinBillEntityRepo;

    /**
     * 新增
     * @param tUcoinBillDto
     * @return ApiResponse<TUcoinBillVo>
     */
     public ApiResponse<TUcoinBillVo> insert(TUcoinBillDto tUcoinBillDto){
           return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<TUcoinBillVo>(){}.getType()));
           //TUcoinBillEntity tUcoinBillEntity = BeanUtils.copyAttrs(new TUcoinBillEntity(), tUcoinBillDto);
           //tUcoinBillEntityRepo.save(tUcoinBillEntity);
           //return ApiResponse.ok(BeanUtils.copyAttrs(new TUcoinBillVo(),tUcoinBillEntity));
     }


     /**
      * 修改
      * @param tUcoinBillDto
      * @return ApiResponse<TUcoinBillVo>
      */
      public ApiResponse<TUcoinBillVo> update(TUcoinBillDto tUcoinBillDto){
            return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<TUcoinBillVo>(){}.getType()));
            //TUcoinBillEntity tUcoinBillEntity = BeanUtils.copyAttrs(new TUcoinBillEntity(), tUcoinBillDto);
            //tUcoinBillEntityRepo.save(tUcoinBillEntity);
            //return ApiResponse.ok(BeanUtils.copyAttrs(new TUcoinBillVo(),tUcoinBillEntity));
      }

      /**
       * 通过主键获取对象
       * @param id 实体主键
       * @return ApiResponse<TUcoinBillVo>
       */
       public ApiResponse<TUcoinBillVo> findOne(String id){
             return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<TUcoinBillVo>(){}.getType()));
             //TUcoinBillEntity tUcoinBillEntity = tUcoinBillEntityRepo.findOne(id);
             //return ApiResponse.ok(BeanUtils.copyAttrs(new TUcoinBillVo(),tUcoinBillEntity));
       }

       /**
        * 默认查询所有列表，若要筛选列表，请增加过滤参数
        * @return ApiResponse<List<TUcoinBillVo>>
        */
        public ApiResponse<List<TUcoinBillVo>> findAll(){
               return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<List<TUcoinBillVo>>(){}.getType()));
               //List<TUcoinBillEntity> tUcoinBillEntities = tUcoinBillEntityRepo.findAll();
               //List<TUcoinBillVo> tUcoinBillVoList = new BeanListUtils<TUcoinBillVo, TUcoinBillEntity>(TUcoinBillVo.class, tUcoinBillEntities).getTargetList();
               //return ApiResponse.ok(tUcoinBillVoList);
        }

        /**
         * 删除对应主键的数据
         * @return
         */
         public ApiResponse delete(String id){
                //tUcoinBillEntityRepo.delete(id);
                return ApiResponse.prompt(Syscode.SC_OK);
         }

}