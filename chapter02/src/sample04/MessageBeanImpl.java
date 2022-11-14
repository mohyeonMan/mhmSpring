package sample04;

public class MessageBeanImpl implements MessageBean{
	private String name;
	private String phone;
	private Outputter outputter;
	

	//name은 생성자로
	public MessageBeanImpl(String name) {
		System.out.println("constructor name");
		this.name = name;
	}
	//phone, outputter는  set메소드로
	public void setPhone(String phone) {
		System.out.println("setPhone");
		this.phone = phone;
	}
	public void setOutputter(Outputter outputter) {
		System.out.println("setOutputter");
		this.outputter = outputter;
	}
	@Override
	public void helloCall() {
		System.out.println("helloCall");
		outputter.output(name+"\t"+phone);
	}

}
