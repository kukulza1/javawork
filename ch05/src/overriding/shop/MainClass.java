package overriding.shop;

public class MainClass {

	public static void main(String[] args) {
		Shop1 shop1 = new Shop1();
		
		
		shop1.김치찌게();
		shop1.된장찌게();
		shop1.비빔밥();
		System.out.println("==============================");
		Shop2 shop2 = new Shop2();
		shop2.김치찌게();
		shop2.된장찌게();
		shop2.비빔밥();

	}

}
