package com.fabu.demo3.config;

import com.fabu.demo3.service.ITask;
import com.fabu.demo3.service.impl.ITaskImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration  //此处为配置向
public class ITaskImplConfig {

    /****
     * 此处返回的是一个Spring 的配置Bean 与xml 的Bean 等价
     * @return
     */
    @Bean
    public ITaskImpl getITaskImpl(){ //方法名 可以随意写
        return new ITaskImpl();
    }
}
