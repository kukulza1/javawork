package network.socket;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerSample {
	//서버소켓객체선언
	private static ServerSocket svs;

	public static void main(String[] args) {
		System.out.println("=================================");
		System.out.println("서버를 종료하려면q또는Q를 입력하고 엔터를누르세요");
		System.out.println("=================================");
		//TCP서버 시작
				startServer();
		Scanner sc = new Scanner(System.in);
		while(true) {
		String key =sc.nextLine();
		if(key.toLowerCase().equals("q"))break;
		}
           sc.close();
           stopserver();
	}

	private static void startServer() {
		//작업스레드 생성
		Thread thd = new Thread() {
			public void run() {
				try {
					svs = new ServerSocket(50001);
					System.out.println("[서버]");
					while(true) {
						System.out.println("\n서버연결요청대기중\n");
						
						Socket socket= svs.accept();//클라와 소통할수있도록 소켓생성
						
						//ip주소알아내기
						InetSocketAddress isa=(InetSocketAddress)socket.getRemoteSocketAddress();
						String clientIp = isa.getHostString();
						System.out.println("서버"+clientIp+"의 연결요청을 수락함");
						//웹 브라우저에서 http://127.0.0.1:50001/을 입력함 -콘솔에서 확인
						socket.close();
						System.out.println("서버"+clientIp+"의 연결을해제함 ");
					}
				} catch (IOException e) {
					//e.printStackTrace();
					System.out.println("서버"+ e.toString());
				}
			}
		};
		thd.start();
	}//start서버끝
	private static void stopserver() {
		           try {
					svs.close();
					System.out.println("서버종료");
				} catch (IOException e) {
					e.printStackTrace();
				}
	}
}
