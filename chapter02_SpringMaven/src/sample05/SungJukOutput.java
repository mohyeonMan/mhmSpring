package sample05;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class SungJukOutput implements SungJuk{
	@Autowired
	@Qualifier("arrayList")
	private List<SungJukDTO2> list;
	
	
	public void setList(List<SungJukDTO2> list) {
		this.list = list;
	}


	@Override
	public void execute() {
		System.out.println("\n\n<name>\t<kor>\t<eng>\t<mat>\t<tot>\t<avg>\n"
						  +"----------------------------------------------");
								for(SungJukDTO2 sungJukDTO2 : list) {
									System.out.println(sungJukDTO2);
								}
		System.out.println("----------------------------------------------\n\n");
	}

}
