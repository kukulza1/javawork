package constant;

public class ConstantT {

	public static void main(String[] args) {
		// 상수 선언및 사용
		final int MAX_Num = 100;//상수
			//MAX_Num =10; 상수는 변경불가
	     
		//System.out.println(MAX_Num);
		
		//원의 넓이 =반지름*반지름*원주율
		//변수- radius, circleArea
		//상수 PI
		
		int radius= 5;
		final double PI =3.14;
		double circleArea;
		
		circleArea=radius*radius*PI;
		System.out.println("원의 넓이는"+circleArea+"입니다.");
		

	}

}
