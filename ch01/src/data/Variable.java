package data;

public class Variable {

	public static void main(String[] args) {
		// 변수
		// 변수 선언방법 -자료형 변수이름(변수이름은 의미를 알수있게 만들것)
		int year;
	    year = 2023;
	//정수 자료형변수 year를 선언함, 2023을 year에 대입함
		System.out.println(year+"년");//숫자와 문자 혼용 +
		
		int month = 9;//변수의초기화(선언과동시에 값을 대입)
		System.out.println(month+"월");
		
		int day = 5;
		System.out.println(day+"일");
		
		
		//문자열 자료형 string 한문자 자료형-char
		//ex)int class<-이미 정해진 명령어(예약어)는 사용할수없음
		//변수이름에 띄어쓰기(공백)은 사용할수 없음, 변수이름은 숫자로 시작할수 없음
		
		String name = "손흥민" ;
		int grade = 3;
		int ban = 2;
		System.out.println(name+"은"+ grade +"학년" + ban +"반입니다");
		
		

	}

}
