package org.csu.demo;

import org.csu.demo.hibernate.User;
import org.csu.demo.hibernate.UserDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class OrmTest4 {

    @Autowired
    private UserDao userDao;

    @Test
    void test(){
        User user = userDao.findUser(1);
        System.out.println(user);
//        user.setPassword("123456");
    }
}
