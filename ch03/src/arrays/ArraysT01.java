package arrays;

public class ArraysT01 {

	public static void main(String[] args) {
		// 변수
		String car ="sonata";
		
		System.out.println(car);
		
		//배열-순서가 있음,중복가능
		//직접 저장 -중괄호사용
		String[] cars = new String[]{"bf","ss","ew"};//new String[]<<생략가능
        System.out.println(cars[0]);
        System.out.println(cars[1]);
        System.out.println(cars[2]);
      
        
        //배열의 크기(개수) -배열이름.length
        System.out.println("배열의 크기:"+cars.length);
	//for문-전체조회
        for(int i = 0; i<3; i++) {
        	System.out.println(cars[i]);//0,1,2,3
        }
	}
}
