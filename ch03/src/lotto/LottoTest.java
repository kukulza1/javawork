package lotto;

public class LottoTest {

	public static void main(String[] args) {
		//로또 번호생성기
		//1~45>한번에 6개 생성
		//배열의 크기가 6개인 lotto선언
		int[] lotto =new int[6];
		//lotto[0]=(int)(Math.random()*45+1);
		//System.out.println(lotto[0]);
		
		for(int i=0; i<lotto.length;i++) {
			lotto[i]= (int)(Math.random()*45+1);
			
			//중복문제해결 -중첩for
			for(int j=0;j<i;j++) {
				if(lotto[i]==lotto[j])
					i--;//이전인덱스로이동	
			}
		}
		/*
		 * 10 5 8 5 30 35
		 * i=0일때 결과10
		 * i=1   j=0 result:5
		 * i=2   j=1 result8
		 * i=3   j=2 result5-중복(재추정)
		 * i=4   j=3 result30
		 * i=5   j=4 result35
 		 */
		//6개동시 생성
		for(int i=0; i<lotto.length;i++) {
			System.out.print(lotto[i]+" ");
		}
		System.out.println();
		//파일 이름 출력
		LottoTest lottoTest = new LottoTest();
		System.out.println(lottoTest);
		
		
	}

}
