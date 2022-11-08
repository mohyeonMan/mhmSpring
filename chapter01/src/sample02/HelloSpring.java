package sample02;

public class HelloSpring{

	public static void main(String[] args) {
		MessageBean messageBean = new MessageBeanKo(); //결합도 낮추기.
		messageBean.sayHello("Spring~");
	}

}
