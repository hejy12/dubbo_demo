package com.worstEzreal.dubboConsumer.common;

/**
 * Desc
 *
 * @author zengxzh@yonyou.com
 * @version V1.0.0
 * @date 2017/9/13
 */
public class Result {
    /** 响应状态 */
    private String status;
    /** 响应提示 */
    private String msg;
    /** 响应内容 */
    private Object content;

    public Result(String status, String msg, Object content) {
        this.status = status;
        this.msg = msg;
        this.content = content;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getContent() {
        return content;
    }

    public void setContent(Object content) {
        this.content = content;
    }
}
