package vip.yangsf.common.exception;

import vip.yangsf.common.model.result.StatusCode;

/**
 * 业务异常类
 *
 * @author yangsf
 */
public class BusinessException extends RuntimeException {
    private final StatusCode code;

    private final String description;

    public BusinessException(StatusCode code) {
        super(code.getMessage());
        this.description = code.getMessage();
        this.code = code;
    }

    public BusinessException(StatusCode code, String description) {
        super(description);
        this.description = description;
        this.code = code;
    }

    public StatusCode getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }
}