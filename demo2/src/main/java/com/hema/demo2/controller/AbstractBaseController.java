package com.hema.demo2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;

import java.util.Locale;

/**
 * 描述:
 * 抽象类 进行资源的读取
 *
 * @author mac
 * @create 2018-11-28 9:12 PM
 */
public abstract class AbstractBaseController {

    @Autowired
    private MessageSource  messageSource;

    public String getMessage(String key,String ... args){

        System.out.println(Locale.getDefault());

        return this.messageSource.getMessage(key,args, Locale.getDefault());
    }
}