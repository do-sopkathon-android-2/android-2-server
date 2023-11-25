package org.sopt.sopkathonserver.domain.enums;

import com.fasterxml.jackson.annotation.JsonValue;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum TimeSlots {

    SLOT_1_00("01:00"),
    SLOT_2_00("02:00"),
    SLOT_3_00("03:00"),
    SLOT_4_00("04:00"),
    SLOT_5_00("05:00"),
    SLOT_6_00("06:00"),
    SLOT_7_00("07:00"),
    SLOT_8_00("08:00"),
    SLOT_9_00("09:00"),
    SLOT_10_00("10:00"),
    SLOT_11_00("11:00"),
    SLOT_12_00("12:00"),
    SLOT_13_00("13:00"),
    SLOT_14_00("14:00"),
    SLOT_15_00("15:00"),
    SLOT_16_00("16:00"),
    SLOT_17_00("17:00"),
    SLOT_18_00("18:00"),
    SLOT_19_00("19:00"),
    SLOT_20_00("20:00"),
    SLOT_21_00("21:00"),
    SLOT_22_00("22:00"),
    SLOT_23_00("23:00"),
    SLOT_24_00("24:00");

    @JsonValue
    private final String time;

}
