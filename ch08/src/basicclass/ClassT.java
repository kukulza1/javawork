package basicclass;


import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class ClassT {

	public static void main(String[] args) throws ClassNotFoundException {
		// String 클래스의 정보출력
		System.out.println("=====클래스의 이름 가져오기======");
		
		Class<?> c1 = Class.forName("java.lang.String");
		System.out.println(c1.getName());
		
		System.out.println("=========클래스의 필드(맴버변수)출력하기==============");
		Field[] fields =c1.getDeclaredFields();
		for(Field field : fields)
			System.out.println(field);
		
		System.out.println("=====생성자 정보 출력하기======");
		Constructor<?>[] cons =c1.getConstructors();
		for(Constructor<?> con:cons){
			System.out.println(con);
		}

	}

}
