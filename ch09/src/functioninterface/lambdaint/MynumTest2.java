package functioninterface.lambdaint;

public class MynumTest2 {

	public static void main(String[] args) {
		Mynumber2 num;
		
		/*num=(n1,n2)->{
			return (n1 >= n2) ? n1 : n2;
		};*/
		num=(n1,n2)->(n1 >= n2) ? n1 : n2;
		//getMax()호출
		System.out.println("더큰수는"+num.getMax(13, 3));

	}

}
