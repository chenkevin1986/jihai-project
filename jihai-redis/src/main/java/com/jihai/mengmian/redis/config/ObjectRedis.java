package com.jihai.mengmian.redis.config;

import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/**
 * Created by kevinchen on 2017/7/27.
 *  对redis缓存的增删改查的基本操作
 */
@Repository
public class ObjectRedis {

    @Autowired
    private RedisTemplate<String, String> redisTemplate;

    /**
     * 增加
     * @param key
     * @param time 过期时间粒度为分钟
     * @param t
     */
    public <T> void add(String key, Long time,T t) {
        redisTemplate.opsForValue().set(key,JSON.toJSONString(t),time,TimeUnit.MINUTES);
    }

    /**
     * 增加
     * @param key
     * @param t
     */
    public <T> void add(String key,T t) {
        redisTemplate.opsForValue().set(key,JSON.toJSONString(t));
    }

    /**
     * 批量增加
     * @param key
     * @param time 过期时间粒度为分钟
     * @param ts
     */
    public <T> void add(String key, Long time, List<T> ts) {
        redisTemplate.opsForValue().set(key, JSON.toJSONString(ts), time, TimeUnit.MINUTES);
    }

    /**
     * 批量增加
     * @param key
     * @param ts
     */
    public <T> void add(String key, List<T> ts) {
        redisTemplate.opsForValue().set(key,JSON.toJSONString(ts));
    }



    public <T> T get(String key,Class<T> tClass) {
        T t = null;
        String tJson = redisTemplate.opsForValue().get(key);
        if(!StringUtils.isEmpty(tJson))
            t = JSON.parseObject(tJson, tClass);
        return t;
    }

    public <T> List<T> getList(String key,Class<T> tClass) {
        List<T> ts = null;
        String listJson = redisTemplate.opsForValue().get(key);
        if(!StringUtils.isEmpty(listJson))
           ts = JSON.parseArray(listJson,tClass);
        return ts;
    }

    /**
     * 从缓存中获取分页数据
     * @param key
     * @param tClass
     * @param page
     * @param size
     * @return
     */
    public <T> Page<T> getPageList(String key,Class<T> tClass,int page,int size){
        List<T> list = getList(key, tClass);
        return list==null || list.size()==0 ? null : new PageImpl<T>(list,new PageRequest(page,size),list.size());
    }

    public void delete(String key){
        redisTemplate.opsForValue().getOperations().delete(key);
    }

    public void deleteByPattern(String pattern){
        Set<String> allKeys = getAllKeys(pattern);
        if (allKeys==null ||allKeys.size()==0){
            return;
        }
        redisTemplate.opsForValue().getOperations().delete(allKeys);
    }

    /**
     * 查询所有"pattern"的匹配的key值
      * @param pattern
     * @return
     */
    public Set<String> getAllKeys(String pattern){
        return redisTemplate.keys(pattern);
    }

    /**
     * 获取所有"pattern"匹配的key对应的value值
     * @param pattern
     * @param tClass
     * @param <T>
     * @return
     */
    public <T> List<T> getAllObjects(String pattern,Class<T> tClass){
        Set<String> allKeys = getAllKeys(pattern);
        if (allKeys==null ||allKeys.size()==0){
            return null;
        }
        List<T> tlist = new ArrayList<>();
        List<String> list = redisTemplate.opsForValue().multiGet(allKeys);
        if (list==null || list.size()==0){
            return null;
        }
        for(Iterator<String> iterator = list.iterator();iterator.hasNext();){
            String tJson = iterator.next();
            if(!StringUtils.isEmpty(tJson)){
                T t = JSON.parseObject(tJson, tClass);
                if (t!=null)
                    tlist.add(t);
            }
        }
        return tlist;
    }

    public <T> void leftPush(String key,T t){
        redisTemplate.opsForList().leftPush(key,JSON.toJSONString(t));
    }

    public <T> T rightPop(String key,Class<T> tClass){
        T t = null;
        String tJson = redisTemplate.opsForList().rightPop(key);
        if(!StringUtils.isEmpty(tJson))
            t = JSON.parseObject(tJson, tClass);
        return t;
    }

}
