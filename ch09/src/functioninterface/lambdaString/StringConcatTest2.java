package functioninterface.lambdaString;

public class StringConcatTest2 {

	public static void main(String[] args) {
		StringConcat c1;
		
		String st1 = "컵";
		String st2 = "라면";
		
		c1=(x,y)-> System.out.println(x+y);
		
		c1.makeString(st1, st2);

	}

}
