package io.nexo.hibernate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class DemoServiceImpl implements DemoService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public Set<User> findAllUsersSet() {
        return userRepository.findAllUsersSet();
    }

    @Override
    public List<User> findAllUsersList() {
        return userRepository.findAllUsersList();
    }

    @Override
    public List<User> findAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public List<User> findByIds(List<Long> ids) {
        return userRepository.findAllById(ids);
    }

    @Override
    public List<User> findByIdsJoinFetch(List<Long> ids) {
        return userRepository.findAllUsersByIds(ids);
    }

    @Override
    public List<User> findByIdsJoinFetchPageable(List<Long> ids, Integer pageNumber, Integer pageSize) {
        Pageable page = PageRequest.of(pageNumber, pageSize);
        return userRepository.findAllUsersByIdsPageable(ids, page);
    }
}
