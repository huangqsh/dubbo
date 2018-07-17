package org.huangqsh.provider;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"classpath*:config/spring-dubbo-provider.xml"})
public class ConsumerTest {
	
	@Test
	public  void test() {
//		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath*:config/spring-dubbo-provider.xml");
//		applicationContext.getBean("userService");
		System.out.println("22");
	}
}
