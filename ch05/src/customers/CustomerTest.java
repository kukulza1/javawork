package customers;

public class CustomerTest {

	public static void main(String[] args) {
		Customer c1 = new Customer();
		c1.setCustomerId(1001);
		c1.setCustomerName("SB");
		int price = 10000;//상품가격
		c1.calPrice(price);
		System.out.println(c1.showCustomerInfo());
		
		
		
		System.out.println("=====================");
	
		VipCustomer v1 = new VipCustomer();
		v1.setCustomerId(1010);
		v1.setCustomerName("KSG");
		v1.setAgentId(7777);
		price = 20000;
		v1.calPrice(price);
		
		
		System.out.println(v1.showCustomerInfo());

	}

}
