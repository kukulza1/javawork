package datascaping;

import java.io.IOException;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class ExchageRate {

	public static void main(String[] args) {	
			
		try {
			//환율정보를 가져올 웹페이지 url
			String url = "https://finance.naver.com/marketindex/";
			//연결객체
			Connection conn = Jsoup.connect(url);
			//접속페이지의 데이터가져오기
			Document doc = conn.get();
			//System.out.println(doc.html());
			
			//태그와 선택자를 이용해서 데이터를 가져옴
		  Elements c1 =	doc.select(".data_lst li");
		  //System.out.println(c1);
		  
		  for(Element element :c1) {
			  //통화,환율 비율
			  //String currency = element.select("span.blind").text();
			  //selectFirst() 함수사용 -class 이름인 blind중 처음 값만 필요함
			  //국가이름 제외한 통화이름만 출력하기 -split()
			  String currency = element.selectFirst("span.blind").text();
			  String[] cname = currency.split(" ");
			  /*for(String cname2 : cname) {
				  System.out.println(cname2+" ");
			  }*/
			 // System.out.println(cname[0]);
			  String rate = element.selectFirst("span.value").text();
			  System.out.println(cname[1] + ": "+rate);
			  if(currency.equals("중국 CNY")) break;
		  }
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
