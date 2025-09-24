package Demo;


import org.csu.demo.spring.ProductDao;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class DemoTest {

    @Autowired
    private ProductDao productDao;

    @Test
    public void demo1() {
        productDao.insert();
        productDao.delete();
    }

}
