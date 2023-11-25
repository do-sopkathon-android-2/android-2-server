package org.sopt.sopkathonserver.controller;


import lombok.RequiredArgsConstructor;
import org.sopt.sopkathonserver.common.ApiResponse;
import org.sopt.sopkathonserver.controller.dto.request.UserTimeRequestDto;
import org.sopt.sopkathonserver.exception.SuccessMessage;
import org.sopt.sopkathonserver.service.UserTimeService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/user-time")
@RequiredArgsConstructor
public class UserTimeController {

    private final UserTimeService userTimeService;

    @PostMapping("/{userId}")
    public ApiResponse createUserTime(@PathVariable final Long userId, @RequestBody final UserTimeRequestDto requestDto) {
        userTimeService.createUserTime(userId, requestDto);
        return ApiResponse.success(SuccessMessage.USER_TIME_CREATE_SUCCESS);
    }
}
