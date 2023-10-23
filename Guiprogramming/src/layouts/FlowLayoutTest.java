package layouts;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutTest {

	public static void main(String[] args) {
		// flowlayout -왼쪽에서 오른쪽으로 배치(한 줄)
		JFrame jf = new JFrame();
		jf.setSize(400,100);
		jf.setLocation(200, 100);
		
		//레이아웃 배치
		FlowLayout layout = new FlowLayout();
		jf.setLayout(layout);
		
		//컴포넌트 배치
		jf.add(new JButton("계란"));
		jf.add(new JButton("두부"));
		jf.add(new JButton("콩나물"));
		jf.add(new JButton("라면"));
		
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setVisible(true);
		

	}

}
