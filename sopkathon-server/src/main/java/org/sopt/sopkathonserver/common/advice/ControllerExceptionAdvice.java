package org.sopt.sopkathonserver.common.advice;

import org.sopt.sopkathonserver.common.ApiResponse;
import org.sopt.sopkathonserver.exception.ErrorMessage;
import org.sopt.sopkathonserver.exception.model.NotFoundException;
import org.sopt.sopkathonserver.exception.model.SoptException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ControllerExceptionAdvice {

    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(NotFoundException.class)
    public ApiResponse handleNotFoundException(NotFoundException e) {
        return ApiResponse.error(e.getErrorMessage());
    }

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(IllegalArgumentException.class)
    public ApiResponse handleIllegalArgumentException(IllegalArgumentException e) {
        return ApiResponse.error(ErrorMessage.BAD_REQUEST_ERROR);
    }

    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(SoptException.class)
    public ApiResponse handleRuntimeException(SoptException e) {
        return ApiResponse.error(e.getErrorMessage());
    }
}
