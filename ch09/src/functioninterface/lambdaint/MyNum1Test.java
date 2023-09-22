package functioninterface.lambdaint;

public class MyNum1Test {

	public static void main(String[] args) {
		//인터페이스형 변수 선언
		Mynumber1 num;
		
		//변수에 람다식을 저장
		//람다식으로 calculator를 구현한것
		//매개변수가 1개인 경우 소괄호 생략가능
		/*num = (x)->{x=x+10;
		System.out.println(x);};*/
		
		num=x->System.out.println(x+10);
		
		num.calculate(1);
		
		//어떤수를 제곱하는 함수구현
		num = n ->System.out.println(n*n);
		num.calculate(7);
	}
   
}
