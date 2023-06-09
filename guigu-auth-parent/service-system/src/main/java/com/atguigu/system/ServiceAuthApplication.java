package com.atguigu.system;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author ZhangYiAn
 * @version 1.0.0
 * @ClassName ServiceAuthApplication.java
 * @Description 启动类
 * @createTime 2022年12月03日 17:26:00
 */
@SpringBootApplication
@ComponentScan("com.atguigu")
public class ServiceAuthApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServiceAuthApplication.class, args);
    }
}
