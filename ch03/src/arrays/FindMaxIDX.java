package arrays;

public class FindMaxIDX {

	public static void main(String[] args) {
		// 최대값의 위치 찾기
		//최대값의 위치를 0으로 설정
        int[] arr=new int[] {1,5,8,3,200};
        int maxIdx=0;
        
        for(int i=0; i<arr.length;i++) {
        	if(arr[i]>arr[maxIdx]) 
        	maxIdx=i;
   
           

	}
    	System.out.println("최대값의 위치:"+maxIdx);
}
}
