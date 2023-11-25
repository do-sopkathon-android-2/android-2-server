package org.sopt.sopkathonserver.service;

import lombok.RequiredArgsConstructor;
import org.sopt.sopkathonserver.controller.dto.request.ToDoCreateRequest;
import org.sopt.sopkathonserver.controller.dto.response.ToDoAllGetResponse;
import org.sopt.sopkathonserver.controller.dto.response.ToDoGetResponse;
import org.sopt.sopkathonserver.domain.ToDo;
import org.sopt.sopkathonserver.domain.User;
import org.sopt.sopkathonserver.domain.enums.TimeTag;
import org.sopt.sopkathonserver.exception.ErrorMessage;
import org.sopt.sopkathonserver.exception.model.NotFoundException;
import org.sopt.sopkathonserver.repository.ToDoRepository;
import org.sopt.sopkathonserver.repository.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class ToDoService {
    private static String MORNING = "MORNING";
    private static String LUNCH = "LUNCH";
    private static String DINNER = "DINNER";

    private final ToDoRepository toDoRepository;
    private final UserRepository userRepository;
    private final UserService userService;

    @Transactional
    public String create(ToDoCreateRequest request, Long userId) {
        User user = userRepository.findByIdOrThrow(userId);
        ToDo toDo = toDoRepository.save(
                ToDo.builder()
                        .content(request.content())
                        .timeTag(request.timeTag())
                        .user(user)
                        .build()
        );
        return toDo.getId().toString();
    }

    @Transactional
    public void delete(final Long todoId) {
        ToDo toDo = toDoRepository.findById(todoId).orElseThrow(
                () -> new NotFoundException(ErrorMessage.TODO_NOT_FOUND_ERROR)
        );
        toDoRepository.delete(toDo);
    }

    public List<ToDoGetResponse> findByTimeTag(Long userId, String timeTag) {
        TimeTag timeTagValue = TimeTag.valueOf(timeTag);
        User user = userService.findById(userId);
        List<ToDo> toDoList = toDoRepository.findAllByUserAndTimeTag(user, timeTagValue);
        return toDoList.stream().map(
                ToDoGetResponse::of
        ).collect(Collectors.toList());
    }

    public ToDoAllGetResponse findByUser(Long userId) {
        List<ToDoGetResponse> morning = findByTimeTag(userId, MORNING);
        List<ToDoGetResponse> lunch = findByTimeTag(userId, LUNCH);
        List<ToDoGetResponse> dinner = findByTimeTag(userId, DINNER);
        return ToDoAllGetResponse.of(morning, lunch, dinner);
    }
}
