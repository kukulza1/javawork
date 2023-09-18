package methods;

public class MathTest {

	public static void main(String[] args) {
		// 내장함수-수학(math)
		int v1=Math.abs(10);//절대값 (거리):양수->음수, 음수->양수
		System.out.println("v1="+v1);
      
		long v2=Math.round(5.67);//반올림후 정수로 반환>6
		System.out.println(v2);
		
		double v3=Math.floor(3.6);//fㅣoor 버림
		System.out.println(v3);
		
		//random() - 0.0<=범위<1.0
		double rand=Math.random();
		System.out.println(rand);
		
		//dice- 주사위(1~6)
		int dice=(int)(Math.random()*6+1);//0~5총 6개숫자가 나옴
		System.out.println("dice ="+dice);
		
		//1~10 자연수 무작위출력
		int number=(int)(Math.random()*10+1);
		System.out.println(number);
		
	}

}
