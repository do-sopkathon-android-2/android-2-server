package org.sopt.sopkathonserver.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor
public enum SuccessMessage {
    USER_TIME_CREATE_SUCCESS(HttpStatus.CREATED, "사용자의 시간대가 입력되었습니다."),
    TODO_DELETE_SUCCESS(HttpStatus.OK, "투두 내역이 삭제 되었습니다."),
    TODO_CREATE_SUCCESS(HttpStatus.CREATED, "할 일 등록이 완료되었습니다."),
    USER_TIME_SEARCH_SUCCESS(HttpStatus.OK, "사용자의 시간이 성공적으로 조회되었습니다."),
    ;
    final HttpStatus status;
    final String message;
}
