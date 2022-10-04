package ch18.checkproblem;

import java.io.BufferedReader;
import java.io.FileReader;

public class N7_Example {

	public static void main(String[] args) throws Exception {
		
		String filePath = "C:/ThisIsJavaSecondEdition/workspace/thisisjava/src/ch02/sec01/VariableUseExample.java";
		
		FileReader fr = new FileReader(filePath);
		BufferedReader br = new BufferedReader(fr);
		
		int rowNumber = 0;
		String rowData;
		while(true) {
			rowNumber++;
			rowData = br.readLine(); //1행을 읽음
			if(rowData==null) break;
			System.out.println(rowNumber + ": " + rowData);
		}
	}

}
