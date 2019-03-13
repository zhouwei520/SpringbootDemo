package com.zw.demo10.config;

import com.zw.demo10.utils.MyInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/***
 *  extends  WebMvcConfigurerAdapter
 */
@Configuration
public class WebApplicationConfig implements WebMvcConfigurer { //定义MVC配置

  /*
    在2.0 之前的版本继承这个类 WebMvcConfigurerAdapter    在2.0版本  这个类已经被废弃了 实现WebMvcConfigurer 这个接口
   @Override
    public void addInterceptors(InterceptorRegistry registry) {  // 进行拦截器注册操作
        registry.addInterceptor(new MyInterceptor()).addPathPatterns("/***");//匹配路径
        super.addInterceptors(registry);
    }*/

    @Override
    public void addInterceptors(InterceptorRegistry registry) {  //进行拦截器注册操作
        registry.addInterceptor(new MyInterceptor()).addPathPatterns("/***");//匹配路径
    }
}
