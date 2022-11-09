package sample01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpring_01 {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		MessageBean messageBean = context.getBean("messageBeanImpl",MessageBean.class);
		messageBean.sayHello();
		messageBean.sayHello("딸기",20000);
		messageBean.sayHello("바나나",2000, 10);
	}

}
