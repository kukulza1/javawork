package layouts;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class LoginWindow {

	public static void main(String[] args) {
		JFrame jf = new JFrame();
		//제목표시줄-내용
		jf.setTitle("로그인창");
		jf.setSize(300,200); //300X200 = 60000픽셀
		jf.setLocation(200, 100); //윈도우창 좌표값 x=200, y=100
		jf.setLayout(null);  //레이아웃 객체가 없는상태
		//레이블(글자 출력)
		JLabel label = new JLabel();
		label.setText("아이디:");
		label.setSize(80,30);
		label.setLocation(20, 40);
		jf.add(label);
		JLabel label1 = new JLabel();
		label1.setText("비밀번호:");
		label1.setSize(80,30);
		label1.setLocation(20, 70);
		jf.add(label1);
		
		JTextField text = new JTextField();
		text.setSize(120, 20);
		text.setLocation(80, 45);
		jf.add(text);
		
		JTextField text1 = new JTextField();
		text1.setSize(120, 20);
		text1.setLocation(80, 75);
		jf.add(text1);	
		
		//버튼생성
	    JButton btn = new JButton("로그인");
	    btn.setSize(80,30);
		btn.setLocation(100, 110);		
		jf.add(btn);
		
		//배치
		
		jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);//윈도우 종료
		//윈도우 디스플레이
		jf.setVisible(true);
		

	}

}
