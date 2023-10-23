package actionevent;

import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ButtonActionEvent {

	public static void main(String[] args) {
		//프레임
		JFrame jf = new JFrame();
		jf.setSize(250,100);
		jf.setLocation(200, 100);
		
		//컴포넌트 생성 - JTextField(입력상자),JButton,JLabel 필드
		JTextField text = new JTextField();
		JButton jb = new JButton("확인");
		JLabel jl = new JLabel("Hello!");
		
		//button이벤트
		ConfirmBtnActionListner listener =new ConfirmBtnActionListner(text,jl);
		jb.addActionListener(listener);
		
		
		//컴포넌트 배치 -borderlayout사용
		jf.add(text,BorderLayout.CENTER);
		jb.setPreferredSize(new Dimension(60,30));
		jf.add(jb,BorderLayout.EAST);
		jb.setPreferredSize(new Dimension(65,40));
		jf.add(jl,BorderLayout.SOUTH);
		
				
		//디스플레이
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setVisible(true);
	}
}