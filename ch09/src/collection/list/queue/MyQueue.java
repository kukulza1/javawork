package collection.list.queue;

import java.util.ArrayList;
import java.util.List;

public class MyQueue {
	
	//필드
	private List<String> arrQueue;
	
	//생성자
	public MyQueue() {
		arrQueue = new ArrayList<>();
	}
	
	//자료추가:맨뒤에서추가
	public void enQueue(String data) {
		arrQueue.add(data);
		
	}
	//자료삭제 - remove():맨앞에서 꺼냄
	public String deQueue() {
		int size = arrQueue.size();
		if(size==0) {
			System.out.println("큐가 비었습니다.");
			return null;
		}
		return arrQueue.remove(0);
	}
	

}
