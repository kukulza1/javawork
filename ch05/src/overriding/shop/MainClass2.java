package overriding.shop;

public class MainClass2 {

	public static void main(String[] args) {
		//자동 형변환
		HeadShop shop1 = new Shop1();
		
		
	    shop1.비빔밥();
	    
	    System.out.println("==========================");
	    
	    
	    HeadShop shop2 = new Shop2();
	    shop2.비빔밥();
	    
	    int iNum =10;
	    double dNum;
	    dNum = iNum;
	    System.out.println(dNum);
	    
	    double dNum2 =10.1;
	    int iNum2;
	    iNum2=(int)dNum2;
	    System.out.println(iNum2);
	    
	    

	}

}
