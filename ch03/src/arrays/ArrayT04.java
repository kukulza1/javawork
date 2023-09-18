package arrays;

public class ArrayT04 {

	public static void main(String[] args) {
		// 실수형 배열의 연산
		//크기가 5인 실수형 배열 data선언
		double[] data=new double[5];
		double total=0;
		double average;
		//저장
		data[0]=10.1;
		data[1]=20.3;
		data[2]=30.5;
		
		//전체 조회
		for(int i=0; i<data.length; i++) {
			System.out.println(data[i]);
			total +=data[i];
			average=total/data.length;
			
		}
		average=total/data.length;
		System.out.println("평균"+average);
		System.out.println("총합"+total);	
      
	}
}
