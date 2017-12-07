package com.jihai.mengmian1.service;

import com.google.common.reflect.TypeToken;
import com.jihai.mengmian.BeanUtils;
import com.jihai.mengmian.BeanListUtils;
import com.jihai.mengmian1.entity.TTalkRecordEntity;
import com.jihai.mengmian1.repo.TTalkRecordEntityRepo;
import com.jihai.mengmian1.vo.TTalkRecordVo;
import com.jihai.mengmian1.dto.TTalkRecordDto;
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
public class TTalkRecordService {
    @Autowired
    private TTalkRecordEntityRepo tTalkRecordEntityRepo;

    /**
     * 新增
     * @param tTalkRecordDto
     * @return ApiResponse<TTalkRecordVo>
     */
     public ApiResponse<TTalkRecordVo> insert(TTalkRecordDto tTalkRecordDto){
           return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<TTalkRecordVo>(){}.getType()));
           //TTalkRecordEntity tTalkRecordEntity = BeanUtils.copyAttrs(new TTalkRecordEntity(), tTalkRecordDto);
           //tTalkRecordEntityRepo.save(tTalkRecordEntity);
           //return ApiResponse.ok(BeanUtils.copyAttrs(new TTalkRecordVo(),tTalkRecordEntity));
     }


     /**
      * 修改
      * @param tTalkRecordDto
      * @return ApiResponse<TTalkRecordVo>
      */
      public ApiResponse<TTalkRecordVo> update(TTalkRecordDto tTalkRecordDto){
            return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<TTalkRecordVo>(){}.getType()));
            //TTalkRecordEntity tTalkRecordEntity = BeanUtils.copyAttrs(new TTalkRecordEntity(), tTalkRecordDto);
            //tTalkRecordEntityRepo.save(tTalkRecordEntity);
            //return ApiResponse.ok(BeanUtils.copyAttrs(new TTalkRecordVo(),tTalkRecordEntity));
      }

      /**
       * 通过主键获取对象
       * @param id 实体主键
       * @return ApiResponse<TTalkRecordVo>
       */
       public ApiResponse<TTalkRecordVo> findOne(String id){
             return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<TTalkRecordVo>(){}.getType()));
             //TTalkRecordEntity tTalkRecordEntity = tTalkRecordEntityRepo.findOne(id);
             //return ApiResponse.ok(BeanUtils.copyAttrs(new TTalkRecordVo(),tTalkRecordEntity));
       }

       /**
        * 默认查询所有列表，若要筛选列表，请增加过滤参数
        * @return ApiResponse<List<TTalkRecordVo>>
        */
        public ApiResponse<List<TTalkRecordVo>> findAll(){
               return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<List<TTalkRecordVo>>(){}.getType()));
               //List<TTalkRecordEntity> tTalkRecordEntities = tTalkRecordEntityRepo.findAll();
               //List<TTalkRecordVo> tTalkRecordVoList = new BeanListUtils<TTalkRecordVo, TTalkRecordEntity>(TTalkRecordVo.class, tTalkRecordEntities).getTargetList();
               //return ApiResponse.ok(tTalkRecordVoList);
        }

        /**
         * 删除对应主键的数据
         * @return
         */
         public ApiResponse delete(String id){
                //tTalkRecordEntityRepo.delete(id);
                return ApiResponse.prompt(Syscode.SC_OK);
         }

}