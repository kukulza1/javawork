package functioninterface.lambdaString;

public class StringConcatTest1 {

	public static void main(String[] args) {
		StringConcatImpl ss = new StringConcatImpl();
		
		String st1 = "오리";
		String st2 = "너구리";
		ss.makeString(st1, st2);

	}

}
