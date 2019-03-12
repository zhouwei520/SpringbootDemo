package com.fabu.demo3.service.impl;

import com.fabu.demo3.service.ITask;
import org.springframework.stereotype.Service;

/*@Service 注释掉 用Config 包里面配置类来描述Bean 的配置*/
public class ITaskImpl implements ITask {

    @Override
    public String info() {

        return "ZW";
    }
}
