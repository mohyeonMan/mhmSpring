package sample05;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class SungJukDTO2 {
	private String name2;
	private int kor2,eng2,mat2;
	private int tot2 ;
	private double avg2;
	
	@Override
	public String toString() {
		return name2+"\t"+
				kor2+"\t"+
				eng2+"\t"+
				mat2+"\t"+
				tot2+"\t"+
				String.format("%.2f",avg2);
	}
}
