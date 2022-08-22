package com.kt.app.shop2;

import com.kt.component.web.config.CloudAppConfig;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@MapperScan(basePackages = "com.kt.app.shop2.dao")
@SpringBootApplication
@EnableFeignClients(basePackages = {})
@EnableDiscoveryClient
public class Application  extends CloudAppConfig {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}