package referens;

public class CircleTest {

	public static void main(String[] args) {
		/*Circle c1 = new Circle(2,3,5);
		c1.showCircleInfo();
		
		Circle c2 = new Circle(10,12,10);
		c2.showCircleInfo();*/
		
		//객체배열
		/*Circle[] circle = { 
				new Circle(2,3,5),//circle[0]
				new Circle(10,12,10),//circle[1]
				new Circle(-10,-12,10)//circle[2]
		};*/
            
		Circle[] circle = new Circle[3];
		circle[0] = new Circle(2,3,5);
		circle[1] = new Circle(10,12,10);
		circle[2] = new Circle(-10,-12,10);
		
		
		//circle[2].showCircleInfo();
		System.out.println("=========================");
             
             //전체조회(출력)
             for(int i=0; i<circle.length; i++) {
            	 circle[i].showCircleInfo();
             }
	}

}
