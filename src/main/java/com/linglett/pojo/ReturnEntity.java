package com.linglett.pojo;

import lombok.Data;

@Data
public class ReturnEntity {
    private int code;
    private String message;
    private Object data;
    private String dataJson;

    public ReturnEntity() {
    }

    public ReturnEntity(int code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public ReturnEntity(int code,String message,String dataJson){
        this.code = code;
        this.message = message;
        this.dataJson = dataJson;
    }

    public static ReturnEntity successResult(Object data) {
        return new ReturnEntity(1, "", data);
    }

    public static ReturnEntity successResult(String userdata){
        return new ReturnEntity(1,"",userdata);
    }

    public static ReturnEntity failedResult(String message) {
        return new ReturnEntity(0, message, null);
    }
}
