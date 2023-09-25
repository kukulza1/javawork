package streams.customer;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class CustomerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Customer> clist = new ArrayList<>();
		
		Customer c1 = new Customer("SB",40,100);
		Customer c2 = new Customer("KSB",36,150);
		Customer c3 = new Customer("GSB",22,90);
		
		clist.add(c1);
		clist.add(c2);
		clist.add(c3);
		
		System.out.println("=======고객명단출력======");
		//Stream과 람다식사용
		/*for(Customer cc : clist)
			System.out.println(cc.getName());*/
		Stream<Customer> strm= clist.stream();
		strm.map(c->c.getName())
		.forEach(s->System.out.println(s));
		
		int total=clist.stream().
				      mapToInt(c->c.getPrice()).sum();
		System.out.println("총여행비용은"+total+"만 입니다");
		
		System.out.println("======30세 이상인 고객명단======");
		//중간연산자filter(),map(),sorted()
		//최종연산자forEach()
		
		clist.stream().filter(c->c.getAge()>=30)
		          .map(c->c.getName()).sorted()
		          .forEach(s->System.out.println(s));
		
		

	}

}
