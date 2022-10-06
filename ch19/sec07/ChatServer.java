package ch19.sec07;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.json.JSONObject;

public class ChatServer {
	
	//field
	ServerSocket serverSocket;
	ExecutorService threadPool = Executors.newFixedThreadPool(100); //스레드풀 생성
	Map<String, SocketClient> chatRoom = Collections.synchronizedMap(new HashMap<>()); //Hashtable 해도 됨!

	
	//method - start (서버 시작)
	public void start() throws IOException {
		serverSocket = new ServerSocket(50001);
		System.out.println("[서버] 시작됨");
		
		//Thread 생성 - Runable 익명객체 생성(람다식)
		Thread thread = new Thread(() -> {
			try {
				while(true) {
					Socket socket = serverSocket.accept(); //클라이언트 연결 요청 -> 수락 (블로킹 해제)
					SocketClient sc = new SocketClient(this, socket); //람다식 밖에서 실행하는 객체의 this(=ChatServer)
				}
			} catch(Exception e) {
				
			}
		});
		thread.start();
		
	}
	
	//method - addSocketClient (채팅방에 들어온 채팅자 정보)
	public void addSocketClient(SocketClient socketClient) {
		String key = socketClient.chatName + "@" + socketClient.clientIp;
		chatRoom.put(key, socketClient);
		System.out.println("입장: " + key);
		System.out.println("현재 채팅자 수: " + chatRoom.size() + "\n");
	}

	//method - addSocketClient (채팅방에 나간 채팅자 정보 삭제)
	public void removeSocketClient(SocketClient socketClient) {
		String key = socketClient.chatName + "@" + socketClient.clientIp;
		chatRoom.remove(key); //키만 주면 엔트리 삭제!
		System.out.println("나감: " + key);
		System.out.println("현재 채팅자 수: " + chatRoom.size() + "\n");
	}
	
	//method - sendToAll
	public void sendToAll(SocketClient sender, String message) {
		JSONObject root = new JSONObject();
		root.put("clientIp", sender.clientIp);
		root.put("chatName", sender.chatName);
		root.put("message", message);
		String json = root.toString();
		
		//모든 클라이언트에게 보내는 코드
		Collection<SocketClient> socketClients = chatRoom.values();
		for(SocketClient sc : socketClients) {
			if(sc == sender) continue; //동일한 객체여부 확인! (동등비교x)
			sc.send(json);
		}
	}
	
	//method - stop
	public void stop() {
		try {
			serverSocket.close(); //서버 소켓 종료
			threadPool.shutdownNow(); //스레드풀 종료
			chatRoom.values().stream().forEach(sc -> sc.close());
		} catch (Exception e) {
		} 
		System.out.println("[서버] 종료됨");
	}
	
	
	//main method 
	public static void main(String[] args) {
		try {
			ChatServer chatServer = new ChatServer();
			
			//TCP 채팅 서버 시작
			chatServer.start();
			
			System.out.println("----------------------------------------------");
			System.out.println("서버를 종료하려면 q 또는 Q를 입력하고, Enter키를 입력하세요.");
			System.out.println("----------------------------------------------");
			
			//키보드 입력 (스캐너 이용)
			Scanner sc = new Scanner(System.in);
			while(true) {
				String key = sc.nextLine();
				if(key.toLowerCase().equals("q")) {
					break;
				}
			}
			sc.close();
			
			//TCP 채팅 서버 종료
			chatServer.stop();
			
		} catch (IOException e) {
			System.out.println("[서버] " + e.getMessage());
		}

	}

}
