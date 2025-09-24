package org.csu.demo.jdbctemplate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("templateUserDao")
public class UserDaoImpl implements UserDao {

    private static final String INSERT_USER =
            "INSERT INTO userinfo (username,password,email,age,is_admin) VALUES (?,?,?,?,?)";
    private static final String FIND_USER = "SELECT * FROM userinfo WHERE id = ?";

    private static final String FIND_USER_BY_USERNAME_AND_PASSWORD = "SELECT * FROM userinfo WHERE username=? AND password=?";

    private static final String FIND_USER_BY_USERNAME = "SELECT * FROM userinfo WHERE username=?";

    private static final String FIND_ALL_USER = "SELECT * FROM userinfo";

    private static final String DELETE_USER = "DELETE FROM userinfo WHERE id=?";


    @Autowired
    private JdbcTemplate jdbcTemplate;


    @Override
    public List<User> findAllUser() {
        //jdbcTemplate.queryForList(FIND_ALL_USER, JPAUser.class);
        return jdbcTemplate.query(FIND_ALL_USER, new UserRowMapper());

    }

    @Override
    public User findUserByUsernameAndPassword(String username, String password) {
        return null;
    }

    @Override
    public boolean findUserByUsername(String username) {
        return false;
    }

    @Override
    public User findUser(int id) {
        return jdbcTemplate.queryForObject(FIND_USER,
                new UserRowMapper(),
                id);

    }

    @Override
    public boolean insertUser(User user) {
        int result = jdbcTemplate.update(INSERT_USER,
                user.getUsername(),user.getPassword(),user.getEmail(),
                user.getAge(),user.isAdmin());
        return result == 1;
    }

    @Override
    public boolean deleteUser(int id) {
        return false;
    }
}
