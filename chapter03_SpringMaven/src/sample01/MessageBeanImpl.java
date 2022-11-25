package sample01;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//target
@Component
public class MessageBeanImpl implements MessageBean{

	@Value("good")
	private String str;
	
	//target 의 모든 메소드는 JoinPoint가 된다.

	@Override
	public void showPrintBefore() {
		System.out.println("\nshowPrintBefore : "+str+"\n"); //핵심코드
	}

	@Override
	public void viewPrintBefore() {
		try {
			Thread.sleep(5000); // 5초 딜레이
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("\nviewPrintBefore : "+str+"\n"); //핵심코드
	}

	@Override
	public void display() {
		System.out.println("\ndisplay : "+str+"\n"); //핵심코드
	}

	@Override
	public void showPrintAfter() {
		System.out.println("\nshowPrintAfter : "+str+"\n"); //핵심코드		
	}

	@Override
	public void viewPrintAfter() {
		System.out.println("\nviewPrintAfter : "+str+"\n"); //핵심코드
		
	}
	@Override
	public String showPrint() {
		System.out.println("\nshowPrint : "+str+"\n"); //핵심코드
		return "veryGood";
	}
	@Override
	public void viewPrint() {
		System.out.println("\nviewPrint : "+str+"\n"); //핵심코드
	}

}
