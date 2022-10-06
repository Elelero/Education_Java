package ch19.sec07;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;

import org.json.JSONObject;

public class SocketClient {
	//field
	ChatServer chatServer;
	Socket socket;
	String clientIp;
	String chatName;
	DataInputStream dis;
	DataOutputStream dos;
	
	//constructor
	public SocketClient(ChatServer chatServer, Socket socket) {
		try {
			this.chatServer = chatServer;
			this.socket = socket;
			this.dis = new DataInputStream(socket.getInputStream());
			this.dos = new DataOutputStream(socket.getOutputStream());
			InetSocketAddress isa = (InetSocketAddress) socket.getRemoteSocketAddress();
			this.clientIp = isa.getHostName();
			receive();
		} catch (IOException e) {
		}
	}
	
	//method - receive()
	public void receive() {
		chatServer.threadPool.execute(()->{
			try {
				while(true) {
					//{"command": "incoming", "data": "chatName"}
					//{"command": "message", "data": "content"}
					String receiveJson = dis.readUTF(); //연결이 끊기면 예외 발생
					JSONObject jsonObject = new JSONObject(receiveJson);
					String command = jsonObject.getString("command");
					
					switch(command){
						case "incoming": 
							this.chatName = jsonObject.getString("data");
							chatServer.sendToAll(this, "들어오셨습니다"); //this = SocketClient
							chatServer.addSocketClient(this);
							break;
						case "message": 
							String message = jsonObject.getString("data");
							chatServer.sendToAll(this, message); //this = SocketClient
							break;
					}
				}
			} catch (IOException e) {
				chatServer.sendToAll(this, "나가셨습니다");
				chatServer.removeSocketClient(this);
			}
		});
	}
	
	//method - send()
	public void send(String json) {
		try {
			dos.writeUTF(json);
			dos.flush();
		} catch (IOException e) {
		}
	}
	
	//method - close()
	public void close() {
		try {
			socket.close();
		} catch (IOException e) {
		}
	}
}
