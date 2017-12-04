package com.jihai.mengmian.redis.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;

/**
 * redis 缓存配置
 * Created by kevinchen on 2017/2/19.
 *
 */
@Configuration
//@EnableCaching           //启用缓存，这个注解很重要；
//@EnableRedisHttpSession //这两种缓存机制 都不可控。 在这里取消掉
public class RedisCacheConfig {

    /*@Bean
    public CacheManager cacheManager(RedisTemplate<?,?> redisTemplate) {
        CacheManager cacheManager = new RedisCacheManager(redisTemplate);
        return cacheManager;
    }*/

    @Bean
    public RedisTemplate<String, String> redisTemplate(RedisConnectionFactory factory) {
        RedisTemplate<String,String> redisTemplate = new RedisTemplate<String, String>();
        redisTemplate.setConnectionFactory(factory);
        RedisSerializer<String> redisSerializer = new StringRedisSerializer();
        redisTemplate.setKeySerializer(redisSerializer);
        redisTemplate.setValueSerializer(redisSerializer);
        //redisTemplate.setHashKeySerializer(redisSerializer);
        //redisTemplate.setHashKeySerializer(new RedisObjectSerializer());
        return redisTemplate;
    }


}


