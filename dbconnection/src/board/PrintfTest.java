package board;

public class PrintfTest {

	public static void main(String[] args) {
		System.out.printf("%d\n",80);
		System.out.printf("%7d\n",80); //7자리,빈자리는 공백처리
		System.out.printf("%-7d\n",80); //7자리,빈자리는 공백처리,왼쪽정렬시 -n
		
		//문자열
		System.out.printf("%s\n","hello");
		System.out.printf("%7s\n","hello");
		System.out.printf("%-7s\n","hello");

	}

}
