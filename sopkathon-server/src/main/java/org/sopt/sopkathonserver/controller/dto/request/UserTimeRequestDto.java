package org.sopt.sopkathonserver.controller.dto.request;

import org.sopt.sopkathonserver.domain.enums.TimeSlots;

public record UserTimeRequestDto(
        TimeSlots morningStart,
        TimeSlots lunchStart,
        TimeSlots dinnerStart,
        TimeSlots dinnerEnd
) {
}
