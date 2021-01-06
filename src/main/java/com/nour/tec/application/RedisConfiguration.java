package com.nour.tec.application;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.hash.ObjectHashMapper;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;

/**
 * @author Xubo
 * @date 2021/1/6 20:29
 */
@Configuration
public class RedisConfiguration {

    // @Bean
    // @SuppressWarnings("all")
    // public RedisTemplate<String,Object> redisTemplate(RedisConnectionFactory factory){
    //     RedisTemplate<String,Object> template = new RedisTemplate<>();
    //     template.setConnectionFactory(factory);
    //     Jackson2JsonRedisSerializer jackson2JsonRedisSerializer = new Jackson2JsonRedisSerializer(Object.class);
    //     ObjectMapper
    //     jackson2JsonRedisSerializer.setObjectMapper();
    // }
}
