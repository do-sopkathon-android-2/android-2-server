package org.sopt.sopkathonserver.domain;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import org.sopt.sopkathonserver.controller.dto.request.UserTimeRequestDto;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserTime {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private User user;

    @Embedded
    private MorningTime morningTime;

    @Embedded
    private LunchTime lunchTime;

    @Embedded
    private DinnerTime dinnerTime;

    public static UserTime create(final User user, final UserTimeRequestDto requestDto) {
        return UserTime
                .builder()
                .user(user)
                .morningTime(MorningTime.create(requestDto.morningStart(), requestDto.lunchStart()))
                .lunchTime(LunchTime.create(requestDto.lunchStart(), requestDto.dinnerStart()))
                .dinnerTime(DinnerTime.create(requestDto.dinnerStart(), requestDto.dinnerEnd()))
                .build();
    }
}
