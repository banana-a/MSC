import com.alibaba.fastjson.JSON;
import com.miracle.msc.db.provider.DbProviderApplication;
import com.miracle.msc.db.provider.entity.Student;
import com.miracle.msc.db.provider.service.DbService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @program: MSC
 * @description:
 * @author: miracle
 * @create: 2019-07-07 23:15
 **/


@SpringBootTest(classes = DbProviderApplication.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class DbProviderTest {

    @Autowired
    DbService dbService;

    @Test
    public void testInsert(){
        Student student = new Student();
        student.setName("test");
        dbService.insert(student);
    }

    @Test
    public void t(){
        Student student = new Student();
        student.setEmail("604891119@qq.com");
        student.setName("test");
        student.setGrade("one");
        student.setPhone("12345678910");
        student.setMessage("null");
        String message = JSON.toJSONString(student);
    }

}
