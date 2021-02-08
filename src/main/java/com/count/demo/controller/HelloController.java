package com.count.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Rosemary
 * @title: HelloController
 * @projectName count_demo
 * @description: TODO
 * @date 2021/2/516:07
 */
@RestController
public class HelloController {
	@Autowired
	StringRedisTemplate redisTemplate;

	@GetMapping("/hello")
	public String hello(){
		Long views = redisTemplate.opsForValue().increment("views");
		return "hello"+views;
	}
}
