package com.java.zd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *   消费者启动类
 */
@SpringBootApplication(scanBasePackages = "com.java.zd.*")
public class ConsumerStart {

    //启动方法
    public static void main(String[] args) {
        SpringApplication.run(ConsumerStart.class);
    }
}
