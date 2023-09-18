package arrayList;

import java.util.ArrayList;

public class ArrayListT1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       // String[] carts = new String[]{"사과","콩나물","커피","우유"};
		//String[] carts = new String[4]
				//carts[0]="사과"
		
		//리스트공간이 기본10개 생성됨
		//리스트는 순서가있음 (인덱싱)
		//중복가능
	    ArrayList<String> carts = new ArrayList<>();
	    
	    //자료 추가- add()
	    carts.add("사과");
	    carts.add("사과2");
	    carts.add("사과");
	    carts.add("ㄱㄱ");
	    
	    //출력
	    System.out.println(carts.get(0));
	    System.out.println(carts.get(1));
	    System.out.println(carts.get(2));
	    
	    //리스트의 크기
	    System.out.println(carts.size());
	    
	    //자료수정-set()
	    carts.set(1, "바나나");
	    
	    //자료삭제- remove()
	   // carts.remove(1);
	    //carts.remove("바나나");
	    
	    //전체 출력
	    for(int i=0; i<carts.size();i++) {
	    	String c1 =carts.get(i);
	    	System.out.print(c1);
	    }
	    System.out.println();
	   
	    //향상된 for문 - for(자료형 변수 : 리스트이름){}
	    for(String c1:carts)
	            System.out.println(c1+" ");
	}
       
}
