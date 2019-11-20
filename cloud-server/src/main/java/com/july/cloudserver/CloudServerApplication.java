package com.july.cloudserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 测试分布式配置中心
 * @author zqk
 * @since 2019/11/19
 */
@SpringBootApplication
@EnableConfigServer
@EnableEurekaClient
public class CloudServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudServerApplication.class, args);
    }

}
