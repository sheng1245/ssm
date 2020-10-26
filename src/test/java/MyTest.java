import com.zts.pojo.Books;
import com.zts.service.BookServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {

    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookServiceImpl serviceImpl = (BookServiceImpl) context.getBean("BookServiceImpl");
        for(Books books:serviceImpl.queryAll()){
            System.out.println(books);
        }
    }
}
