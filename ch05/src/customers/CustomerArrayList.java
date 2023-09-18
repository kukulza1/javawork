package customers;

import java.util.ArrayList;

public class CustomerArrayList {

	public static void main(String[] args) {
		// 일반 고객-2명,골드-2명,vip-1명
		
		ArrayList<Customer> customerList = new ArrayList<>();
		
		
		//고객객체 생성- 부모타입으로 생성(다형성)
		Customer lee = new Customer(101,"SB");
		Customer sin = new Customer(102,"KSB");
		Customer hong = new GoldCustomer(103,"길동");
		Customer youl = new GoldCustomer(104,"율곡");
		Customer king = new VipCustomer(105,"세종",1334);
		
		//고객 객체저장
		customerList.add(lee);
		customerList.add(sin);
		customerList.add(hong);
		customerList.add(youl);
		customerList.add(king);
		
		int price = 10000;
		
		for(int i=0; i<customerList.size();i++) {
			Customer c1 = customerList.get(i);
			int cost = c1.calPrice(price);
			System.out.printf("%s님이 지불할비용은%원 입니다"+c1.getCustomerName(),cost);
			System.out.println(c1.showCustomerInfo());
		}
		
		

	}

}
