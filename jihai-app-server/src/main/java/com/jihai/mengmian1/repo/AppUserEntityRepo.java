package com.jihai.mengmian1.repo;

import com.jihai.mengmian1.entity.AppUserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * <br>
 * <b>description：</b>app用户表 数据库访问接口【DAO】<br>
 * <b>author：</b>kevin chen<br>
 * <b>Time：</b> 2017-12-06 23:12:27 <br>
 * <b>Contact：<b>wechat and phone number - 13826126615<br>
 */
public interface AppUserEntityRepo extends JpaRepository<AppUserEntity, String> {

}