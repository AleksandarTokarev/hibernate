package io.nexo.hibernate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class DemoServiceImpl implements DemoService {

    @Autowired
    private UserRepository userRepository;


    @Override
    public Set<User> getUser(Long id) {
        return userRepository.getUsersJoin();
    }

    @Override
    public List<User> getUserList(Long id) {
        return userRepository.findAll();
    }
}
