package arrays;

public class ArrayT02 {

	public static void main(String[] args) {
		// 배열의 선언및 사용
		
		//크기가 4인 cars배열 선언
		//값이 비어잇으면 null을 출력
		String[] cars =new String[4];

		//입력(저장)
		cars[0] = "ss";
		cars[1]="sw";
		cars[2]="sa";
		cars[3]="sd";
		
		//특정한위치(1번 인덱스)조회
		System.out.println(cars[1]);//mornig
		
		//전체출력
		System.out.println(cars.length);
		for(int i=0; i<cars.length; i++) {
			System.out.println(cars[i]);
		}
	}

}
