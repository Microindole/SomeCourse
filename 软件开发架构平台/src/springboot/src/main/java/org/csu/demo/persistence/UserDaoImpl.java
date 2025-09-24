package org.csu.demo.persistence;

import org.csu.demo.domain.User;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


@Repository("userDao")
public class UserDaoImpl implements UserDao{

    private static final String INSERT_USER =
            "INSERT INTO userinfo (username,password,email,age,is_admin) VALUES (?,?,?,?,?)";
    private static final String FIND_USER = "SELECT * FROM userinfo WHERE id = ?";

    private static final String FIND_USER_BY_USERNAME_AND_PASSWORD = "SELECT * FROM userinfo WHERE username=? AND password=?";

    private static final String FIND_USER_BY_USERNAME = "SELECT * FROM userinfo WHERE username=?";

    private static final String FIND_ALL_USER = "SELECT * FROM userinfo";

    private static final String DELETE_USER = "DELETE FROM userinfo WHERE id=?";

    public List<User> findAllUser(){
        List<User> userList = new ArrayList<>();
        try {
            Connection connection = DBUtil.getConnection();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(FIND_ALL_USER);
            while (resultSet.next()){
                User user = this.resultSetToUser(resultSet);
                userList.add(user);
            }
            DBUtil.closeResultSet(resultSet);
            DBUtil.closeStatement(statement);
            DBUtil.closeConnection(connection);
        }catch (Exception e){
            e.printStackTrace();
        }
        return userList;
    }

    public User findUserByUsernameAndPassword(String username, String password){
        User result = null;
        try {
            Connection connection = DBUtil.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(FIND_USER_BY_USERNAME_AND_PASSWORD);
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);
            ResultSet resultSet = preparedStatement.executeQuery();
            if(resultSet.next()){
                result = this.resultSetToUser(resultSet);
            }
            DBUtil.closeResultSet(resultSet);
            DBUtil.closePreparedStatement(preparedStatement);
            DBUtil.closeConnection(connection);
        }catch (Exception e){
            e.printStackTrace();
        }
        return result;
    }

    public boolean findUserByUsername(String username){
        boolean result = false;
        try {
            Connection connection = DBUtil.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(FIND_USER_BY_USERNAME);
            preparedStatement.setString(1, username);
            ResultSet resultSet = preparedStatement.executeQuery();
            if(resultSet.next()){
                result = true;
            }
            DBUtil.closeResultSet(resultSet);
            DBUtil.closePreparedStatement(preparedStatement);
            DBUtil.closeConnection(connection);
        }catch (Exception e){
            e.printStackTrace();
        }
        return result;
    }

    public User findUser(int id){
        User result = null;
        try {
            Connection connection = DBUtil.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(FIND_USER);
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            if(resultSet.next()){
                result = this.resultSetToUser(resultSet);
            }
            DBUtil.closeResultSet(resultSet);
            DBUtil.closePreparedStatement(preparedStatement);
            DBUtil.closeConnection(connection);
        }catch (Exception e){
            e.printStackTrace();
        }
        return result;
    }

    public boolean insertUser(User user){
        boolean result = false;
        try {
            Connection connection = DBUtil.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USER);
            preparedStatement.setString(1, user.getUsername());
            preparedStatement.setString(2, user.getPassword());
            preparedStatement.setString(3,user.getEmail());
            preparedStatement.setInt(4,user.getAge());
            preparedStatement.setInt(5,user.isAdmin() ? 0 : 1 );
            int rows = preparedStatement.executeUpdate();
            if(rows == 1){
                result = true;
            }
            DBUtil.closePreparedStatement(preparedStatement);
            DBUtil.closeConnection(connection);
        }catch (Exception e){
            e.printStackTrace();
        }
        return result;
    }

    public boolean deleteUser(int id){
        boolean result = false;
        try {
            Connection connection = DBUtil.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(DELETE_USER);
            preparedStatement.setInt(1, id);

            int rows = preparedStatement.executeUpdate();
            if(rows == 1){
                result = true;
            }
            DBUtil.closePreparedStatement(preparedStatement);
            DBUtil.closeConnection(connection);
        }catch (Exception e){
            e.printStackTrace();
        }
        return result;
    }

    private User resultSetToUser(ResultSet resultSet) throws Exception{
        User user = new User();
        user.setId(resultSet.getInt("id"));
        user.setUsername(resultSet.getString("username"));
        user.setPassword(resultSet.getString("password"));
        user.setEmail(resultSet.getString("email"));
        user.setAge(resultSet.getInt("age"));
        user.setAdmin(resultSet.getInt("is_admin") == 0);
        return user;
    }
}
