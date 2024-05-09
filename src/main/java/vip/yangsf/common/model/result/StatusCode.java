package vip.yangsf.common.model.result;

/**
 * 返回状态码封装枚举
 *
 * @author yangsf
 */
public enum StatusCode {

    SUCCESS(200, "ok"),
    PARAM_ERROR(401, "fail"),
    NO_AUTH(400, "未认证！"),
    SYSTEM_ERROR(500, "fail"),
    BAD_REQUEST(404, "fail");
    int code;
    String message;

    StatusCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}