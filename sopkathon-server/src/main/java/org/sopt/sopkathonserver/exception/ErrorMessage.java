package org.sopt.sopkathonserver.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor
public enum ErrorMessage {
    USER_NOT_FOUND_ERROR(HttpStatus.NOT_FOUND, "해당 사용자가 존재하지 않습니다."),
    TIME_NOT_FOUND_ERROR(HttpStatus.NOT_FOUND, "해당 사용자의 시간이 존재하지 않습니다."),
    TODO_NOT_FOUND_ERROR(HttpStatus.NOT_FOUND, "해당 투두 리스트가 존재하지 않습니다."),
    BAD_REQUEST_ERROR(HttpStatus.BAD_REQUEST, "잘못된 요청입니다."),
    INTERNAL_SERVER_ERROR(HttpStatus.INTERNAL_SERVER_ERROR, "서버 내부 오류입니다.");
    final HttpStatus status;
    final String message;
}
