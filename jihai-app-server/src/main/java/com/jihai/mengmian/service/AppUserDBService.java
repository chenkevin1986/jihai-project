package com.jihai.mengmian.service;

//import com.google.common.reflect.TypeToken;

import com.jihai.mengmian.BeanUtils;
import com.jihai.mengmian.entity.AppUserEntity;
import com.jihai.mengmian.repo.AppUserEntityRepo;
import com.jihai.mengmian.syscode.Syscode;
import com.jihai.mengmian.vo.AppUserVo;
import com.jihai.mengmian.web.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//import com.jihai.mock.ModelEntity;

/**
 * Created by kevinchen on 2017/7/24.
 */
@Service
public class AppUserDBService {

    @Autowired
    private AppUserEntityRepo appUserEntityRepo;

    /**
     * 创建手机用户
     * @param phone
     * @return
     */
    public ApiResponse<AppUserVo> login(String phone,String password){
        AppUserEntity appUserEntity = appUserEntityRepo.findByPhoneAndPassword(phone, password);
        if (appUserEntity==null){
            return ApiResponse.prompt(Syscode.ACCOUNT_NOT_EXISTS);
        }
        //return ApiResponse.ok(new ModelEntity().resolveBean(new TypeToken<AppUserVo>(){}.getType()));
        return ApiResponse.ok(BeanUtils.copyAttrs(new AppUserVo(),appUserEntity));
    }


    public ApiResponse register(String phone, String password) {
        AppUserEntity appUserEntity = appUserEntityRepo.findByPhoneAndPassword(phone, password);
        if (appUserEntity==null){
            appUserEntity = AppUserEntity.of(phone, password);
            appUserEntityRepo.save(appUserEntity);
            return ApiResponse.prompt(Syscode.SC_OK);
        }
        return ApiResponse.prompt(Syscode.ACCOUNT_EXISTS);
    }

    /**
     * 删除对应主键的数据
     * @return
     */
    public ApiResponse delete(String id){
        appUserEntityRepo.delete(id);
        return ApiResponse.prompt(Syscode.SC_OK);
    }
}
