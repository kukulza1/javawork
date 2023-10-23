package components;

import javax.swing.JButton;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Jframe1 {

	public static void main(String[] args) {
		//프레임 - 원도우전체
		JFrame jf = new JFrame();
		//제목표시줄-내용
		jf.setTitle("처음만드는 윈도우");
		jf.setSize(300,200); //300X200 = 60000픽셀
		jf.setLocation(200, 100); //윈도우창 좌표값 x=200, y=100
		jf.setLayout(null);  //레이아웃 객체가 없는상태
		//레이블(글자 출력)
		JLabel label = new JLabel();
		label.setText("hi~java");
		label.setSize(80,30);
		label.setLocation(100, 40);
		
		//label.setHorizontalAlignment(JLabel.CENTER);//레이블정렬
		
		//프레임을 동,서,남,북,중앙으로 배치
		//jf.add(label,BorderLayout.CENTER); //프레임에 라벨을추가해야 화면에 출력됨
		jf.add(label);//프레임에 라벨을 추가해야 화면에 출력됨
		
		//버튼생성
	    JButton btn = new JButton("확인");
	    btn.setSize(70,30);
		btn.setLocation(100, 80);		
		jf.add(btn);
		
		//배치
		
		jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);//윈도우 종료
		//윈도우 디스플레이
		jf.setVisible(true);
		
                                   
	}

}











