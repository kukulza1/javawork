package interfaceEx;

public class CarMain {

	public static void main(String[] args) {
		Car c1 = new Car();
		//c1.run();
		
		//앞바퀴 변경
	//	KumTire k1 = new KumTire();
   //	KumTire k2 = new KumTire();
	//	c1.frontLeftTire = k1;
	//	c1.frontrightTire = k2;
		
		/*c1.frontLeftTire = new KumTire();
		c1.frontrightTire = new KumTire();
		c1.run();*/
 System.out.println("============================");
     
         Car2 c2 = new Car2();
         c2.tires[0] = new KumTire();
         c2.tires[1] = new KumTire();  
         c2.run();
	}

}
