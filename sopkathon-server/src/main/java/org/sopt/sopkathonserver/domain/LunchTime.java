package org.sopt.sopkathonserver.domain;


import jakarta.persistence.Embeddable;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Getter;
import org.sopt.sopkathonserver.domain.enums.TimeSlots;

@Getter
@Embeddable
public class LunchTime {
    @Enumerated(EnumType.STRING)
    private TimeSlots lunchStart;

    @Enumerated(EnumType.STRING)
    private TimeSlots lunchEnd;
}
