package com.fabu.demo6.controller;

import com.fabu.demo6.basecontroller.AbstractBaseController;
import com.fabu.demo6.vo.Member;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Valid;
import java.util.Iterator;

/*****
 * 控制层
 */
@Controller

public class MemberController extends AbstractBaseController  {

    /*****
     * 跳转到指定页面去
     * @return
     */
    @RequestMapping(value = "/toAddMeber",method = RequestMethod.GET)
    public  String toAddMeber(){
         return  "member_add"; //建立一个名字为member_add的模板页面
     }

     @RequestMapping(value = "/add",method = RequestMethod.POST)
     @ResponseBody
     public Object add(@Valid  Member vo, BindingResult result){
        if(result.hasErrors()){ //现在表示执行的验证出现错误
            //获取全部错误信息
            Iterator<ObjectError> iterable=result.getAllErrors().iterator();
            while (iterable.hasNext()){
                ObjectError error=iterable.next(); //取出每一个错误
                String str=error.getDefaultMessage();
                System.out.println("[错误信息code=]"+error.getCode()+" , message= "+error.getDefaultMessage());
            }
            return  result.getAllErrors();
        }
         else{
            return  vo;
        }
     }

}
