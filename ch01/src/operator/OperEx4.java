package operator;

public class OperEx4 {

	public static void main(String[] args) {
		// 논리연산자
		//&&-엠퍼샌드: 두항이 모두 참인경우에만 결과값이 참 -논리곱
		//||-bar 2개: 두항 중 하나만 참이여도 참 -논리합
		// !- 항이 참이면 거짓이고, 거짓이면 참 -논리부정
		System.out.println((4<5) && (10 ==11));//false
		System.out.println((4<5)||(10==11));//true 단락회로
		System.out.println(!(10==11));//true 논리부정

	}

}
