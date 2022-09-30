package ch18.sec04.exam02;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReadExample {

	public static void main(String[] args) {
		
		Reader reader = null;
		
		try {
			
			//1문자씩 읽기
			reader = new FileReader("C:/Temp/test.txt"); //텍스트파일로부터 문자 입력 스트림 생성
			while(true) {
				int data = reader.read();//1문자 읽음
				System.out.print((char)data);
				if(data==-1) break;
			}
			reader.close();
			System.out.println();
		
		
			//문자 배열로 읽기
			reader = new FileReader("C:/Temp/test.txt");
			char[] data = new char[100];
			while(true) {
				int num = reader.read(data);
				for(int i=0; i<num; i++) {
					System.out.print(data[i]);
				}
				if(num==-1) break;
			}
			reader.close();
		
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
