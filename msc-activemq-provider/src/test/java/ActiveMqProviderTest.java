import com.miracle.msc.activemq.provider.ActiveMqProviderApplication;
import com.miracle.msc.activemq.provider.service.ActiveMqProviderService;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @program: MSC
 * @description:
 * @author: miracle
 * @create: 2019-07-07 21:31
 **/

@SpringBootTest(classes = ActiveMqProviderApplication.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class ActiveMqProviderTest {

    @Autowired
    ActiveMqProviderService activeMqProviderService;

}
