package io.nexo.hibernate;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Set;

public interface UserRepository extends JpaRepository<User, Long> {

    @Query("SELECT user FROM User user LEFT JOIN FETCH user.userAttributes userAttributes")
    Set<User> getUsersJoin();

}