package datascaping;

import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Stockinfo {

	public static void main(String[] args) {
		//네이버 증권 사이트에서 주식정보 가져오기
				
		try {
			String url ="https://finance.naver.com/sise/sise_rise.naver";
			Connection conn = Jsoup.connect(url);
			Document doc = conn.get();
			//System.out.println(doc.html());
			if(doc != null) {//데이터가 있으면 실행
			//Elements elements = doc.select(".type_2 tbody tr");
			Elements elements = doc.select("table[class='type_2'] tbody tr");
			for(Element element : elements) {
				String stock = element.text(); //문자열 변수에저장
				System.out.println(element);
			}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
