package org.csu.demo;

import org.csu.demo.jdbc.User;
import org.csu.demo.jdbc.UserDao;
import org.csu.demo.jdbc.UserDaoImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class OrmTest1 {

    @Autowired
    private UserDao jdbcUserDao;

    @Test
    public void test() {
        User user = jdbcUserDao.findUser(3);
        System.out.println(user.getUsername());
    }
}
