package com.sarproj.mobile.loader.exception;

import java.io.IOException;

public class BadResponseException extends IOException {
    public BadResponseException(String message) {
        super(message);
    }
}
