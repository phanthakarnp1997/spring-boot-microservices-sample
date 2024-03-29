package com.demo.microservice.commonlibrary.util.constant;

import lombok.Getter;

@Getter
public enum ErrorCodes {
    DEFAULT_CODE("PFL101"),
    ERROR_BUSINESS_CODE_1("PFL999"),
    BAD_REQUEST_BUSINESS_CODE_1("PFL888"),
    NOT_FOUND_BUSINESS_CODE_1("PFL777"),
    NOT_FOUND_BUSINESS_CODE_2("PFL5981"),
    UNAUTHORIZED_CODE("PFL401");

    private final String value;

    ErrorCodes(String value) {
        this.value = value;
    }

}
