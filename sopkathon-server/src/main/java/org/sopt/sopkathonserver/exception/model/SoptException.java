package org.sopt.sopkathonserver.exception.model;

import lombok.Getter;
import org.sopt.sopkathonserver.exception.ErrorMessage;

@Getter
public class SoptException extends RuntimeException {

    private final ErrorMessage errorMessage;

    public SoptException(ErrorMessage errorMessage) {
        super(errorMessage.getMessage());
        this.errorMessage = errorMessage;
    }

    public int getStatus() {
        return errorMessage.getStatus().value();
    }
}
