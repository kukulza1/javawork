package operator;

public class BitOperTest {

	public static void main(String[] args) {
		//비트 논리연산자
		int n1 =5;   //00000101
		int n2 = 10; //00001010
		             //00000000-&
		             //00001111
		
		int result;
		
		result = n1&n2; //and연산자는 모두 1일때 1이고,나머지는 0
		System.out.println(result);
		
		result = n1|n2;//둘중하나만 1이여도 1임
		System.out.println(result);//00001111->15
		
		int a = 10;
		
		System.out.println(a<<2);//1010(10) ->101000 (40)
		System.out.println(a>>3);
		

	}

}
