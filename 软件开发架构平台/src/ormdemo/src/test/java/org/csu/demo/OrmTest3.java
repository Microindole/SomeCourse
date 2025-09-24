package org.csu.demo;

import org.csu.demo.mybatis.User;
import org.csu.demo.mybatis.UserDao;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
@MapperScan("org.csu.demo.mybatis")
public class OrmTest3 {

    @Autowired
    private UserDao userDao;

//    注意，在此IDEA中，lombok注解不管用时，是查看注解处理器，勾上obtain和第一个，第三个路径一定要为空。
//    同时rebuild整个项目

    @Test
    void test(){
        System.out.println(userDao);
        User user = userDao.findUser(2);
        System.out.println(user);

        List<User> userList = userDao.findAllUser();
        System.out.println(userList);
    }
}
