package exceptions;

public class ExceptionHandling3 {

	public static void main(String[] args) {
         //컴파일 오류-일반예외 (컴파일러가 체크)
		//try~catch()
		//try~catch()~finally
		try {
			
			Class.forName("java.lang.Strings");
			System.out.println("찾는 클래스가 있습니다.");
		} catch (Exception e) {
			System.out.println("클래스를 찾을수 없습니다.");
			e.printStackTrace();
		}finally {//프로그램상 항상 실행해야 할 경우에사용함
			System.out.println("항상 수행됨");
		}
	}

}
