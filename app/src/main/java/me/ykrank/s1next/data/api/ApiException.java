package me.ykrank.s1next.data.api;

/**
 * Created by ykrank on 2016/6/17.
 */
public class ApiException extends Exception {
    
    public ApiException(String msg) {
        super(msg);
    }

    public ApiException(Throwable cause) {
        super(cause);
    }

    public ApiException(String message, Throwable cause) {
        super(message, cause);
    }
    
    public static class AuthenticityTokenException extends ApiException{

        public AuthenticityTokenException(String msg) {
            super(msg);
        }

        public AuthenticityTokenException(Throwable cause) {
            super(cause);
        }

        public AuthenticityTokenException(String message, Throwable cause) {
            super(message, cause);
        }
    }
}
