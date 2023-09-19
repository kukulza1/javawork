package interfaceEx.sort;

public interface Sort {
	
	public void ascending(int[] number);
	public void descending(int[] number);
	default public void description() {
		System.out.println("숫자를 정렬하는 알고리즘입니다.");
	}

}
