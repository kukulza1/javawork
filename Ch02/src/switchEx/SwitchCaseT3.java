package switchEx;

public class SwitchCaseT3 {

	public static void main(String[] args) {
		// 사칙연산 -산술 기호
		//변수- n1, n2,oper
		
		
		int n1=10;
		int n2=2;
		char operator='!';//값을 초기화 해줘야함
        //String str =""; 스트링은 초기화X
		int result = 0;
		
		/*switch(operator) {
		case '+':
		    result =n1+n2;
		    break;
		case '-':
			result =n1-n2;
			break;
		case '*':
			result =n1*n2;
			break;
		case '/':
			result =n1/n2;
			break;
		
			default:
				System.out.println("지원하지않는 기능입니다.");
				return;//즉시 종료
		
		}
		System.out.println("결과는"+result+"입니다.");*/
		if(operator == '+') {
			result=n1+n2;
		}else if(operator=='-') {
			result=n1-n2;
		}else if(operator=='*') {
			result=n1*n2;
		}else if(operator=='/') {
			result=n1/n2;
		}else {
			System.out.println("지원하지않는 기능입니다");
			return;
		}
		System.out.println("결과는"+result+"입니다.");
	}

}
