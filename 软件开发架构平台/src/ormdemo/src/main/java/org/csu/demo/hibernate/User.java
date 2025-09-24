package org.csu.demo.hibernate;

import jakarta.persistence.*;
import lombok.Data;

// Hibernate对象一定要有id属性（主键，无论组件有没有）以及空的构造方法（有@Data可以忽略）
// 切且必须打上注解


@Data
@Entity
@Table(name = "userinfo")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String username;
    private String password;
    private String email;
    private int age;
    private boolean isAdmin;

}
