package org.csu.demo;


import org.csu.demo.jpa.JPAUser;
import org.csu.demo.jpa.UserDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;

@SpringBootTest
public class OrmTest5 {

    @Autowired
    private UserDao userDao;

    @Test
    void test(){
        Optional<JPAUser> userOptional = userDao.findById(1);
        JPAUser user = userOptional.get();
        System.out.println(user);
        List<JPAUser> jpaUsers = userDao.findAll();
        System.out.println(jpaUsers);
    }
}
