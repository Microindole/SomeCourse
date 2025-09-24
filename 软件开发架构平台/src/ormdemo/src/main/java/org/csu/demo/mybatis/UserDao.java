package org.csu.demo.mybatis;


import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao {
    User findUser(@Param("id") int id);

    List<User> findAllUser();
}
