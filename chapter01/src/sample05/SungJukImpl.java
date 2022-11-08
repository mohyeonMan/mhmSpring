package sample05;

import java.util.Scanner;

public class SungJukImpl implements SungJuk {
	String name;
	int kor;
	int eng;
	int mat;
	int tot;
	double avg;
	
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
	}

	@Override
	public void display() {
		avg=tot/4;
	}

}
