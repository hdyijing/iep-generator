package com.vanke.iep.dto.enums;

import org.apache.commons.lang.StringUtils;

/**
 * @Author zhenglei
 * @Date 2018/6/12 18:38
 */
public enum ResultCode {
    /**
     * 1 请求成功
     */
    SUCCESS("1", "请求成功"),
    /**
     * -1 系统错误
     */
    ERROR("-1", "系统繁忙"),
    /**
     * 20101 没有权限，请联系管理员授权
     */
    DENIED_PERMISSION("20101", "没有权限，请联系管理员授权"),
    /**
     * 20201 token无效
     */
    INVALID_TOKEN("20201", "token无效"),
    /**
     * 40140 缺少参数
     */
    MISSING_PARAMETER("40140", "缺少参数"),
    /**
     * 404 请求路径不存在
     */
    LINK_NOT_EXITS("404", "路径不存在，请检查路径是否正确"),
    /**
     * 50101 数据库中已存在该记录
     */
    DATA_REPEAT("50101", "数据库中已存在该记录"),
    ;

    /**
     * 返回码
     */
    private String code;

    /**
     * 返回结果描述
     */
    private String message;

    ResultCode(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ResultCode getByCode(String code) {
        if (StringUtils.isBlank(code)) {
            return null;
        }
        for (ResultCode one : values()) {
            if (code.equals(one.getCode())) {
                return one;
            }
        }
        return null;
    }
}

