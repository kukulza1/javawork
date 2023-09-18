package inheritance.statement;

public class SaleStateMent22 {

	public static void main(String[] args) {
		// Drink클래스 사용
				Drink coffee = new Drink("커피",2500,10);
				Drink 녹차 = new Drink("녹차",3000,4);
				
				//Alcohol클래스 사용
				Alcohol 소주 = new Alcohol("소주",4000,3,15.1F);
				
				//전표출력
				Drink.printTitle();
				coffee.printData();
		        녹차.printData();
		        
		        System.out.println("=====================");
		        //알콜전표 출력
		        Alcohol.printTitle();
		        소주.printData();
		        
		        //총계출력
		        int sumV = coffee.getTotalprice()+녹차.getTotalprice()
		                    +소주.getTotalprice();
		        System.out.println("합계금액"+ sumV + "원");
			}

}
