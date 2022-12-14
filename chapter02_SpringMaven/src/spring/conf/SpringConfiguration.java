package spring.conf;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import sample01.MessageBeanImpl;
import sample02.CalcAdd;
import sample02.CalcMul;
import sample05.SungJukDTO2;

@Configuration //환경설정을 위한 java파일로 선언.
public class SpringConfiguration { //applicationContext.xml 의 역할을 하는 클래스.

	@Bean
	public MessageBeanImpl messageBeanImpl(){
		return new MessageBeanImpl("사과");
	}
	
	@Bean
	public CalcAdd calcAdd() {
		return new CalcAdd(25, 36);
	}
	@Bean(name="calcMul")
	public CalcMul getCalcMul() {
		return new CalcMul();
	}
	@Bean
	public List<SungJukDTO2> arrayList(){
		return new ArrayList<SungJukDTO2>(); // 내부클래스는 우리가 component할수가없다. 그래서 configuration이 꼭필요하다!
	}
	
}

/*
@Bean 
- 메소드 위에 선언. return되는 클래스를 빈으로 생성.
- 메소드의 이름은 반드시 id명으로 설정해야한다.
*/
