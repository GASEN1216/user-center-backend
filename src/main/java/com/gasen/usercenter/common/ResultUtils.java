package com.gasen.usercenter.common;

public class ResultUtils {
    public static <T> BaseResponse<T> success(T data) {
        return new BaseResponse(0,data,"ok");
    }

    public static BaseResponse error(ErrorCode errorCode) {
        return new BaseResponse<>(errorCode);
    }

    /**
     * 失败
     * @param code
     * @param msg
     * @param description
     * @return
     */
    public static BaseResponse error(int code, String msg, String description) {
        return new BaseResponse<>(code,null,msg,description);
    }

    public static BaseResponse error(ErrorCode errorCode, String msg, String description) {
        return new BaseResponse<>(errorCode.getCode(),null,msg,description);
    }
    public static BaseResponse error(ErrorCode errorCode, String description) {
        return new BaseResponse<>(errorCode.getCode(),errorCode.getMessage(),description);
    }
}
