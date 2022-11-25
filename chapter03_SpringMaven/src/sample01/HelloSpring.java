package sample01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpring {

	public static void main(String[] args) {
		ApplicationContext con = new ClassPathXmlApplicationContext("acQuickStart.xml");
		MessageBean mb = con.getBean("messageBeanImpl",MessageBean.class);
//		mb.showPrintBefore();
//		mb.viewPrintBefore();
//		mb.display();
//		mb.showPrintAfter();
//		mb.viewPrintAfter();
		mb.showPrint();
		mb.viewPrint();
		mb.display();
		
	}
}
