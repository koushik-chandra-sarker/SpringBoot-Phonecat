package com.inovace.Exception;

import org.springframework.http.HttpStatus;


public class Message {
    private final String message ;
    private final HttpStatus httpStatus;

    public Message(String message, HttpStatus httpStatus) {
        this.message = message;
        this.httpStatus = httpStatus;
    }


    public String getMessage() {
        return message;
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }

}
