package com.zw.demo10.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyInterceptor implements HandlerInterceptor {


    private Logger log= LoggerFactory.getLogger(MyInterceptor.class);

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        HandlerMethod handlerMethod=(HandlerMethod) handler;
        this.log.info("[拦截前]+MyInterceptor.preHandle()"+ handlerMethod.getBean().getClass().getSimpleName());
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        HandlerMethod handlerMethod=(HandlerMethod) handler;
        this.log.info("[拦截中]+MyInterceptor.postHandle"+handlerMethod.getBean().getClass().getSimpleName());
        this.log.info("【拦截中】+MyInterceptor.postHandle"+modelAndView);
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

        this.log.info("[拦截完成]+MyInterceptor.afterCompletion");
    }
}
