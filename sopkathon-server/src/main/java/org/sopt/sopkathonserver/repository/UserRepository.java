package org.sopt.sopkathonserver.repository;

import org.sopt.sopkathonserver.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
