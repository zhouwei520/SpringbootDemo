package com.zw.demo10.service.impl;

import com.zw.demo10.service.IMsgService;
import com.zw.demo10.vo.Msg;
import org.springframework.stereotype.Service;

@Service
public class IMsgServiceImpl  implements IMsgService {

    @Override
    public Msg get(Integer id) {
        Msg msg=new Msg();
        msg.setId(id);
        msg.setName("zw");
        return msg;
    }
}
