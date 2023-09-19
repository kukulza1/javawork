package stringmethod;

public class StringTest {

	public static void main(String[] args) {
		//String 클래스로 문자를 연결하면 내부의 문자열이 변경되지 않아서 메모리가 많이 낭비된다
		String javaStr = new String("java");
         String andStr = new String("android");
         
         System.out.println(javaStr);
         System.out.println("처음 문자열 주소값:"+System.identityHashCode(javaStr));
         
         //문자를 연결하는 메서드 -concat()
         javaStr = javaStr.concat(andStr);
         
         System.out.println(javaStr);
         System.out.println(" 문자열 연결후 주소값:"+System.identityHashCode(javaStr)); 
	}

}
