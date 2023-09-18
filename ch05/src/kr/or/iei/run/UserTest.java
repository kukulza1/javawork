package kr.or.iei.run;

import kr.or.iei.model.User;

public class UserTest {

	public static void main(String[] args) {
		//user1-객체(인스턴스)
		User user1 = new User();
		user1.setid("abc123");
		user1.setpwd("ww12");
		user1.setname("KSB");
		
		
		
		System.out.println("아이디:"+user1.getid());
		System.out.println("비번:"+ user1.getpwd());
		System.out.println("유저이름:"+ user1.getname());
		
		//System.out.println(user1); //메모리 주소

	}

}
