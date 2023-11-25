package org.sopt.sopkathonserver.exception.model;

import org.sopt.sopkathonserver.exception.ErrorMessage;

public class NotFoundException extends SoptException{
    public NotFoundException(ErrorMessage errorMessage) {
        super(errorMessage);
    }
}
