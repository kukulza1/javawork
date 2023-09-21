package basicclass;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassT2 {

	public static void main(String[] args) {
		Person p1 = new Person();
		
		System.out.println("=====클래스의 이름 가져오기======");
		Class<?> c1 = p1.getClass();
		//Class<?> c1 = Class.forName("basicclass.Person");
		System.out.println(c1.getName());
		
		System.out.println("=========클래스의 필드(맴버변수)출력하기==============");
		Field[] fields = c1.getDeclaredFields();
		for(Field field : fields)
			System.out.println(field);
		
		System.out.println("=====생성자 정보 출력하기======");
		Constructor<?>[] cons =c1.getConstructors();
		for(Constructor<?> con:cons){
			System.out.println(con);
		}
		//메서드 정보 출력
		Method[] methods = c1.getMethods();
		for(Method method : methods)
			System.out.println(method);

	}

}
