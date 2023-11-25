package org.sopt.sopkathonserver.domain.enums;

import com.fasterxml.jackson.annotation.JsonValue;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum TimeTag {
    MORNING("morning"),
    LUNCH("lunch"),
    DINNER("dinner")
    ;
    @JsonValue
    private String time;
}
