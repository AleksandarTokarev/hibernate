package io.nexo.hibernate;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Set;

public interface UserRepository extends JpaRepository<User, Long> {

    @Query("SELECT user FROM User user LEFT JOIN FETCH user.userAttributes userAttributes")
    Set<User> findAllUsersSet();

    @Query("SELECT distinct user FROM User user LEFT JOIN FETCH user.userAttributes userAttributes")
    List<User> findAllUsersList();

    @Query("SELECT distinct user FROM User user LEFT JOIN FETCH user.userAttributes userAttributes WHERE user.id in ?1")
    List<User> findAllUsersByIds(List<Long> ids);

    @Query("SELECT distinct user FROM User user LEFT JOIN FETCH user.userAttributes userAttributes WHERE user.id in ?1")
    List<User> findAllUsersByIdsPageable(List<Long> ids, Pageable pageable);

}