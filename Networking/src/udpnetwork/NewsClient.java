package udpnetwork;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;

public class NewsClient {

	public static void main(String[] args) {
		try {
			//UDP가 비연결방식이므로 생성자로 서버의 Port번호가 없음
			DatagramSocket datagramSocket =new DatagramSocket();
			System.out.println("[클라이언트] 통신소켓생성");
			
			//데이터보내기(송신) -구독하고픈 뉴스주제보내기
			//서버의 호스트(ip)와 port를 명시해서 연결요청함
			String data = "경제";
			byte[] bytes = data.getBytes("utf-8");
			DatagramPacket sendPacket = new DatagramPacket(bytes,
					bytes.length,new InetSocketAddress("localhost",8100));
			datagramSocket.send(sendPacket);
			
			
			//무한반복(대기)
			while(true) {
				DatagramPacket receivePacket=
						new DatagramPacket(new byte[1024],1024);
				datagramSocket.receive(receivePacket);
			
				//문자열로복원
			String news = new String(receivePacket.getData(),
					0,receivePacket.getLength(),"utf-8");
			System.out.println(news);
			    if(news.contains("뉴스10")) break;
			}//while 끝 브레이크 해줘야 에러없음
			datagramSocket.close();
			System.out.println("[클라이언트]통신 연결 끊음");
		}  catch (IOException e) {
			e.printStackTrace();
		}
	}

}
