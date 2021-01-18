package com.nour.tec.controller;

import com.nour.tec.Entity.UserEntity;
import com.nour.tec.tools.redis.RedisUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Date;
import java.util.Map;

/**
 * @author Xubo
 * @date 2021/1/18 19:40
 */
@Slf4j
@RequestMapping("/redis")
@RestController
public class RedisController {

    private static int ExpireTime = 60;

    @Resource
    private RedisUtil redisUtil;

    @GetMapping("set")
    public boolean redisset(@RequestBody Map<String,Object> valMap){
        UserEntity userEntity = new UserEntity();
        String key = valMap.get("key").toString();
        userEntity.setId(Long.valueOf(valMap.get("id").toString()));
        userEntity.setGuid(valMap.get("guid").toString());
        userEntity.setName(valMap.get("name").toString()    );
        userEntity.setAge(valMap.get("age").toString());
        userEntity.setCreateTime(new Date());

        return redisUtil.set(key,userEntity);
    }

    @RequestMapping("get")
    public Object redisget(String key){
        return redisUtil.get(key);
    }

    @RequestMapping("expire")
    public boolean expire(String key){
        return redisUtil.expire(key,ExpireTime);
    }


}
