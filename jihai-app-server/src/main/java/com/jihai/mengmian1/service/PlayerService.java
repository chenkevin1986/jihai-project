package com.jihai.mengmian1.service;

import com.google.common.reflect.TypeToken;
import com.jihai.mengmian.BeanUtils;
import com.jihai.mengmian.BeanListUtils;
import com.jihai.mengmian1.entity.PlayerEntity;
import com.jihai.mengmian1.repo.PlayerEntityRepo;
import com.jihai.mengmian1.vo.PlayerVo;
import com.jihai.mengmian1.dto.PlayerDto;
import com.jihai.mengmian.syscode.Syscode;
import com.jihai.mengmian.web.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.jihai.mock.ModelEntity;
import java.util.List;

/**
 * <br>
 * <b>description：</b>玩家表 业务接口<br>
 * <b>author：</b>kevin chen<br>
 * <b>Time：</b> 2017-12-06 23:12:28 <br>
 * <b>Contact：<b>wechat and phone number - 13826126615<br>
 */
@Service
public class PlayerService {
    @Autowired
    private PlayerEntityRepo playerEntityRepo;

    /**
     * 新增
     * @param playerDto
     * @return ApiResponse<PlayerVo>
     */
     public ApiResponse<PlayerVo> insert(PlayerDto playerDto){
           return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<PlayerVo>(){}.getType()));
           //PlayerEntity playerEntity = BeanUtils.copyAttrs(new PlayerEntity(), playerDto);
           //playerEntityRepo.save(playerEntity);
           //return ApiResponse.ok(BeanUtils.copyAttrs(new PlayerVo(),playerEntity));
     }


     /**
      * 修改
      * @param playerDto
      * @return ApiResponse<PlayerVo>
      */
      public ApiResponse<PlayerVo> update(PlayerDto playerDto){
            return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<PlayerVo>(){}.getType()));
            //PlayerEntity playerEntity = BeanUtils.copyAttrs(new PlayerEntity(), playerDto);
            //playerEntityRepo.save(playerEntity);
            //return ApiResponse.ok(BeanUtils.copyAttrs(new PlayerVo(),playerEntity));
      }

      /**
       * 通过主键获取对象
       * @param id 实体主键
       * @return ApiResponse<PlayerVo>
       */
       public ApiResponse<PlayerVo> findOne(String id){
             return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<PlayerVo>(){}.getType()));
             //PlayerEntity playerEntity = playerEntityRepo.findOne(id);
             //return ApiResponse.ok(BeanUtils.copyAttrs(new PlayerVo(),playerEntity));
       }

       /**
        * 默认查询所有列表，若要筛选列表，请增加过滤参数
        * @return ApiResponse<List<PlayerVo>>
        */
        public ApiResponse<List<PlayerVo>> findAll(){
               return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<List<PlayerVo>>(){}.getType()));
               //List<PlayerEntity> playerEntities = playerEntityRepo.findAll();
               //List<PlayerVo> playerVoList = new BeanListUtils<PlayerVo, PlayerEntity>(PlayerVo.class, playerEntities).getTargetList();
               //return ApiResponse.ok(playerVoList);
        }

        /**
         * 删除对应主键的数据
         * @return
         */
         public ApiResponse delete(String id){
                //playerEntityRepo.delete(id);
                return ApiResponse.prompt(Syscode.SC_OK);
         }

}