package interfaceEx.calculator;

//인터페이스는모든 메서드가 추상메서드이다
//필드나 생성자가없음
//구성요소-상수,메서드

public interface Calculator {
	//인터페이스상수(final생략가능)
	//변수선언시 오류가 나지않는이유는 상수로 변환됨
	/*final*/ int ERROR = -999; 
	
	//추상 메서드
	int add(int n1, int n2);
	int sub(int n1, int n2);	
	int mul(int n1, int n2);	
	int div(int n1, int n2);	
	


}
