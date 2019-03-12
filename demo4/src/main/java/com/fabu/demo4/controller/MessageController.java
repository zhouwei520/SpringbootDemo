package com.fabu.demo4.controller;

import com.fabu.demo4.service.IMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;

/****
 * 控制层 用来测试模板渲染处理
 */
@Controller
@RequestMapping("/Message")
public class MessageController  {


    @Autowired
    private IMessage  iMessage;

    @RequestMapping(value = "/info",method = RequestMethod.GET)
    public  String  info(String user, Model model){
        model.addAttribute("url",iMessage.info()); //request 属性传递包装
        model.addAttribute("username",user);
        return "message/index";  //返回一个路径 后缀是默认.html
    }

    /*****
     * 老的方式  进行操作
     * @param user
     * @param map
     * @return
     */
    @RequestMapping(value = "/msg",method = RequestMethod.GET)
    public ModelAndView msg(String user, HashMap<String,Object> map){
        map.put("url",iMessage.info());
        map.put("username",user);
        return new ModelAndView("message/index",map);
    }

}
