package org.sopt.sopkathonserver.service;

import lombok.RequiredArgsConstructor;
import org.sopt.sopkathonserver.controller.dto.request.ToDoCreateRequest;
import org.sopt.sopkathonserver.domain.ToDo;
import org.sopt.sopkathonserver.domain.User;
import org.sopt.sopkathonserver.repository.ToDoRepository;
import org.sopt.sopkathonserver.repository.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class ToDoService {

    private final ToDoRepository toDoRepository;
    private final UserRepository userRepository;

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

}
