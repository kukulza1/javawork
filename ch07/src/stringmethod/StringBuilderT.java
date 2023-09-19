package stringmethod;

public class StringBuilderT {

	public static void main(String[] args) {
		//StringBuilder,String buffer문자열 변경이 가능한 클래스(메모리 주소변경되지 않고 유지)
		String javaStr = new String("java");
		
		
		StringBuilder buffer =new StringBuilder(javaStr);
		System.out.println("연산전 buffer메모리주소"+System.identityHashCode(buffer));
		
		//문자열 연결 -append()사용
		buffer.append("and");
		buffer.append("android");
		buffer.append("programming is fun!!");
		
		System.out.println("연결후 buffer메모리주소"+System.identityHashCode(buffer));
		System.out.println(buffer);
		
		
	}   
	   

}
