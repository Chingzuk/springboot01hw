package com.atgg.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by liuqingzhu on 2018/4/24 10:10
 */

/**
 * @Controller 能处理请求
 */
@Controller
public class HelloController {

    /**
     * @RequestMapping 浏览器发送请求地址，接受来自/hello 的请求
     * @ResponseBody 把"hello world!"字符串写出去 返回给浏览器
     * @return
     */
    @ResponseBody
    @RequestMapping("/hello")
    public String hello(){
        return "hello world!" ;
    }
}
