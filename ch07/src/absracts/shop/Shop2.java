package absracts.shop;

public class Shop2 extends HeadShop {
	
	public Shop2() {
		System.out.println("역세권 매장입니다.");
	}

	@Override
	public void 된장찌게() {
		System.out.println("된장찌게:7400원");
		
	}

	@Override
	public void 김치찌게() {
		System.out.println("김치찌게:8100원");
		
	}

	@Override
	public void 비빔밥() {
		System.out.println("비빔밥:6100원");
		
	}

}
