package network;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAdressTest {

	public static void main(String[] args) {
		try {
			InetAddress local = InetAddress.getLocalHost();//로컬 컴퓨터 IP불러옴
			System.out.println("내컴퓨터IP주소:"+local.getHostAddress());
			
			//서버 컴퓨터 - 여러대인경우 배열로출력
			//DNS(domain name service):숫자주소->문자이름으로 변경서비스
			//InetAddress server = InetAddress.getByName("www.naver.com");
			//System.out.println("naver컴퓨터Ip주소:"+server);
			
			InetAddress[] server = InetAddress.getAllByName("www.naver.com");
			for(InetAddress remote:server) {
				System.out.println(remote);
				
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}

	}

}
