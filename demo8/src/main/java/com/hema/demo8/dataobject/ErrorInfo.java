package com.hema.demo8.dataobject;

/*****
 * 错误日志实体类
 * 用于RPC 或者前后端分离项目返回给前端Rest风格的日志
 */
public class ErrorInfo {
    private Integer code;
    private String message;
    private String  url;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
