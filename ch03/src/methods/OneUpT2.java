package methods;

public class OneUpT2 {
	//정적변수- static을 붙인 변수
	//정적변수는 생성된 후 프로그램이 종료될 때 소멸됨
	//정적변수특징: 값을 공유,누적함
	static int x =1; //전역공간(위쪽)
	
	public static int oneup() {
		x +=1;
		return x;
	}
	

	public static void main(String[] args) {
	
    System.out.println(oneup());
	System.out.println(oneup());
	System.out.println(oneup());
	System.out.println(oneup());
	
	//변수 x값 출력
	System.out.println("x="+x);

	}

}
