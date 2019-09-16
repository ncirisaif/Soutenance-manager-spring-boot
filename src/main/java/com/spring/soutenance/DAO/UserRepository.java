package com.spring.soutenance.DAO;

import com.spring.soutenance.domain.UserApp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

<<<<<<< HEAD
import java.util.Optional;


@Repository
public interface UserRepository  extends JpaRepository<UserApp,Long> {

    Optional<UserApp> findByEmail(String email);

    Boolean existsByEmail(String email);


=======
@Repository
public interface UserRepository  extends JpaRepository<UserApp,Long> {
    UserApp findByEmail(String email);
>>>>>>> 91b3dc92a671722fccd3876725f715f68b06e8bb

}
