package calulator;

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

public class Calc extends JFrame {
	 String[] operator = {"+","-","X","÷"};
	 JComboBox<String> jcb ;
	 JLabel jl;
	 
	public Calc() {
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
		JTextField text1 = new JTextField(4);
		//콤보박스
		jcb = new JComboBox<>(operator);
		
		JTextField text2 = new JTextField(4);
		//레이블
		jl = new JLabel("=");
		JTextField text3 = new JTextField(4);
		
		//버튼객체
		pane2.setLayout(new FlowLayout());
		JButton calcb = new JButton("계산");
		JButton resetjb = new JButton("취소");
						
		pane1.add(text1);
		pane1.add(jcb);
		pane1.add(text2);
		pane1.add(jl);
		pane1.add(text3);
		
		//pane2에 배치하고 올리기
	    pane2.add(calcb);
	    pane2.add(resetjb);
					
		//이벤트
	    ActionListener listener1 = new  ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				String ss = (String)jcb.getSelectedItem();
			if(ss.equals("+")) {
				int n1 =Integer.parseInt(text1.getText()); 
				int n2 =Integer.parseInt(text2.getText()); 
				int sum = n1+n2;
				text3.setText(String.valueOf(sum));
			}else if(ss.equals("-")) {
				int n1 =Integer.parseInt(text1.getText());
				int n2 =Integer.parseInt(text2.getText()); 
				int sum = n1-n2;
				text3.setText(String.valueOf(sum));
			}else if(ss.equals("÷")) {
				int n1 =Integer.parseInt(text1.getText());
				int n2 =Integer.parseInt(text2.getText()); 
				double sum = (double)n1/n2;
				text3.setText(String.valueOf(sum));
			}else if(ss.equals("X")) {
				int n1 =Integer.parseInt(text1.getText()); 
				int n2 =Integer.parseInt(text2.getText()); 
				int sum = n1*n2;
				text3.setText(String.valueOf(sum));
			}
			}
	    };
	    calcb.addActionListener(listener1);
	    	    
	    ActionListener listener2 = new  ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				text2.setText("");
				text1.setText("");
				text3.setText("");			
			}    
	    };	    	
		  resetjb.addActionListener(listener2);		    			
			//디스플레이
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.setVisible(true);
}
}
