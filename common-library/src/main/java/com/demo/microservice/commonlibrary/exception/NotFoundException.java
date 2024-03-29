package com.demo.microservice.commonlibrary.exception;

import com.demo.microservice.commonlibrary.payload.ApiResponse;
import com.demo.microservice.commonlibrary.util.constant.ErrorCodes;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class NotFoundException extends BaseException {

    public NotFoundException(ErrorCodes errorCode, String message) {
        super(errorCode, message);
    }

    public NotFoundException(ApiResponse apiResponse) {
        super(apiResponse);
    }

    public NotFoundException(String message) {
        super(message);
    }

    public NotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
