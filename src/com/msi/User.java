package com.msi;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by shao on 3/30/2016.
 */
public class User {
    public String name;
    public int age;

    public User(String name, int age){
        this.name = name;
        this.age = age;
    }
}
