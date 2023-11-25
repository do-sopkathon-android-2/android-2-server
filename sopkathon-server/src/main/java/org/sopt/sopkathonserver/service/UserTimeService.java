package org.sopt.sopkathonserver.service;


import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.sopt.sopkathonserver.controller.dto.request.UserTimeRequestDto;
import org.sopt.sopkathonserver.domain.User;
import org.sopt.sopkathonserver.domain.UserTime;
import org.sopt.sopkathonserver.repository.UserTimeRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserTimeService {
    private final UserTimeRepository userTimeRepository;
    private final UserService userService;

    @Transactional
    public void createUserTime(final Long userId, final UserTimeRequestDto requestDto) {
        User user = userService.findById(userId);
        UserTime userTime = UserTime.create(user, requestDto);
        userTimeRepository.save(userTime);
    }
}
