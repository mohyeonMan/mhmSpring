package sample03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Getter;

@Getter
@Component
public class SungJukDTO {
	
	private String name;
	private int kor,eng,mat,tot;
	private double avg;
	@Autowired
	public void setName(@Value("박지훈") String name) {
		this.name = name;
	}
	@Autowired
	public void setKor(@Value("50") int kor) {
		this.kor = kor;
	}
	@Autowired
	public void setEng(@Value("50") int eng) {
		this.eng = eng;
	}
	@Autowired
	public void setMat(@Value("50") int mat) {
		this.mat = mat;
	}

	public void setTot(int tot) {
		this.tot = tot;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

	
	@Override
	public String toString() {
		return name+"\t"+
				kor+"\t"+
				eng+"\t"+
				mat+"\t"+
				tot+"\t"+
				String.format("%.2f",avg);
	}
}
