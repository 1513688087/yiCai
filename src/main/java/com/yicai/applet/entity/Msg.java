package com.yicai.applet.entity;

import java.util.HashMap;
import java.util.Map;

/**
 * 返回信息给前端的统一的类
 * @author Administrator
 *
 */
public class Msg {

    //状态码 100表示成功，200表示失败
    private int code;

    //提示信息
    private String msg;

    //用于存储对象
    private  Object object;

    //用户要返回给浏览器的数据
    private Map<String,Object> extend = new HashMap<String,Object>();

    public Msg() {}

    public Msg(int code, String msg) {
        super();
        this.code = code;
        this.msg = msg;
    }

    public static Msg success(){
        Msg msg = new Msg();
        msg.setCode(100);
        msg.setMsg("处理成功");
        return msg;
    }

    public static Msg fail(){
        Msg msg = new Msg();
        msg.setCode(200);
        msg.setMsg("处理失败");
        return msg;
    }

    public static Msg defineFail(String str){
        Msg msg = new Msg();
        msg.setCode(200);
        msg.setMsg(str);
        return msg;
    }



    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public Msg add(String key,Object obj){
        this.extend.put(key, obj);
        return this;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Map<String, Object> getExtend() {
        return extend;
    }

    public void setExtend(Map<String, Object> extend) {
        this.extend = extend;
    }

    @Override
    public String toString() {
        return "Msg [code=" + code + ", msg=" + msg + ", object=" + object + ", extend=" + extend + "]";
    }


}
