package generic;

public class BoxT {

	public static void main(String[] args) {
		Box<String> b1= new Box<>();
		
		b1.set("22");
		String msg = b1.get();
		
		System.out.println(msg);
		
		//숫자형 타입
		Box<Integer> b2 = new Box<>();
		
		b2.set(300);
		int ff = b2.get();
		System.out.println(ff);
		
		//만든자료형으로 객체생성
		Box<Fluit> b3 = new Box<>();
		//Fluit apple = new Fluit("사과");
		b3.set(new Fluit("사과"));
		Fluit apple = b3.get();
		
		System.out.println(apple);

	}

}
