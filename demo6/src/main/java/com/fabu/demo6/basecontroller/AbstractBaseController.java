package com.fabu.demo6.basecontroller;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;

import java.text.SimpleDateFormat;
import java.util.Date;

/******
 * 处理 controller 公共的东西 做一个抽象类存在
 */
public abstract  class AbstractBaseController  {

    /****
     * 处理时间
     * @param binder
     */
 @InitBinder
   public void initBinder(WebDataBinder binder){
     //首先建立一个可以将字符串转换为日期的工具程序 yyyy-MM-dd HH:mm:ss yyyy-MM-dd HH:mm:SS
      SimpleDateFormat sdf =new SimpleDateFormat("yyyy-MM-dd");
      //明确的描述此时需要注册一个日期格式的转化处理程序类
      CustomDateEditor cu=  new CustomDateEditor(sdf,true);
      binder.registerCustomEditor(Date.class,cu);
  }
}
