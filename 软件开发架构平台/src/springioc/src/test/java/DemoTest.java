import org.csu.demo.DemoConfiguration;
import org.csu.demo.domain.Account;
import org.csu.demo.service.AccountService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = DemoConfiguration.class)
public class DemoTest {

    @Autowired
    private Account account;

    @Autowired
    private AccountService accountService;

    @Test
    public void demo2(){
        System.out.println(account);
        accountService.login(account);
        accountService.register(account);
    }
}
