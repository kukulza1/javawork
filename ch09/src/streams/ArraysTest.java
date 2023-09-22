package streams;

import java.util.Arrays;
import java.util.Collections;

public class ArraysTest {
	
	public static void main(String[] args) {
		Integer[] num1 = {3, 1, 2, 4, 5};
		//오름차순 정렬-Arrays.sort()
		Arrays.sort(num1);
		System.out.println(Arrays.toString(num1));
				
		//오름차순 정렬된 배열을 뒤집기
		Collections.reverse(Arrays.asList(num1));
		
		//Arrays.String()-객체 그대로(리스트형)출력
		System.out.println(Arrays.toString(num1));
		
		//num1의 요소 중 3개 복사
		Integer[] num2 = Arrays.copyOf(num1, 3);//num1을 3개복사
		System.out.println(Arrays.toString(num2));
		
		
		
	}

}
