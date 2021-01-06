package com.client.cloudclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
/**
 *  @author: jinzhao
 *  @Date: 2021/1/6 16:59
 *  @Description:
 *  @EnableFeignClients 用于加载feign
 *  @EnableEurekaClient 用于注册
 *  @SpringBootApplication springboot 基础启动类
 */
public class CloudClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudClientApplication.class, args);
	}

}
