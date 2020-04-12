package com.example.spring.jenkins.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TestController {

    @RequestMapping("test")
    public Object test(){
        List<String> list = new ArrayList<>();
        list.add("111");
        list.add("222");
        list.add("333");
        list.add("444");
        return list;
    }
    @RequestMapping("test2")
    public Object test2(){

        return "很高兴部署成功了122226661111";
    }
    @RequestMapping("test3")
    public Object test3(){

        return "23456胜多负少的股份的说法";
    }
}
