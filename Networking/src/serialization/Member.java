package serialization;

import java.io.Serializable;

//Member클래스를 직렬화 하기
//현상태를 그대로 저장하거나 네트워크를 통해서 전송하기 위해
//연속스트림(필드값을 일렬로 늘어선 바이트로 변경)으로 만드는것
public class Member implements Serializable{
    //버전 ID:역직렬화시 일치하지않으면 오류 발생
	private static final long serialVersionUID = 1L;
	
	private String id;
	private String name;
	
	public Member(String id, String name) {
		this.id=id;
		this.name=name;
	}
	@Override
	public String toString() {
	return id+" ,"+name;
	}

}
