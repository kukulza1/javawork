package basicclass;

public class EqualsTest {

	public static void main(String[] args) {
		//String name = "우영우" //stack 영역
		String name1 = new String("우영우"); //힙메모리 영역
		String name2 = new String("우영우");
		
		//인스턴스의 메모리 주소 비교
		//해시 코드 물리적메모리주소(십진수)
		System.out.println(name1==name2);//주소비교false
		System.out.println(System.identityHashCode(name1));//메모리주소
		System.out.println(System.identityHashCode(name2));//메모리주소
		
		System.out.println(name1.equals(name2)); //equals(문자열비교)
		
		System.out.println("==============================");
		Book book1 = new Book(100,"개미");
		Book book2 = new Book(100,"개미");
		
		System.out.println(book1==book2); //주소비교 -false
		System.out.println(book1.equals(book2));//문자열비교-false
		
		//book 인스턴스의 물리적주소
		System.out.println(System.identityHashCode(book1));
		System.out.println(System.identityHashCode(book2));
		
		//논리적주소 일치시키는 작업필요 -hashcode()-object클래스가 저장
	}

}
