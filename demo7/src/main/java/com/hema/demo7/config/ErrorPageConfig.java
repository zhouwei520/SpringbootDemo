package com.hema.demo7.config;

import org.springframework.boot.web.server.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;

@Configuration
public class ErrorPageConfig {
    /*****
     * 这个配置在2.0版本中就没有用这个了  2.0版本中使用的是这个WebServerFactoryCustomizer 类
     * @return
     */
    /*
    @Bean
    public  EmbeddedServletContainerCustomizer ontainerCustomizer(){
      return new EmbeddedServletContainerCustomizer(){
           @Override
           public void customize(EmbeddedServletContainer container ){
               ErrorPage errorPage400=new ErrorPage(HttpStatus.BAD_REQUEST,
               "/error-400.html");
                 ErrorPage errorPage404=new ErrorPage(HttpStatus.NOT_FOUND,
               "/error-404.html");
                    ErrorPage errorPage500=new ErrorPage(HttpStatus.INTERNAL_SERVER_ERROR,
               "/error-500.html");
               container.addErrorPages(errorPage400,errorPage404,errorPage500);
           }
      }
    }*/

    /****
     * 配置错误项
     * @return
     */
    @Bean
    public WebServerFactoryCustomizer<ConfigurableWebServerFactory>  webServerFactoryCustomizer(){
        return  new WebServerFactoryCustomizer<ConfigurableWebServerFactory>() {
            @Override
            public void customize(ConfigurableWebServerFactory factory) {
                    ErrorPage errorPage400 =new ErrorPage(HttpStatus.BAD_REQUEST,"/error-400.html");
                    System.out.println("出现了错误");
                    ErrorPage errorPage404 =new ErrorPage(HttpStatus.NOT_FOUND,"/error-404.html");
                    ErrorPage errorPage500 =new ErrorPage(HttpStatus.INTERNAL_SERVER_ERROR,"/error-500.html");
                    factory.addErrorPages(errorPage400,errorPage404,errorPage500);
            }
        };

    }



}
