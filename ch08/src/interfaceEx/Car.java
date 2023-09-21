package interfaceEx;

public class Car {
       //필드 인터페이스타입선언
         Tire frontLeftTire;
         Tire frontrightTire;
         Tire backleftTire;
         Tire backrightTire;
         
         public Car() {
        	 Tire frontLeftTire = new HanTire();
             Tire frontrightTire = new HanTire();
             Tire backleftTire = new KumTire();
             Tire backrightTire = new KumTire();
        	 
        	 
         }
         
         //메서드
         void run() {
        	 frontLeftTire.roll();
        	 frontrightTire.roll();
        	 backleftTire.roll();
        	 backrightTire.roll();
         }

}