package continueEx;

public class ContinueTest {

	public static void main(String[] args) {
		// break문 -1부터 10까지 자연수중 6보다 작은수 출력
		for(int i=1; i<11;i++) {
			if(i>5) 
				  break;
				 System.out.println(i);
			
		}
		//continue문 1~10까지 자연수중 5제외한수 출력
		//반복하다가 continue를 만나면 이후의 코드를 수행하지않고 조건삭아너 중검삭울 슈향
		for(int i=1;i<11;i++) {
			if(i==5||i==8)
				continue;
			System.out.println(i);
		}

	}

}
