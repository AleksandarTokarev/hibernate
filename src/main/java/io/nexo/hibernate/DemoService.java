package io.nexo.hibernate;

import java.util.List;
import java.util.Set;

public interface DemoService {
    Set<User> getUser(Long id);

    List<User> getUserList(Long id);
}
