package ch19.sec03.exam01;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientExample {

	public static void main(String[] args) {
		
		try {
			//socket 객체 생성 및 연결 설정 (my ip = localhost)
			Socket socket = new Socket("localhost", 50001);
			System.out.println("[클라이언트] 연결 성공");
			
			socket.close();
			System.out.println("[클라이언트] 연결 해제");
		} catch (UnknownHostException e) {
			//IP 또는 도메인 표기 방법이 잘못되었을 경우
			System.out.println("UnknownHostException: " + e.toString());
		} catch (IOException e) {
			//IP 또는 Port 번호가 존재하지 않을 경우
			System.out.println("IOException: " + e.toString());
		}
	}

}
