package sample05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class SungJukInput implements SungJuk{
		SungJukDTO2 sungJukDTO2=null;
		private List<SungJukDTO2> list;
		
	public void setList(List<SungJukDTO2> list) {
			this.list = list;
		}

	public void setSungJukDTO2(SungJukDTO2 sungJukDTO2) {
			this.sungJukDTO2 = sungJukDTO2;
		}

	@Override
	public void execute() {
			
		Scanner scan = new Scanner(System.in);
		System.out.print("이름 입력 : ");
		sungJukDTO2.setName2(scan.next());
		System.out.print("국어 입력 : ");
		sungJukDTO2.setKor2(scan.nextInt());
		System.out.print("영어 입력 : ");
		sungJukDTO2.setEng2(scan.nextInt());
		System.out.print("수학 입력 : ");
		sungJukDTO2.setMat2(scan.nextInt());
		
		sungJukDTO2.setTot2(sungJukDTO2.getKor2()+sungJukDTO2.getEng2()+sungJukDTO2.getMat2());
		sungJukDTO2.setAvg2(sungJukDTO2.getTot2()/3);
		
		list.add(sungJukDTO2);
		
		System.out.println("\n\n입력 완료되었습니다.\n");
	}
}
