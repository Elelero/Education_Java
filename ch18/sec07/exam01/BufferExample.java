package ch18.sec07.exam01;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class BufferExample {

	public static void main(String[] args) {
		
		try {
			//버퍼가 없는 스트림 생성
			String originalFilePath1 = BufferExample.class.getResource("originalFile1.jpg").getPath(); //절대 경로
			String targetFilePath1 = "C:/Temp/targetFile1.jpg";
			
			FileInputStream fis1 = new FileInputStream(originalFilePath1);
			FileOutputStream fos1 = new FileOutputStream(targetFilePath1);

			
			//버퍼가 있는 스트림 생성
			String originalFilePath2 = BufferExample.class.getResource("originalFile2.jpg").getPath(); //절대 경로
			String targetFilePath2 = "C:/Temp/targetFile2.jpg";
			
			FileInputStream fis2 = new FileInputStream(originalFilePath2);
			BufferedInputStream bis = new BufferedInputStream(fis2);
			
			FileOutputStream fos2 = new FileOutputStream(targetFilePath2);
			BufferedOutputStream bos = new BufferedOutputStream(fos2);
			
			//복사 시간 측정
			long nonBufferTime = copy(fis1, fos1);
			System.out.println("버퍼 미사용:  " + nonBufferTime + "ns");

			long BufferTime = copy(bis, bos);
			System.out.println("버퍼 사용:   " + BufferTime + "ns");
			
			fis1.close();
			fos1.close();
			bis.close();
			bos.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}

	
	
	//copy method (카피(복사)를 하는데 걸리는 시간 리턴)
	public static long copy(InputStream is, OutputStream os) throws Exception {
		long start = System.nanoTime();
		
		//카피 작업
		while(true) {
			int data = is.read();
			if(data==-1) break;
			os.write(data);
		}
		
		os.flush();
		
		
		long end = System.nanoTime();
		return (end-start);
	}
}
