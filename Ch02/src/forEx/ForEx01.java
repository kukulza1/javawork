package forEx;

public class ForEx01 {

	public static void main(String[] args) {
		/*for(초기값;종료값;증감값){
                     실행문
           }*/
            //1~10출력
		for(int i=1; i<=10; i++){
		System.out.println(i+" ");
		}
		
		//아스키 코드값 알파벳 출력
		//'A' -65, 'a'-97, 0-48
		char alpha ='A';
		System.out.println(alpha);
		
		int val=66;
		System.out.println((char)val);
		
		
		
		for(int nu=65; nu<=90; nu++) {
			System.out.print((char)nu+" ");
			
		}
		for(char ch=65; ch<122; ch++) {
			System.out.println(ch+" ");
		}
		//한글 유니코드 값(12593~12685)
			for(char ch=12593; ch<12685; ch++ ) {
				System.out.println(ch+" ");
		}
	}

}
