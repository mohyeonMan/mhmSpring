package sample03;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class SungJukImpl implements SungJuk{

	@Autowired
	private SungJukDTO sungJukDTO = null;
	//component로 설정된 빈에서 SungJukDTO타입을 찾아서 스프링 컨테이너가 생성자 매개변수를 자동으로 주입한다.

	@Override
	public void calcTot() {
		sungJukDTO.setTot(sungJukDTO.getKor()+sungJukDTO.getEng()+sungJukDTO.getMat());
	}

	@Override
	public void calcAvg() {
		sungJukDTO.setAvg(sungJukDTO.getTot()/3);
	}

	@Override
	public void display() {
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println(sungJukDTO);
	}

	@Override
	public void modify() {
		Scanner scan = new Scanner(System.in);
		System.out.print("이름 입력 :");
		sungJukDTO.setName(scan.next());
		System.out.print("국어 입력 :");
		sungJukDTO.setKor(scan.nextInt());
		System.out.print("영어 입력 :");
		sungJukDTO.setEng(scan.nextInt());
		System.out.print("수학 입력 :");
		sungJukDTO.setMat(scan.nextInt());
	}

}
