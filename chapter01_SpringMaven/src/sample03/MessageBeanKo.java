package sample03;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("messageBean") // xml파일의 bean 대용. 하나씩 열어봐야하는 단점이있다.
@Scope("prototype") 
public class MessageBeanKo implements MessageBean{
	private int num; // 필드, 초기화.

	public MessageBeanKo() {
		System.out.println("ko기본생성자임니다");
	}
	
	@Override
	public void sayHello(String name) {
		num++;
		System.out.println("num = " + num);
		System.out.println("안녕, "+ name);
	}

}
