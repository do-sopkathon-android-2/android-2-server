package org.sopt.sopkathonserver.domain;


import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.sopt.sopkathonserver.domain.enums.TimeTag;

@Entity
@Getter
@NoArgsConstructor
public class ToDo {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private User user;

    private String content;

    @Enumerated(EnumType.STRING)
    private TimeTag timeTag;

    @Builder
    public ToDo(String content, TimeTag timeTag, User user){
        this.content = content;
        this.timeTag = timeTag;
        this.user = user;
    }

}
