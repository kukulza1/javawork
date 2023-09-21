package nestedclass.interfaces;

public class BottonT {

	public static void main(String[] args) {
		//버튼 객체 생성
         Button b1 = new Button();
         
         //전화걸기 객체 생성
         CallListener call = new CallListener();
        
         
         b1.setListener(call);
         b1.touch();
         
     // MessageListener M1 = new MessageListener();
         
          b1.setListener(new MessageListener());
        // b1.setListener(M1);
         b1.touch();
         
         //사진찍기 구현
         b1.setListener(new Button.OnClickListener(){
			
			@Override
			public void onClick() {
				System.out.println("사진을 찍습니다"); 
				
			}
		});
         b1.touch();
         
         //쇼핑 - 구매 구현
         
        	 
        	 
         }
	}

