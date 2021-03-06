package de.smiconsulting.smichatbackend.repository.user;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author SMI Consulting
 */
@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {
    Optional<UserEntity> findByUsernameOrEmail(String username, String email);

    Optional<UserEntity> findByUsernameAndEmailAndValidated(String username, String email, boolean validated);

    Optional<UserEntity> findByEmailAndValidationCodeAndValidated(String email, String validationCode, boolean validated);
}
