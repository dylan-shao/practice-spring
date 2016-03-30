package com.msi;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by shao on 3/30/2016.
 */
@RestController
public class Api {
    @RequestMapping("/user")
    public List<User> getUsers() {
        List<User> users = new ArrayList<>();
        users.add(new User("a", 1));
        return users;

    }
}
