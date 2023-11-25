package org.sopt.sopkathonserver.common;

import org.sopt.sopkathonserver.exception.ErrorMessage;
import org.sopt.sopkathonserver.exception.SuccessMessage;

public record ApiResponse<T>(
        int status,
        String message,
        T data
) {
    public static ApiResponse success(SuccessMessage successMessage) {
        return new ApiResponse(successMessage.getStatus().value(), successMessage.getMessage(), null);
    }

    public static <T> ApiResponse<T> success(SuccessMessage successMessage, T data) {
        return new ApiResponse(successMessage.getStatus().value(), successMessage.getMessage(), data);
    }
    public static ApiResponse error(ErrorMessage errorMessage) {
        return new ApiResponse(errorMessage.getStatus().value(), errorMessage.getMessage(), null);
    }
}
