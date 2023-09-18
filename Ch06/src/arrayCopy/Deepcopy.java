package arrayCopy;

public class Deepcopy {

	public static void main(String[] args) {
		Book[] arr1 = new Book[3];
		Book[] arr2 = new Book[3];
		
		arr1[0] = new Book("개미1","베르나르");
		arr1[1] = new Book("개미2","베르나르");
		arr1[2] = new Book("개미3","베르나르");
		
		//기본 생성자로 arr2의 객체 생성
		arr2[0]= new Book();
		arr2[1]= new Book();
		arr2[2]= new Book();
		
		//arr1을 arr2에복사(set.get 활용)
		for(int i=0; i<arr1.length; i++) {
			arr2[i].setBookname(arr1[i].getBookName());
			arr2[i].setAuthor(arr1[i].getAuthor());
			
		}
        //arr1원본요소수정
		arr1[0].setBookname("아리랑1");
		arr1[0].setAuthor("조정태");
		System.out.println("************arr1출력");
		for(int i=0; i<arr1.length; i++) {
			System.out.println(arr1[i].toString());
		}
		System.out.println("****arr2출력");
		//복사한 arr2출력
		for(int i=0; i<arr2.length; i++) {
			System.out.println(arr2[i].toString());
		}
	}
	

}
