package ppp.i;

import ppp.e.UUser;

public class UUserMain {

	public static void main(String[] args) {
		
		UUser[] user = new UUser[2];
		
		UUser user1 = new UUser("sb","22");
		UUser user2 = new UUser("SS","S4");
		
		user[0] = user1;
		user[1] = user2;
				
		
		for(int i=0; i<user.length; i++) {
			System.out.println(user[i].getEe()+","+
		           user[i].getWe());
		}
		

	}

}
