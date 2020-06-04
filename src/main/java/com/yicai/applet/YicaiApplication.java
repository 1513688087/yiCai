package com.yicai.applet;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.yicai.applet.mapper")
public class YicaiApplication {
    public static void main(String[] args) {
        SpringApplication.run(YicaiApplication.class, args);
    }
}
