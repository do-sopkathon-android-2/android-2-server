package org.sopt.sopkathonserver.controller.dto.response;

import org.sopt.sopkathonserver.domain.ToDo;

public record ToDoGetResponse(
        Long id,
        String content
) {
    public static ToDoGetResponse of(ToDo toDo) {
        return new ToDoGetResponse(
                toDo.getId(),
                toDo.getContent()
        );
    }
}
