package interfaceEx.calculator;

public class MyCalculator implements Calculator {

	@Override
	public int add(int n1, int n2) {
		return n1 + n2;
	}

	@Override
	public int sub(int n1, int n2) {
		return n1-n2;
	}

	@Override
	public int mul(int n1, int n2) {
		return n1*n2;
	}

	@Override
	public int div(int n1, int n2) {
		//상수는 인터페이스나 클래스 이름으로 직접접근
		if(n2 != 0) {
		return n1/n2;
	}else {
		return Calculator.ERROR;//상수로 에러처리함
	}
	

}
}