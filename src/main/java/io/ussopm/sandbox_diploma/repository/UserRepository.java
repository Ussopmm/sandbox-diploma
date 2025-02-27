package io.ussopm.sandbox_diploma.repository;

import io.ussopm.sandbox_diploma.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    @Query(value = "SELECT * FROM public.t_user",nativeQuery = true )
    List<User> getAllUsers();

    @Query(value = "SELECT * FROM public.t_user WHERE username = ?1", nativeQuery = true)
    List<User> getUserByUsername(String username);

//    @Qery(value = "SELECT * FROM t_user WHERE username = '" + username + "' AND password = '" + password + "'", nativeQuery = true)
//    Optional<User> findUserByUsernameAndPassword(String username, String password);

}
