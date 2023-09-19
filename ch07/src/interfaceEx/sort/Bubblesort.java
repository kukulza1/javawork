package interfaceEx.sort;

public class Bubblesort implements Sort {

	@Override
	public void ascending(int[] number) {
		System.out.println("Bubblesort ascending");
		
	}

	@Override
	public void descending(int[] number) {
		System.out.println("Bubblesort descending");
		
	}

	@Override
	public void description() {
		// TODO Auto-generated method stub
		Sort.super.description();
		System.out.println("Bubblesort입니다");
	}

	
	

	}


