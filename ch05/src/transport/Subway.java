package transport;

public class Subway {
   //필드
	String LineNumber;
	int passenger;
	int money;
	
	public Subway(String lineNumber) {
		this.LineNumber = lineNumber;
	}
	public void take(int fee) {//요금을 받음
		this.money += fee; //요금을 더해서 수입이 증가
		passenger++; //승객수 1명 증가, passenger=passenger+1

		
}
	public void showSubwayInfo() {
	
		System.out.printf("%s의 수입은%d원이고,승객수는%d명 입니다.",
				LineNumber,money,passenger);
		}
}


