package com.aib.net;

/**
 * 数据状态存储类
 *
 * @param <T>
 */
public class Resource<T> {
    private String msg;
    private Status status;
    private T data;

    public Resource() {
    }

    public Resource(String msg, Status status, T data) {
        this.msg = msg;
        this.status = status;
        this.data = data;
    }

    public static <T> Resource loading(String msg, T data) {
        return new Resource<T>(msg, Status.LOADING, data);
    }

    public static <T> Resource success(T data) {
        return new Resource<T>(null, Status.SUCCESS, data);
    }

    public static <T> Resource error(String msg, T data) {
        return new Resource<T>(msg, Status.ERROR, data);
    }
}
