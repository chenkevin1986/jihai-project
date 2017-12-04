package com.jihai.mengmian.repo;


import com.jihai.mengmian.entity.AppUserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by kevinchen on 2017/3/23.
 */
public interface AppUserEntityRepo extends JpaRepository<AppUserEntity, String> {

    AppUserEntity findByPhoneAndPassword(String phone,String password);

}
