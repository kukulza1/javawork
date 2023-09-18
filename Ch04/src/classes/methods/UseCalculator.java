package classes.methods;

import classes.Calculator;// 다른 패키지에 있으면 import필요
public class UseCalculator {

	public static void main(String[] args) {
		// Calculator 객체 생성
		Calculator calc =new Calculator();
		int num1 =10,num2=2;
		
		int addV=calc.add(10,11);
		int subV=calc.sub(14, 11);
		int mulV=calc.mul(10,11);
		int divV=calc.div(num1,num2);
		
		System.out.println(calc);//객체의 메모리 주소
		
		System.out.println("두 수의 합:"+addV);
		System.out.println("두수의 차" + subV);
		System.out.println("두수의 곱:"+mulV);
		System.out.println("두수의 나누기:"+divV);

	}

}
