package sample03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class HelloSpring{

	public static void main(String[] args) {
		//ApplicationContext context = new FileSystemXmlApplicationContext("src/applicationContext.xml");
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml"); // 더 선호된다.
		
		//MessageBean messageBean = (MessageBean) context.getBean("messageBean"); 
		MessageBean messageBean =  context.getBean("messageBean",MessageBean.class); 
		//object로 가져온다.
		
		messageBean.sayHello("Spring"); 
		System.out.println();
		
	
	}

}
