import com.worstEzreal.dubbo.service.IHelloService;
import com.worstEzreal.dubboConsumer.entity.City;
import com.worstEzreal.dubboConsumer.service.CityService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Desc
 *
 * @author zengxzh@yonyou.com
 * @version V1.0.0
 * @date 2017/9/13
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-context.xml")
public class TestHello {

    @Autowired
    private IHelloService helloService;

    @Autowired
    private CityService cityService;

    @Test
    public void test(){
//        ClassPathXmlApplicationContext context =
//                new ClassPathXmlApplicationContext(new String[]{"classpath*:spring-context.xml"});
//        IHelloService helloService = (IHelloService)context.getBean("helloService");
        String str = helloService.hello("worstEzreal");
        System.out.println(helloService.hello("worstEzreal"));
    }
    @Test
    public void test2(){
        City city = cityService.getCityById(1);
        System.out.println(city);
    }
}
