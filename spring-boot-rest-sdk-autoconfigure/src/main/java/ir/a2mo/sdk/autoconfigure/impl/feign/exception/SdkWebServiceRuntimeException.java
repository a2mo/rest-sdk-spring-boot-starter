package ir.a2mo.sdk.autoconfigure.impl.feign.exception;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Ali Alimohammadi
 * @since 1/22/2021
 */
public abstract class SdkWebServiceRuntimeException extends RuntimeException implements SdkWebServiceBaseException {
    private Map<String, Object> errorParam;
    private String message;

    public SdkWebServiceRuntimeException() {
        super();
    }

    public SdkWebServiceRuntimeException(String message) {
        super(message);
        this.message = message;
    }

    public SdkWebServiceRuntimeException(String message, Throwable cause) {
        super(message, cause);
        this.message = message;
    }

    @Override
    public Map<String, Object> getErrorParam() {
        return errorParam;
    }

    public SdkWebServiceRuntimeException addErrorParam(String key, Object value) {
        if (errorParam == null) {
            errorParam = new HashMap<>();
        }
        errorParam.put(key, value);
        return this;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
