package com.jihai.mengmian1.repo;

import com.jihai.mengmian1.entity.PlayerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * <br>
 * <b>description：</b>玩家表 数据库访问接口【DAO】<br>
 * <b>author：</b>kevin chen<br>
 * <b>Time：</b> 2017-12-06 23:12:28 <br>
 * <b>Contact：<b>wechat and phone number - 13826126615<br>
 */
public interface PlayerEntityRepo extends JpaRepository<PlayerEntity, String> {

}