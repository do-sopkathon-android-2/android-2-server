package org.sopt.sopkathonserver.common;

import org.sopt.sopkathonserver.exception.ErrorMessage;

public record ApiResponse<T>(
        int status,
        String message,
        T data
) {
    public static ApiResponse error(ErrorMessage errorMessage) {
        return new ApiResponse(errorMessage.getStatus().value(), errorMessage.getMessage(), null);
    }
}
