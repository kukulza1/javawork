package collection.list.stack;

import java.util.Stack;

public class StackCoinTest {

	public static void main(String[] args) {
		//stack자료 구조의 객체생성
		Stack<Coin> coinBox = new Stack<>();
		
		Coin c500 = new Coin(500);
		Coin c100 = new Coin(100);
		Coin c50 = new Coin(50);
		Coin c10 = new Coin(10);
		
		//동전넣기(저장) [500-100-50-10]
		coinBox.push(c500);
		coinBox.push(c100);
		coinBox.push(c50);
		coinBox.push(c10);
			
		//10원꺼내짐 (마지막객체꺼내짐
		int coin1 = coinBox.pop().getMoney();
		System.out.println(coin1);
		
		//전체 객체 꺼내기(출력)-밖으로 나오면서 삭제[10-50-100-500]
		while(!coinBox.isEmpty()) {
			Coin coin = coinBox.pop();
			System.out.println(coin.getMoney());
		}
		
	}
}
