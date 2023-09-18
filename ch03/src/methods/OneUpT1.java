package methods;

public class OneUpT1 {
   
	     //1씩 증가하는 함수정의
	//  지역변수의 생명주기(scope)-함수나제어문의 블럭안에서 생성되고 호출된 후(블럭을 벗어나면) 소멸함
	public static int oneUp(){
		int x=1;  //지역변수
		x++;
		return x;
	}
	  
	public static void main(String[] args) {
		System.out.println(oneUp());
		
		//System.out.println(oneUp(x));
	}

}
