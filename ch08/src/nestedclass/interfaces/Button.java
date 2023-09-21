package nestedclass.interfaces;

public class Button {
	//필드- 인터페이스형 맴버 변수
	private OnClickListener listener;
	
	//내부인터페이스
	interface OnClickListener{
		public void onClick();
	}
	//외부에서 구현객체입력
	public void setListener(OnClickListener listener) {
		this.listener = listener;
	}
   //버튼 터치
	public void touch() {
		listener.onClick();
	}
}
