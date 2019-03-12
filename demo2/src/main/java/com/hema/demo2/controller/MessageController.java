package com.hema.demo2.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 描述:
 * 子类 读取抽象类配置信息
 *
 * @author mac
 * @create 2018-11-28 9:16 PM
 */
@RestController
public class MessageController  extends AbstractBaseController {

    /****
     * 进行资源的读取
     * @return
     */
    @RequestMapping(value = "/msg",method = RequestMethod.GET)

    public String msg(String mid){

        System.out.println("[****访问地址*********]"+super.getMessage("member.add.action"));
        return  super.getMessage("welcome.msg",mid);
    }
}