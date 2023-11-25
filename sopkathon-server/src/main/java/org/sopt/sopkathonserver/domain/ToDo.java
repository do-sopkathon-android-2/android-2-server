package org.sopt.sopkathonserver.domain;


import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import org.sopt.sopkathonserver.domain.enums.TimeTag;

@Entity
public class ToDo {
    @Id
    private Long id;

    @ManyToOne
    private User user;

    private String content;

    private boolean isDone;

    @Enumerated(EnumType.STRING)
    private TimeTag timeTag;

}
