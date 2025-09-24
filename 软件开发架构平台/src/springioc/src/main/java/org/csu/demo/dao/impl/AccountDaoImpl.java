package org.csu.demo.dao.impl;

import org.csu.demo.dao.AccountDao;
import org.csu.demo.domain.Account;
import org.springframework.stereotype.Component;

@Component("accountDao")
public class AccountDaoImpl implements AccountDao {

    public AccountDaoImpl() {
        System.out.println("AccountDaoImpl被创建了。。。。");
    }

    @Override
    public boolean insert(Account account) {
        System.out.println("插入了一个Account对象");
        return true;
    }

    @Override
    public Account find(Account account) {
        System.out.println("查询了一个Account对象");
        return null;
    }
}
