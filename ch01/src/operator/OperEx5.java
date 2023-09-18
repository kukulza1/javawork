package operator;

public class OperEx5 {

	public static void main(String[] args) {
		// 1증가,1감소 연산자(++, --)
		int num = 10;
		//num=num+1;
		//num +=1; //복합대입 연산자
		//num++;//1증가
		System.out.println(num);
		
		int num2 =20;
		num2--;//1감소
		System.out.println(num2);
		
		//복합 대입 연산자 연습
		int val =100;
		System.out.println(val +=1);//val= val+1
		System.out.println(val -=1);//val =val-1
		System.out.println(val *=10);//val=val*10
		System.out.println(val /=10);
		

	}

}
