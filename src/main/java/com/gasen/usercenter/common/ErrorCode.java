package com.gasen.usercenter.common;

public enum ErrorCode {
    SUCCESS(0, "成功", "成功"),
    /**
     * 系统错误
     */
    PARAMS_ERROR(40000, "请求参数错误", ""),
    /**
     * 业务错误
     */
    NULL_ERROR(40001, "请求数据为空错误", ""),
    /**
     * 业务错误
     */
    NOT_LOGIN(40100, "未登录", ""),
    NO_AUTH(40101, "没有权限", ""),
    SYSTEM_ERROR(50000, "系统错误", ""),;
    private final int code;
    /**
     * 状态码信息
     */
    private final String message;
    private final String description;

    ErrorCode(int code, String message, String description) {
        this.code = code;
        this.message = message;
        this.description = description;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public String getDescription() {
        return description;
    }
}
