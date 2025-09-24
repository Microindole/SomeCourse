package org.csu.demo;


import org.csu.demo.jdbctemplate.User;
import org.csu.demo.jdbctemplate.UserDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class OrmTest2 {

    @Autowired
    private UserDao templateUserDao;

    @Test
    public void test() {
        User user = templateUserDao.findUser(2);
//        user.getUsername();
        System.out.println(user);

        List<User> userList = templateUserDao.findAllUser();
        System.out.println(userList);
    }
}
