package streams;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamTest2 {

	public static void main(String[] args) {
		// 문자형 배열
		String[] 과일 = {"사과","배","수박","참외"};
		
		//for문 안쓰고 forEach()사용->Stream 객체를 얻어야함
		//Stream<String> strS = Arrays.stream(과일);
		//strS.forEach(str->System.out.println(str));
		Arrays.stream(과일).forEach(str->System.out.println(str));
		
		//정수형 배열
		int[] num = {1,2,3,4};
		//Stream<Integer> numS = Arrays.stream(num);
		//numS.forEach(n->System.out.println(n));
        Arrays.stream(num).forEach(n->System.out.println(n));
   
        //합계,갯수,평균
        int sumV = Arrays.stream(num).sum();
        //count의 반환형이 long이르모 int다운캐스팅
        int count= (int)Arrays.stream(num).count();
        double avg = (double)sumV/count;
        System.out.println("총합="+sumV);
        System.out.println("개수="+count);
        System.out.println("평균="+avg);

	}

}
