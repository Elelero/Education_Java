package ch18.sec03.exam03;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyExample {

	public static void main(String[] args) {

		//원본 사진
		String originalFileName = "C:/Temp/photo.jpg";
		//복사할 사진
		String targetFIleName = "C:/Temp/photo2.jpg";

		
		try (InputStream is = new FileInputStream(originalFileName); 
			 OutputStream os = new FileOutputStream(targetFIleName)) {
			 
			byte[] data = new byte[1024]; //1kB
			
			while(true) {
				int num = is.read(data);
				if(num==-1) break;
				os.write(data, 0, num); //읽은 수 만큼만 출력
			}
			
			os.flush();
			
			System.out.println("복사 완료!");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
