package com.ali.springboot_mybatis.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.GenericJackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;

/**
 * 解决存入redis 数据 中文乱码
 */
    @Configuration
    public class RedisConfigurtion {

        @Autowired

        private RedisTemplate redisTemplate;

        @Bean(name = "redisTemplate")

        public RedisTemplate redisTemplate(RedisConnectionFactory factory) {

            RedisTemplate template = new RedisTemplate<>();

            template.setConnectionFactory(factory);
            //设置key value hashkey hashvalue 序列化方式
            template.setKeySerializer(new StringRedisSerializer());

            template.setValueSerializer(new GenericJackson2JsonRedisSerializer());

            template.setHashKeySerializer(new GenericJackson2JsonRedisSerializer());

            template.setHashValueSerializer(new GenericJackson2JsonRedisSerializer());

            template.afterPropertiesSet();

            return template;

        }

    }
