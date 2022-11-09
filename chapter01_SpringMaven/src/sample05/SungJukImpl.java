package sample05;

import java.util.Scanner;

import org.springframework.stereotype.Component;

@Component
public class SungJukImpl implements SungJuk {
	private String name;
	private int kor,eng,mat,tot;
	private double avg;
	
	public SungJukImpl() {
		Scanner scan = new Scanner(System.in);
		System.out.print("이름 : ");
		this.name=scan.next();
		System.out.print("국어점수 : ");
		this.kor=scan.nextInt();
		System.out.print("영어점수 : ");
		this.eng=scan.nextInt();
		System.out.print("수학점수 : ");
		this.mat=scan.nextInt();
		System.out.println("\n");
	}

	@Override
	public void calc() {
		tot = kor+eng+mat;
		avg=tot/3;
	}

	@Override
	public void display() {
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println(name+"\t"+
							kor+"\t"+
							eng+"\t"+
							mat+"\t"+
							tot+"\t"+
							String.format("%.3f", avg));
	}

}
