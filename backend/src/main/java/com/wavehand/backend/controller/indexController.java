package com.wavehand.backend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/call/")
public class indexController {
    @RequestMapping("index/")
    public String index() {
        return "/call/index.html";
    }
}
