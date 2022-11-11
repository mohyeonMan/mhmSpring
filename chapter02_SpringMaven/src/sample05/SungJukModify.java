package sample05;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import lombok.Setter;

@Setter
@Component
public class SungJukModify implements SungJuk {
	@Autowired
	@Qualifier("arrayList")
	List<SungJukDTO2> list;

	@Override
	public void execute() {
		Scanner scan = new Scanner(System.in);

		System.out.print("이름 입력 : ");
		String name = scan.next();
		int sw = 0;
		for (SungJukDTO2 sungJukDTO2 : list) {

			if (sungJukDTO2.getName2().equals(name)) {
				System.out.println(sungJukDTO2);

				System.out.print("이름 입력 : ");
				sungJukDTO2.setName2(scan.next());
				System.out.print("국어 입력 : ");
				sungJukDTO2.setKor2(scan.nextInt());
				System.out.print("영어 입력 : ");
				sungJukDTO2.setEng2(scan.nextInt());
				System.out.print("수학 입력 : ");
				sungJukDTO2.setMat2(scan.nextInt());
				sungJukDTO2.setTot2(sungJukDTO2.getKor2() + sungJukDTO2.getEng2() + sungJukDTO2.getMat2());
				sungJukDTO2.setAvg2(sungJukDTO2.getTot2() / 3);

				System.out.println("\n\n" + name + "님 수정 완료.\n\n");
				sw++;
				break;
			}
		}
		if (sw == 0)
			System.out.println("\n\n이름 찾을수 없음.\n\n");
	}

}
