package com.outman.engine.shit.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author yangfeng
 * @date 2025/04/15
 * @description: 描述信息
 */
@Controller
public class HomeController {
    @GetMapping("/home")
    public String home() {
        return "home";
    }
}
