package streams.customer;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class BookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Book> blist = new ArrayList<>();
		
		blist.add(new Book("자바",25000));
		blist.add(new Book("파이선",15000));
		blist.add(new Book("갤럭시",30000));
		
		Stream<Book> strm = blist.stream();
		
		int t = blist.stream().mapToInt(b->b.getPrice())
				.sum();
		System.out.println("책들의 총가격은"+t+"입니다.");
		
		System.out.println("==가격이 2만원이상인 책들===");
		blist.stream().filter(b->b.getPrice()>=20000)
		              .map(b->b.getName())
		               .forEach(s->System.out.println(s));
	}

}
