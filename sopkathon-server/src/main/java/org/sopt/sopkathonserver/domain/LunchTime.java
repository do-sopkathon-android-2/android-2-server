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
public class LunchTime {
    @Enumerated(EnumType.STRING)
    private TimeSlots lunchStart;

    @Enumerated(EnumType.STRING)
    private TimeSlots lunchEnd;

    public static LunchTime create(final TimeSlots lunchStart, final TimeSlots lunchEnd) {
        return LunchTime.builder().lunchStart(lunchStart)
                .lunchEnd(lunchEnd).build();
    }
}
