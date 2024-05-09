package vip.yangsf.common.handler;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import vip.yangsf.common.exception.BusinessException;
import vip.yangsf.common.model.result.R;
import vip.yangsf.common.model.result.StatusCode;


/**
 * 全局异常处理器
 *
 * @author yangsf
 */
@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(BusinessException.class)
    public R businessExceptionHandler(BusinessException e) {
        return R.fail(e.getCode(), e.getDescription());
    }

    @ExceptionHandler(RuntimeException.class)
    public R runtimeExceptionHandler(RuntimeException e) {
        return R.fail(StatusCode.SYSTEM_ERROR, e.getMessage());
    }
}