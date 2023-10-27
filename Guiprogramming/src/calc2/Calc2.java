package calc2;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calc2 extends JFrame implements ActionListener{
	 String[] operator = {"+","-","X","÷"};
	 JComboBox<String> jcb ;
	 JLabel jl;
	 JButton calcb;
	 JButton resetjb;
	 JTextField text1;
	 JTextField text2;
	 JTextField text3;
	public Calc2() {
		this.setTitle("계산기");
		this.setSize(300,300);
		this.setLocation(100, 100);
		//패널2개생성
		JPanel pane1 = new JPanel();
		JPanel pane2 = new JPanel();
		
		this.add(pane1,BorderLayout.NORTH);
		this.add(pane2,BorderLayout.CENTER);
						
		//컴포넌트객체생성
		//pane1에 객체올리기
		pane1.setLayout(new FlowLayout());
		text1 = new JTextField(4);
		//콤보박스
		jcb = new JComboBox<>(operator);
		
		text2 = new JTextField(4);
		//레이블
		jl = new JLabel("=");
		text3 = new JTextField(4);
		
		//버튼객체
		pane2.setLayout(new FlowLayout());
		 calcb = new JButton("계산");
		resetjb = new JButton("취소");
						
		pane1.add(text1);
		pane1.add(jcb);
		pane1.add(text2);
		pane1.add(jl);
		pane1.add(text3);
		
		//pane2에 배치하고 올리기
	    pane2.add(calcb);
	    pane2.add(resetjb);
					
		//이벤트
	   
	    calcb.addActionListener(this);
	    resetjb.addActionListener(this);		    			
			//디스플레이
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.setVisible(true);
}//생성자끝

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==calcb) {
			int n1 = Integer.parseInt(text1.getText());
			String op = (String)jcb.getSelectedItem();
			int n2 = Integer.parseInt(text2.getText());
		
			switch(op) {
			case "+": 
				int result = n1+n2; 
				text3.setText(String.valueOf(result));break;
			case "-": 
				int result1 = n1-n2; 
				text3.setText(String.valueOf(result1));break;
			case "X": 
				int result11 = n1*n2; 
				text3.setText(String.valueOf(result11));break;
			case "÷": 
				double result4 = (double)n1/n2; 
				text3.setText(String.valueOf(result4));break;
			  
			}
			if(e.getSource() ==  resetjb) {
				text2.setText("");
				text1.setText("");
				text3.setText("");		
							
			}
		}
	}
	
}
