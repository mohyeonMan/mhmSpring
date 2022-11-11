package sample05;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component
@Scope("prototype")
public class SungJukInput implements SungJuk{
	@Autowired //Spring이 알아서 찾는다.
	SungJukDTO2 sungJukDTO2=null;
	@Autowired // 다형성으로 arraylist 찾아온다.
	@Qualifier("arrayList") //ArrayList가 들어갈것임을 알려줌. 안그러면 null값이 하나가 들어있음.
	private List<SungJukDTO2> list;
	

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
