package collection.list.queue;

import java.util.LinkedList;
import java.util.Queue;

public class MessageQueue {

	public static void main(String[] args) {
		// Queue를 구현한 LinkedList자료구조로 사용
		
		Queue<Message> MQ = new LinkedList<>();
		
		//Message 객체 생성 
		Message email = new Message("email","SB");
		Message SMS = new Message("SMS","KSB");
		Message kakao = new Message("kakao","GSB");

		
		//객체저장-offer()
		MQ.offer(email);
		MQ.offer(SMS);
		MQ.offer(kakao);
		
		//객체꺼내기 - 삭제poll()
		//반복-확인(isEmpty())
		while(!MQ.isEmpty()) {
			Message message = MQ.poll();//1개꺼냄
			switch(message.command) {
			case "email":
				System.out.println(message.to+"님에게 메일을 보냅니다.");
			case "SMS":
				System.out.println(message.to+"님에게 SMS를 보냅니다.");
			case "kakao":	
				System.out.println(message.to+"님에게 kakao를 보냅니다.");
				break;
			}
		}
		
		
		
		
		
		
		

	}

}
