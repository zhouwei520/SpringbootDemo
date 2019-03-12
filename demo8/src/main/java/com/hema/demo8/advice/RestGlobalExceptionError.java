package com.hema.demo8.advice;

import com.hema.demo8.dataobject.ErrorInfo;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@RestControllerAdvice
public class RestGlobalExceptionError {

    private static final String DEFAULT_ERROR="error";

    @ExceptionHandler(Exception.class)

    public Object  modelAndView(HttpServletRequest request,Exception e){
        ErrorInfo errorInfo=new ErrorInfo();
        //假设102
        errorInfo.setCode(102);
        errorInfo.setMessage(e.getMessage());
        errorInfo.setUrl(request.getRequestURL().toString());
        return  errorInfo;
      }

}
