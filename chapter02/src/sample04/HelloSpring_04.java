package sample04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpring_04 {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		MessageBean bean = context.getBean("messageBeanImpl",MessageBeanImpl.class);
		bean.helloCall();
	}
}
