package org.sopt.sopkathonserver.controller;

import lombok.RequiredArgsConstructor;
import org.sopt.sopkathonserver.common.ApiResponse;
import org.sopt.sopkathonserver.controller.dto.request.ToDoCreateRequest;
import org.sopt.sopkathonserver.exception.SuccessMessage;
import org.sopt.sopkathonserver.service.ToDoService;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;

@RestController
@RequestMapping("/api/v1/todo-list")
@RequiredArgsConstructor
public class ToDoController {

    private final ToDoService toDoService;

    // 생성
    @PostMapping("{userId}")
    public ApiResponse<Void> createToDo(@PathVariable Long userId, @RequestBody ToDoCreateRequest request) {
        URI location = URI.create(toDoService.create(request, userId));
        return ApiResponse.success(SuccessMessage.TODO_CREATE_SUCCESS);
    }

    //삭제
    @DeleteMapping("{todoId}")
    public ApiResponse<Void> deleteToDo(@PathVariable final Long todoId) {
        toDoService.delete(todoId);
        return ApiResponse.success(SuccessMessage.TODO_DELETE_SUCCESS);
    }
}
