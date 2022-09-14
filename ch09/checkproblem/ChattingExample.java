package ch09.checkproblem;

public class ChattingExample {

	public static void main(String[] args) {
		
		//객체 생성
		Chatting chat1 = new Chatting();
		
//		Chatting.Chat chat2 = chat1.new Chat();
//		chat2.sendMessage("홍길동");
		
		chat1.startChat("홍길동");
		
	}

}
