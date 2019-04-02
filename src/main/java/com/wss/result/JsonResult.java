package com.wss.result;

/**
 * 少   年   辛   苦   终   身   事
 * 莫   向   光   阴   惰   寸   功
 * Today the best performance  as tomorrow newest starter!
 * Created by IntelliJ IDEA.
 *
 * @author : songsong.wu
 * github: https://github.com/songdesy
 * email: callwss@qq.com
 * <p>
 * Date: 2018/11/14 下午4:39
 * Description: 是否排队/折扣
 * Copyright(©) 2018/11/14 by songsong.wu.
 **/
public class JsonResult {
    public static JsonResult instance() {
        return new JsonResult();
    }

    public JsonResult success() {
        this.code = "0000";
        return this;
    }

    public JsonResult success(Object result) {
        this.code = "0000";
        this.result = result;
        return this;
    }

    public JsonResult success(String msg, Object result) {
        this.code = "0000";
        this.msg = msg;
        this.result = result;
        return this;
    }

    public JsonResult error(String msg) {
        this.code = "1001";
        this.msg = msg;
        return this;
    }
    public JsonResult error(String msg,Object result) {
        this.code = "1001";
        this.msg = msg;
        this.result = result;
        return this;
    }

    public JsonResult warn(String msg) {
        this.code = "1002";
        this.msg = msg;
        return this;
    }

    private String code;
    private String msg;
    private Object result;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }
}
