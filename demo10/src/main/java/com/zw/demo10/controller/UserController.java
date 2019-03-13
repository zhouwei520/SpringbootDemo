package com.zw.demo10.controller;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class UserController {

    @RequestMapping(value = "/msg_add_pre",method = RequestMethod.GET)
    public String msgAddPre(){
        return  "msg_add";
    }

    @RequestMapping(value = "/msg_add",method = RequestMethod.POST)
    @ResponseBody
    public Object msgAdd(Integer id,String name){
        return  name+"  "+id;
    }

}
