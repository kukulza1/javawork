package costant;

public class UsingDefine {

	public static void main(String[] args) {
         //static이 있는 상수는 클래스 이름으로 직접접근
		System.out.println("최대값은"+Define.MAX);
		System.out.println("최대값은"+Define.MIN);
		
		System.out.println("수학과목코드값은"+Define.MATH);
		System.out.println("영어과목코드값은"+Define.ENG);
		
		System.out.println("원주율은="+Define.PI);
		System.out.println("원주율은="+Math.PI);
		
		System.out.println(Define.GM);
	}

}
