package com.july.serviceserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 分布式配置中心服务中心测试
 * @author zqk
 * @since 2019/11/20
 */
@SpringBootApplication
@EnableEurekaServer
public class ServiceServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceServerApplication.class, args);
    }

}
