package operator;

public class OperEx3 {

	public static void main(String[] args) {
		// 조건연산자 -조건문(if문)
		//결과값 = (조건비교) ? 참값 : 거짓값
		
		//ex).1 결과값이 정수면 정수변수 선언
		int num = (4>5) ? 10 : 20; //4>5가 false 이므로 20을 반환
		System.out.println("결과값"+num);
        
		//ex).2 결과값이 한 문자로 출력 : 'T' / 'F'
		int fatherAge = 45;
		int motherAge = 48;
		
		char result = (fatherAge > motherAge) ? 'T':'F';
		System.out.println(result);
		
		//ex.3 홀/짝 판정하는 프로그램
		//어떤수를 2로 나눠서 나머지가0이면 짝, 1이면홀수
		//결과값이 "짝수입니다" or "홀수입니다"
		int numB = 11;
		
		String msg = (numB % 2 == 0) ? "짝수입니다." : "홀수입니다.";
		System.out.println("판정:" + msg);
		
	}

}
