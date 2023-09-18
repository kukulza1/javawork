package objectequals;

class Employee{
	int empId;
	String empName;
	
	Employee(int empId,String empName){
		this.empId = empId;
		this.empName = empName;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Employee) {//obj가 Employee인스턴스라면
			Employee employee = (Employee)obj;//다운캐스팅 (강제형변환)
			if(this.empId == employee.empId)//외부에서 입력한 사번과 원래 사번이 일치하면
				return true;
		}
		return false;
	}

	@Override
	public int hashCode() {//int형인 empId를반환
		// TODO Auto-generated method stub
		return empId;
	}
	
	
}

public class HashCodeT {
	

	public static void main(String[] args) {
		Employee emp1= new Employee(232,"SB");
		Employee emp2= new Employee(232,"SB");
		
		System.out.println(emp1==emp2);
		System.out.println(emp1.equals(emp2));//equals 재정의하면 참
		
		//hashcode비교 - 동등객체인지 확인(문자열의 일치 확인)
		System.out.println(emp1.hashCode()==emp2.hashCode());
		System.out.println(emp1.hashCode());
		
		//실제물리 주소
     System.out.println(System.identityHashCode(emp2));
     System.out.println(System.identityHashCode(emp1));
	}

}
