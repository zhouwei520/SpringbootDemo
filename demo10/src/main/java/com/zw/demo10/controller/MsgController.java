package com.zw.demo10.controller;

        import com.zw.demo10.service.IMsgService;
        import com.zw.demo10.vo.Msg;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.stereotype.Controller;
        import org.springframework.web.bind.annotation.RequestMapping;
        import org.springframework.web.bind.annotation.RequestMethod;
        import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MsgController {

    @Autowired
    private IMsgService iMsgService;

    @RequestMapping(value = "msg_get",method = RequestMethod.GET)
    @ResponseBody
    public Msg  getById(){
        return  iMsgService.get(123);
    }

}
