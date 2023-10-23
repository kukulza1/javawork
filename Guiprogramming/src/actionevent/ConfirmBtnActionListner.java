package actionevent;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JTextField;

public class ConfirmBtnActionListner implements ActionListener {
	
	//필드
	JTextField text;
	JLabel label;
	public ConfirmBtnActionListner() {}
	//생성자
	public ConfirmBtnActionListner(JTextField text,JLabel label) {
		this.text = text;
		this.label = label;
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//입력된 이름을 가져와서 레이블에서 출력
		String name = text.getText();
		label.setText("hi~:"+name);
	}

}
