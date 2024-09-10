package com.bs2.exception;

import org.apache.logging.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.lang.Nullable;
import org.springframework.web.bind.annotation.ResponseStatus;
import com.bs2.response.ResponseCode;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class NotFoundException extends ExceptionBase{
    public NotFoundException(Logger l) {
        logger = l;
        errorCode = ResponseCode.NOT_FOUND;
    }
    public NotFoundException(Logger l, @Nullable String message) {
        logger = l;
        errorCode = ResponseCode.NOT_FOUND;
        this.additionalMessage = message;
    }

    @Override
    public int getStatusCode() {
        return HttpStatus.NOT_FOUND.value();
    }
}
