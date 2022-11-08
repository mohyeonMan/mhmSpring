package sample03;

public class MessageBeanEn implements MessageBean{

	public MessageBeanEn() {
		System.out.println("En기본생성자임니다");
	}
	
	
	@Override
	public void sayHello(String name) {
		System.out.println("Hi, "+name);
	}

}
