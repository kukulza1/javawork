package kr.or.iei.run;

import kr.or.iei.model.User;

public class UserTest2 {

	public static void main(String[] args) {
		//매개변수가있는 생성자로 user1인스턴스(객체)생성
		/*User user1 = new User("sss","ww12","SB");
		
		System.out.println("아이디:"+user1.getid());
		System.out.println("비번:"+user1.getpwd());
		System.out.println("이름:"+user1.getname());*/
		
		//크기가 3인 배열생성
		User[] users = new User[3];
		
		//user 객체 생성
		User user1 = new User("sss","ww12","SB");
		User user2 = new User("ssd","ww33","KSB");
		User user3 = new User("sWd","ww45","GKSB");
		
		//배열에 객체를 저장(입력)
		users[0] = user1;
		users[1] = user2;
		users[2] = user3;
		
		//users[0] 1개출력
		 {
			System.out.println(users[0].getid()+ ","+
					users[0].getpwd()+","+users[0].getname());}
		
		System.out.println("================================");
		
		//전체출력
		for(int i=0; i<users.length; i++) {
			System.out.println(users[i].getid()+ ","+
					users[i].getpwd()+","+users[i].getname());
		}
		
		
		
		

	}

}
