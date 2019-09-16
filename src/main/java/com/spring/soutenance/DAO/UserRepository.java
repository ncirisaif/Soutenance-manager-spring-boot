package com.spring.soutenance.DAO;

import com.spring.soutenance.domain.UserApp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface UserRepository  extends JpaRepository<UserApp,Long> {

    Optional<UserApp> findByEmail(String email);

    Boolean existsByEmail(String email);



}
