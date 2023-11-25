package org.sopt.sopkathonserver.repository;

import org.sopt.sopkathonserver.domain.UserTime;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserTimeRepository extends JpaRepository<UserTime, Long> {
}
