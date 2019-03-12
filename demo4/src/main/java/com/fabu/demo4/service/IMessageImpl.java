package com.fabu.demo4.service;

public class IMessageImpl implements IMessage {
    /*****
     * 按照真实开发 数据全部要去数据库查询出来 我这里为方便就不建立 数据库操作层了
     */
    @Override
    public String info() {
        return "测试模板渲染 zw";
    }
}
