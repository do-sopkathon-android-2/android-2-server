package org.sopt.sopkathonserver.controller.dto.response;

import java.util.List;

public record ToDoAllGetResponse(
        List<ToDoGetResponse> morning,
        List<ToDoGetResponse> lunch,
        List<ToDoGetResponse> dinner
) {
    public static ToDoAllGetResponse of(List<ToDoGetResponse> morning,
                                        List<ToDoGetResponse> lunch,
                                        List<ToDoGetResponse> dinner) {
        return new ToDoAllGetResponse(morning, lunch, dinner);
    }
}
