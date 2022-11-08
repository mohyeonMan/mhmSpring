package sample04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpring {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Calc calc;
		calc = context.getBean("calcAdd",CalcAdd.class);
		calc.calculate(10, 10);
		calc = context.getBean("calcMul",CalcMul.class);
		calc.calculate(10, 10);

	}

}
