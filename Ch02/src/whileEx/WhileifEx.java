package whileEx;

public class WhileifEx {

	public static void main(String[] args) {
		// 반복조건문
        //1부터 10까지 출력
		
		int i =0;
		while(true) {//무한반복
			i++;
			System.out.print(i+" ");
			if(i==10) 
				break; //탈출//실행문이 한줄일경우 중괄호부호 생략가능
			
		}
	}

}
