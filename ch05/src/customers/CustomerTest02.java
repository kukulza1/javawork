package customers;

public class CustomerTest02 {

	public static void main(String[] args) {
		// 부모형으로 객체 생성 -자동형변환
         Customer lee = new Customer(1001,"이순신");
         
         int price = 10000;
         int cost=lee.calPrice(price);
         
         System.out.println(lee.getCustomerName()
        		 +"님이 지불한비용은"+cost+"원입니다" );
         System.out.println(lee.showCustomerInfo());
         
         Customer woo = new VipCustomer(1010,"우영우",7777);
         
         price =20000;
         cost=woo.calPrice(price);
         
         System.out.println(woo.getCustomerName()+
        		 "님이 지불한 비용은"+cost+"원입니다.");
         System.out.println(woo.showCustomerInfo());
        
         
	}

}
