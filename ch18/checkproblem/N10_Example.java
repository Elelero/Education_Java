package ch18.checkproblem;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;

public class N10_Example {

	public static void main(String[] args) {
		
		try {
			//스캐너 객체 생성
			Scanner sc = new Scanner(System.in);
			
			
			//경로 입력 받기
			System.out.print("원본 파일 경로: ");
			String originalFilePath = sc.nextLine();
			
			System.out.print("복사 파일 경로: ");
			String targetFilePath = sc.nextLine();
			
			
			//원본 파일 존재 여부 확인
			File originalFile = new File(originalFilePath);
			if(!originalFile.exists()) {
				System.out.println("원본 파일이 존재하지 않습니다.");
				System.exit(0);
			}
			
			//복사 파일 경로상에 없는 모든 디렉토리 생성
			File targetFile = new File(targetFilePath);
			File parentFile = targetFile.getParentFile();
			if(!parentFile.exists()) {
				parentFile.mkdirs();
			}
			
			
			//입출력 스트림 얻기
			BufferedInputStream bis = new BufferedInputStream(
					new FileInputStream(originalFilePath));
			BufferedOutputStream bos = new BufferedOutputStream(
					new FileOutputStream(targetFilePath));
			
			// 파일 데이터를 읽고 출력하기
			byte[] data = new byte[1024];
			while(true) {
				int num = bis.read(data); //최대 1024 바이트를 읽고 배열에 저장 (읽은 바이트는 리턴)
				if(num==-1) break; //파일을 다 읽으면 while문 종료
				bos.write(data, 0, num);
			}
			System.out.println("복사가 완료되었습니다.");

			//버퍼 실행 & 닫음
			bos.flush();
			bos.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
