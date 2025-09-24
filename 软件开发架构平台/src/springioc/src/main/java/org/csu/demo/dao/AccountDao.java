package org.csu.demo.dao;

import org.csu.demo.domain.Account;

public interface AccountDao {
    boolean insert(Account account);

    Account find(Account account);
}
