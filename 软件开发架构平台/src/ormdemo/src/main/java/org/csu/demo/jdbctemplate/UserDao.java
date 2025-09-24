package org.csu.demo.jdbctemplate;

import java.util.List;

public interface UserDao {
    public List<User> findAllUser();

    public User findUserByUsernameAndPassword(String username, String password);

    public boolean findUserByUsername(String username);

    public User findUser(int id);

    public boolean insertUser(User user);

    public boolean deleteUser(int id);
}
