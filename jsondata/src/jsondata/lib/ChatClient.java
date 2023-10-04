package jsondata.lib;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

import org.json.JSONObject;

public class ChatClient {

	Socket socket;
	DataInputStream dis;
	DataOutputStream dos;
	String chatName;
	
	public void connect() throws IOException{
		socket = new Socket("localhost",6000);
		dis = new DataInputStream(socket.getInputStream());
		dos = new DataOutputStream(socket.getOutputStream());
		System.out.println("[클라이언트]"+"서버에연결됨");
	}
	//데이터보냄
	public void send(String json)throws IOException{
		dos.writeUTF(json);
		dos.flush();
	}
	//데이터 받기
	public void receive() {
		System.out.println("===================================================");
		System.out.println("보낼메세지를 입력하고 엔터를 누르세요");
		System.out.println("서버를 종료하려면 q 또는 Q를 입력하고 Enter를 누르세요.");
		System.out.println("===================================================");
		Scanner sc = new Scanner(System.in);
		while(true) {
			String message = sc.nextLine();
			if(message.toLowerCase().equals("q")) {
				break;
			}else {
				jsonObject = new jsonObject();
				jsonObject.put("command","imessage");
				jsonObject.put("data",message);
				json=JSONObject.doubleToString();
				chatClient.send();
			}
		}
		sc.close();
		//항상 받을준비
		Thread thr = new Thread(()->{
			try {
				while(true) {
				String json = dis.readUTF();
				
				//읽은데이터 파싱
				JSONObject root = new JSONObject(json);
				String clientIp = root.getString("clientIp");
			    String chatName =root.getString("chatName");
			    String message =root.getString("message");
			    System.out.println("<"+chatName+"@"+clientIp+">"+message);
				}
			} catch (IOException e) {
				e.printStackTrace();
				
				System.out.println("[클라이언트] 서벼연결끊김");
				System.exit(0); //프로세스 완전종료
			}
			
		});
	  thr.start();
	
	}
	public void unconnect()throws IOException{
		socket.close();
	}
	
	public static void main(String[] args) {
		
		try {
			ChatClient chatClient = new ChatClient();
			chatClient.connect();
			Scanner sc = new Scanner(System.in);
			System.out.println("대화명 입력:");
			chatClient.chatName = sc.nextLine();
			
			//command,data
			JSONObject jsonObject = new JSONObject();
			jsonObject.put("command","incomming");
			jsonObject.put("data", chatClient.chatName);
			String json = jsonObject.toString();//객체를 문자열로 열기
			
			//데이터보냄
			chatClient.send(json);
			chatClient.receive();
			
			sc.close();
			chatClient.unconnect();
			} catch (IOException e) {
			e.printStackTrace();
		}
		

	}

}
