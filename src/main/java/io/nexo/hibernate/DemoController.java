package io.nexo.hibernate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Set;

@RestController
public class DemoController {

    @Autowired
    private DemoService demoService;

    @GetMapping("getUser")
    public Set<User> getUser(@RequestParam(name = "id") Long id )
    {
        return demoService.getUser(id);
    }

    @GetMapping("getUser2")
    public List<User> getUserList(@RequestParam(name = "id") Long id)
    {
        return demoService.getUserList(id);
    }
}