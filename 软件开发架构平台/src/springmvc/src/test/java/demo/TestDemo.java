package demo;

import org.csu.demo.domain.User;
import org.csu.demo.persistence.UserDao;
import org.csu.demo.persistence.UserDaoImpl;
import org.junit.jupiter.api.Test;

import java.util.List;

public class TestDemo {

    @Test
    public void test1() {
        UserDao userDao = new UserDaoImpl();
        List<User> userList = userDao.findAllUser();
        System.out.println(userList.size());
    }
}
