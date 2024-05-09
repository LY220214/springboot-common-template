package vip.yangsf.common.model.result;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 统一返回结果
 *
 * @author yangsf
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class R {
    private int code;
    private String msg;
    private Object data;

    public static R ok() {
        return new R(StatusCode.SUCCESS.getCode(), StatusCode.SUCCESS.getMessage(), null);
    }

    public static R ok(Object data) {
        return new R(StatusCode.SUCCESS.getCode(), StatusCode.SUCCESS.getMessage(), data);
    }

    public static R fail(StatusCode code) {
        return new R(code.getCode(), code.getMessage(), null);
    }

    public static R fail(StatusCode code, String description) {
        return new R(code.getCode(), description, null);
    }
}