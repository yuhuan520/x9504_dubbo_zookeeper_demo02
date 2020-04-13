package com.java.zd;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *   提供者1的项目启动类
 */
@SpringBootApplication(scanBasePackages = "com.java.zd.*")
@MapperScan("com.java.zd.mapper")
public class Provider1Start {

    //启动方法
    public static void main(String[] args) {
        SpringApplication.run(Provider1Start.class);
    }
}
