package nestedclass.interfaces;

public class MessageListener implements Button.OnClickListener{

	@Override
	public void onClick() {
		System.out.println("문자보내기");
		
	}

}
