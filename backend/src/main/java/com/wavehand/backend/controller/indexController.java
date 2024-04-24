package com.wavehand.backend.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/call/")
public class indexController {
    @RequestMapping("index/")
    public List<Map<String, String>> getinfo() {
        List<Map<String, String>> list = new LinkedList<>();
        Map<String, String> user1 = new java.util.HashMap<>();
        user1.put("name", "zhangsan");
        user1.put("age", "18");
        list.add(user1);
        Map<String, String> user2 = new java.util.HashMap<>();
        user2.put("name", "lisi");
        user2.put("age", "20");
        list.add(user2);
        return list;
    }
}