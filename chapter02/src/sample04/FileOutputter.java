package sample04;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

//파일로 출력
public class FileOutputter implements Outputter {
	private String filePath,fileName;
	
	
	public void setFilePath(String filePath) {
		System.out.println("setFilePath");
		this.filePath = filePath;
	}



	public void setFileName(String fileName) {
		System.out.println("setFileName");
		this.fileName = fileName;
	}



	@Override
	public void output(String message) {
		System.out.println("message output");
		
		try {
			FileWriter fileWriter = new FileWriter(new File(filePath,fileName));
			fileWriter.write(message);
			fileWriter.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
