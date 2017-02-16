package com.ghost.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test")
public class TestController{

    @RequestMapping("/index.htm")
    public String index() {
        return "index";
    }
}
