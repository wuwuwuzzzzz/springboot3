package com.wxz.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wxz
 * @date 21:14 2023/8/31
 */
@RestController
public class HelloController {

    /**
     * @return java.lang.String
     * @author wxz
     * @date 21:15 2023/8/31
     */
    @GetMapping("/hello")
    public String hello() {
        return "Hello Spring Boot 3!";
    }
}
