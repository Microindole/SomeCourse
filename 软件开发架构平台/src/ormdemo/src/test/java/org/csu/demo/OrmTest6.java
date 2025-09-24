package org.csu.demo;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.csu.demo.mybatisplus.User;
import org.csu.demo.mybatisplus.UserMapper;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@MapperScan("org.csu.demo.mybatisplus")
public class OrmTest6 {

    @Autowired
    private UserMapper userMapper;

    @Test
    void test(){
        User user = userMapper.selectById(1);
        System.out.println(user.getUsername());

        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("username","j2ee").eq("password","123456");
        User user1 = userMapper.selectOne(queryWrapper);
        System.out.println(user1);

    }

}
