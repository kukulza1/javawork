package exchange;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Exchange extends JFrame implements ActionListener{
	String[] currency = {"달러","위안","유로","엔"};
	JComboBox<String> jcb;
	JLabel  jl1 ;
	JLabel  jl2 ;//변환결과 출력할 레이블
	JPanel p1 ;
	JPanel p2 ;
	JTextField text;
	JButton button;
	static final float usd = 1357.50F;
	static final float cny = 185.58F;
	static final float jpy = 9.04F;
	static final float eur = 1432.43F;
	public Exchange() {
		//프레임
		this.setTitle("환전기");
		this.setSize(350, 150);
		this.setLocation(200, 100);
		
		//1.panel 2개 생성 위,가운데
		p1 = new JPanel();
		p2 = new JPanel();
		this.add(p1,BorderLayout.NORTH);
		this.add(p2,BorderLayout.CENTER);
		//2.p1에 올릴 객체 생성및 추가
		
		jl1 = new JLabel("원화");
		text= new JTextField(6);
		jcb = new JComboBox<String>(currency);
		button=new JButton("변환");
		
		jl2 = new JLabel("변환결과");
		
		p1.add(jl1);
		p1.add(text);
		p1.add(jcb);
		p1.add(button);	
		
		p2.add(jl2);
		jl2.setFont(new Font("고딕",Font.PLAIN,30));
		jl1.setFont(new Font("고딕",Font.PLAIN,15));
		text.setFont(new Font("고딕",Font.PLAIN,20));
		
		//변환버튼 이벤트
		button.addActionListener(this);
		
		//디스플레이
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == button) {
		float won =Integer.parseInt(text.getText());
		String op = (String)jcb.getSelectedItem();
		if(op.equals("달러")) {
			won= won/usd;
			jl2.setText(String.format("%2f$",won));
		}else if(op.equals("유로")) {
			won = won/eur;
			jl2.setText(String.format("%2f€",won));
		}else if(op.equals("위안")) {
			won = won/cny;
			jl2.setText(String.format("%2f￥",won));
		}else if(op.equals("엔")) {
			won = won/jpy;
			jl2.setText(String.format("%2f￡",won));
		}		
	}		
	}
}