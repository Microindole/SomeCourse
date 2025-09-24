package org.csu.demo;


import org.csu.demo.dao.AccountDao;
import org.csu.demo.dao.impl.AccountDaoImpl;
import org.csu.demo.domain.Account;
import org.csu.demo.service.AccountService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("org.csu.demo")
public class DemoConfiguration {

//    @Bean("account")
//    public Account account(){
//        Account account = new Account();
//        account.setUsername("abc");
//        account.setPassword("123");
//        return account;
//    }
//
//    @Bean("accountDao")
//    public AccountDao accountDao(){
//        return new AccountDaoImpl();
//    }
//
//    @Bean("accountService")
//    public AccountService accountService(AccountDao accountDao){
//        return new AccountService(accountDao);
//    }
}
