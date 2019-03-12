package com.hema.demo8.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class UserController {


    @RequestMapping("/getUser")
    @ResponseBody
    public String   getUser(){
        System.out.println("运算"+1000/0);  //抛出异常
        return  "ZW";
    }
}
