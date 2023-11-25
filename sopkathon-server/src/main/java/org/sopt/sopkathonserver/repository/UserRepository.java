package org.sopt.sopkathonserver.repository;

import jakarta.persistence.EntityNotFoundException;
import org.sopt.sopkathonserver.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    default User findByIdOrThrow(Long id) {
        return findById(id).orElseThrow(
                () -> new EntityNotFoundException("존재하지 않는 사용자입니다.")
        );
    }
}
