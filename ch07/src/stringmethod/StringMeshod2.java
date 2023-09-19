package stringmethod;

public class StringMeshod2 {

	public static void main(String[] args) {
		//indexOf()검색에 도움
		//문자열이 시작되는 인덱스를 리턴합니다.
		String str = "Hello World Hello!";
		
		int vv =str.indexOf("Hello");//앞에서부터 찾음
		System.out.println(vv);
		
		int vv2 =str.lastIndexOf("Hello");//뒤에서부터 찾음
		System.out.println(vv2);//12번
		
		int vv3 = str.indexOf("ok");//찾는 문자가 없으면 -1반환
		System.out.println(vv3);
		
		//조건문 만들기
		String subject = "자바 프로그래밍";
		if(subject.indexOf("자바") != -1) {//자바가 검색이 되면
			System.out.println("자바와 관련된책이군요!");
		}else {//index == -1
			System.out.println("자바관련 책이 아니군요.");
		}

	}

}
