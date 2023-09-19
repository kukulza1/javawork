package interfaceEx.calculator;

public class CalcT {

	public static void main(String[] args) {
		//Calculator c1 = new Calculator();
		//인터페이스는 객체생성불가
		MyCalculator c1 = new MyCalculator();
		
		int n1=10, n2=0;
		int sub =c1.sub(n1, n2);
		int add =c1.add(n1, n2);
		int mul =c1.mul(n1, n2);
		int div =c1.div(n1, n2);
		System.out.println(add);
		System.out.println(sub);
		System.out.println(mul);
		System.out.println(div);
	    

	}

}
