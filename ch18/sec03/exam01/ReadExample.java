package ch18.sec03.exam01;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ReadExample {

	public static void main(String[] args) {
		
		
		try (InputStream is = new FileInputStream("C:/Temp/test1.db") ) {
			
			while(true) {
				int data = is.read(); //1바이트 읽음
				System.out.println(data);
				if(data==-1) break; //데이터를 다 읽었을 경우 while문 나오기!
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
