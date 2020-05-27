package com.zwc.providerfirst.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName SayHelloController
 * @Desc TODO   Say Hello
 * @Date 2019/5/15 15:28
 * @Version 1.0
 */
@RestController
public class SayHelloController {

    /*
     * @ClassName SayHelloController
     * @Desc TODO   读取配置文件中的端口
     * @Date 2019/5/15 15:49
     * @Version 1.0
     */
    @Value("${server.port}")
    private String port;

    /*
     * @ClassName SayHelloController
     * @Desc TODO   Say Hello
     * @Date 2019/5/15 15:30
     * @Version 1.0
     */
    @RequestMapping("/hello")
    public String hello(){
        return "Hello Spring Cloud！！！port：" + port;
    }

}
