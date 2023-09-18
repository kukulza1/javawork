package methods;

public class MathTest02 {

	public static void main(String[] args) {
		// 주사위 10번던지기
        
		/*for(int i=1;i<=10;i++) {
			int n1=(int)(Math.random()*6+1);
			System.out.println(n1);
		}*/
		//배열에서 문자열 랜덤 추출
		String[] word = {"나","너","우리","나라"};
		System.out.println(word[0]);
		//전체출력
		for(int i=0;i<word.length;i++) {
			System.out.println("for"+word[i]);
		}
		
		
		int index =(int)(Math.random()*word.length);
		
		
		System.out.println(index);
		System.out.println(word[index]);
	}

}
