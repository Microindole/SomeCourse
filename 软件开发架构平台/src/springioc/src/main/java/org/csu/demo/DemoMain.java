package org.csu.demo;

import org.csu.demo.domain.Account;
import org.csu.demo.service.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoMain {
    public static void main(String[] args) {
//        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        ApplicationContext context = new AnnotationConfigApplicationContext(DemoConfiguration.class);
//        Account account = (Account) context.getBean("account");
        Account account = context.getBean("account", Account.class);
        System.out.println(account.getUsername()+","+account.getPassword());

        AccountService accountService = (AccountService) context.getBean("accountService",AccountService.class);
        accountService.register(account);
        accountService.login(account);

        Account account1 = context.getBean("account", Account.class);
        System.out.println(account);
        System.out.println(account1);
    }
}
