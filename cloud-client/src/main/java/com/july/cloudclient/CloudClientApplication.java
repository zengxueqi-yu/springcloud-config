package com.july.cloudclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试分布式配置中心
 * @author zqk
 * @since 2019/11/19
 */
@SpringBootApplication
@EnableEurekaClient
@RestController
@RefreshScope
public class CloudClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudClientApplication.class, args);
    }

    @Value("${msg}")
    String msg;

    @RequestMapping("/test")
    public String test(){
        return msg;
    }

}
