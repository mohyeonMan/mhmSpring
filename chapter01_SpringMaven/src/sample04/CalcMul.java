package sample04;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component //첫글자의 대소문자만 다르다면 생략가능.
@Scope("prototype")
public class CalcMul implements Calc{
		
	@Override
	public void calculate(int x, int y) {
		System.out.println(x+" * "+y+" = "+(x*y));
	}

}
