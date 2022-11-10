package sample02;

import org.springframework.beans.factory.annotation.Value;

//@Component
public class CalcAdd implements Calc {
	int x, y;
	
	public CalcAdd(@Value("25") int x,@Value("36") int y) {
		super();
		this.x = x;
		this.y = y; 
	}
	
	
	@Override
	public void calculate() {
		System.out.println(x+" + "+ y +" = "+(x+y));
	}



}
