package sample03;

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
