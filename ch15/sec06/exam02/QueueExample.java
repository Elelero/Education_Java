package ch15.sec06.exam02;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
		
		//Queue 컬렉션 생성
		Queue<Message> messageQueue = new LinkedList<>();
		
		//메세지 넣기
		messageQueue.offer(new Message("sendMail", "홍길동"));
		messageQueue.offer(new Message("sendSNS", "신용권"));
		messageQueue.offer(new Message("sendKaKaoTalk", "김자바"));
	
		//메세지를 하나씨 꺼내어 처리
		while(!messageQueue.isEmpty()) {
			Message message = messageQueue.poll();
			switch(message.command) {
				case "sendMail":
				System.out.println(message.to + "님에게 메일을 보냈습니다");
				break;
				case "sendSNS":
					System.out.println(message.to + "님에게 SNS을 보냈습니다");
					break;
				case "sendKaKaoTalk":
					System.out.println(message.to + "님에게 카카오톡을 보냈습니다");
					break;
			}
			
			
			
		}
	
	}

}
