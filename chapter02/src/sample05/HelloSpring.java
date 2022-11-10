package sample05;


import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpring {
	
	private void menu() {
		while(true) {	
			ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
			Scanner scan = new Scanner(System.in);
			System.out.print("***************\n" 
							+ "   관리\n" 
							+ "***************\n" 
							+ "  1. 입력\n" 
							+ "  2. 출력\n"
							+ "  3. 수정\n" 
							+ "  4. 삭제\n" 
							+ "  5. 종료\n" 
							+ "***************\n" 
							+ "   번호선택 : ");
			int a = scan.nextInt();
			SungJuk sungJuk=null;
			if(a==5) break;
			else if(a==1) sungJuk=context.getBean("sungJukInput",SungJukInput.class);
			else if(a==2) sungJuk=context.getBean("sungJukOutput",SungJukOutput.class);
			else if(a==3) sungJuk=context.getBean("sungJukModify",SungJukModify.class);
			else if(a==4) sungJuk=context.getBean("sungJukDelete",SungJukDelete.class);
			sungJuk.execute();
		}
		System.out.println("\n프로그램 종료");
	}
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		HelloSpring hello = context.getBean("helloSpring",HelloSpring.class);
		hello.menu();
	}
}
