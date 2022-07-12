package io.nexo.hibernate;

import java.util.List;
import java.util.Set;

public interface DemoService {
    Set<User> findAllUsersSet();

    List<User> findAllUsersList();

    List<User> findAllUsers();

    List<User> findByIds(List<Long> ids);

    List<User> findByIdsJoinFetch(List<Long> ids);

    List<User> findByIdsJoinFetchPageable(List<Long> ids, Integer pageNumber, Integer pageSize);
}
