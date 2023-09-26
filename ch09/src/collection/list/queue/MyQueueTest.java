package collection.list.queue;

public class MyQueueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyQueue que = new MyQueue();
		
		que.enQueue("수박");
		que.enQueue("ㅇㄹㄹ");
		que.enQueue("사과");
		
		
		//자료 삭제및출력
		
		System.out.println(que.deQueue());
		System.out.println(que.deQueue());
		System.out.println(que.deQueue());
		System.out.println(que.deQueue());

	}

}
