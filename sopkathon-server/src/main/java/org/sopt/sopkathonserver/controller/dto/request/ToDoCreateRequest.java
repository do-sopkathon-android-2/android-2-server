package org.sopt.sopkathonserver.controller.dto.request;

import org.sopt.sopkathonserver.domain.enums.TimeTag;

public record ToDoCreateRequest(
        String content,
        TimeTag timeTag
) {
}
