package org.csu.demo.mybatis;


//使用lombok简化步骤

import lombok.Data;

@Data
public class User {

    private int id;
    private String username;
    private String password;
    private String email;
    private int age;
    private boolean isAdmin;

}
