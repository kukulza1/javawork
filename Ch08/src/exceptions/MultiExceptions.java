package exceptions;

public class MultiExceptions {

	public static void main(String[] args) {
		
		
		String[] arr = {"100","123a"};
		
		for(int i=0; i<= arr.length;i++) {
		 try {
			System.out.println(arr[i]);
			int value = Integer.parseInt(arr[i]);
			System.out.println(value);
			}catch(NumberFormatException e) {
				System.out.println("숫자로 변환할수 없는 항목이 있습니다");
			}catch(Exception e){
				System.out.println("배열의 범위를 초과햇습니다.");
				
			}
		}

	}

}
