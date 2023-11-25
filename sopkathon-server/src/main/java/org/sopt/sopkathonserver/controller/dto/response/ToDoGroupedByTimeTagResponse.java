package org.sopt.sopkathonserver.controller.dto.response;

import org.sopt.sopkathonserver.domain.ToDo;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public record ToDoGroupedByTimeTagResponse(
        Map<String, List<ToDoGetResponse>> data
) {
//    public static ToDoGroupedByTimeTagResponse of(List<ToDo> toDos) {
//        Map<String, List<ToDoGetResponse>> groupedToDos = toDos.stream()
//                .map(ToDoGetResponse::of)
//                .collect(Collectors.groupingBy(ToDoGetResponse::timeTag));
//
//        return new ToDoGroupedByTimeTagResponse(groupedToDos);
//    }
}
