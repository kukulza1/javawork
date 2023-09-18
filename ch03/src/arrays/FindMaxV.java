package arrays;

public class FindMaxV {

	public static void main(String[] args) {
		// 배열에서 최대값 찾기
		//최대값 설정- 0번 인덱스
		//전체를 반복하면서 배열의값과 최대값을 비교해서
		//최대값보다 크면 그값을 최대값으로 변경한다
		int[] arr = new int[] {1,5,8,3,2};
		int maxVal=arr[0];
		
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>maxVal)
				maxVal =arr[i];
		}
             //최대값 출력
		System.out.println("최대값:"+maxVal);
	/* i=0     maxval=1
	 * i=1 5>1 maxval=5
	 * i=2 8>5 maxval=8
	 * i=3 3>8 (false)maxval=8
	 * i=4 2>8 maxVal=8
	 */
	}

}
