package com.aib.entity;

public class BaseEntity<T> {
    private String retCode;
    private String msg;
    private T data;

    public BaseEntity() {
    }

    public BaseEntity(String retCode, String msg, T data) {
        this.retCode = retCode;
        this.msg = msg;
        this.data = data;
    }

    public String getRetCode() {
        return retCode;
    }

    public void setRetCode(String retCode) {
        this.retCode = retCode;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
