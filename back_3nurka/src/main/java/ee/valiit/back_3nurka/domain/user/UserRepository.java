package ee.valiit.back_3nurka.domain.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {

    @Query("select u from User u where u.email = ?1 and u.password = ?2")
    Optional<User> findBy(String email, String password);


}