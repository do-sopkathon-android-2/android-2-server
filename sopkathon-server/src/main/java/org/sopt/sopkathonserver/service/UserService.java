package org.sopt.sopkathonserver.service;

import lombok.RequiredArgsConstructor;
import org.sopt.sopkathonserver.domain.User;
import org.sopt.sopkathonserver.exception.ErrorMessage;
import org.sopt.sopkathonserver.exception.model.NotFoundException;
import org.sopt.sopkathonserver.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public User findById(final Long userId) {
        return userRepository.findById(userId).orElseThrow(
                () -> new NotFoundException(ErrorMessage.USER_NOT_FOUND_ERROR)
        );
    }
}
