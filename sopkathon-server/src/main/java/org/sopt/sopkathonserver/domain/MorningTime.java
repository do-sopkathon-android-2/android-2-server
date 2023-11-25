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
public class MorningTime {

    @Enumerated(EnumType.STRING)
    private TimeSlots morningStart;

    @Enumerated(EnumType.STRING)
    private TimeSlots morningEnd;

    public static MorningTime create(TimeSlots morningStart, TimeSlots morningEnd) {
        return MorningTime.builder().morningStart(morningStart)
                .morningEnd(morningEnd).build();
    }
}
