package singleTon.student;

public class StudentN2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentN SN = StudentN.getInstance();
		
		School s1 = SN.SNum();
		School s2 = SN.SNum();
		School s3 = SN.SNum();
		School s4 = SN.SNum();
		
		System.out.println("학번:"+s1.getStudent());
		System.out.println("학번:"+s2.getStudent());
		System.out.println("학번:"+s3.getStudent());
		System.out.println("학번:"+s4.getStudent());
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);

	}

}
