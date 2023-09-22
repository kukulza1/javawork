package functioninterface;

public class MyinterMain {

	public static void main(String[] args) {
		Myfunction1 func;
		
		//람다식 표현으로 추상메서드를 구현
		//매개변수가 없음 - 빈소괄호 사용
		//코드가 한줄일경우 중괄호 생략가능
	//func=()->{System.out.println("hello");};
		//실행함수호출
		
		func=()->System.out.println("안녕");
		func.method();
	}

}
