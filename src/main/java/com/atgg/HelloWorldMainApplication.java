package com.atgg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by liuqingzhu on 2018/4/24 10:06
 */

/**
 * @SpringBootApplication 来标注一个主程序类，说明这是一个spring boot应用
 */

@SpringBootApplication
public class HelloWorldMainApplication {

    public static void main(String[] args) {

        //spring应用启动起来
        SpringApplication.run(HelloWorldMainApplication.class, args);
    }
}
