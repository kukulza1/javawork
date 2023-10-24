package layouts.windowwinherit;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ButtonEvent extends JFrame{
	
	public ButtonEvent() {
	//프레임생성(상속을 받으면 frame객체를 생성하지않고 BE객체로 가능함
	this.setTitle("버튼 이벤트");
	//this.setSize(250,150); //프레임 크기설정
	this.setLocation(200, 100);
	//컴포넌트 생성- BorderLayout배치(위쪽- 입력상자,버튼,아래쪽-레이블)
	JTextField text = new JTextField();
	text.setPreferredSize(new Dimension(200,40));
	text.setFont(new Font("맑은고딕",Font.PLAIN,30)); //보통굵기로 30포인트 크기
	text.setForeground(new Color(0X00ff00)); //255,255,255
	text.setBackground(Color.black);
	
	JButton btn = new JButton("확인");
	
	JLabel jl = new JLabel("출력");
	jl.setPreferredSize(new Dimension(200,50));
	jl.setFont(new Font("함초롱돋음",Font.PLAIN,30));
	 
	//프레임에 객체 추가
	this.add(text,BorderLayout.CENTER);
	this.add(btn,BorderLayout.EAST);
	this.add(jl,BorderLayout.SOUTH);
	
	//액션이벤트
	ActionListener listener = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
               String username = text.getText();	
               jl.setText(username);
		}
		
	};
	btn.addActionListener(listener);
	
	this.pack();//프레임역할
	//디스플레이
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setVisible(true);
	
	}
	public static void main(String[] args) {
		ButtonEvent evn = new ButtonEvent();

	}

}


















