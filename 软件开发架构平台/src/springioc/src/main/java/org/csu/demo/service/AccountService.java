package org.csu.demo.service;

import org.csu.demo.dao.AccountDao;
import org.csu.demo.domain.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("accountService")
public class AccountService {

    @Autowired
    private AccountDao accountDao;

    public AccountService(AccountDao accountDao) {
        this.accountDao = accountDao;
        System.out.println("AccountService被创建了.....");
    }

    public Account login(Account account) {
        System.out.println("登录成功。。。");
        return accountDao.find(account);
    }

    public boolean register(Account account) {
        System.out.println("注册成功。。。");
        return accountDao.insert(account);
    }
}
