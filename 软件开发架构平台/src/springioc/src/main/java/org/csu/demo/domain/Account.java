package org.csu.demo.domain;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("account")
public class Account {

    @Value("abc")
    private String username;

    @Value("123")
    private String password;

    public Account() {
        System.out.println("Account constructor");
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
