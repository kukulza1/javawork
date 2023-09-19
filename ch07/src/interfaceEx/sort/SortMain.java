package interfaceEx.sort;

import java.io.IOException;

public class SortMain {

	public static void main(String[] args) throws IOException {
		
		System.out.println("정렬방식 선택");
		System.out.println("B:BubbleSort");
		System.out.println("H:HeadSort");
		System.out.println("Q:QuickSort");
		
      int ch = System.in.read();
		
		Sort sort = null;
		if(ch=='B'||ch=='b') {
			sort = new Bubblesort();
		}else if(ch=='H'||ch=='h'){
			sort = new HeadSort();
		}else if(ch=='Q'||ch=='q') {
			sort = new QuickSort();
		}else {
			System.out.println("미지원 기능입니다.");
			//return;
			System.exit(0);

	}
		int[] arr = new int[10];
		
		sort.ascending(arr);
		sort.descending(arr);
		sort.description();

}
}
