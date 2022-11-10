package sample05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class SungJukInput implements SungJuk{

	@Override
	public void execute() {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		SungJukDTO2 sungJukDTO2 = context.getBean("sungJukDTO2",SungJukDTO2.class);
		List<SungJukDTO2> list = context.getBean("list",ArrayList.class);
		
		Scanner scan = new Scanner(System.in);
		System.out.print("이름 입력 : ");
		sungJukDTO2.setName2(scan.next());
		System.out.print("국어 입력 : ");
		sungJukDTO2.setKor2(scan.nextInt());
		System.out.print("영어 입력 : ");
		sungJukDTO2.setEng2(scan.nextInt());
		System.out.print("수학 입력 : ");
		sungJukDTO2.setMat2(scan.nextInt());
		
		list.add(sungJukDTO2);
		
		System.out.println("\n\n입력 완료되었습니다.\n");
	}
}
