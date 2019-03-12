package com.fabu.demo3.controller;

import com.fabu.demo3.service.ITask;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class MessageTaskController {

    @Autowired
    private ITask  iTask;

    @RequestMapping("/info")
    public  String info(){
        return iTask.info();
    }
}
