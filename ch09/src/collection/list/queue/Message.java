package collection.list.queue;

public class Message {
	String command; //수행 이메일,SMS
	String to; //대상
	
	//생성자
	Message(String command, String to){
		this.command = command;
		this.to = to;
	}
	

}
