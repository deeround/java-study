package com.wang.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class HelloController {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @GetMapping("/hello")
    public String hello() throws Exception {
        return "hello world";
    }

    @GetMapping("getUserList")
    public Object getUserList(){
        String sql = "select * from user";
        List<Map<String,Object>> maps = jdbcTemplate.queryForList(sql);
        return maps;
    }

}
