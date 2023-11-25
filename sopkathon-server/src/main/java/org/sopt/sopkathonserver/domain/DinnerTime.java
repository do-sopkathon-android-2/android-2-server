package org.sopt.sopkathonserver.domain;

import jakarta.persistence.Embeddable;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.sopt.sopkathonserver.domain.enums.TimeSlots;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class DinnerTime {
    @Enumerated(EnumType.STRING)
    private TimeSlots dinnerStart;

    @Enumerated(EnumType.STRING)
    private TimeSlots dinnerEnd;

    public static DinnerTime create(final TimeSlots dinnerStart, final TimeSlots dinnerEnd) {
        return DinnerTime.builder()
                .dinnerStart(dinnerStart)
                .dinnerEnd(dinnerEnd)
                .build();
    }
}
