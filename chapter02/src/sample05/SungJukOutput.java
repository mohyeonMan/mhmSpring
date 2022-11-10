package sample05;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SungJukOutput implements SungJuk{

	@Override
	public void execute() {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		List<SungJukDTO2> list = context.getBean("list",ArrayList.class);

		System.out.println(list.size());
//		for(int i =0;i<list.size()-1;i++) {
//			System.out.println(
//			list.get(i).getName2()+"\t"+
//			list.get(i).getKor2()+"\t"+
//			list.get(i).getEng2()+"\t"+
//			list.get(i).getMat2()+"\t"
//			);
//		}
	}

}
