package com.fabu.demo3;

import com.fabu.demo3.controller.MessageTaskController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@SpringBootTest
@RunWith(SpringRunner.class)
@WebAppConfiguration
public class TestMessageTaskController {

    @Autowired
    private MessageTaskController messageTaskController;

    @Test
    public  void testInfo(){

        System.out.println(" 测试类 "+messageTaskController.info());
    }
}
