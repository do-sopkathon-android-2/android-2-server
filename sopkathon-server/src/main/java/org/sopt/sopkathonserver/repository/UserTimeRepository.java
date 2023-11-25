package org.sopt.sopkathonserver.repository;

import org.sopt.sopkathonserver.domain.User;
import org.sopt.sopkathonserver.domain.UserTime;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserTimeRepository extends JpaRepository<UserTime, Long> {

    Optional<UserTime> findByUser(User user);
}
