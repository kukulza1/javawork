package button;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Button {

	public static void main(String[] args) {
		JFrame jf = new JFrame("레이아웃 예제");
		jf.setSize(250,120);
		jf.setLocation(200, 100);
		
	
		//버튼
		JButton jb = new JButton("북");
		jf.add(jb,BorderLayout.NORTH);//버튼을 프레임에 추가 
		
		JButton jb1 = new JButton("남");
		jf.add(jb1,BorderLayout.SOUTH);//버튼을 프레임에 추가
		
		JButton jb2 = new JButton("서");
		jf.add(jb2,BorderLayout.WEST);//버튼을 프레임에 추가
		
		JButton jb3 = new JButton("동");
		jf.add(jb3,BorderLayout.EAST);//버튼을 프레임에 추가
		
		JButton jb4 = new JButton("중앙");
		jf.add(jb4,BorderLayout.CENTER);//버튼을 프레임에 추가
		
		
		//디스플레이
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setVisible(true);
		

	}

}
