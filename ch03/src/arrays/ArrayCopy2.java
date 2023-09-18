package arrays;

public class ArrayCopy2 {

	public static void main(String[] args) {
		// 배열 복사하기 -문자형복사
		char[] arr1 = {'n','f','e'};
		char[] arr2 = new char[3];
		
		for(int i=0;i<arr1.length;i++) {
			arr2[i]=arr1[i];
			
		}
		for(int i=0;i<arr2.length;i++) {
			//arr3[2-i]=arr2[i]
			//System.out.print(arr2[i]+" ");
		}
		System.out.println();
		//역순 복사
		char[] arr3=new char[3];
		
		for(int i=2;i<arr3.length ; i--) {
			arr3[i]=arr2[i];
			System.out.print(arr3[i]+" ");
			
		}
		/*char[] arr3=new char[3];
		
		for(int i=2;i<arr3.length ; i--) {
			arr3[2-i]=arr2[i];
			System.out.print(arr3[i]+" ");*/
		
		
	}

}
