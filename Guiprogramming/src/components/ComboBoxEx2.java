package components;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ComboBoxEx2 extends JFrame implements ActionListener{
	//필드
	String[] currency = {"달러","위안","유로","엔"};
	JComboBox<String> jcb;
	JLabel  jl ;
	public ComboBoxEx2() {
		//프레임
		this.setTitle("목록상자");
		this.setSize(300, 300);
		this.setLocation(200, 100);
		
		//컴포넌트 객체생성
		
		 new JComboBox<>(currency);
		 new JLabel("화폐를선택하세요");
		
		//배치
		this.add(jcb,BorderLayout.NORTH);
		this.add(jl,BorderLayout.CENTER);
		
		//콤보이벤트
		jcb.addActionListener(this);
		
		
		//디스플레이
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);		
	}
	
	

	public static void main(String[] args) {
         new ComboBoxEx2();
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		String currency = (String)jcb.getSelectedItem();
		jl.setText(currency+"를 선택하셨습니다.");
	}

}
