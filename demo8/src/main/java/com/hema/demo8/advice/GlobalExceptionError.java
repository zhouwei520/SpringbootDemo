package com.hema.demo8.advice;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/*****
 * 处理全局的异常和错误
 * 作为一个切面进行处理
 */
/*@ControllerAdvice*/
public class GlobalExceptionError {

    /*****
     * 显示错误页面
     */
    public static final  String DEFAULT_ERROR_VIEW="error";
   /* @ExceptionHandler(Exception.class) //所有的异常都是Exception子类*/
    //出现异常会自动被这个方法切面掉 进行一个获取 显示
    public ModelAndView defaultModelAndView(HttpServletRequest request, Exception e
      ){
        ModelAndView modelAndView=new ModelAndView(DEFAULT_ERROR_VIEW);
        modelAndView.addObject("url",request.getRequestURL().toString());//获取请求路径
        modelAndView.addObject("error",e);//把异常信息传送到前台
        return  modelAndView;

    }

}
