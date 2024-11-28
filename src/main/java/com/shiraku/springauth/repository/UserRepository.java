package com.shiraku.springauth.repository;

import com.shiraku.springauth.model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
    UserEntity findByUsername(String username);
    UserEntity findByEmail(String email);
    UserEntity findByUsernameAndPassword(String username, String password);
    UserEntity findByEmailAndPassword(String email, String password);
    Optional<UserEntity> findByOauth2ProviderAndOauth2ProviderId(String oauth2Provider, String oauth2ProviderId);
}
