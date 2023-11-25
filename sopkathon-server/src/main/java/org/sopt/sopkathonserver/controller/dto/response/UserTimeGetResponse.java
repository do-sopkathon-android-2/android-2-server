package org.sopt.sopkathonserver.controller.dto.response;

import org.sopt.sopkathonserver.domain.UserTime;
import org.sopt.sopkathonserver.domain.enums.TimeSlots;

public record UserTimeGetResponse(
        int morningStart,
        int morningEnd,
        int lunchStart,
        int lunchEnd,
        int dinnerStrat,
        int dinnerEnd,
        int nightStart,
        int nightEnd
) {

    private static int START_INDEX = 0;
    private static int END_INDEX = 2;

    public static UserTimeGetResponse of(final UserTime userTime) {
        return new UserTimeGetResponse(
                getIntValue(userTime.getMorningTime().getMorningStart()),
                getIntValue(userTime.getMorningTime().getMorningEnd()),
                getIntValue(userTime.getLunchTime().getLunchStart()),
                getIntValue(userTime.getLunchTime().getLunchEnd()),
                getIntValue(userTime.getDinnerTime().getDinnerStart()),
                getIntValue(userTime.getDinnerTime().getDinnerEnd()),
                getIntValue(userTime.getDinnerTime().getDinnerEnd()),
                getIntValue(userTime.getMorningTime().getMorningStart())
        );
    }

    private static int getIntValue(final TimeSlots timeSlots) {
        return Integer.valueOf(timeSlots.getTime().substring(START_INDEX, END_INDEX));
    }
}
