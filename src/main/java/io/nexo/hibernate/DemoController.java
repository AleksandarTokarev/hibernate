package io.nexo.hibernate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@RestController
public class DemoController {

    @Autowired
    private DemoService demoService;

    @GetMapping("findAllUsersSet")
    public Set<User> findAllUsersSet()
    {
        Set<User> usersSet = demoService.findAllUsersSet();
        return usersSet;
    }

    @GetMapping("findAllUsersList")
    public List<User> findAllUsersList()
    {
        List<User> usersList = demoService.findAllUsersList();
        return usersList;
    }

    @GetMapping("findAllUsers")
    public List<User> findAllUsers()
    {
        List<User> usersList = demoService.findAllUsers();
        // If the user attributes is not set to null here and "spring.jpa.open-in-view=false" property is set
        // it will try to fetch it when the json is returned and because session is closed it will throw exception
        for(User user : usersList) {
            user.setUserAttributes(null);
        }
        return usersList;
    }

    @PostMapping("findByIds")
    public List<User> findByIds(@RequestBody List<Long> ids)
    {
        List<User> usersList = demoService.findByIds(ids);
        // If the user attributes is not set to null here and "spring.jpa.open-in-view=false" property is set
        // it will try to fetch it when the json is returned and because session is closed it will throw exception
        for(User user : usersList) {
            user.setUserAttributes(null);
        }
        return usersList;
    }

    @PostMapping("findByIdsJoinFetch")
    public List<User> findByIdsJoinFetch(@RequestBody List<Long> ids)
    {
        List<User> usersList = demoService.findByIdsJoinFetch(ids);
        return usersList;
    }

    @PostMapping("findByIdsJoinFetchPageable")
    public List<User> findByIdsJoinFetchPageable(@RequestBody List<Long> ids, @RequestParam Integer pageSize, @RequestParam Integer pageNumber)
    {
        List<User> usersList = demoService.findByIdsJoinFetchPageable(ids, pageNumber, pageSize);
        return usersList;
    }
}