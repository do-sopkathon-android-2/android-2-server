package org.sopt.sopkathonserver.repository;

import org.sopt.sopkathonserver.domain.ToDo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ToDoRepository extends JpaRepository<ToDo, Long> {
}
