package org.csu.demo.persistence;

import org.csu.demo.domain.User;

import java.util.List;

public interface UserDao {
    public List<User> findAllUser();

    public User findUserByUsernameAndPassword(String username, String password);

    public boolean findUserByUsername(String username);

    public User findUser(int id);

    public boolean insertUser(User user);

    public boolean deleteUser(int id);
}
