package com.north.entity;

import com.baomidou.mybatisplus.extension.api.IErrorCode;

public class ErrorCode implements IErrorCode {
    private long code;
    private String msg;

    private ErrorCode(long code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public static ErrorCode builder(long code, String msg) {
        return new ErrorCode(code,msg);
    }

    public static ErrorCode success() {
        return new ErrorCode(200,"操作成功");
    }

    @Override
    public long getCode() {
        return code;
    }

    public void setCode(long code) {
        this.code = code;
    }

    @Override
    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
