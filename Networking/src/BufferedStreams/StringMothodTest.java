package BufferedStreams;

import java.util.Arrays;

public class StringMothodTest {

	public static void main(String[] args) {
        String sub= "자바 프로그램 입문";
       System.out.println(sub.charAt(3));
       
       System.out.println(sub.indexOf("프"));
       
       String[] ww = sub.split(" ");//split()사용-구분기호("")
       System.out.println(Arrays.toString(ww));
       System.out.println(ww[0]);
       System.out.println(ww[1]);
       
       //전화번호
       String phone = "010-1234-5678";
       String[] num = phone.split("-");
       System.out.println(Arrays.toString(num));
       System.out.println(num[0]);
       System.out.println(num[1]);
       
	}

}
