package collection.list.stack;

public class StackarrLTest {

	public static void main(String[] args) {
		StackarrL arr = new StackarrL();
		
		arr.push("a");
		arr.push("b");
		arr.push("c");
		
		//객체빼기
		System.out.println(arr.pop());
		System.out.println(arr.pop());
		System.out.println(arr.pop());
		System.out.println(arr.pop());

	}

}
