package customers;

//상속을위해 필의드 접근제어자:프로텍트
//접근제어자가 생략된 필드는 default- 패키지 내부에서만 접근 가능
public class Customer {
	protected int customerId;
	protected String customerName;
	protected String customerGrade;
	int bonusPoint;
	double bonusRatio;
	
	public Customer() {
		customerGrade="SILVER";
		bonusRatio = 0.01; //1%
	}
	
	public Customer(int customerId, String customerName) {
		this.customerId= customerId;
		this.customerName = customerName;
		customerGrade="SILVER";
		bonusRatio = 0.01; //1%
	}
	
	
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
    public int getCustomerId() {
    	return customerId;
    }
    public void setCustomerName(String customerName) {
    	this.customerName = customerName;
    }
    public String getCustomerName() {
    	return customerName;
    }
    
    public int calPrice(int price) {
    	bonusPoint = (int)(price*bonusRatio);
    	return price;
    }
    
    public String showCustomerInfo() {
    	return customerName +"님의 등급은"+customerGrade+"이며"
    			+ "보너스 포인트는"+ bonusPoint+"점 입니다";
    }
		
}
