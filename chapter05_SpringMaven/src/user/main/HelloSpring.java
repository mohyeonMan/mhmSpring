package user.main;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import user.service.UserDeleteService;
import user.service.UserInsertService;
import user.service.UserSelectService;
import user.service.UserService;
import user.service.UserUpdateService;


@Component
public class HelloSpring {
	
	private void menu(ApplicationContext context) {
		int a;
		Scanner scan = new Scanner(System.in);
		while(true) {	
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
			a = scan.nextInt();
			UserService userService=null;
			if(a==5) break;
			else if(a==1) userService = context.getBean("userInsertService",UserService.class);
			else if(a==2) userService = context.getBean("userSelectService",UserService.class);
			else if(a==3) userService = context.getBean("userUpdateService",UserService.class);
			else if(a==4) userService = context.getBean("userDeleteService",UserService.class);
			userService.execute();
		}
		System.out.println("\n프로그램 종료");
	}
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/applicationContext.xml");
		HelloSpring hello = context.getBean("helloSpring",HelloSpring.class);
		hello.menu(context);
	}
}
