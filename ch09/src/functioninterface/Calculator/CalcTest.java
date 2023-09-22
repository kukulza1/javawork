package functioninterface.Calculator;

public class CalcTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator add, sub, mul, div;
		int num1 =10; 
	    int num2 =5;
		
		
		add=(n1, n2)->(n1+n2);
		int v1 =add.Calculate(num1, num2);
		System.out.println("add="+add.Calculate(num1, num2));
		
		sub=(n1,n2)->(n1-n2);
		int v2=sub.Calculate(num1, num2);
		System.out.println("sub="+sub.Calculate(num1, num2));
		mul=(n1,n2)->(n1*n2);
		int v3 = mul.Calculate(num1, num2);
		System.out.println("mul="+mul.Calculate(num1, num2));
          
		div=(n1,n2)->(n1/n2);
		double v4 = div.Calculate(num1, num2);
		System.out.println("div="+(double)div.Calculate(num1, num2));
	}

}
