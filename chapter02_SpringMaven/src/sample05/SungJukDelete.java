package sample05;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import lombok.Setter;

@Setter
@Component
public class SungJukDelete implements SungJuk {
	@Autowired
	@Qualifier("arrayList")
	private List<SungJukDTO2> list;

	@Override
	public void execute() {
		Scanner scan = new Scanner(System.in);

		System.out.print("이름 입력 : ");
		String name = scan.next();
		int sw = 0;
		Iterator<SungJukDTO2> it = list.iterator();
		while(it.hasNext()) {
			SungJukDTO2 sungJukDTO2 = it.next();
			if (sungJukDTO2.getName2().equals(name)) {
				it.remove();
				System.out.println("\n\n삭제완료.\n\n");
				sw++;
				break;
			}
		}
		if (sw == 0)
			System.out.println("\n\n이름 찾을수 없음.\n\n");
	}
}
