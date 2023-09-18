package operator;

public class OperEx1 {

	public static void main(String[] args) {
		// 산술연산자 + - / %(나머지)
		//계산의 결과는 기본적으로 정수형으로 표현됨
	    //자바의 기본형 int, double
		System.out.println(4+8); 
		System.out.println(4-8);
		System.out.println(4*8);
		System.out.println((double)4/8); //형변환(type conversion)
		
		//나머지 연산자% 정수단위 까지 만 나누고 뺀 나머지 값
		System.out.println(4%8);//4
		System.out.println(5%2);//1
		//홀수 짝수 판별시 좋음
		System.out.println(4%2);//0
		System.out.println(7%2);//1
		
		
		
		System.out.println("=======================================================");
		
		//연산자(변수사용)
		
		int a = 4;
		int b = 8;
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/(double)b);
		
		//점수의 합계,평균
		int KorScore = 95;
		int MathScore = 80;
		int sumScore;
		double avgScore;
		sumScore = KorScore+MathScore; 
		avgScore = (double)sumScore/2;
		System.out.println("점수합계"+sumScore);
		System.out.println("평균점수"+avgScore);
		
		
		
		
		
	}

}
