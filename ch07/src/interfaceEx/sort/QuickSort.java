package interfaceEx.sort;

public class QuickSort implements Sort {

	@Override
	public void ascending(int[] number) {
		System.out.println("QuickSort ascending");
	
		
	}

	@Override
	public void descending(int[] number) {
		System.out.println("QuickSort descending");
		
	}

	@Override
	public void description() {
		// TODO Auto-generated method stub
		Sort.super.description();
		System.out.println("QuickSort입니다.");
	}

	

	
}
