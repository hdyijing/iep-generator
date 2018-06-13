package com.vanke.iep.dto;

import com.vanke.iep.dto.enums.ResultCode;

/**
 * @Author zhenglei
 * @Date 2018/6/12 18:37
 */
public class Result<T> {
    /**
     * 返回码
     */
    private String code;

    /**
     * 返回结果描述
     */
    private String message;

    /**
     * 返回内容(自定义内容)
     */
    private T data;

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public Object getData() {
        return data;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Result() {
        super();
    }

    public Result(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public Result(String code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public Result(ResultCode resultCode) {
        this.code = resultCode.getCode();
        this.message = resultCode.getMessage();
    }

    public Result(ResultCode resultCode, T data) {
        this.code = resultCode.getCode();
        this.message = resultCode.getMessage();
        this.data = data;
    }

    public static Result ok(Object data) {
        return new Result(ResultCode.SUCCESS, data);
    }

    public static Result ok() {
        return ok(null);
    }

    public static Result error() {
        return error(ResultCode.ERROR);
    }

    public static Result error(ResultCode resultCode) {
        return error(resultCode, null);
    }

    public static Result error(String message) {
        return new Result("-1", message, null);
    }

    public static Result error(String code, String message) {
        return error(code, message, null);
    }

    public static Result error(ResultCode resultCode, Object data) {
        return error(resultCode.getCode(), resultCode.getMessage(), data);
    }

    public static Result error(String code, String message, Object data) {
        return new Result(code, message, data);
    }

    public static Result errorMissParams() {
        return error(ResultCode.MISSING_PARAMETER);
    }
}

