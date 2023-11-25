package org.sopt.sopkathonserver.controller;

import lombok.RequiredArgsConstructor;
import org.sopt.sopkathonserver.common.ApiResponse;
import org.sopt.sopkathonserver.controller.dto.request.ToDoCreateRequest;
import org.sopt.sopkathonserver.controller.dto.response.ToDoAllGetResponse;
import org.sopt.sopkathonserver.controller.dto.response.ToDoGetResponse;
import org.sopt.sopkathonserver.exception.SuccessMessage;
import org.sopt.sopkathonserver.service.ToDoService;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

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

    @GetMapping("{userId}")
    public ApiResponse<List<ToDoGetResponse>> getToDos(@PathVariable Long userId, @RequestParam String timeTag) {
        return ApiResponse.success(SuccessMessage.TODO_FILTERED_LIST_GET_SUCCESS, toDoService.findByTimeTag(userId, timeTag));
    }

    @GetMapping("{userId}/all")
    public ApiResponse<ToDoAllGetResponse> getAllToDos(@PathVariable Long userId) {
        return ApiResponse.success(SuccessMessage.TODO_LIST_GET_SUCCESS, toDoService.findByUser(userId));
    }
}
