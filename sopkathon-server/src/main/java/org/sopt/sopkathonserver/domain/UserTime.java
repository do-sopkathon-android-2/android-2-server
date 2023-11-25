package org.sopt.sopkathonserver.domain;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserTime {
    @Id
    private Long id;

    @Embedded
    private MorningTime morningTime;

    @Embedded
    private LunchTime lunchTime;

    @Embedded
    private DinnerTime dinnerTime;

}
