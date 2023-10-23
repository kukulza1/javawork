package actionevent;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PlusCalcEvent {

	public static void main(String[] args) {
		//프레임>패널1,패널2(BorderLayout,flowLayout)>버튼,택스트상자
		JFrame jf = new JFrame("덧셈프로그램");
			
		jf.setSize(300,200); 
		jf.setLocation(200, 100); 
		
		//패널1,패널2
		JPanel pane1 = new JPanel();
		JPanel pane2 = new JPanel();
		
		//프레임에서 패널배치-보더레이아웃
		jf.add(pane1,BorderLayout.NORTH);
		jf.add(pane2,BorderLayout.CENTER);
		
		//패널에서 버튼,텍스트상자 배치-플로우레이아웃
		pane1.setLayout(new FlowLayout());
		JTextField text = new JTextField(4);
		JTextField text1 = new JTextField(4);//4글자정도
		JTextField text2 = new JTextField(4);
		
		pane2.setLayout(new FlowLayout());
		JButton calcBtn = new JButton("계산");
		JButton resetBtn = new JButton("취소");
		
		//패널에 버튼, 텍스트 상자 추가
		pane1.add(text);
		pane1.add(new JLabel("+"));
		pane1.add(text1);
		pane1.add(new JLabel("="));
		pane1.add(text2);
		
		pane2.add(calcBtn);
		pane2.add(resetBtn);
		
		//버튼이벤트--익명객체구현
		ActionListener listener = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
			    int n1 =Integer.parseInt(text.getText()); // 입력된문자를 숫자로 변환
				int n2 =Integer.parseInt(text1.getText()); 
				int sum = n1+n2;
				text2.setText(String.valueOf(sum));
							
			}					
		};
		
		ActionListener listener2 = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {	    	
				text2.setText("");
				text1.setText("");
				text.setText("");
			}
			
		};
		calcBtn.addActionListener(listener);
		resetBtn.addActionListener(listener2);
		
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setVisible(true);


	}

}





















