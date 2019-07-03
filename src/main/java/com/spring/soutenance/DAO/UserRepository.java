package com.spring.soutenance.DAO;

import com.spring.soutenance.domain.UserApp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository  extends JpaRepository<UserApp,Long> {
    UserApp findByEmail(String email);

}
