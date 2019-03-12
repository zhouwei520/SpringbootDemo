package com.fabu.demo4.config;

import com.fabu.demo4.service.IMessageImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/****
 * 使用配置向的方式来配置Bean
 */
@Configuration
public class IMessageService {


    @Bean //构建一个Bean 进行处理
    public IMessageImpl getIMessageImpl(){

        return  new IMessageImpl();
    }


}
