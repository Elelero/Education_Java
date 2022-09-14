package ch09.checkproblem;

public class Chatting {
	
	//인스턴스 멤버 클래스
	class Chat {
		void start() {}
		void sendMessage(String message) {
		}
	}
	
	//메소드
	void startChat(String chatId) {
		//틀린 코드
		/*String nickName = null;
		nickName = chatId;*/
		
		//올바른 코드
		String nickName = chatId;
		
		Chat chat = new Chat() {
			public void start() {
				while(true) {
					String inputData = "안녕하세요";
					String message = "[" + nickName + "]" + inputData;
					sendMessage(message);
				}
			}
		};
		chat.start();
	}
}
