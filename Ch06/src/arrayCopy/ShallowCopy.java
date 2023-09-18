package arrayCopy;

public class ShallowCopy {

	public static void main(String[] args) {
		Book[] arr1 = new Book[3];
		Book[] arr2 = new Book[3];
		
		arr1[0] = new Book("개미1","베르나르");
		arr1[1] = new Book("개미2","베르나르");
		arr1[2] = new Book("개미3","베르나르");
		
		//arr1의 첫번째 요소 수정
		arr1[0].setBookname("아리랑1");
		arr1[0].setAuthor("조정태");
		
		
		System.out.println("************arr1출력");
		for(int i=0; i<arr1.length; i++) {
			System.out.println(arr1[i].toString());
		}
		//배열복사
		for(int i=0; i<arr1.length; i++) {
			arr2[i]=arr1[i];
		
		}
		System.out.println("****arr2출력");
		//복사한 arr2출력
		for(int i=0; i<arr2.length; i++) {
			System.out.println(arr2[i].toString());
		}
		//clone()배열 복사
		System.out.println("333==================");
		Book[] arr3 = arr2.clone();
		for(int i=0; i<arr3.length; i++) {
			System.out.println(arr3[i].toString());
			}
		System.out.println("향상포문=============");
		//향상for문 for(자료형 변수: 배열이름){변수 출력}
		for(Book array3: arr3) {
			System.out.println(array3.toString());
		}
	}

}
