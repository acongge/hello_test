package com.acong.demo_springboot.com.acong.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/test")
public class TestController {

    @ResponseBody
    @RequestMapping("/testController")
    public Map<String,Object> testIndex(){
        Map<String,Object> datas = new HashMap<>();
        datas.put("name","jiker");
        datas.put("age",12);
        return  datas;
    }


}
