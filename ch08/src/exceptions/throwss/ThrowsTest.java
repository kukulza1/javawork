package exceptions.throwss;

public class ThrowsTest {

	public static void main(String[] args) {
		//함수를 호출한 곳에서 예외처리
		try {
			findClass();
		} catch (ClassNotFoundException e) {
			//e.printStackTrace();
			System.out.println(e.toString());
		}

	}
	public static void findClass() throws ClassNotFoundException {
		//컴파일러가 체크해줌 -일반예외
		//throws는 예외미룸
		Class.forName("java.lang.System2");
	}


}
