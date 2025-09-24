package org.csu.demo.service;



import org.csu.demo.domain.User;
import org.csu.demo.persistence.UserDao;
import org.csu.demo.persistence.UserDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("userService")
public class UserService {
    @Autowired
    private UserDao userDao;
    private String msg;

//    public UserService(){
//        this.userDao = new UserDaoImpl();
//    }

    public User login(User user){
//        User loginUser = this.userDao.findUserByUsernameAndPassword(username, password);
        User loginUser = this.userDao.findUserByUsernameAndPassword(user.getUsername(),user.getPassword());
        if(loginUser == null){
            this.msg = "用户名或密码错误";
            return null;
        }
        return loginUser;
    }

    public List<User> getAllUserInfo(){
        List<User> userList = new ArrayList<>();
        userList = userDao.findAllUser();
        return userList;
    }
    public boolean addUser(User registerUser){
        String username = registerUser.getUsername();
        if(userDao.findUserByUsername(username)) {
            this.msg = "用户名已存在";
            return false;
        }
        return userDao.insertUser(registerUser);
    }

    public boolean deleteUser(int id){
        return userDao.deleteUser(id);
    }

    public List<User> getUserList(){
        return this.userDao.findAllUser();
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
