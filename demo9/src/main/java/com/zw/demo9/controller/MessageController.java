package com.zw.demo9.controller;

import com.zw.demo9.vo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/msg")
public class MessageController {

    @RequestMapping(value = "/msgsden",method = RequestMethod.GET)
    public String  toMessage(String id, String url, Model model){
        model.addAttribute("url",url); //request 属性传递包装
        model.addAttribute("id",id);  //request  属性传递包装
        return "message/message_msg";//message/message_show"; //此处只返回一个路径 该路径没有设置后缀 后缀默认是*.html
    }

    @RequestMapping("/showStyles")
    public String showStyles(Model model){
        model.addAttribute("url","<span style=\"color: yellow\">www.zw.com</span>");
        return  "message/message_styles";
    }

      @RequestMapping(value = "/inner",method = RequestMethod.GET)
    public String inner(HttpServletRequest request,Model model){
     request.setAttribute("requestMessage","zwjava-request");
     request.getSession().setAttribute("sessionMessage","session.zwjava-session");
     request.getServletContext().setAttribute("applicationMessage","application.zwjava-application");
     model.addAttribute("url","www.baidu.com");
     request.setAttribute("url2","<span style='color:red'>www.baidu.com</span>");
        return  "message/message_show_inner";

    }
    @RequestMapping(value = "/user_show",method = RequestMethod.GET)
    public String userShow(Model model){
        User user=new User();
        user.setMid(102L);
        user.setName("微微");
        user.setAge(18);
        user.setBirthday(new Date());
        user.setSalary(9999969.96);
        model.addAttribute("user",user);
        return  "message/message_user";
    }

    /****
     * Array 模拟集合数据 给模板 模板怎么显示
     * @param model
     * @return
     */
    @RequestMapping(value = "/user_list",method = RequestMethod.GET)
    public String userList(Model model){
        ArrayList<User> arrayList =new ArrayList<>();
        for (int i=0;i<10;i++){
            User user=new User();
            user.setMid(102L);
            user.setName("微微");
            user.setAge(18);
            user.setBirthday(new Date());
            user.setSalary(9999969.96);
            arrayList.add(user);
        }
        model.addAttribute("user",arrayList);
        return  "message/message_list";
    }

    /****
     * Map 模拟集合数据 给模板 模板怎么显示
     * @param model
     * @return
     */
    @RequestMapping(value = "/user_map",method = RequestMethod.GET)
    public String userMap(Model model){
        Map<String,User> userMap=new HashMap<>();
        for (int i=0;i<10;i++){
            User user=new User();
            user.setMid(102L);
            user.setName("微微");
            user.setAge(18);
            user.setBirthday(new Date());
            user.setSalary(9999969.96);
            userMap.put(i+"",user);
        }
        model.addAttribute("user",userMap);
        return  "message/message_map";
    }

}
