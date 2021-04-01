package com.ali.springboot_mybatis.Test;


import com.ali.springboot_mybatis.SpringbootMybatisApplication;
import com.ali.springboot_mybatis.service.RedisTest;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringbootMybatisApplication.class)
/**
 * 由于使用@Test 测试，导致redis 空指针
 * 解决需加入 @Runwith 和@SpringBootTest
 * @Runwith 测试时启动spring 容器
 * @SpringBootTest
 *
 * 当Redis 服务非正常关闭，如杀死进程等 数据redis不保存
 * Redis 正常 通过控制台 shutdown 可以保存数据
 */
public class TestRedis {
    @Autowired
    private RedisUtil redisUtil;
    @Autowired
    private RedisTemplate redisTemplate;
@Test
public  void aVoid(){
        String key = "1";
        String value = "红芭蕉测试三小时失效";
        redisUtil.set(key,value);

      System.out.println("终于不空指针了");
      redisTemplate.opsForValue().set(key,value,3, TimeUnit.HOURS);
      redisTemplate.boundSetOps("nameset").add("曹操");
    }
}
