package org.sopt.sopkathonserver.domain.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum TimeTag {
    MORNING("morning"),
    LUNCH("lunch"),
    DINNER("dinner")
    ;
    private String time;
}
