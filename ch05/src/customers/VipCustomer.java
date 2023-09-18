package customers;

public class VipCustomer extends Customer{
	private int agentId; //전문 상담원
	double saleRatio;
	
	public VipCustomer() {
		customerGrade="VIP";
		saleRatio = 0.1; //10%
		bonusRatio = 0.05; //5%
	}
	
	public VipCustomer(int customerId, String customerName, int agentId ) {
		super(customerId,customerName);
		
		customerGrade="VIP";
		saleRatio = 0.1; //10%
		bonusRatio = 0.05; //5%
	}
	
	public void setAgentId(int agentId) {
		this.agentId = agentId;
	}
	
	

	@Override
	public int calPrice(int price) {
		price -= (int)(price*saleRatio);
		bonusPoint += (int)(price*saleRatio);
		return price;
	}

	@Override
	public String showCustomerInfo() {
		
		return super.showCustomerInfo()+"\n전문상담원 아이디는"+
		agentId+"입니다.";
	}

}
