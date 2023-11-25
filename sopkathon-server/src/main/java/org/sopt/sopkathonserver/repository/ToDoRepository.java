package org.sopt.sopkathonserver.repository;

import org.sopt.sopkathonserver.domain.ToDo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ToDoRepository extends JpaRepository<ToDo, Long> {
}
