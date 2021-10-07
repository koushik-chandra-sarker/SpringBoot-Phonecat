package com.inovace.Exception;

public class MyMadeException extends RuntimeException {
    public MyMadeException(String message) {
        super(message);
    }

    public MyMadeException(String message, Throwable cause) {
        super(message, cause);
    }
}
